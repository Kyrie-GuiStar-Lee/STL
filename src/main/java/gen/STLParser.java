// Generated from E:/STL/src/main/resources\STL.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class STLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND=2, OR=3, IMPLY=4, NOT=5, F=6, G=7, U=8, LT=9, GT=10, LE=11, 
		GE=12, SpaceOrTab=13, Comment=14, Letter=15, LPAREN=16, LINEJUMP=17, RPAREN=18, 
		LB=19, RB=20, COMMA=21, NUMBER=22, NNUMBER=23, NAME=24, Signal=25, SignalPert=26;
	public static final int
		RULE_prog = 0, RULE_form = 1, RULE_expr = 2, RULE_monocularTemporalop = 3, 
		RULE_until = 4, RULE_perturbation = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "form", "expr", "monocularTemporalop", "until", "perturbation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'AND'", "'OR'", "'-->'", "'NOT'", "'F_'", "'G_'", "'U_'", 
			"'<'", "'>'", "'<='", "'>='", null, null, null, "'('", "'\n'", "')'", 
			"'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AND", "OR", "IMPLY", "NOT", "F", "G", "U", "LT", "GT", "LE", 
			"GE", "SpaceOrTab", "Comment", "Letter", "LPAREN", "LINEJUMP", "RPAREN", 
			"LB", "RB", "COMMA", "NUMBER", "NNUMBER", "NAME", "Signal", "SignalPert"
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
	public String getGrammarFileName() { return "STL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public STLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Program_Context extends ProgContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public TerminalNode EOF() { return getToken(STLParser.EOF, 0); }
		public List<PerturbationContext> perturbation() {
			return getRuleContexts(PerturbationContext.class);
		}
		public PerturbationContext perturbation(int i) {
			return getRuleContext(PerturbationContext.class,i);
		}
		public Program_Context(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterProgram_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitProgram_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitProgram_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new Program_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			form();
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SignalPert) {
				{
				{
				setState(13);
				perturbation();
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			match(EOF);
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

	public static class FormContext extends ParserRuleContext {
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
	 
		public FormContext() { }
		public void copyFrom(FormContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Formula_Context extends FormContext {
		public TerminalNode NAME() { return getToken(STLParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Formula_Context(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterFormula_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitFormula_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitFormula_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_form);
		try {
			_localctx = new Formula_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(NAME);
			setState(22);
			match(T__0);
			setState(23);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EventualAlways_Context extends ExprContext {
		public MonocularTemporalopContext monocularTemporalop() {
			return getRuleContext(MonocularTemporalopContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EventualAlways_Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterEventualAlways_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitEventualAlways_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitEventualAlways_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Parens_Context extends ExprContext {
		public TerminalNode LPAREN() { return getToken(STLParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(STLParser.RPAREN, 0); }
		public Parens_Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterParens_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitParens_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitParens_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(STLParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOrImplyUntil_Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(STLParser.AND, 0); }
		public TerminalNode OR() { return getToken(STLParser.OR, 0); }
		public TerminalNode IMPLY() { return getToken(STLParser.IMPLY, 0); }
		public UntilContext until() {
			return getRuleContext(UntilContext.class,0);
		}
		public AndOrImplyUntil_Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterAndOrImplyUntil_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitAndOrImplyUntil_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitAndOrImplyUntil_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Predicates_Context extends ExprContext {
		public TerminalNode Signal() { return getToken(STLParser.Signal, 0); }
		public TerminalNode GT() { return getToken(STLParser.GT, 0); }
		public TerminalNode LT() { return getToken(STLParser.LT, 0); }
		public TerminalNode GE() { return getToken(STLParser.GE, 0); }
		public TerminalNode LE() { return getToken(STLParser.LE, 0); }
		public TerminalNode NUMBER() { return getToken(STLParser.NUMBER, 0); }
		public TerminalNode NNUMBER() { return getToken(STLParser.NNUMBER, 0); }
		public Predicates_Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterPredicates_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitPredicates_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitPredicates_(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F:
			case G:
				{
				_localctx = new EventualAlways_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(26);
				monocularTemporalop();
				setState(27);
				expr(5);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(NOT);
				setState(30);
				expr(4);
				}
				break;
			case LPAREN:
				{
				_localctx = new Parens_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(LPAREN);
				setState(32);
				expr(0);
				setState(33);
				match(RPAREN);
				}
				break;
			case Signal:
				{
				_localctx = new Predicates_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(Signal);
				setState(36);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(37);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==NNUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOrImplyUntil_Context(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(40);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(45);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AND:
						{
						setState(41);
						match(AND);
						}
						break;
					case OR:
						{
						setState(42);
						match(OR);
						}
						break;
					case IMPLY:
						{
						setState(43);
						match(IMPLY);
						}
						break;
					case U:
						{
						setState(44);
						until();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(47);
					expr(4);
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class MonocularTemporalopContext extends ParserRuleContext {
		public MonocularTemporalopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monocularTemporalop; }
	 
		public MonocularTemporalopContext() { }
		public void copyFrom(MonocularTemporalopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MonocularTemporalop_Context extends MonocularTemporalopContext {
		public TerminalNode LB() { return getToken(STLParser.LB, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(STLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(STLParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(STLParser.COMMA, 0); }
		public TerminalNode RB() { return getToken(STLParser.RB, 0); }
		public TerminalNode F() { return getToken(STLParser.F, 0); }
		public TerminalNode G() { return getToken(STLParser.G, 0); }
		public MonocularTemporalop_Context(MonocularTemporalopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterMonocularTemporalop_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitMonocularTemporalop_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitMonocularTemporalop_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonocularTemporalopContext monocularTemporalop() throws RecognitionException {
		MonocularTemporalopContext _localctx = new MonocularTemporalopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_monocularTemporalop);
		int _la;
		try {
			_localctx = new MonocularTemporalop_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==F || _la==G) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(54);
			match(LB);
			setState(55);
			match(NUMBER);
			setState(56);
			match(COMMA);
			setState(57);
			match(NUMBER);
			setState(58);
			match(RB);
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

	public static class UntilContext extends ParserRuleContext {
		public UntilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until; }
	 
		public UntilContext() { }
		public void copyFrom(UntilContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Until_Context extends UntilContext {
		public TerminalNode U() { return getToken(STLParser.U, 0); }
		public TerminalNode LB() { return getToken(STLParser.LB, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(STLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(STLParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(STLParser.COMMA, 0); }
		public TerminalNode RB() { return getToken(STLParser.RB, 0); }
		public Until_Context(UntilContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterUntil_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitUntil_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitUntil_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UntilContext until() throws RecognitionException {
		UntilContext _localctx = new UntilContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_until);
		try {
			_localctx = new Until_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(U);
			setState(61);
			match(LB);
			setState(62);
			match(NUMBER);
			setState(63);
			match(COMMA);
			setState(64);
			match(NUMBER);
			setState(65);
			match(RB);
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

	public static class PerturbationContext extends ParserRuleContext {
		public PerturbationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perturbation; }
	 
		public PerturbationContext() { }
		public void copyFrom(PerturbationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Perturbation_Context extends PerturbationContext {
		public TerminalNode SignalPert() { return getToken(STLParser.SignalPert, 0); }
		public TerminalNode NUMBER() { return getToken(STLParser.NUMBER, 0); }
		public TerminalNode NNUMBER() { return getToken(STLParser.NNUMBER, 0); }
		public Perturbation_Context(PerturbationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterPerturbation_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitPerturbation_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitPerturbation_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerturbationContext perturbation() throws RecognitionException {
		PerturbationContext _localctx = new PerturbationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_perturbation);
		int _la;
		try {
			_localctx = new Perturbation_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(SignalPert);
			setState(68);
			match(T__0);
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==NNUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\7\4\63\n\4\f\4\16\4"+
		"\66\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\2\3\6\b\2\4\6\b\n\f\2\5\3\2\13\16\3\2\30\31\3\2\b\t\2K"+
		"\2\16\3\2\2\2\4\27\3\2\2\2\6(\3\2\2\2\b\67\3\2\2\2\n>\3\2\2\2\fE\3\2\2"+
		"\2\16\22\5\4\3\2\17\21\5\f\7\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2"+
		"\2\22\23\3\2\2\2\23\25\3\2\2\2\24\22\3\2\2\2\25\26\7\2\2\3\26\3\3\2\2"+
		"\2\27\30\7\32\2\2\30\31\7\3\2\2\31\32\5\6\4\2\32\5\3\2\2\2\33\34\b\4\1"+
		"\2\34\35\5\b\5\2\35\36\5\6\4\7\36)\3\2\2\2\37 \7\7\2\2 )\5\6\4\6!\"\7"+
		"\22\2\2\"#\5\6\4\2#$\7\24\2\2$)\3\2\2\2%&\7\33\2\2&\'\t\2\2\2\')\t\3\2"+
		"\2(\33\3\2\2\2(\37\3\2\2\2(!\3\2\2\2(%\3\2\2\2)\64\3\2\2\2*/\f\5\2\2+"+
		"\60\7\4\2\2,\60\7\5\2\2-\60\7\6\2\2.\60\5\n\6\2/+\3\2\2\2/,\3\2\2\2/-"+
		"\3\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61\63\5\6\4\6\62*\3\2\2\2\63\66\3\2\2"+
		"\2\64\62\3\2\2\2\64\65\3\2\2\2\65\7\3\2\2\2\66\64\3\2\2\2\678\t\4\2\2"+
		"89\7\25\2\29:\7\30\2\2:;\7\27\2\2;<\7\30\2\2<=\7\26\2\2=\t\3\2\2\2>?\7"+
		"\n\2\2?@\7\25\2\2@A\7\30\2\2AB\7\27\2\2BC\7\30\2\2CD\7\26\2\2D\13\3\2"+
		"\2\2EF\7\34\2\2FG\7\3\2\2GH\t\3\2\2H\r\3\2\2\2\6\22(/\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}