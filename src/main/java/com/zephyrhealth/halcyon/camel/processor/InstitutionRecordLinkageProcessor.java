package com.zephyrhealth.halcyon.camel.processor;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.kafka.KafkaConstants;
import org.apache.camel.impl.DefaultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zephyrhealth.halcyon.configuration.HalcyonConfig;

@Service
public class InstitutionRecordLinkageProcessor implements Processor {
	
	@Autowired
	private RuntimeService runtimeService;
	
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		HalcyonConfig.autowireBean(this);
		
		String body = exchange.getIn().getBody(String.class);
		
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("body", body);
		
		ProcessInstance pi = runtimeService.startProcessInstanceByKey("institution", variables);
		
		body = (String) runtimeService.getVariable(pi.getId(), "body");
		
		Execution execution = runtimeService.createExecutionQuery()
			.processInstanceId(pi.getId())
			.activityId("wait")
			.singleResult();
		runtimeService.signal(execution.getId());
		
		Message message = new DefaultMessage();
		message.setBody(body.getBytes());
		message.setHeader(KafkaConstants.PARTITION_KEY, 1);
		exchange.setOut(message);
	}
}
