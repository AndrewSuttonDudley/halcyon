package com.zephyrhealth.halcyon.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import com.zephyrhealth.halcyon.RecordLinkageBaseVisitor;
import com.zephyrhealth.halcyon.RecordLinkageParser;
import com.zephyrhealth.halcyon.service.dsl.i.IDataService;
import com.zephyrhealth.halcyon.service.dsl.i.ISimpleStringTransformationService;

@Configurable
public class RecordLinkageVisitor extends RecordLinkageBaseVisitor<RecordLinkageMap> {
	
	@Autowired
	private IDataService dataService;
	
	@Autowired
	private ISimpleStringTransformationService simpleStringTransformationService;
	
	private RecordLinkageMap existingRecord;
	
	private RecordLinkageMap newRecord;
	
	
	@Override
	public RecordLinkageMap visitConfFuncDataTranComp(@NotNull RecordLinkageParser.ConfFuncDataTranCompContext ctx) {
		
		newRecord = visit(ctx.data());
		newRecord.putAll(visit(ctx.tran()));
		newRecord.putAll(visit(ctx.comp()));
		
		return newRecord;
	}
	
	@Override
	public RecordLinkageMap visitDataFuncData(@NotNull RecordLinkageParser.DataFuncDataContext ctx) {
		
		RecordLinkageMap result = visit(ctx.data());
		result.putAll(visit(ctx.dataFunc()));
		return result;
	}
	
	@Override
	public RecordLinkageMap visitDataFuncAssign(@NotNull RecordLinkageParser.DataFuncAssignContext ctx) {
		
		String key = ctx.FIELD_NAME().getText();
		String value = dataService.getField(Integer.valueOf(ctx.INT().getText()));
		
		return new RecordLinkageMap(key, value);
	}
	
	@Override
	public RecordLinkageMap visitTranFuncTran(@NotNull RecordLinkageParser.TranFuncTranContext ctx) {
		
		RecordLinkageMap result = visit(ctx.tran());
		result.putAll(visit(ctx.tranFunc()));
		return result;
	}
	
	@Override
	public RecordLinkageMap visitTranFuncRemoveWhitespace(@NotNull RecordLinkageParser.TranFuncRemoveWhitespaceContext ctx) {
		
		String origKey = ctx.FIELD_NAME().getText();
		
		String newValue = simpleStringTransformationService.removeWhitespace(newRecord.get(origKey));
		
		return new RecordLinkageMap(origKey + "_REM_WS", newValue);
	}
	
	@Override
	public RecordLinkageMap visitCompFuncComp(@NotNull RecordLinkageParser.CompFuncCompContext ctx) {
		
		RecordLinkageMap result = visit(ctx.comp());
		result.putAll(visit(ctx.compFunc()));
		return result;
	}
	
	@Override
	public RecordLinkageMap visitCompFuncExactMatch(@NotNull RecordLinkageParser.CompFuncExactMatchContext ctx) {
		
		String key = ctx.FIELD_NAME().getText();
		
		String val1 = existingRecord.get(key);
		String val2 = newRecord.get(key);
		
		return new RecordLinkageMap(key + "_EXACT_MATCH", val1.equals(val2) ? "true" : "false");
	}
	
	public void setExistingRecord(RecordLinkageMap existingRecord) {
		this.existingRecord = existingRecord;
	}
}
