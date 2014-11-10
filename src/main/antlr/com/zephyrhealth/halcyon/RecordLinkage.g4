grammar RecordLinkage;

@header {
	package com.zephyrhealth.halcyon;
}

conf:	data '\n' tran '\n' comp '\n'					# confFuncDataTranComp
	;


data:	dataFunc										# funcDataFunc
	|   dataFunc '\n' data								# dataFuncData
	;

dataFunc
	:	'assign(' INT ',' FIELD_NAME ')'				# dataFuncAssign
	;


tran:	tranFunc										# funcTranFunc
	|	tranFunc '\n' tran								# tranFuncTran
	;

tranFunc
	:	'removeWhitespace(' FIELD_NAME ')'				# tranFuncRemoveWhitespace
	;


comp:	compFunc										# funcCompFunc
	|	compFunc '\n' comp								# compFuncComp
	;

compFunc
	:	'exactMatch(' FIELD_NAME ')'		# compFuncExactMatch
	;


INT:			[^]*[0-9]+ ;
FIELD_NAME:		[^]*[a-z|A-Z]+ ;
WHITESPACE:		[ \t]+ -> skip ;