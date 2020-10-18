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
		AND=1, OR=2, IMPLY=3, F=4, G=5, U=6, LT=7, GT=8, LE=9, GE=10, Equal=11, 
		SpaceOrTab=12, Comment=13, Letter=14, LPAREN=15, LINEJUMP=16, RPAREN=17, 
		LB=18, RB=19, COMMA=20, NUMBER=21, NNUMBER=22, NAME=23, Signal=24, SignalPert=25;
	public static final int
		RULE_prog = 0, RULE_formula = 1, RULE_expr = 2, RULE_eventually = 3, RULE_always = 4, 
		RULE_until = 5, RULE_interval = 6, RULE_intvalue = 7, RULE_predicates = 8, 
		RULE_relop = 9, RULE_perturbation_list = 10, RULE_realnum = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "formula", "expr", "eventually", "always", "until", "interval", 
			"intvalue", "predicates", "relop", "perturbation_list", "realnum"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AND'", "'OR'", "'-->'", "'F_'", "'G_'", "'U_'", "'<'", "'>'", 
			"'<='", "'>='", "'='", null, null, null, "'('", "'\n'", "')'", "'['", 
			"']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "IMPLY", "F", "G", "U", "LT", "GT", "LE", "GE", "Equal", 
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
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(STLParser.EOF, 0); }
		public List<Perturbation_listContext> perturbation_list() {
			return getRuleContexts(Perturbation_listContext.class);
		}
		public Perturbation_listContext perturbation_list(int i) {
			return getRuleContext(Perturbation_listContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			formula();
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				perturbation_list();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SignalPert );
			setState(30);
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

	public static class FormulaContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(STLParser.NAME, 0); }
		public TerminalNode Equal() { return getToken(STLParser.Equal, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(NAME);
			setState(33);
			match(Equal);
			setState(34);
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
		public EventuallyContext eventually() {
			return getRuleContext(EventuallyContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AlwaysContext always() {
			return getRuleContext(AlwaysContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(STLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(STLParser.RPAREN, 0); }
		public PredicatesContext predicates() {
			return getRuleContext(PredicatesContext.class,0);
		}
		public TerminalNode AND() { return getToken(STLParser.AND, 0); }
		public TerminalNode OR() { return getToken(STLParser.OR, 0); }
		public TerminalNode IMPLY() { return getToken(STLParser.IMPLY, 0); }
		public UntilContext until() {
			return getRuleContext(UntilContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitExpr(this);
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
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F:
				{
				setState(37);
				eventually();
				setState(38);
				expr(8);
				}
				break;
			case G:
				{
				setState(40);
				always();
				setState(41);
				expr(7);
				}
				break;
			case LPAREN:
				{
				setState(43);
				match(LPAREN);
				setState(44);
				expr(0);
				setState(45);
				match(RPAREN);
				}
				break;
			case Signal:
				{
				setState(47);
				predicates();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(63);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(50);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(51);
						match(AND);
						setState(52);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(53);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(54);
						match(OR);
						setState(55);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(57);
						match(IMPLY);
						setState(58);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(60);
						until();
						setState(61);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(67);
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

	public static class EventuallyContext extends ParserRuleContext {
		public TerminalNode F() { return getToken(STLParser.F, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public EventuallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventually; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterEventually(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitEventually(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitEventually(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventuallyContext eventually() throws RecognitionException {
		EventuallyContext _localctx = new EventuallyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eventually);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(F);
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

	public static class AlwaysContext extends ParserRuleContext {
		public TerminalNode G() { return getToken(STLParser.G, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public AlwaysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_always; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterAlways(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitAlways(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitAlways(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlwaysContext always() throws RecognitionException {
		AlwaysContext _localctx = new AlwaysContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_always);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(G);
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

	public static class UntilContext extends ParserRuleContext {
		public TerminalNode U() { return getToken(STLParser.U, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public UntilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitUntil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitUntil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UntilContext until() throws RecognitionException {
		UntilContext _localctx = new UntilContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(U);
			setState(75);
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
		public TerminalNode LB() { return getToken(STLParser.LB, 0); }
		public List<IntvalueContext> intvalue() {
			return getRuleContexts(IntvalueContext.class);
		}
		public IntvalueContext intvalue(int i) {
			return getRuleContext(IntvalueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(STLParser.COMMA, 0); }
		public TerminalNode RB() { return getToken(STLParser.RB, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(LB);
			setState(78);
			intvalue();
			setState(79);
			match(COMMA);
			setState(80);
			intvalue();
			setState(81);
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
			setState(83);
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

	public static class PredicatesContext extends ParserRuleContext {
		public TerminalNode Signal() { return getToken(STLParser.Signal, 0); }
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public RealnumContext realnum() {
			return getRuleContext(RealnumContext.class,0);
		}
		public PredicatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterPredicates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitPredicates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitPredicates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatesContext predicates() throws RecognitionException {
		PredicatesContext _localctx = new PredicatesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_predicates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(Signal);
			setState(86);
			relop();
			setState(87);
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
		enterRule(_localctx, 18, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
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

	public static class Perturbation_listContext extends ParserRuleContext {
		public TerminalNode SignalPert() { return getToken(STLParser.SignalPert, 0); }
		public TerminalNode Equal() { return getToken(STLParser.Equal, 0); }
		public RealnumContext realnum() {
			return getRuleContext(RealnumContext.class,0);
		}
		public Perturbation_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perturbation_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).enterPerturbation_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STLListener ) ((STLListener)listener).exitPerturbation_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STLVisitor ) return ((STLVisitor<? extends T>)visitor).visitPerturbation_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perturbation_listContext perturbation_list() throws RecognitionException {
		Perturbation_listContext _localctx = new Perturbation_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_perturbation_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(SignalPert);
			setState(92);
			match(Equal);
			setState(93);
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
		enterRule(_localctx, 22, RULE_realnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16\4E\13\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\2\3\6\16\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\2\5\4\2\20\20\27\27\3\2\t\f\3\2\27\30\2_\2\32\3\2\2"+
		"\2\4\"\3\2\2\2\6\62\3\2\2\2\bF\3\2\2\2\nI\3\2\2\2\fL\3\2\2\2\16O\3\2\2"+
		"\2\20U\3\2\2\2\22W\3\2\2\2\24[\3\2\2\2\26]\3\2\2\2\30a\3\2\2\2\32\34\5"+
		"\4\3\2\33\35\5\26\f\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37"+
		"\3\2\2\2\37 \3\2\2\2 !\7\2\2\3!\3\3\2\2\2\"#\7\31\2\2#$\7\r\2\2$%\5\6"+
		"\4\2%\5\3\2\2\2&\'\b\4\1\2\'(\5\b\5\2()\5\6\4\n)\63\3\2\2\2*+\5\n\6\2"+
		"+,\5\6\4\t,\63\3\2\2\2-.\7\21\2\2./\5\6\4\2/\60\7\23\2\2\60\63\3\2\2\2"+
		"\61\63\5\22\n\2\62&\3\2\2\2\62*\3\2\2\2\62-\3\2\2\2\62\61\3\2\2\2\63C"+
		"\3\2\2\2\64\65\f\b\2\2\65\66\7\3\2\2\66B\5\6\4\t\678\f\7\2\289\7\4\2\2"+
		"9B\5\6\4\b:;\f\6\2\2;<\7\5\2\2<B\5\6\4\7=>\f\5\2\2>?\5\f\7\2?@\5\6\4\6"+
		"@B\3\2\2\2A\64\3\2\2\2A\67\3\2\2\2A:\3\2\2\2A=\3\2\2\2BE\3\2\2\2CA\3\2"+
		"\2\2CD\3\2\2\2D\7\3\2\2\2EC\3\2\2\2FG\7\6\2\2GH\5\16\b\2H\t\3\2\2\2IJ"+
		"\7\7\2\2JK\5\16\b\2K\13\3\2\2\2LM\7\b\2\2MN\5\16\b\2N\r\3\2\2\2OP\7\24"+
		"\2\2PQ\5\20\t\2QR\7\26\2\2RS\5\20\t\2ST\7\25\2\2T\17\3\2\2\2UV\t\2\2\2"+
		"V\21\3\2\2\2WX\7\32\2\2XY\5\24\13\2YZ\5\30\r\2Z\23\3\2\2\2[\\\t\3\2\2"+
		"\\\25\3\2\2\2]^\7\33\2\2^_\7\r\2\2_`\5\30\r\2`\27\3\2\2\2ab\t\4\2\2b\31"+
		"\3\2\2\2\6\36\62AC";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}