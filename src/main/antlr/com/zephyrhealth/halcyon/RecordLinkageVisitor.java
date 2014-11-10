// Generated from RecordLinkage.g4 by ANTLR 4.2

	package com.zephyrhealth.halcyon;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RecordLinkageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RecordLinkageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RecordLinkageParser#dataFuncAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataFuncAssign(@NotNull RecordLinkageParser.DataFuncAssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link RecordLinkageParser#funcTranFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncTranFunc(@NotNull RecordLinkageParser.FuncTranFuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link RecordLinkageParser#funcDataFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDataFunc(@NotNull RecordLinkageParser.FuncDataFuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link RecordLinkageParser#compFuncExactMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompFuncExactMatch(@NotNull RecordLinkageParser.CompFuncExactMatchContext ctx);

	/**
	 * Visit a parse tree produced by {@link RecordLinkageParser#funcCompFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCompFunc(@NotNull RecordLinkageParser.FuncCompFuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link RecordLinkageParser#tranFuncTran}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranFuncTran(@NotNull RecordLinkageParser.TranFuncTranContext ctx);

	/**
	 * Visit a parse tree produced by {@link RecordLinkageParser#compFuncComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompFuncComp(@NotNull RecordLinkageParser.CompFuncCompContext ctx);

	/**
	 * Visit a parse tree produced by {@link RecordLinkageParser#dataFuncData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataFuncData(@NotNull RecordLinkageParser.DataFuncDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link RecordLinkageParser#confFuncDataTranComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfFuncDataTranComp(@NotNull RecordLinkageParser.ConfFuncDataTranCompContext ctx);

	/**
	 * Visit a parse tree produced by {@link RecordLinkageParser#tranFuncRemoveWhitespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranFuncRemoveWhitespace(@NotNull RecordLinkageParser.TranFuncRemoveWhitespaceContext ctx);
}