// Generated from C:\Users\Joab Ramirez\Desktop\Laboratorio Compiladores\LabCompiladores\src\sql_ejercicio2\SQL.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CREATE=2, TABLE=3, INT=4, PRIMARY=5, KEY=6, TEXT=7, INSERT=8, 
		INTO=9, VALUES=10, SELECT=11, FROM=12, WHERE=13, GT=14, NUMBER_LITERAL=15, 
		STRING_LITERAL=16, ID=17, COMMA=18, LPAREN=19, RPAREN=20, SEMICOLON=21, 
		WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'*'", "'CREATE'", "'TABLE'", "'INT'", "'PRIMARY'", "'KEY'", "'TEXT'", 
		"'INSERT'", "'INTO'", "'VALUES'", "'SELECT'", "'FROM'", "'WHERE'", "'>'", 
		"NUMBER_LITERAL", "STRING_LITERAL", "ID", "','", "'('", "')'", "';'", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__0", "CREATE", "TABLE", "INT", "PRIMARY", "KEY", "TEXT", "INSERT", 
		"INTO", "VALUES", "SELECT", "FROM", "WHERE", "GT", "NUMBER_LITERAL", "STRING_LITERAL", 
		"ID", "COMMA", "LPAREN", "RPAREN", "SEMICOLON", "WS"
	};


	public SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

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
		case 21: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\30\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\6\20|\n\20\r\20\16\20}\3\21\3\21\3\21\3\21\7"+
		"\21\u0084\n\21\f\21\16\21\u0087\13\21\3\21\3\21\3\22\3\22\7\22\u008d\n"+
		"\22\f\22\16\22\u0090\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\6\27\u009b\n\27\r\27\16\27\u009c\3\27\3\27\2\30\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35"+
		"\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\2\3\2\7\3\2\62"+
		";\3\2))\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u00a4\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2"+
		"\2\78\3\2\2\2\t>\3\2\2\2\13B\3\2\2\2\rJ\3\2\2\2\17N\3\2\2\2\21S\3\2\2"+
		"\2\23Z\3\2\2\2\25_\3\2\2\2\27f\3\2\2\2\31m\3\2\2\2\33r\3\2\2\2\35x\3\2"+
		"\2\2\37{\3\2\2\2!\177\3\2\2\2#\u008a\3\2\2\2%\u0091\3\2\2\2\'\u0093\3"+
		"\2\2\2)\u0095\3\2\2\2+\u0097\3\2\2\2-\u009a\3\2\2\2/\60\7,\2\2\60\4\3"+
		"\2\2\2\61\62\7E\2\2\62\63\7T\2\2\63\64\7G\2\2\64\65\7C\2\2\65\66\7V\2"+
		"\2\66\67\7G\2\2\67\6\3\2\2\289\7V\2\29:\7C\2\2:;\7D\2\2;<\7N\2\2<=\7G"+
		"\2\2=\b\3\2\2\2>?\7K\2\2?@\7P\2\2@A\7V\2\2A\n\3\2\2\2BC\7R\2\2CD\7T\2"+
		"\2DE\7K\2\2EF\7O\2\2FG\7C\2\2GH\7T\2\2HI\7[\2\2I\f\3\2\2\2JK\7M\2\2KL"+
		"\7G\2\2LM\7[\2\2M\16\3\2\2\2NO\7V\2\2OP\7G\2\2PQ\7Z\2\2QR\7V\2\2R\20\3"+
		"\2\2\2ST\7K\2\2TU\7P\2\2UV\7U\2\2VW\7G\2\2WX\7T\2\2XY\7V\2\2Y\22\3\2\2"+
		"\2Z[\7K\2\2[\\\7P\2\2\\]\7V\2\2]^\7Q\2\2^\24\3\2\2\2_`\7X\2\2`a\7C\2\2"+
		"ab\7N\2\2bc\7W\2\2cd\7G\2\2de\7U\2\2e\26\3\2\2\2fg\7U\2\2gh\7G\2\2hi\7"+
		"N\2\2ij\7G\2\2jk\7E\2\2kl\7V\2\2l\30\3\2\2\2mn\7H\2\2no\7T\2\2op\7Q\2"+
		"\2pq\7O\2\2q\32\3\2\2\2rs\7Y\2\2st\7J\2\2tu\7G\2\2uv\7T\2\2vw\7G\2\2w"+
		"\34\3\2\2\2xy\7@\2\2y\36\3\2\2\2z|\t\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2"+
		"\2}~\3\2\2\2~ \3\2\2\2\177\u0085\7)\2\2\u0080\u0084\n\3\2\2\u0081\u0082"+
		"\7)\2\2\u0082\u0084\7)\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7)\2\2\u0089\"\3\2\2\2\u008a\u008e"+
		"\t\4\2\2\u008b\u008d\t\5\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f$\3\2\2\2\u0090\u008e\3\2\2\2"+
		"\u0091\u0092\7.\2\2\u0092&\3\2\2\2\u0093\u0094\7*\2\2\u0094(\3\2\2\2\u0095"+
		"\u0096\7+\2\2\u0096*\3\2\2\2\u0097\u0098\7=\2\2\u0098,\3\2\2\2\u0099\u009b"+
		"\t\6\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\27\2\2\u009f.\3\2\2\2"+
		"\b\2}\u0083\u0085\u008e\u009c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}