package com.zephyrhealth.halcyon.service.process;

import org.activiti.engine.RuntimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.zephyrhealth.halcyon.configuration.HalcyonConfig;

public class ProcessRunner extends Thread {
	
	Logger log = LoggerFactory.getLogger(ProcessRunner.class);
	
	@Autowired
	private RuntimeService runtimeService;
	
	private String processName;
	private String message;
	
	
	public ProcessRunner(String processName, String message) {
		this.processName = processName;
		this.message = message;
	}
	
	
	@Override
	public void run() {
		
		HalcyonConfig.autowireBean(this);
		
		log.info("Starting process (" + processName + ") with message: " + message);
		
		runtimeService.startProcessInstanceByKey(processName);
	}
}
