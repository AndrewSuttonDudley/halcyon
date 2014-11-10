package com.zephyrhealth.halcyon.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InstitutionRouteBuilder extends RouteBuilder {
	
	@Value("${kafka_host}")
	private String kafkaHost;
	
	@Value("${kafka_port}")
	private String kafkaPort;
	
	@Value("${zookeeper_host}")
	private String zookeeperHost;
	
	@Value("${zookeeper_port}")
	private String zookeeperPort;
	
	
	private String kafkaEndpoint(String group, String topic) {
		return "kafka:" + kafkaHost + ":" + kafkaPort +
				"?zookeeperHost=" + zookeeperHost + "&zookeeperPort=" + zookeeperPort +
				"&groupId=" + group + "&topic=" + topic + "&serializerClass=kafka.serializer.StringEncoder";
	}
	
	
	@Override
	public void configure() throws Exception {
    	
        from(kafkaEndpoint("record_linkage", "institution"))
        	.setBody(method(KafkaActivitiHelper.class))
	    	.to("activiti:institutionSimple");
        
        from("activiti:institutionSimple:cameltask1?copyCamelBodyToBody=true")
        	.setHeader("kafka.PARTITION_KEY", constant(1))
        	.to(kafkaEndpoint("record_linkage", "destination"));
	}
}
