// Generated from RecordLinkage.g4 by ANTLR 4.2

	package com.zephyrhealth.halcyon;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RecordLinkageParser}.
 */
public interface RecordLinkageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RecordLinkageParser#dataFuncAssign}.
	 * @param ctx the parse tree
	 */
	void enterDataFuncAssign(@NotNull RecordLinkageParser.DataFuncAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecordLinkageParser#dataFuncAssign}.
	 * @param ctx the parse tree
	 */
	void exitDataFuncAssign(@NotNull RecordLinkageParser.DataFuncAssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link RecordLinkageParser#funcTranFunc}.
	 * @param ctx the parse tree
	 */
	void enterFuncTranFunc(@NotNull RecordLinkageParser.FuncTranFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecordLinkageParser#funcTranFunc}.
	 * @param ctx the parse tree
	 */
	void exitFuncTranFunc(@NotNull RecordLinkageParser.FuncTranFuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link RecordLinkageParser#funcDataFunc}.
	 * @param ctx the parse tree
	 */
	void enterFuncDataFunc(@NotNull RecordLinkageParser.FuncDataFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecordLinkageParser#funcDataFunc}.
	 * @param ctx the parse tree
	 */
	void exitFuncDataFunc(@NotNull RecordLinkageParser.FuncDataFuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link RecordLinkageParser#compFuncExactMatch}.
	 * @param ctx the parse tree
	 */
	void enterCompFuncExactMatch(@NotNull RecordLinkageParser.CompFuncExactMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecordLinkageParser#compFuncExactMatch}.
	 * @param ctx the parse tree
	 */
	void exitCompFuncExactMatch(@NotNull RecordLinkageParser.CompFuncExactMatchContext ctx);

	/**
	 * Enter a parse tree produced by {@link RecordLinkageParser#funcCompFunc}.
	 * @param ctx the parse tree
	 */
	void enterFuncCompFunc(@NotNull RecordLinkageParser.FuncCompFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecordLinkageParser#funcCompFunc}.
	 * @param ctx the parse tree
	 */
	void exitFuncCompFunc(@NotNull RecordLinkageParser.FuncCompFuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link RecordLinkageParser#tranFuncTran}.
	 * @param ctx the parse tree
	 */
	void enterTranFuncTran(@NotNull RecordLinkageParser.TranFuncTranContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecordLinkageParser#tranFuncTran}.
	 * @param ctx the parse tree
	 */
	void exitTranFuncTran(@NotNull RecordLinkageParser.TranFuncTranContext ctx);

	/**
	 * Enter a parse tree produced by {@link RecordLinkageParser#compFuncComp}.
	 * @param ctx the parse tree
	 */
	void enterCompFuncComp(@NotNull RecordLinkageParser.CompFuncCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecordLinkageParser#compFuncComp}.
	 * @param ctx the parse tree
	 */
	void exitCompFuncComp(@NotNull RecordLinkageParser.CompFuncCompContext ctx);

	/**
	 * Enter a parse tree produced by {@link RecordLinkageParser#dataFuncData}.
	 * @param ctx the parse tree
	 */
	void enterDataFuncData(@NotNull RecordLinkageParser.DataFuncDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecordLinkageParser#dataFuncData}.
	 * @param ctx the parse tree
	 */
	void exitDataFuncData(@NotNull RecordLinkageParser.DataFuncDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link RecordLinkageParser#confFuncDataTranComp}.
	 * @param ctx the parse tree
	 */
	void enterConfFuncDataTranComp(@NotNull RecordLinkageParser.ConfFuncDataTranCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecordLinkageParser#confFuncDataTranComp}.
	 * @param ctx the parse tree
	 */
	void exitConfFuncDataTranComp(@NotNull RecordLinkageParser.ConfFuncDataTranCompContext ctx);

	/**
	 * Enter a parse tree produced by {@link RecordLinkageParser#tranFuncRemoveWhitespace}.
	 * @param ctx the parse tree
	 */
	void enterTranFuncRemoveWhitespace(@NotNull RecordLinkageParser.TranFuncRemoveWhitespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecordLinkageParser#tranFuncRemoveWhitespace}.
	 * @param ctx the parse tree
	 */
	void exitTranFuncRemoveWhitespace(@NotNull RecordLinkageParser.TranFuncRemoveWhitespaceContext ctx);
}