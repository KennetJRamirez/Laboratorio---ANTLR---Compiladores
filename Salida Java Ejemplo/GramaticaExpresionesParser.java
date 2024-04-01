// Generated from C:\Users\Joab Ramirez\Downloads\GramaticaExpresiones.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaExpresionesParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, SCIENTIFIC_NUMBER=2, LPAREN=3, RPAREN=4, PLUS=5, MINUS=6, 
		TIMES=7, DIV=8, GT=9, LT=10, EQ=11, POINT=12, POW=13, WS=14;
	public static final String[] tokenNames = {
		"<INVALID>", "VARIABLE", "SCIENTIFIC_NUMBER", "'('", "')'", "'+'", "'-'", 
		"'*'", "'/'", "'>'", "'<'", "'='", "'.'", "'^'", "WS"
	};
	public static final int
		RULE_equation = 0, RULE_expression = 1, RULE_term = 2, RULE_factor = 3, 
		RULE_signedAtom = 4, RULE_atom = 5, RULE_scientific = 6, RULE_variable = 7, 
		RULE_relop = 8;
	public static final String[] ruleNames = {
		"equation", "expression", "term", "factor", "signedAtom", "atom", "scientific", 
		"variable", "relop"
	};

	@Override
	public String getGrammarFileName() { return "GramaticaExpresiones.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaExpresionesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EquationContext extends ParserRuleContext {
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).exitEquation(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); expression();
			setState(19); relop();
			setState(20); expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode MINUS(int i) {
			return getToken(GramaticaExpresionesParser.MINUS, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(GramaticaExpresionesParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(GramaticaExpresionesParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(GramaticaExpresionesParser.PLUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); term();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(23);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(24); term();
				}
				}
				setState(29);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public TerminalNode TIMES(int i) {
			return getToken(GramaticaExpresionesParser.TIMES, i);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(GramaticaExpresionesParser.TIMES); }
		public List<TerminalNode> DIV() { return getTokens(GramaticaExpresionesParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(GramaticaExpresionesParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); factor();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIV) {
				{
				{
				setState(31);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(32); factor();
				}
				}
				setState(37);
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

	public static class FactorContext extends ParserRuleContext {
		public List<SignedAtomContext> signedAtom() {
			return getRuleContexts(SignedAtomContext.class);
		}
		public SignedAtomContext signedAtom(int i) {
			return getRuleContext(SignedAtomContext.class,i);
		}
		public TerminalNode POW(int i) {
			return getToken(GramaticaExpresionesParser.POW, i);
		}
		public List<TerminalNode> POW() { return getTokens(GramaticaExpresionesParser.POW); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); signedAtom();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POW) {
				{
				{
				setState(39); match(POW);
				setState(40); signedAtom();
				}
				}
				setState(45);
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

	public static class SignedAtomContext extends ParserRuleContext {
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(GramaticaExpresionesParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GramaticaExpresionesParser.MINUS, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SignedAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).enterSignedAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).exitSignedAtom(this);
		}
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_signedAtom);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); match(PLUS);
				setState(47); signedAtom();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(48); match(MINUS);
				setState(49); signedAtom();
				}
				break;
			case VARIABLE:
			case SCIENTIFIC_NUMBER:
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(50); atom();
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GramaticaExpresionesParser.LPAREN, 0); }
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GramaticaExpresionesParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(59);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); scientific();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); variable();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(55); match(LPAREN);
				setState(56); expression();
				setState(57); match(RPAREN);
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

	public static class ScientificContext extends ParserRuleContext {
		public TerminalNode SCIENTIFIC_NUMBER() { return getToken(GramaticaExpresionesParser.SCIENTIFIC_NUMBER, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).enterScientific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).exitScientific(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(SCIENTIFIC_NUMBER);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(GramaticaExpresionesParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(VARIABLE);
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
		public TerminalNode LT() { return getToken(GramaticaExpresionesParser.LT, 0); }
		public TerminalNode GT() { return getToken(GramaticaExpresionesParser.GT, 0); }
		public TerminalNode EQ() { return getToken(GramaticaExpresionesParser.EQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaExpresionesListener ) ((GramaticaExpresionesListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\20F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\4\3\4\3\4\7\4$\n\4\f\4"+
		"\16\4\'\13\4\3\5\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\66\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\2\13\2\4\6\b\n\f\16\20\22\2\5\3\2\7\b\3\2\t\n\3\2\13\rC\2\24\3\2\2\2"+
		"\4\30\3\2\2\2\6 \3\2\2\2\b(\3\2\2\2\n\65\3\2\2\2\f=\3\2\2\2\16?\3\2\2"+
		"\2\20A\3\2\2\2\22C\3\2\2\2\24\25\5\4\3\2\25\26\5\22\n\2\26\27\5\4\3\2"+
		"\27\3\3\2\2\2\30\35\5\6\4\2\31\32\t\2\2\2\32\34\5\6\4\2\33\31\3\2\2\2"+
		"\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\5\3\2\2\2\37\35\3\2\2\2"+
		" %\5\b\5\2!\"\t\3\2\2\"$\5\b\5\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2"+
		"\2\2&\7\3\2\2\2\'%\3\2\2\2(-\5\n\6\2)*\7\17\2\2*,\5\n\6\2+)\3\2\2\2,/"+
		"\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\t\3\2\2\2/-\3\2\2\2\60\61\7\7\2\2\61\66"+
		"\5\n\6\2\62\63\7\b\2\2\63\66\5\n\6\2\64\66\5\f\7\2\65\60\3\2\2\2\65\62"+
		"\3\2\2\2\65\64\3\2\2\2\66\13\3\2\2\2\67>\5\16\b\28>\5\20\t\29:\7\5\2\2"+
		":;\5\4\3\2;<\7\6\2\2<>\3\2\2\2=\67\3\2\2\2=8\3\2\2\2=9\3\2\2\2>\r\3\2"+
		"\2\2?@\7\4\2\2@\17\3\2\2\2AB\7\3\2\2B\21\3\2\2\2CD\t\4\2\2D\23\3\2\2\2"+
		"\7\35%-\65=";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}