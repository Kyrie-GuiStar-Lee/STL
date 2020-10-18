// Generated from /Users/jun/Documents/project/STL/src/main/resources/STL.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class STLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND=2, OR=3, IMPLY=4, F=5, G=6, U=7, LT=8, GT=9, LE=10, GE=11, 
		SpaceOrTab=12, Comment=13, Letter=14, LPAREN=15, LINEJUMP=16, RPAREN=17, 
		LB=18, RB=19, COMMA=20, NUMBER=21, NNUMBER=22, NAME=23, Signal=24, SignalPert=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "AND", "OR", "IMPLY", "F", "G", "U", "LT", "GT", "LE", "GE", 
			"SpaceOrTab", "Comment", "Letter", "LPAREN", "LINEJUMP", "RPAREN", "LB", 
			"RB", "COMMA", "NUMBER", "NNUMBER", "NAME", "Signal", "SignalPert"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'AND'", "'OR'", "'-->'", "'F_'", "'G_'", "'U_'", "'<'", 
			"'>'", "'<='", "'>='", null, null, null, "'('", "'\n'", "')'", "'['", 
			"']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AND", "OR", "IMPLY", "F", "G", "U", "LT", "GT", "LE", "GE", 
			"SpaceOrTab", "Comment", "Letter", "LPAREN", "LINEJUMP", "RPAREN", "LB", 
			"RB", "COMMA", "NUMBER", "NNUMBER", "NAME", "Signal", "SignalPert"
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


	public STLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "STL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\6\rW\n\r\r\r\16\rX\3\r\3\r\3\16\3\16\3\16\3\16\7\16a\n\16"+
		"\f\16\16\16d\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26w\n\26\r\26\16\26x\3\26\3\26\6\26"+
		"}\n\26\r\26\16\26~\5\26\u0081\n\26\3\27\3\27\6\27\u0085\n\27\r\27\16\27"+
		"\u0086\3\27\3\27\6\27\u008b\n\27\r\27\16\27\u008c\5\27\u008f\n\27\3\30"+
		"\3\30\3\30\6\30\u0094\n\30\r\30\16\30\u0095\3\30\7\30\u0099\n\30\f\30"+
		"\16\30\u009c\13\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2"+
		"\5\4\2\13\f\"\"\4\2\f\f\17\17\4\2C\\c|\2\u00b4\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7;\3\2\2\2\t>\3\2\2\2\13B\3\2\2\2\rE\3"+
		"\2\2\2\17H\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27R\3\2\2\2\31"+
		"V\3\2\2\2\33\\\3\2\2\2\35g\3\2\2\2\37i\3\2\2\2!k\3\2\2\2#m\3\2\2\2%o\3"+
		"\2\2\2\'q\3\2\2\2)s\3\2\2\2+v\3\2\2\2-\u0082\3\2\2\2/\u0090\3\2\2\2\61"+
		"\u009d\3\2\2\2\63\u00a2\3\2\2\2\65\66\7?\2\2\66\4\3\2\2\2\678\7C\2\28"+
		"9\7P\2\29:\7F\2\2:\6\3\2\2\2;<\7Q\2\2<=\7T\2\2=\b\3\2\2\2>?\7/\2\2?@\7"+
		"/\2\2@A\7@\2\2A\n\3\2\2\2BC\7H\2\2CD\7a\2\2D\f\3\2\2\2EF\7I\2\2FG\7a\2"+
		"\2G\16\3\2\2\2HI\7W\2\2IJ\7a\2\2J\20\3\2\2\2KL\7>\2\2L\22\3\2\2\2MN\7"+
		"@\2\2N\24\3\2\2\2OP\7>\2\2PQ\7?\2\2Q\26\3\2\2\2RS\7@\2\2ST\7?\2\2T\30"+
		"\3\2\2\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z"+
		"[\b\r\2\2[\32\3\2\2\2\\]\7/\2\2]^\7/\2\2^b\3\2\2\2_a\n\3\2\2`_\3\2\2\2"+
		"ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\b\16\2\2f\34\3\2"+
		"\2\2gh\t\4\2\2h\36\3\2\2\2ij\7*\2\2j \3\2\2\2kl\7\f\2\2l\"\3\2\2\2mn\7"+
		"+\2\2n$\3\2\2\2op\7]\2\2p&\3\2\2\2qr\7_\2\2r(\3\2\2\2st\7.\2\2t*\3\2\2"+
		"\2uw\4\62;\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\u0080\3\2\2\2z|"+
		"\7\60\2\2{}\4\62;\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080z\3\2\2\2\u0080\u0081\3\2\2\2\u0081,\3\2\2\2\u0082\u0084"+
		"\7/\2\2\u0083\u0085\4\62;\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008e\3\2\2\2\u0088\u008a\7\60"+
		"\2\2\u0089\u008b\4\62;\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0088\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f.\3\2\2\2\u0090\u009a\5\35\17\2\u0091\u0099"+
		"\5\35\17\2\u0092\u0094\4\62;\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0099"+
		"\7a\2\2\u0098\u0091\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\60\3\2\2"+
		"\2\u009c\u009a\3\2\2\2\u009d\u009e\5/\30\2\u009e\u009f\7*\2\2\u009f\u00a0"+
		"\7v\2\2\u00a0\u00a1\7+\2\2\u00a1\62\3\2\2\2\u00a2\u00a3\5\61\31\2\u00a3"+
		"\u00a4\7a\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7t\2\2"+
		"\u00a7\u00a8\7v\2\2\u00a8\64\3\2\2\2\16\2Xbx~\u0080\u0086\u008c\u008e"+
		"\u0095\u0098\u009a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}