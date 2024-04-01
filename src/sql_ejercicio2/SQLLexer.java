// Generated from C:/Users/Joab Ramirez/Desktop/Laboratorio Compiladores/LabCompiladores/src/sql_ejercicio2/SQL.g4 by ANTLR 4.13.1
package sql_ejercicio2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CREATE=2, TABLE=3, INT=4, PRIMARY=5, KEY=6, TEXT=7, INSERT=8, 
		INTO=9, VALUES=10, SELECT=11, FROM=12, WHERE=13, GT=14, NUMBER_LITERAL=15, 
		STRING_LITERAL=16, ID=17, COMMA=18, LPAREN=19, RPAREN=20, SEMICOLON=21, 
		WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "CREATE", "TABLE", "INT", "PRIMARY", "KEY", "TEXT", "INSERT", 
			"INTO", "VALUES", "SELECT", "FROM", "WHERE", "GT", "NUMBER_LITERAL", 
			"STRING_LITERAL", "ID", "COMMA", "LPAREN", "RPAREN", "SEMICOLON", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'CREATE'", "'TABLE'", "'INT'", "'PRIMARY'", "'KEY'", "'TEXT'", 
			"'INSERT'", "'INTO'", "'VALUES'", "'SELECT'", "'FROM'", "'WHERE'", "'>'", 
			null, null, null, "','", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CREATE", "TABLE", "INT", "PRIMARY", "KEY", "TEXT", "INSERT", 
			"INTO", "VALUES", "SELECT", "FROM", "WHERE", "GT", "NUMBER_LITERAL", 
			"STRING_LITERAL", "ID", "COMMA", "LPAREN", "RPAREN", "SEMICOLON", "WS"
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


	public SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

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
		"\u0004\u0000\u0016\u009e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0004\u000ez\b\u000e\u000b\u000e"+
		"\f\u000e{\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0082\b\u000f\n\u000f\f\u000f\u0085\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u008b\b\u0010\n\u0010\f\u0010\u008e\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u0099\b\u0015\u000b\u0015"+
		"\f\u0015\u009a\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0005\u0001\u0000"+
		"09\u0001\u0000\'\'\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t"+
		"\n\r\r  \u00a2\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000"+
		"\u0000\u0003/\u0001\u0000\u0000\u0000\u00056\u0001\u0000\u0000\u0000\u0007"+
		"<\u0001\u0000\u0000\u0000\t@\u0001\u0000\u0000\u0000\u000bH\u0001\u0000"+
		"\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000\u0000\u0000"+
		"\u0011X\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015d"+
		"\u0001\u0000\u0000\u0000\u0017k\u0001\u0000\u0000\u0000\u0019p\u0001\u0000"+
		"\u0000\u0000\u001bv\u0001\u0000\u0000\u0000\u001dy\u0001\u0000\u0000\u0000"+
		"\u001f}\u0001\u0000\u0000\u0000!\u0088\u0001\u0000\u0000\u0000#\u008f"+
		"\u0001\u0000\u0000\u0000%\u0091\u0001\u0000\u0000\u0000\'\u0093\u0001"+
		"\u0000\u0000\u0000)\u0095\u0001\u0000\u0000\u0000+\u0098\u0001\u0000\u0000"+
		"\u0000-.\u0005*\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005C\u0000"+
		"\u000001\u0005R\u0000\u000012\u0005E\u0000\u000023\u0005A\u0000\u0000"+
		"34\u0005T\u0000\u000045\u0005E\u0000\u00005\u0004\u0001\u0000\u0000\u0000"+
		"67\u0005T\u0000\u000078\u0005A\u0000\u000089\u0005B\u0000\u00009:\u0005"+
		"L\u0000\u0000:;\u0005E\u0000\u0000;\u0006\u0001\u0000\u0000\u0000<=\u0005"+
		"I\u0000\u0000=>\u0005N\u0000\u0000>?\u0005T\u0000\u0000?\b\u0001\u0000"+
		"\u0000\u0000@A\u0005P\u0000\u0000AB\u0005R\u0000\u0000BC\u0005I\u0000"+
		"\u0000CD\u0005M\u0000\u0000DE\u0005A\u0000\u0000EF\u0005R\u0000\u0000"+
		"FG\u0005Y\u0000\u0000G\n\u0001\u0000\u0000\u0000HI\u0005K\u0000\u0000"+
		"IJ\u0005E\u0000\u0000JK\u0005Y\u0000\u0000K\f\u0001\u0000\u0000\u0000"+
		"LM\u0005T\u0000\u0000MN\u0005E\u0000\u0000NO\u0005X\u0000\u0000OP\u0005"+
		"T\u0000\u0000P\u000e\u0001\u0000\u0000\u0000QR\u0005I\u0000\u0000RS\u0005"+
		"N\u0000\u0000ST\u0005S\u0000\u0000TU\u0005E\u0000\u0000UV\u0005R\u0000"+
		"\u0000VW\u0005T\u0000\u0000W\u0010\u0001\u0000\u0000\u0000XY\u0005I\u0000"+
		"\u0000YZ\u0005N\u0000\u0000Z[\u0005T\u0000\u0000[\\\u0005O\u0000\u0000"+
		"\\\u0012\u0001\u0000\u0000\u0000]^\u0005V\u0000\u0000^_\u0005A\u0000\u0000"+
		"_`\u0005L\u0000\u0000`a\u0005U\u0000\u0000ab\u0005E\u0000\u0000bc\u0005"+
		"S\u0000\u0000c\u0014\u0001\u0000\u0000\u0000de\u0005S\u0000\u0000ef\u0005"+
		"E\u0000\u0000fg\u0005L\u0000\u0000gh\u0005E\u0000\u0000hi\u0005C\u0000"+
		"\u0000ij\u0005T\u0000\u0000j\u0016\u0001\u0000\u0000\u0000kl\u0005F\u0000"+
		"\u0000lm\u0005R\u0000\u0000mn\u0005O\u0000\u0000no\u0005M\u0000\u0000"+
		"o\u0018\u0001\u0000\u0000\u0000pq\u0005W\u0000\u0000qr\u0005H\u0000\u0000"+
		"rs\u0005E\u0000\u0000st\u0005R\u0000\u0000tu\u0005E\u0000\u0000u\u001a"+
		"\u0001\u0000\u0000\u0000vw\u0005>\u0000\u0000w\u001c\u0001\u0000\u0000"+
		"\u0000xz\u0007\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u001e"+
		"\u0001\u0000\u0000\u0000}\u0083\u0005\'\u0000\u0000~\u0082\b\u0001\u0000"+
		"\u0000\u007f\u0080\u0005\'\u0000\u0000\u0080\u0082\u0005\'\u0000\u0000"+
		"\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005\'\u0000\u0000\u0087 "+
		"\u0001\u0000\u0000\u0000\u0088\u008c\u0007\u0002\u0000\u0000\u0089\u008b"+
		"\u0007\u0003\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\"\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005,\u0000\u0000\u0090$\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005(\u0000\u0000\u0092&\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005)\u0000\u0000\u0094(\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		";\u0000\u0000\u0096*\u0001\u0000\u0000\u0000\u0097\u0099\u0007\u0004\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u0015\u0000"+
		"\u0000\u009d,\u0001\u0000\u0000\u0000\u0006\u0000{\u0081\u0083\u008c\u009a"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}