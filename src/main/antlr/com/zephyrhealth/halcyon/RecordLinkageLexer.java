// Generated from RecordLinkage.g4 by ANTLR 4.2

	package com.zephyrhealth.halcyon;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RecordLinkageLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, INT=7, FIELD_NAME=8, WHITESPACE=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'exactMatch('", "'\n'", "'assign('", "','", "'removeWhitespace('", 
		"INT", "FIELD_NAME", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "INT", "FIELD_NAME", "WHITESPACE"
	};


	public RecordLinkageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RecordLinkage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\7\bC\n\b\f\b\16\bF\13\b\3\b\6\bI\n\b"+
		"\r\b\16\bJ\3\t\7\tN\n\t\f\t\16\tQ\13\t\3\t\6\tT\n\t\r\t\16\tU\3\n\6\n"+
		"Y\n\n\r\n\16\nZ\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\3\2\6\3\2``\3\2\62;\5\2C\\c|~~\4\2\13\13\"\"b\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13"+
		"-\3\2\2\2\r/\3\2\2\2\17D\3\2\2\2\21O\3\2\2\2\23X\3\2\2\2\25\26\7+\2\2"+
		"\26\4\3\2\2\2\27\30\7g\2\2\30\31\7z\2\2\31\32\7c\2\2\32\33\7e\2\2\33\34"+
		"\7v\2\2\34\35\7O\2\2\35\36\7c\2\2\36\37\7v\2\2\37 \7e\2\2 !\7j\2\2!\""+
		"\7*\2\2\"\6\3\2\2\2#$\7\f\2\2$\b\3\2\2\2%&\7c\2\2&\'\7u\2\2\'(\7u\2\2"+
		"()\7k\2\2)*\7i\2\2*+\7p\2\2+,\7*\2\2,\n\3\2\2\2-.\7.\2\2.\f\3\2\2\2/\60"+
		"\7t\2\2\60\61\7g\2\2\61\62\7o\2\2\62\63\7q\2\2\63\64\7x\2\2\64\65\7g\2"+
		"\2\65\66\7Y\2\2\66\67\7j\2\2\678\7k\2\289\7v\2\29:\7g\2\2:;\7u\2\2;<\7"+
		"r\2\2<=\7c\2\2=>\7e\2\2>?\7g\2\2?@\7*\2\2@\16\3\2\2\2AC\t\2\2\2BA\3\2"+
		"\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2GI\t\3\2\2HG\3\2"+
		"\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\20\3\2\2\2LN\t\2\2\2ML\3\2\2\2NQ\3"+
		"\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RT\t\4\2\2SR\3\2\2\2TU\3"+
		"\2\2\2US\3\2\2\2UV\3\2\2\2V\22\3\2\2\2WY\t\5\2\2XW\3\2\2\2YZ\3\2\2\2Z"+
		"X\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\n\2\2]\24\3\2\2\2\b\2DJOUZ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}