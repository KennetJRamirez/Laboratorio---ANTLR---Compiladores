// Generated from C:\Users\Joab Ramirez\Desktop\Laboratorio Compiladores\LabCompiladores\src\operaciones_aritmeticas_ejercicio1\GramaticaExpresiones.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaExpresionesLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, SCIENTIFIC_NUMBER=2, LPAREN=3, RPAREN=4, PLUS=5, MINUS=6, 
		TIMES=7, DIV=8, GT=9, LT=10, EQ=11, POINT=12, POW=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"VARIABLE", "SCIENTIFIC_NUMBER", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
		"'>'", "'<'", "'='", "'.'", "'^'", "WS"
	};
	public static final String[] ruleNames = {
		"VARIABLE", "VALID_ID_START", "VALID_ID_CHAR", "SCIENTIFIC_NUMBER", "NUMBER", 
		"E", "SIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "GT", 
		"LT", "EQ", "POINT", "POW", "WS"
	};


	public GramaticaExpresionesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramaticaExpresiones.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 18: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\20n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\5\3\62\n\3\3"+
		"\4\3\4\5\4\66\n\4\3\5\3\5\3\5\5\5;\n\5\3\5\3\5\5\5?\n\5\3\6\6\6B\n\6\r"+
		"\6\16\6C\3\6\3\6\6\6H\n\6\r\6\16\6I\5\6L\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\6\24i\n\24\r\24\16\24j\3\24\3\24\2\25\3\3"+
		"\1\5\2\1\7\2\1\t\4\1\13\2\1\r\2\1\17\2\1\21\5\1\23\6\1\25\7\1\27\b\1\31"+
		"\t\1\33\n\1\35\13\1\37\f\1!\r\1#\16\1%\17\1\'\20\2\3\2\6\5\2C\\aac|\4"+
		"\2GGgg\4\2--//\5\2\13\f\17\17\"\"p\2\3\3\2\2\2\2\t\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\3)\3\2\2\2\5\61\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\13A\3\2\2\2\rM\3\2"+
		"\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3"+
		"\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!a\3\2\2\2#c\3\2\2\2%e\3\2\2"+
		"\2\'h\3\2\2\2)-\5\5\3\2*,\5\7\4\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2"+
		"\2\2.\4\3\2\2\2/-\3\2\2\2\60\62\t\2\2\2\61\60\3\2\2\2\62\6\3\2\2\2\63"+
		"\66\5\5\3\2\64\66\4\62;\2\65\63\3\2\2\2\65\64\3\2\2\2\66\b\3\2\2\2\67"+
		">\5\13\6\28:\5\r\7\29;\5\17\b\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\5\13\6"+
		"\2=?\3\2\2\2>8\3\2\2\2>?\3\2\2\2?\n\3\2\2\2@B\4\62;\2A@\3\2\2\2BC\3\2"+
		"\2\2CA\3\2\2\2CD\3\2\2\2DK\3\2\2\2EG\7\60\2\2FH\4\62;\2GF\3\2\2\2HI\3"+
		"\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KE\3\2\2\2KL\3\2\2\2L\f\3\2\2\2MN"+
		"\t\3\2\2N\16\3\2\2\2OP\t\4\2\2P\20\3\2\2\2QR\7*\2\2R\22\3\2\2\2ST\7+\2"+
		"\2T\24\3\2\2\2UV\7-\2\2V\26\3\2\2\2WX\7/\2\2X\30\3\2\2\2YZ\7,\2\2Z\32"+
		"\3\2\2\2[\\\7\61\2\2\\\34\3\2\2\2]^\7@\2\2^\36\3\2\2\2_`\7>\2\2` \3\2"+
		"\2\2ab\7?\2\2b\"\3\2\2\2cd\7\60\2\2d$\3\2\2\2ef\7`\2\2f&\3\2\2\2gi\t\5"+
		"\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b\24\2\2m(\3"+
		"\2\2\2\f\2-\61\65:>CIKj";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}