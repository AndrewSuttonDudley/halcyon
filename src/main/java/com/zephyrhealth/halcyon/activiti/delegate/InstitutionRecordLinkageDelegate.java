package com.zephyrhealth.halcyon.activiti.delegate;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class InstitutionRecordLinkageDelegate implements JavaDelegate {
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		execution.setVariable("camelBody", ((String) execution.getVariable("camelBody")) + " bar");
	}
}
