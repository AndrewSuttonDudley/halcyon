package com.zephyrhealth.halcyon.camel.route;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;

public class KafkaActivitiHelper {

	@Handler
	public Map<String, Object> inbound(Exchange exchange) {
		
		Map<String, Object> variables = new HashMap<String, Object>();
		
		variables.put("camelBody", exchange.getIn().getBody(String.class));
		
		return variables;
	}
}
