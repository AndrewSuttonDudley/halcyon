package com.zephyrhealth.halcyon.configuration;

import javax.sql.DataSource;

import org.activiti.engine.HistoryService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class ActivitiConfig implements InitializingBean {
	
	Logger log = LoggerFactory.getLogger(ActivitiConfig.class);
	
	
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(org.h2.Driver.class);
		dataSource.setUrl("jdbc:h2:mem:activiti;DB_CLOSE_DELAY=1000");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}
	
	@Bean
	public PlatformTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
		return transactionManager;
	}
	
	@Bean
	public SpringProcessEngineConfiguration processEngineConfiguration() {
		SpringProcessEngineConfiguration processEngineConfiguration = new SpringProcessEngineConfiguration();
		processEngineConfiguration.setDataSource(dataSource());
		processEngineConfiguration.setTransactionManager(transactionManager());
		processEngineConfiguration.setDatabaseSchemaUpdate("true");
		processEngineConfiguration.setJobExecutorActivate(false);
		return processEngineConfiguration;
	}
	
	@Bean
	public ProcessEngineFactoryBean processEngineFactoryBean() {
		ProcessEngineFactoryBean factory = new ProcessEngineFactoryBean();
		factory.setProcessEngineConfiguration(processEngineConfiguration());
		return factory;
	}
	
	@Bean
	public RepositoryService repositoryService() throws Exception {
		return processEngineFactoryBean().getObject().getRepositoryService();
	}
	
	@Bean
	public RuntimeService runtimeService() throws Exception {
		return processEngineFactoryBean().getObject().getRuntimeService();
	}
	
	@Bean
	public TaskService taskService() throws Exception {
		return processEngineFactoryBean().getObject().getTaskService();
	}
	
	@Bean
	public HistoryService historyService() throws Exception {
		return processEngineFactoryBean().getObject().getHistoryService();
	}
	
	@Bean
	public ManagementService managementService() throws Exception {
		return processEngineFactoryBean().getObject().getManagementService();
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
//		deployProcess("activiti/record_linkage/Institution.bpmn");
		deployProcess("activiti/record_linkage/InstitutionSimple.bpmn");
	}
	
	private void deployProcess(String path) throws Exception {
		String deploymentId = repositoryService().
				createDeployment().
				addClasspathResource(path).
				deploy().
				getId();
		log.info("Deployed resource " + path + " (id: " + deploymentId + ").");
	}
}
