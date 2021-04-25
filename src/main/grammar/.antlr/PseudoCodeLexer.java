// Generated from /home/tinaxd/graalvm-workspace/pseudorunner/src/main/grammar/PseudoCode.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoCodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ID=6, INTEGER=7, WS=8, ADD=9, 
		SUB=10, MUL=11, DIV=12, INT_TYPE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "ID", "INTEGER", "WS", "ADD", 
			"SUB", "MUL", "DIV", "INT_TYPE"
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


	public PseudoCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PseudoCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17M\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\7\7.\n\7\f\7\16\7\61\13\7\3\b\5\b\64\n\b\3\b"+
		"\6\b\67\n\b\r\b\16\b8\3\t\6\t<\n\t\r\t\16\t=\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\6\5\2C\\aac|\7\2//\62;C\\aac|"+
		"\3\2\62;\5\2\13\f\17\17\"\"\2P\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5"+
		"\37\3\2\2\2\7\"\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17\63\3\2\2"+
		"\2\21;\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33I\3\2"+
		"\2\2\35\36\7<\2\2\36\4\3\2\2\2\37 \7>\2\2 !\7/\2\2!\6\3\2\2\2\"#\7f\2"+
		"\2#$\7w\2\2$%\7o\2\2%&\7r\2\2&\b\3\2\2\2\'(\7]\2\2(\n\3\2\2\2)*\7_\2\2"+
		"*\f\3\2\2\2+/\t\2\2\2,.\t\3\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3"+
		"\2\2\2\60\16\3\2\2\2\61/\3\2\2\2\62\64\7/\2\2\63\62\3\2\2\2\63\64\3\2"+
		"\2\2\64\66\3\2\2\2\65\67\t\4\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\2"+
		"89\3\2\2\29\20\3\2\2\2:<\t\5\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2"+
		"\2>?\3\2\2\2?@\b\t\2\2@\22\3\2\2\2AB\7-\2\2B\24\3\2\2\2CD\7/\2\2D\26\3"+
		"\2\2\2EF\7,\2\2F\30\3\2\2\2GH\7\61\2\2H\32\3\2\2\2IJ\7k\2\2JK\7p\2\2K"+
		"L\7v\2\2L\34\3\2\2\2\7\2/\638=\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}