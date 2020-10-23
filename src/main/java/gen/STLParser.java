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
		RULE_prog = 0, RULE_form = 1, RULE_expr = 2, RULE_eventually = 3, RULE_global = 4, 
		RULE_not = 5, RULE_relop = 6, RULE_perturbation = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "form", "expr", "eventually", "global", "not", "relop", "perturbation"
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
			setState(16);
			form();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SignalPert) {
				{
				{
				setState(17);
				perturbation();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
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
			setState(25);
			match(NAME);
			setState(26);
			match(T__0);
			setState(27);
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
	public static class Imply_Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IMPLY() { return getToken(STLParser.IMPLY, 0); }
		public Imply_Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterImply_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitImply_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitImply_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Until_Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode U() { return getToken(STLParser.U, 0); }
		public TerminalNode LB() { return getToken(STLParser.LB, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(STLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(STLParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(STLParser.COMMA, 0); }
		public TerminalNode RB() { return getToken(STLParser.RB, 0); }
		public Until_Context(ExprContext ctx) { copyFrom(ctx); }
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
	public static class And_Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(STLParser.AND, 0); }
		public And_Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterAnd_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitAnd_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitAnd_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpression_Context extends ExprContext {
		public EventuallyContext eventually() {
			return getRuleContext(EventuallyContext.class,0);
		}
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public UnaryExpression_Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterUnaryExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitUnaryExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitUnaryExpression_(this);
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
	public static class Or_Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(STLParser.OR, 0); }
		public Or_Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterOr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitOr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitOr_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Predicates_Context extends ExprContext {
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case F:
			case G:
				{
				_localctx = new UnaryExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case F:
					{
					setState(30);
					eventually();
					}
					break;
				case G:
					{
					setState(31);
					global();
					}
					break;
				case NOT:
					{
					setState(32);
					not();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case LPAREN:
				{
				_localctx = new Parens_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(LPAREN);
				setState(36);
				expr(0);
				setState(37);
				match(RPAREN);
				}
				break;
			case Signal:
				{
				_localctx = new Predicates_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				relop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new And_Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(42);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(43);
						match(AND);
						setState(44);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new Or_Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(45);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(46);
						match(OR);
						setState(47);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new Imply_Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(48);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(49);
						match(IMPLY);
						setState(50);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new Until_Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(52);
						match(U);
						setState(53);
						match(LB);
						setState(54);
						match(NUMBER);
						setState(55);
						match(COMMA);
						setState(56);
						match(NUMBER);
						setState(57);
						match(RB);
						setState(58);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class EventuallyContext extends ParserRuleContext {
		public EventuallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventually; }
	 
		public EventuallyContext() { }
		public void copyFrom(EventuallyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Eventually_Context extends EventuallyContext {
		public TerminalNode F() { return getToken(STLParser.F, 0); }
		public TerminalNode LB() { return getToken(STLParser.LB, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(STLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(STLParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(STLParser.COMMA, 0); }
		public TerminalNode RB() { return getToken(STLParser.RB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Eventually_Context(EventuallyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterEventually_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitEventually_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitEventually_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventuallyContext eventually() throws RecognitionException {
		EventuallyContext _localctx = new EventuallyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eventually);
		try {
			_localctx = new Eventually_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(F);
			setState(65);
			match(LB);
			setState(66);
			match(NUMBER);
			setState(67);
			match(COMMA);
			setState(68);
			match(NUMBER);
			setState(69);
			match(RB);
			setState(70);
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

	public static class GlobalContext extends ParserRuleContext {
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
	 
		public GlobalContext() { }
		public void copyFrom(GlobalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Global_Context extends GlobalContext {
		public TerminalNode G() { return getToken(STLParser.G, 0); }
		public TerminalNode LB() { return getToken(STLParser.LB, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(STLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(STLParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(STLParser.COMMA, 0); }
		public TerminalNode RB() { return getToken(STLParser.RB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Global_Context(GlobalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterGlobal_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitGlobal_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitGlobal_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_global);
		try {
			_localctx = new Global_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(G);
			setState(73);
			match(LB);
			setState(74);
			match(NUMBER);
			setState(75);
			match(COMMA);
			setState(76);
			match(NUMBER);
			setState(77);
			match(RB);
			setState(78);
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

	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
	 
		public NotContext() { }
		public void copyFrom(NotContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Not_Context extends NotContext {
		public TerminalNode NOT() { return getToken(STLParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Not_Context(NotContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterNot_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitNot_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitNot_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_not);
		try {
			_localctx = new Not_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(NOT);
			setState(81);
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

	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	 
		public RelopContext() { }
		public void copyFrom(RelopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GE_Context extends RelopContext {
		public TerminalNode Signal() { return getToken(STLParser.Signal, 0); }
		public TerminalNode GE() { return getToken(STLParser.GE, 0); }
		public TerminalNode NUMBER() { return getToken(STLParser.NUMBER, 0); }
		public TerminalNode NNUMBER() { return getToken(STLParser.NNUMBER, 0); }
		public GE_Context(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterGE_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitGE_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitGE_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GT_Context extends RelopContext {
		public TerminalNode Signal() { return getToken(STLParser.Signal, 0); }
		public TerminalNode GT() { return getToken(STLParser.GT, 0); }
		public TerminalNode NUMBER() { return getToken(STLParser.NUMBER, 0); }
		public TerminalNode NNUMBER() { return getToken(STLParser.NNUMBER, 0); }
		public GT_Context(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterGT_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitGT_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitGT_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LT_Context extends RelopContext {
		public TerminalNode Signal() { return getToken(STLParser.Signal, 0); }
		public TerminalNode LT() { return getToken(STLParser.LT, 0); }
		public TerminalNode NUMBER() { return getToken(STLParser.NUMBER, 0); }
		public TerminalNode NNUMBER() { return getToken(STLParser.NNUMBER, 0); }
		public LT_Context(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterLT_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitLT_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitLT_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LE_Context extends RelopContext {
		public TerminalNode Signal() { return getToken(STLParser.Signal, 0); }
		public TerminalNode LE() { return getToken(STLParser.LE, 0); }
		public TerminalNode NUMBER() { return getToken(STLParser.NUMBER, 0); }
		public TerminalNode NNUMBER() { return getToken(STLParser.NNUMBER, 0); }
		public LE_Context(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterLE_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitLE_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitLE_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relop);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new GT_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(Signal);
				setState(84);
				match(GT);
				setState(85);
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
			case 2:
				_localctx = new LT_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(Signal);
				setState(87);
				match(LT);
				setState(88);
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
			case 3:
				_localctx = new GE_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(Signal);
				setState(90);
				match(GE);
				setState(91);
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
			case 4:
				_localctx = new LE_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(Signal);
				setState(93);
				match(LE);
				setState(94);
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
		enterRule(_localctx, 14, RULE_perturbation);
		int _la;
		try {
			_localctx = new Perturbation_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(SignalPert);
			setState(98);
			match(T__0);
			setState(99);
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2"+
		"\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4$\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4+\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bb\n\b\3\t\3\t\3\t\3\t\3\t\2\3\6\n"+
		"\2\4\6\b\n\f\16\20\2\3\3\2\30\31\2k\2\22\3\2\2\2\4\33\3\2\2\2\6*\3\2\2"+
		"\2\bB\3\2\2\2\nJ\3\2\2\2\fR\3\2\2\2\16a\3\2\2\2\20c\3\2\2\2\22\26\5\4"+
		"\3\2\23\25\5\20\t\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3"+
		"\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\7"+
		"\32\2\2\34\35\7\3\2\2\35\36\5\6\4\2\36\5\3\2\2\2\37#\b\4\1\2 $\5\b\5\2"+
		"!$\5\n\6\2\"$\5\f\7\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$+\3\2\2\2%&\7\22"+
		"\2\2&\'\5\6\4\2\'(\7\24\2\2(+\3\2\2\2)+\5\16\b\2*\37\3\2\2\2*%\3\2\2\2"+
		"*)\3\2\2\2+?\3\2\2\2,-\f\b\2\2-.\7\4\2\2.>\5\6\4\t/\60\f\7\2\2\60\61\7"+
		"\5\2\2\61>\5\6\4\b\62\63\f\6\2\2\63\64\7\6\2\2\64>\5\6\4\7\65\66\f\5\2"+
		"\2\66\67\7\n\2\2\678\7\25\2\289\7\30\2\29:\7\27\2\2:;\7\30\2\2;<\7\26"+
		"\2\2<>\5\6\4\6=,\3\2\2\2=/\3\2\2\2=\62\3\2\2\2=\65\3\2\2\2>A\3\2\2\2?"+
		"=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2A?\3\2\2\2BC\7\b\2\2CD\7\25\2\2DE\7\30\2"+
		"\2EF\7\27\2\2FG\7\30\2\2GH\7\26\2\2HI\5\6\4\2I\t\3\2\2\2JK\7\t\2\2KL\7"+
		"\25\2\2LM\7\30\2\2MN\7\27\2\2NO\7\30\2\2OP\7\26\2\2PQ\5\6\4\2Q\13\3\2"+
		"\2\2RS\7\7\2\2ST\5\6\4\2T\r\3\2\2\2UV\7\33\2\2VW\7\f\2\2Wb\t\2\2\2XY\7"+
		"\33\2\2YZ\7\13\2\2Zb\t\2\2\2[\\\7\33\2\2\\]\7\16\2\2]b\t\2\2\2^_\7\33"+
		"\2\2_`\7\r\2\2`b\t\2\2\2aU\3\2\2\2aX\3\2\2\2a[\3\2\2\2a^\3\2\2\2b\17\3"+
		"\2\2\2cd\7\34\2\2de\7\3\2\2ef\t\2\2\2f\21\3\2\2\2\b\26#*=?a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}