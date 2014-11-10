package com.zephyrhealth.halcyon.service.process;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Service;

import com.zephyrhealth.halcyon.service.process.i.IProcessService;

@Service
public class InstitutionRecordLinkageProcessService implements IProcessService {
	
    @Produce(uri = "direct:start")
    private ProducerTemplate template;
    
	@Override
	public void run(String message) {
		System.out.println("template: " + template);
		
		System.out.println("About to start a new institution process with message: " + message);
		ProcessRunner processRunner = new ProcessRunner("institution", message);
		processRunner.start();
	}
}
