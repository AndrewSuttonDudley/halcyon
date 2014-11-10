// Generated from RecordLinkage.g4 by ANTLR 4.2

	package com.zephyrhealth.halcyon;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RecordLinkageParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, INT=7, FIELD_NAME=8, WHITESPACE=9;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'exactMatch('", "'\n'", "'assign('", "','", "'removeWhitespace('", 
		"INT", "FIELD_NAME", "WHITESPACE"
	};
	public static final int
		RULE_conf = 0, RULE_data = 1, RULE_dataFunc = 2, RULE_tran = 3, RULE_tranFunc = 4, 
		RULE_comp = 5, RULE_compFunc = 6;
	public static final String[] ruleNames = {
		"conf", "data", "dataFunc", "tran", "tranFunc", "comp", "compFunc"
	};

	@Override
	public String getGrammarFileName() { return "RecordLinkage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RecordLinkageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConfContext extends ParserRuleContext {
		public ConfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conf; }
	 
		public ConfContext() { }
		public void copyFrom(ConfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConfFuncDataTranCompContext extends ConfContext {
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TranContext tran() {
			return getRuleContext(TranContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ConfFuncDataTranCompContext(ConfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).enterConfFuncDataTranComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).exitConfFuncDataTranComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecordLinkageVisitor ) return ((RecordLinkageVisitor<? extends T>)visitor).visitConfFuncDataTranComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfContext conf() throws RecognitionException {
		ConfContext _localctx = new ConfContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_conf);
		try {
			_localctx = new ConfFuncDataTranCompContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(14); data();
			setState(15); match(3);
			setState(16); tran();
			setState(17); match(3);
			setState(18); comp();
			setState(19); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	 
		public DataContext() { }
		public void copyFrom(DataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDataFuncContext extends DataContext {
		public DataFuncContext dataFunc() {
			return getRuleContext(DataFuncContext.class,0);
		}
		public FuncDataFuncContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).enterFuncDataFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).exitFuncDataFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecordLinkageVisitor ) return ((RecordLinkageVisitor<? extends T>)visitor).visitFuncDataFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataFuncDataContext extends DataContext {
		public DataFuncContext dataFunc() {
			return getRuleContext(DataFuncContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public DataFuncDataContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).enterDataFuncData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).exitDataFuncData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecordLinkageVisitor ) return ((RecordLinkageVisitor<? extends T>)visitor).visitDataFuncData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data);
		try {
			setState(26);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new FuncDataFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21); dataFunc();
				}
				break;

			case 2:
				_localctx = new DataFuncDataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22); dataFunc();
				setState(23); match(3);
				setState(24); data();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataFuncContext extends ParserRuleContext {
		public DataFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataFunc; }
	 
		public DataFuncContext() { }
		public void copyFrom(DataFuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataFuncAssignContext extends DataFuncContext {
		public TerminalNode INT() { return getToken(RecordLinkageParser.INT, 0); }
		public TerminalNode FIELD_NAME() { return getToken(RecordLinkageParser.FIELD_NAME, 0); }
		public DataFuncAssignContext(DataFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).enterDataFuncAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).exitDataFuncAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecordLinkageVisitor ) return ((RecordLinkageVisitor<? extends T>)visitor).visitDataFuncAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataFuncContext dataFunc() throws RecognitionException {
		DataFuncContext _localctx = new DataFuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dataFunc);
		try {
			_localctx = new DataFuncAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(4);
			setState(29); match(INT);
			setState(30); match(5);
			setState(31); match(FIELD_NAME);
			setState(32); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranContext extends ParserRuleContext {
		public TranContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tran; }
	 
		public TranContext() { }
		public void copyFrom(TranContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncTranFuncContext extends TranContext {
		public TranFuncContext tranFunc() {
			return getRuleContext(TranFuncContext.class,0);
		}
		public FuncTranFuncContext(TranContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).enterFuncTranFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).exitFuncTranFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecordLinkageVisitor ) return ((RecordLinkageVisitor<? extends T>)visitor).visitFuncTranFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TranFuncTranContext extends TranContext {
		public TranFuncContext tranFunc() {
			return getRuleContext(TranFuncContext.class,0);
		}
		public TranContext tran() {
			return getRuleContext(TranContext.class,0);
		}
		public TranFuncTranContext(TranContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).enterTranFuncTran(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).exitTranFuncTran(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecordLinkageVisitor ) return ((RecordLinkageVisitor<? extends T>)visitor).visitTranFuncTran(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranContext tran() throws RecognitionException {
		TranContext _localctx = new TranContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tran);
		try {
			setState(39);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new FuncTranFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34); tranFunc();
				}
				break;

			case 2:
				_localctx = new TranFuncTranContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35); tranFunc();
				setState(36); match(3);
				setState(37); tran();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranFuncContext extends ParserRuleContext {
		public TranFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tranFunc; }
	 
		public TranFuncContext() { }
		public void copyFrom(TranFuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TranFuncRemoveWhitespaceContext extends TranFuncContext {
		public TerminalNode FIELD_NAME() { return getToken(RecordLinkageParser.FIELD_NAME, 0); }
		public TranFuncRemoveWhitespaceContext(TranFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).enterTranFuncRemoveWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).exitTranFuncRemoveWhitespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecordLinkageVisitor ) return ((RecordLinkageVisitor<? extends T>)visitor).visitTranFuncRemoveWhitespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranFuncContext tranFunc() throws RecognitionException {
		TranFuncContext _localctx = new TranFuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tranFunc);
		try {
			_localctx = new TranFuncRemoveWhitespaceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(6);
			setState(42); match(FIELD_NAME);
			setState(43); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompContext extends ParserRuleContext {
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	 
		public CompContext() { }
		public void copyFrom(CompContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncCompFuncContext extends CompContext {
		public CompFuncContext compFunc() {
			return getRuleContext(CompFuncContext.class,0);
		}
		public FuncCompFuncContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).enterFuncCompFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).exitFuncCompFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecordLinkageVisitor ) return ((RecordLinkageVisitor<? extends T>)visitor).visitFuncCompFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompFuncCompContext extends CompContext {
		public CompFuncContext compFunc() {
			return getRuleContext(CompFuncContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public CompFuncCompContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).enterCompFuncComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).exitCompFuncComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecordLinkageVisitor ) return ((RecordLinkageVisitor<? extends T>)visitor).visitCompFuncComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comp);
		try {
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new FuncCompFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45); compFunc();
				}
				break;

			case 2:
				_localctx = new CompFuncCompContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46); compFunc();
				setState(47); match(3);
				setState(48); comp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompFuncContext extends ParserRuleContext {
		public CompFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compFunc; }
	 
		public CompFuncContext() { }
		public void copyFrom(CompFuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompFuncExactMatchContext extends CompFuncContext {
		public TerminalNode FIELD_NAME() { return getToken(RecordLinkageParser.FIELD_NAME, 0); }
		public CompFuncExactMatchContext(CompFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).enterCompFuncExactMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecordLinkageListener ) ((RecordLinkageListener)listener).exitCompFuncExactMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecordLinkageVisitor ) return ((RecordLinkageVisitor<? extends T>)visitor).visitCompFuncExactMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompFuncContext compFunc() throws RecognitionException {
		CompFuncContext _localctx = new CompFuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compFunc);
		try {
			_localctx = new CompFuncExactMatchContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(2);
			setState(53); match(FIELD_NAME);
			setState(54); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5*\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\65\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\66\2\20\3\2\2\2\4\34\3\2\2\2\6\36"+
		"\3\2\2\2\b)\3\2\2\2\n+\3\2\2\2\f\64\3\2\2\2\16\66\3\2\2\2\20\21\5\4\3"+
		"\2\21\22\7\5\2\2\22\23\5\b\5\2\23\24\7\5\2\2\24\25\5\f\7\2\25\26\7\5\2"+
		"\2\26\3\3\2\2\2\27\35\5\6\4\2\30\31\5\6\4\2\31\32\7\5\2\2\32\33\5\4\3"+
		"\2\33\35\3\2\2\2\34\27\3\2\2\2\34\30\3\2\2\2\35\5\3\2\2\2\36\37\7\6\2"+
		"\2\37 \7\t\2\2 !\7\7\2\2!\"\7\n\2\2\"#\7\3\2\2#\7\3\2\2\2$*\5\n\6\2%&"+
		"\5\n\6\2&\'\7\5\2\2\'(\5\b\5\2(*\3\2\2\2)$\3\2\2\2)%\3\2\2\2*\t\3\2\2"+
		"\2+,\7\b\2\2,-\7\n\2\2-.\7\3\2\2.\13\3\2\2\2/\65\5\16\b\2\60\61\5\16\b"+
		"\2\61\62\7\5\2\2\62\63\5\f\7\2\63\65\3\2\2\2\64/\3\2\2\2\64\60\3\2\2\2"+
		"\65\r\3\2\2\2\66\67\7\4\2\2\678\7\n\2\289\7\3\2\29\17\3\2\2\2\5\34)\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}