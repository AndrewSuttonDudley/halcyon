package com.zephyrhealth.halcyon;

import org.apache.camel.main.Main;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zephyrhealth.halcyon.configuration.ActivitiConfig;
import com.zephyrhealth.halcyon.configuration.CamelConfig;
import com.zephyrhealth.halcyon.configuration.HalcyonConfig;

@Configurable
public class Halcyon {
	
	private static AnnotationConfigApplicationContext context;
	
	private static Main camel;
	
	
	private static void start() throws Exception {
		
    	context = new AnnotationConfigApplicationContext();
    	context.register(HalcyonConfig.class, ActivitiConfig.class, CamelConfig.class);
    	context.refresh();
    	
		camel = new Main();
		camel.start();
	}
	
	public static void stop() throws Exception {
		camel.stop();
		context.close();
	}
	
    public static void main(String[] args) throws Exception {
    	Halcyon.start();
    }
}
