package com.zephyrhealth.halcyon.service.dsl;

import org.springframework.stereotype.Service;

import com.zephyrhealth.halcyon.service.dsl.i.ISimpleStringTransformationService;

@Service
public class SimpleStringTransformationService implements ISimpleStringTransformationService {
	
	@Override
	public String removeWhitespace(String value) {
		// TODO: this
		return value;
	}
}
