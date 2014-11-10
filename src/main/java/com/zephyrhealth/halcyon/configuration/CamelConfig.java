package com.zephyrhealth.halcyon.configuration;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.kafka.KafkaComponent;
import org.apache.camel.osgi.SpringCamelContextFactory;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.osgi.framework.BundleContext;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.osgi.context.BundleContextAware;

@Configuration
@ComponentScan({
	"com.zephyrhealth.halcyon.camel.route"
})
public class CamelConfig extends CamelConfiguration implements InitializingBean, BundleContextAware {
	
	private BundleContext bundleContext;
	
	private static CamelContext camelContext;
	
	
	public static CamelContext getCamelContext() {
		return camelContext;
	}
	
	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}
	
	@Override
	public CamelContext camelContext() throws Exception {
		SpringCamelContextFactory factory = new SpringCamelContextFactory();
		factory.setApplicationContext(getApplicationContext());
		factory.setBundleContext(bundleContext);
		camelContext = factory.createContext();
		return camelContext;
	}
	
	@Override
	public void setupCamelContext(CamelContext camelContext) throws Exception {
	}
	
    @Override
 	public void afterPropertiesSet() throws Exception {
    	
    	camelContext().addComponent("kafka", new KafkaComponent(camelContext));
    	
		System.out.println("Adding route builders.");
		for (RouteBuilder routeBuilder : routes()) {
			System.out.println("Adding route builder.");
			camelContext().addRoutes(routeBuilder);
		}
	}
}
