// Generated from /Users/jun/Documents/project/STL/src/main/resources/STL.g4 by ANTLR 4.8
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
		T__0=1, AND=2, OR=3, IMPLY=4, F=5, G=6, U=7, LT=8, GT=9, LE=10, GE=11, 
		SpaceOrTab=12, Comment=13, Letter=14, LPAREN=15, LINEJUMP=16, RPAREN=17, 
		LB=18, RB=19, COMMA=20, NUMBER=21, NNUMBER=22, NAME=23, Signal=24, SignalPert=25;
	public static final int
		RULE_prog = 0, RULE_form = 1, RULE_expr = 2, RULE_eventually = 3, RULE_always = 4, 
		RULE_until = 5, RULE_interval = 6, RULE_intvalue = 7, RULE_relop = 8, 
		RULE_perturbation = 9, RULE_realnum = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "form", "expr", "eventually", "always", "until", "interval", 
			"intvalue", "relop", "perturbation", "realnum"
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
			setState(22);
			form();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SignalPert) {
				{
				{
				setState(23);
				perturbation();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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
			setState(31);
			match(NAME);
			setState(32);
			match(T__0);
			setState(33);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EventuallyContext eventually() {
			return getRuleContext(EventuallyContext.class,0);
		}
		public AlwaysContext always() {
			return getRuleContext(AlwaysContext.class,0);
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
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public RealnumContext realnum() {
			return getRuleContext(RealnumContext.class,0);
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F:
			case G:
				{
				_localctx = new EventualAlways_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case F:
					{
					setState(36);
					eventually();
					}
					break;
				case G:
					{
					setState(37);
					always();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40);
				expr(4);
				}
				break;
			case LPAREN:
				{
				_localctx = new Parens_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(LPAREN);
				setState(43);
				expr(0);
				setState(44);
				match(RPAREN);
				}
				break;
			case Signal:
				{
				_localctx = new Predicates_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(Signal);
				setState(47);
				relop();
				setState(48);
				realnum();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOrImplyUntil_Context(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(52);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(57);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AND:
						{
						setState(53);
						match(AND);
						}
						break;
					case OR:
						{
						setState(54);
						match(OR);
						}
						break;
					case IMPLY:
						{
						setState(55);
						match(IMPLY);
						}
						break;
					case U:
						{
						setState(56);
						until();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(59);
					expr(4);
					}
					} 
				}
				setState(64);
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
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
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
			setState(65);
			match(F);
			setState(66);
			interval();
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

	public static class AlwaysContext extends ParserRuleContext {
		public AlwaysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_always; }
	 
		public AlwaysContext() { }
		public void copyFrom(AlwaysContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Always_Context extends AlwaysContext {
		public TerminalNode G() { return getToken(STLParser.G, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public Always_Context(AlwaysContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterAlways_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitAlways_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitAlways_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlwaysContext always() throws RecognitionException {
		AlwaysContext _localctx = new AlwaysContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_always);
		try {
			_localctx = new Always_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(G);
			setState(69);
			interval();
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
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_until);
		try {
			_localctx = new Until_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(U);
			setState(72);
			interval();
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

	public static class IntervalContext extends ParserRuleContext {
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	 
		public IntervalContext() { }
		public void copyFrom(IntervalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Interval_Context extends IntervalContext {
		public TerminalNode LB() { return getToken(STLParser.LB, 0); }
		public List<IntvalueContext> intvalue() {
			return getRuleContexts(IntvalueContext.class);
		}
		public IntvalueContext intvalue(int i) {
			return getRuleContext(IntvalueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(STLParser.COMMA, 0); }
		public TerminalNode RB() { return getToken(STLParser.RB, 0); }
		public Interval_Context(IntervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterInterval_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitInterval_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitInterval_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interval);
		try {
			_localctx = new Interval_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(LB);
			setState(75);
			intvalue();
			setState(76);
			match(COMMA);
			setState(77);
			intvalue();
			setState(78);
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

	public static class IntvalueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(STLParser.NUMBER, 0); }
		public TerminalNode Letter() { return getToken(STLParser.Letter, 0); }
		public IntvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterIntvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitIntvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitIntvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntvalueContext intvalue() throws RecognitionException {
		IntvalueContext _localctx = new IntvalueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_intvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==Letter || _la==NUMBER) ) {
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(STLParser.GT, 0); }
		public TerminalNode LT() { return getToken(STLParser.LT, 0); }
		public TerminalNode GE() { return getToken(STLParser.GE, 0); }
		public TerminalNode LE() { return getToken(STLParser.LE, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
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
		public RealnumContext realnum() {
			return getRuleContext(RealnumContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_perturbation);
		try {
			_localctx = new Perturbation_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(SignalPert);
			setState(85);
			match(T__0);
			setState(86);
			realnum();
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

	public static class RealnumContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(STLParser.NUMBER, 0); }
		public TerminalNode NNUMBER() { return getToken(STLParser.NNUMBER, 0); }
		public RealnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterRealnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitRealnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitRealnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealnumContext realnum() throws RecognitionException {
		RealnumContext _localctx = new RealnumContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_realnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\2\3\6\r\2\4\6\b\n\f\16\20\22\24\26\2\5\4\2\20"+
		"\20\27\27\3\2\n\r\3\2\27\30\2Y\2\30\3\2\2\2\4!\3\2\2\2\6\64\3\2\2\2\b"+
		"C\3\2\2\2\nF\3\2\2\2\fI\3\2\2\2\16L\3\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24"+
		"V\3\2\2\2\26Z\3\2\2\2\30\34\5\4\3\2\31\33\5\24\13\2\32\31\3\2\2\2\33\36"+
		"\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7"+
		"\2\2\3 \3\3\2\2\2!\"\7\31\2\2\"#\7\3\2\2#$\5\6\4\2$\5\3\2\2\2%(\b\4\1"+
		"\2&)\5\b\5\2\')\5\n\6\2(&\3\2\2\2(\'\3\2\2\2)*\3\2\2\2*+\5\6\4\6+\65\3"+
		"\2\2\2,-\7\21\2\2-.\5\6\4\2./\7\23\2\2/\65\3\2\2\2\60\61\7\32\2\2\61\62"+
		"\5\22\n\2\62\63\5\26\f\2\63\65\3\2\2\2\64%\3\2\2\2\64,\3\2\2\2\64\60\3"+
		"\2\2\2\65@\3\2\2\2\66;\f\5\2\2\67<\7\4\2\28<\7\5\2\29<\7\6\2\2:<\5\f\7"+
		"\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<=\3\2\2\2=?\5\6\4\6>\66\3"+
		"\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\7\3\2\2\2B@\3\2\2\2CD\7\7\2\2DE"+
		"\5\16\b\2E\t\3\2\2\2FG\7\b\2\2GH\5\16\b\2H\13\3\2\2\2IJ\7\t\2\2JK\5\16"+
		"\b\2K\r\3\2\2\2LM\7\24\2\2MN\5\20\t\2NO\7\26\2\2OP\5\20\t\2PQ\7\25\2\2"+
		"Q\17\3\2\2\2RS\t\2\2\2S\21\3\2\2\2TU\t\3\2\2U\23\3\2\2\2VW\7\33\2\2WX"+
		"\7\3\2\2XY\5\26\f\2Y\25\3\2\2\2Z[\t\4\2\2[\27\3\2\2\2\7\34(\64;@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}