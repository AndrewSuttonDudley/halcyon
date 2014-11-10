package com.zephyrhealth.halcyon.configuration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.zephyrhealth.halcyon.Halcyon;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({
	"com.zephyrhealth.halcyon.service"
})
@PropertySource({ "classpath:config.properties" })
public class HalcyonConfig implements ApplicationContextAware {
	
	private static ApplicationContext context;
	
	
	@Bean
	public static Halcyon getHalcyon() {
		return new Halcyon();
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new  PropertySourcesPlaceholderConfigurer();
	}
	
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		HalcyonConfig.context = context;
	}
	
	public static void autowireBean(Object object) {
		AutowireCapableBeanFactory factory = context.getAutowireCapableBeanFactory();
		factory.autowireBean(object);
	}
}
