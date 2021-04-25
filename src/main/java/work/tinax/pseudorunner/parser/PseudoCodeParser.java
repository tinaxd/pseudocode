// Generated from PseudoCode.g4 by ANTLR 4.9.2
package work.tinax.pseudorunner.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ID=6, INTEGER=7, WS=8, ADD=9, 
		SUB=10, MUL=11, DIV=12, INT_TYPE=13;
	public static final int
		RULE_expr = 0, RULE_stmt = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_dump = 4, RULE_dynamicArrayType = 5, RULE_type = 6, RULE_program = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "stmt", "declaration", "assignment", "dump", "dynamicArrayType", 
			"type", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'<-'", "'dump'", "'['", "']'", null, null, null, "'+'", 
			"'-'", "'*'", "'/'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "ID", "INTEGER", "WS", "ADD", "SUB", 
			"MUL", "DIV", "INT_TYPE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PseudoCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseudoCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(PseudoCodeParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(PseudoCodeParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(PseudoCodeParser.ADD, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(17);
				match(INTEGER);
				}
				break;
			case ID:
				{
				setState(18);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(21);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(22);
					match(ADD);
					setState(23);
					expr(2);
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DumpContext dump() {
			return getRuleContext(DumpContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				assignment();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				dump();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseudoCodeParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ID);
			setState(34);
			match(T__0);
			setState(35);
			type();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseudoCodeParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(ID);
			setState(38);
			match(T__1);
			setState(39);
			expr(0);
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

	public static class DumpContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dump; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDump(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DumpContext dump() throws RecognitionException {
		DumpContext _localctx = new DumpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dump);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__2);
			setState(42);
			expr(0);
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

	public static class DynamicArrayTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(PseudoCodeParser.INT_TYPE, 0); }
		public DynamicArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDynamicArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDynamicArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDynamicArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicArrayTypeContext dynamicArrayType() throws RecognitionException {
		DynamicArrayTypeContext _localctx = new DynamicArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dynamicArrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(INT_TYPE);
			setState(45);
			match(T__3);
			setState(46);
			match(T__4);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(PseudoCodeParser.INT_TYPE, 0); }
		public DynamicArrayTypeContext dynamicArrayType() {
			return getRuleContext(DynamicArrayTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(INT_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				dynamicArrayType();
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

	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==ID) {
				{
				{
				setState(52);
				stmt();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\5\2\26"+
		"\n\2\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\3\3\3\5\3\"\n\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b\65\n"+
		"\b\3\t\7\t8\n\t\f\t\16\t;\13\t\3\t\2\3\2\n\2\4\6\b\n\f\16\20\2\2\29\2"+
		"\25\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b\'\3\2\2\2\n+\3\2\2\2\f.\3\2\2\2\16"+
		"\64\3\2\2\2\209\3\2\2\2\22\23\b\2\1\2\23\26\7\t\2\2\24\26\7\b\2\2\25\22"+
		"\3\2\2\2\25\24\3\2\2\2\26\34\3\2\2\2\27\30\f\3\2\2\30\31\7\13\2\2\31\33"+
		"\5\2\2\4\32\27\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\3"+
		"\3\2\2\2\36\34\3\2\2\2\37\"\5\b\5\2 \"\5\n\6\2!\37\3\2\2\2! \3\2\2\2\""+
		"\5\3\2\2\2#$\7\b\2\2$%\7\3\2\2%&\5\16\b\2&\7\3\2\2\2\'(\7\b\2\2()\7\4"+
		"\2\2)*\5\2\2\2*\t\3\2\2\2+,\7\5\2\2,-\5\2\2\2-\13\3\2\2\2./\7\17\2\2/"+
		"\60\7\6\2\2\60\61\7\7\2\2\61\r\3\2\2\2\62\65\7\17\2\2\63\65\5\f\7\2\64"+
		"\62\3\2\2\2\64\63\3\2\2\2\65\17\3\2\2\2\668\5\4\3\2\67\66\3\2\2\28;\3"+
		"\2\2\29\67\3\2\2\29:\3\2\2\2:\21\3\2\2\2;9\3\2\2\2\7\25\34!\649";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}