// Generated from foplGram.g4 by ANTLR 4.4

package assignmentLexPar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class foplGramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, POINT=28, COMMA=29, TERM=30, SYMBOL=31, COMPARATOR=32, 
		OPERATOR=33, TYPE=34, LETTER=35, WORD=36, BOOLVAL=37, NUMBER=38, BLOCKOPEN=39, 
		BLOCKCLOSE=40, WS=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'def :'", "'return'", "'::global'", "'='", "'elseif ('", 
		"'do'", "'out('", "'('", "'route('", "'->'", "'case'", "'in('", "'while ('", 
		"'if ('", "':'", "'['", "'drop'", "']'", "'or'", "'#'", "'else'", "'for (float'", 
		"')'", "'and'", "'+'", "'array'", "'] = '", "'.'", "','", "';'", "SYMBOL", 
		"COMPARATOR", "OPERATOR", "TYPE", "LETTER", "WORD", "BOOLVAL", "NUMBER", 
		"'{'", "'}'", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_string = 1, RULE_value = 2, RULE_operation = 3, RULE_rtn = 4, 
		RULE_globals = 5, RULE_funcDeclare = 6, RULE_funcCall = 7, RULE_varDec = 8, 
		RULE_assignment = 9, RULE_comparison = 10, RULE_output = 11, RULE_input = 12, 
		RULE_doWhile = 13, RULE_routeCaseroute = 14, RULE_rCase = 15, RULE_def = 16, 
		RULE_whileLoop = 17, RULE_forLoop = 18, RULE_ifState = 19, RULE_elseif = 20, 
		RULE_elseState = 21, RULE_arrayDec = 22, RULE_arrayAssign = 23, RULE_arrayMid = 24, 
		RULE_statement = 25;
	public static final String[] ruleNames = {
		"prog", "string", "value", "operation", "rtn", "globals", "funcDeclare", 
		"funcCall", "varDec", "assignment", "comparison", "output", "input", "doWhile", 
		"routeCaseroute", "rCase", "def", "whileLoop", "forLoop", "ifState", "elseif", 
		"elseState", "arrayDec", "arrayAssign", "arrayMid", "statement"
	};

	@Override
	public String getGrammarFileName() { return "foplGram.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public foplGramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public FuncDeclareContext funcDeclare(int i) {
			return getRuleContext(FuncDeclareContext.class,i);
		}
		public GlobalsContext globals(int i) {
			return getRuleContext(GlobalsContext.class,i);
		}
		public List<GlobalsContext> globals() {
			return getRuleContexts(GlobalsContext.class);
		}
		public List<FuncDeclareContext> funcDeclare() {
			return getRuleContexts(FuncDeclareContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52); globals();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58); funcDeclare();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SYMBOL(int i) {
			return getToken(foplGramParser.SYMBOL, i);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(foplGramParser.NUMBER, i);
		}
		public TerminalNode WS(int i) {
			return getToken(foplGramParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(foplGramParser.WORD); }
		public List<TerminalNode> WS() { return getTokens(foplGramParser.WS); }
		public List<TerminalNode> NUMBER() { return getTokens(foplGramParser.NUMBER); }
		public TerminalNode WORD(int i) {
			return getToken(foplGramParser.WORD, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(foplGramParser.SYMBOL); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(T__7);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYMBOL) | (1L << WORD) | (1L << NUMBER) | (1L << WS))) != 0)) {
				{
				{
				setState(64);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYMBOL) | (1L << WORD) | (1L << NUMBER) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70); match(T__7);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode BOOLVAL() { return getToken(foplGramParser.BOOLVAL, 0); }
		public TerminalNode WORD() { return getToken(foplGramParser.WORD, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(foplGramParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); match(NUMBER);
				}
				break;
			case BOOLVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); match(BOOLVAL);
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); match(WORD);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); string();
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(foplGramParser.NUMBER, i);
		}
		public List<TerminalNode> WORD() { return getTokens(foplGramParser.WORD); }
		public List<TerminalNode> NUMBER() { return getTokens(foplGramParser.NUMBER); }
		public TerminalNode WORD(int i) {
			return getToken(foplGramParser.WORD, i);
		}
		public TerminalNode OPERATOR() { return getToken(foplGramParser.OPERATOR, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(79); match(OPERATOR);
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==NUMBER) ) {
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

	public static class RtnContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TERM() { return getToken(foplGramParser.TERM, 0); }
		public RtnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rtn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterRtn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitRtn(this);
		}
	}

	public final RtnContext rtn() throws RecognitionException {
		RtnContext _localctx = new RtnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rtn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(T__25);
			setState(83); value();
			setState(84); match(TERM);
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

	public static class GlobalsContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TERM() { return getToken(foplGramParser.TERM, 0); }
		public TerminalNode WORD() { return getToken(foplGramParser.WORD, 0); }
		public TerminalNode TYPE() { return getToken(foplGramParser.TYPE, 0); }
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitGlobals(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_globals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(TYPE);
			setState(87); match(WORD);
			setState(90);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(88); match(T__23);
				setState(89); value();
				}
			}

			setState(92); match(T__24);
			setState(93); match(TERM);
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

	public static class FuncDeclareContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(foplGramParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(foplGramParser.BLOCKCLOSE, 0); }
		public List<TerminalNode> WORD() { return getTokens(foplGramParser.WORD); }
		public List<TerminalNode> TYPE() { return getTokens(foplGramParser.TYPE); }
		public List<TerminalNode> COMMA() { return getTokens(foplGramParser.COMMA); }
		public TerminalNode TYPE(int i) {
			return getToken(foplGramParser.TYPE, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode WORD(int i) {
			return getToken(foplGramParser.WORD, i);
		}
		public RtnContext rtn() {
			return getRuleContext(RtnContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(foplGramParser.COMMA, i);
		}
		public FuncDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterFuncDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitFuncDeclare(this);
		}
	}

	public final FuncDeclareContext funcDeclare() throws RecognitionException {
		FuncDeclareContext _localctx = new FuncDeclareContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDeclare);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(TYPE);
			setState(96); match(WORD);
			setState(97); match(T__19);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(98); match(TYPE);
				setState(99); match(WORD);
				setState(101);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(100); match(COMMA);
					}
				}

				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108); match(T__4);
			setState(109); match(BLOCKOPEN);
			setState(111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(110); statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(115); rtn();
			setState(116); match(BLOCKCLOSE);
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(foplGramParser.TERM, 0); }
		public List<TerminalNode> WORD() { return getTokens(foplGramParser.WORD); }
		public List<TerminalNode> COMMA() { return getTokens(foplGramParser.COMMA); }
		public TerminalNode WORD(int i) {
			return getToken(foplGramParser.WORD, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(foplGramParser.COMMA, i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(WORD);
			setState(119); match(T__19);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(120); match(WORD);
				setState(122);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(121); match(COMMA);
					}
				}

				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129); match(T__4);
			setState(130); match(TERM);
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

	public static class VarDecContext extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(foplGramParser.TERM, 0); }
		public List<TerminalNode> WORD() { return getTokens(foplGramParser.WORD); }
		public TerminalNode TYPE() { return getToken(foplGramParser.TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(foplGramParser.COMMA); }
		public TerminalNode WORD(int i) {
			return getToken(foplGramParser.WORD, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(foplGramParser.COMMA, i);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitVarDec(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(TYPE);
			setState(133); match(WORD);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134); match(COMMA);
				setState(135); match(WORD);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141); match(TERM);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TERM() { return getToken(foplGramParser.TERM, 0); }
		public List<TerminalNode> WORD() { return getTokens(foplGramParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(foplGramParser.WORD, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); match(WORD);
				setState(144); match(T__23);
				setState(145); value();
				setState(146); match(TERM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); match(WORD);
				setState(149); match(T__23);
				setState(150); match(WORD);
				setState(151); match(T__2);
				setState(152); match(WORD);
				setState(153); match(TERM);
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMPARATOR() { return getToken(foplGramParser.COMPARATOR, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); value();
			setState(157); match(COMPARATOR);
			setState(158); value();
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

	public static class OutputContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public TerminalNode TERM() { return getToken(foplGramParser.TERM, 0); }
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> WORD() { return getTokens(foplGramParser.WORD); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public TerminalNode WORD(int i) {
			return getToken(foplGramParser.WORD, i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(T__20);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(161); string();
				setState(166);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(162); match(T__2);
					setState(163); value();
					setState(164); match(WORD);
					}
				}

				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173); match(T__4);
			setState(174); match(TERM);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(foplGramParser.TERM, 0); }
		public TerminalNode WORD() { return getToken(foplGramParser.WORD, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(T__15);
			setState(177); match(WORD);
			setState(178); match(T__4);
			setState(179); match(TERM);
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

	public static class DoWhileContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(foplGramParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(foplGramParser.BLOCKCLOSE, 0); }
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public TerminalNode TERM() { return getToken(foplGramParser.TERM, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public DoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitDoWhile(this);
		}
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_doWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(T__21);
			setState(182); match(BLOCKOPEN);
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183); statement();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__25) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__5) | (1L << T__1) | (1L << TYPE) | (1L << WORD) | (1L << NUMBER))) != 0) );
			setState(188); match(BLOCKCLOSE);
			setState(189); match(T__14);
			setState(190); comparison();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__3) {
				{
				{
				setState(191);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(192); comparison();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198); match(T__4);
			setState(199); match(TERM);
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

	public static class RouteCaserouteContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(foplGramParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(foplGramParser.BLOCKCLOSE, 0); }
		public TerminalNode WORD() { return getToken(foplGramParser.WORD, 0); }
		public RCaseContext rCase(int i) {
			return getRuleContext(RCaseContext.class,i);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public List<RCaseContext> rCase() {
			return getRuleContexts(RCaseContext.class);
		}
		public RouteCaserouteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeCaseroute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterRouteCaseroute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitRouteCaseroute(this);
		}
	}

	public final RouteCaserouteContext routeCaseroute() throws RecognitionException {
		RouteCaserouteContext _localctx = new RouteCaserouteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_routeCaseroute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(T__18);
			setState(202); match(WORD);
			setState(203); match(T__4);
			setState(204); match(BLOCKOPEN);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(205); rCase();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211); def();
			setState(212); match(BLOCKCLOSE);
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

	public static class RCaseContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(foplGramParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(foplGramParser.BLOCKCLOSE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode TERM() { return getToken(foplGramParser.TERM, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public RCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterRCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitRCase(this);
		}
	}

	public final RCaseContext rCase() throws RecognitionException {
		RCaseContext _localctx = new RCaseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(T__16);
			setState(215); comparison();
			setState(216); match(T__12);
			setState(217); match(BLOCKOPEN);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218); statement();
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__25) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__5) | (1L << T__1) | (1L << TYPE) | (1L << WORD) | (1L << NUMBER))) != 0) );
			setState(223); match(T__10);
			setState(224); match(TERM);
			setState(225); match(BLOCKCLOSE);
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

	public static class DefContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(foplGramParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(foplGramParser.BLOCKCLOSE, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); match(T__26);
			setState(228); match(BLOCKOPEN);
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(229); statement();
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__25) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__5) | (1L << T__1) | (1L << TYPE) | (1L << WORD) | (1L << NUMBER))) != 0) );
			setState(234); match(BLOCKCLOSE);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(foplGramParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(foplGramParser.BLOCKCLOSE, 0); }
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); match(T__14);
			setState(237); comparison();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__3) {
				{
				{
				setState(238);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(239); comparison();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245); match(T__4);
			setState(246); match(BLOCKOPEN);
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247); statement();
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__25) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__5) | (1L << T__1) | (1L << TYPE) | (1L << WORD) | (1L << NUMBER))) != 0) );
			setState(252); match(BLOCKCLOSE);
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(foplGramParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(foplGramParser.BLOCKCLOSE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode WORD() { return getToken(foplGramParser.WORD, 0); }
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode COMPARATOR() { return getToken(foplGramParser.COMPARATOR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(T__5);
			setState(255); match(WORD);
			setState(256); match(T__23);
			setState(257); value();
			setState(258); match(T__17);
			setState(259); value();
			setState(260); match(COMPARATOR);
			setState(261); value();
			setState(262); match(T__17);
			setState(263); assignment();
			setState(264); match(T__4);
			setState(265); match(BLOCKOPEN);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(266); statement();
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__25) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__5) | (1L << T__1) | (1L << TYPE) | (1L << WORD) | (1L << NUMBER))) != 0) );
			setState(271); match(BLOCKCLOSE);
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

	public static class IfStateContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(foplGramParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(foplGramParser.BLOCKCLOSE, 0); }
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public IfStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterIfState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitIfState(this);
		}
	}

	public final IfStateContext ifState() throws RecognitionException {
		IfStateContext _localctx = new IfStateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(T__13);
			setState(274); comparison();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__3) {
				{
				{
				setState(275);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(276); comparison();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282); match(T__4);
			setState(283); match(BLOCKOPEN);
			setState(285); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(284); statement();
				}
				}
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__25) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__5) | (1L << T__1) | (1L << TYPE) | (1L << WORD) | (1L << NUMBER))) != 0) );
			setState(289); match(BLOCKCLOSE);
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

	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(foplGramParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(foplGramParser.BLOCKCLOSE, 0); }
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitElseif(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(T__22);
			setState(292); comparison();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__3) {
				{
				{
				setState(293);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(294); comparison();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300); match(T__4);
			setState(301); match(BLOCKOPEN);
			setState(303); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(302); statement();
				}
				}
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__25) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__5) | (1L << T__1) | (1L << TYPE) | (1L << WORD) | (1L << NUMBER))) != 0) );
			setState(307); match(BLOCKCLOSE);
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

	public static class ElseStateContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(foplGramParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(foplGramParser.BLOCKCLOSE, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ElseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterElseState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitElseState(this);
		}
	}

	public final ElseStateContext elseState() throws RecognitionException {
		ElseStateContext _localctx = new ElseStateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(T__6);
			setState(310); match(BLOCKOPEN);
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311); statement();
				}
				}
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__25) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__5) | (1L << T__1) | (1L << TYPE) | (1L << WORD) | (1L << NUMBER))) != 0) );
			setState(316); match(BLOCKCLOSE);
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

	public static class ArrayDecContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TERM() { return getToken(foplGramParser.TERM, 0); }
		public TerminalNode WORD() { return getToken(foplGramParser.WORD, 0); }
		public ArrayDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterArrayDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitArrayDec(this);
		}
	}

	public final ArrayDecContext arrayDec() throws RecognitionException {
		ArrayDecContext _localctx = new ArrayDecContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); match(T__1);
			setState(319); match(WORD);
			setState(320); match(T__11);
			setState(321); value();
			setState(322); match(T__9);
			setState(323); match(TERM);
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

	public static class ArrayAssignContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public TerminalNode TERM() { return getToken(foplGramParser.TERM, 0); }
		public TerminalNode WORD() { return getToken(foplGramParser.WORD, 0); }
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayMidContext arrayMid() {
			return getRuleContext(ArrayMidContext.class,0);
		}
		public ArrayAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitArrayAssign(this);
		}
	}

	public final ArrayAssignContext arrayAssign() throws RecognitionException {
		ArrayAssignContext _localctx = new ArrayAssignContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); match(WORD);
			setState(326); match(T__11);
			setState(327); value();
			setState(328); arrayMid();
			setState(329); value();
			setState(330); match(TERM);
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

	public static class ArrayMidContext extends ParserRuleContext {
		public ArrayMidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayMid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterArrayMid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitArrayMid(this);
		}
	}

	public final ArrayMidContext arrayMid() throws RecognitionException {
		ArrayMidContext _localctx = new ArrayMidContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayMid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(T__0);
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

	public static class StatementContext extends ParserRuleContext {
		public ArrayDecContext arrayDec() {
			return getRuleContext(ArrayDecContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public IfStateContext ifState() {
			return getRuleContext(IfStateContext.class,0);
		}
		public ElseifContext elseif() {
			return getRuleContext(ElseifContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public RouteCaserouteContext routeCaseroute() {
			return getRuleContext(RouteCaserouteContext.class,0);
		}
		public ArrayAssignContext arrayAssign() {
			return getRuleContext(ArrayAssignContext.class,0);
		}
		public RCaseContext rCase() {
			return getRuleContext(RCaseContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public RtnContext rtn() {
			return getRuleContext(RtnContext.class,0);
		}
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public DoWhileContext doWhile() {
			return getRuleContext(DoWhileContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public ElseStateContext elseState() {
			return getRuleContext(ElseStateContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foplGramListener ) ((foplGramListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(352);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334); funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335); varDec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336); assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337); output();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(338); input();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(339); doWhile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(340); routeCaseroute();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(341); rCase();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(342); def();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(343); whileLoop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(344); forLoop();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(345); ifState();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(346); elseif();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(347); elseState();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(348); arrayDec();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(349); arrayAssign();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(350); operation();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(351); rtn();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0165\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\6\2>\n\2\r\2\16\2"+
		"?\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4O\n\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7]\n\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bh\n\b\7\bj\n\b\f\b\16\bm\13\b\3\b\3\b\3\b\6\b"+
		"r\n\b\r\b\16\bs\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t}\n\t\7\t\177\n\t\f\t\16"+
		"\t\u0082\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u009d\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a9\n\r\7"+
		"\r\u00ab\n\r\f\r\16\r\u00ae\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\6\17\u00bb\n\17\r\17\16\17\u00bc\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u00c4\n\17\f\17\16\17\u00c7\13\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\7\20\u00d1\n\20\f\20\16\20\u00d4\13\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\6\21\u00de\n\21\r\21\16\21\u00df\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\6\22\u00e9\n\22\r\22\16\22\u00ea\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\7\23\u00f3\n\23\f\23\16\23\u00f6\13\23\3\23\3\23\3\23\6"+
		"\23\u00fb\n\23\r\23\16\23\u00fc\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u010e\n\24\r\24\16\24\u010f\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\7\25\u0118\n\25\f\25\16\25\u011b\13\25\3"+
		"\25\3\25\3\25\6\25\u0120\n\25\r\25\16\25\u0121\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\7\26\u012a\n\26\f\26\16\26\u012d\13\26\3\26\3\26\3\26\6\26\u0132"+
		"\n\26\r\26\16\26\u0133\3\26\3\26\3\27\3\27\3\27\6\27\u013b\n\27\r\27\16"+
		"\27\u013c\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0163\n\33\3\33"+
		"\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\5\6"+
		"\2!!&&((++\4\2&&((\4\2\25\25\32\32\u0178\29\3\2\2\2\4A\3\2\2\2\6N\3\2"+
		"\2\2\bP\3\2\2\2\nT\3\2\2\2\fX\3\2\2\2\16a\3\2\2\2\20x\3\2\2\2\22\u0086"+
		"\3\2\2\2\24\u009c\3\2\2\2\26\u009e\3\2\2\2\30\u00a2\3\2\2\2\32\u00b2\3"+
		"\2\2\2\34\u00b7\3\2\2\2\36\u00cb\3\2\2\2 \u00d8\3\2\2\2\"\u00e5\3\2\2"+
		"\2$\u00ee\3\2\2\2&\u0100\3\2\2\2(\u0113\3\2\2\2*\u0125\3\2\2\2,\u0137"+
		"\3\2\2\2.\u0140\3\2\2\2\60\u0147\3\2\2\2\62\u014e\3\2\2\2\64\u0162\3\2"+
		"\2\2\668\5\f\7\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2<>\5\16\b\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2"+
		"\2\2AE\7\26\2\2BD\t\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3"+
		"\2\2\2GE\3\2\2\2HI\7\26\2\2I\5\3\2\2\2JO\7(\2\2KO\7\'\2\2LO\7&\2\2MO\5"+
		"\4\3\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\7\3\2\2\2PQ\t\3\2\2QR"+
		"\7#\2\2RS\t\3\2\2S\t\3\2\2\2TU\7\4\2\2UV\5\6\4\2VW\7 \2\2W\13\3\2\2\2"+
		"XY\7$\2\2Y\\\7&\2\2Z[\7\6\2\2[]\5\6\4\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2"+
		"\2^_\7\5\2\2_`\7 \2\2`\r\3\2\2\2ab\7$\2\2bc\7&\2\2ck\7\n\2\2de\7$\2\2"+
		"eg\7&\2\2fh\7\37\2\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2id\3\2\2\2jm\3\2\2\2"+
		"ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\31\2\2oq\7)\2\2pr\5\64\33"+
		"\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\5\n\6\2vw\7*\2"+
		"\2w\17\3\2\2\2xy\7&\2\2y\u0080\7\n\2\2z|\7&\2\2{}\7\37\2\2|{\3\2\2\2|"+
		"}\3\2\2\2}\177\3\2\2\2~z\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\31"+
		"\2\2\u0084\u0085\7 \2\2\u0085\21\3\2\2\2\u0086\u0087\7$\2\2\u0087\u008c"+
		"\7&\2\2\u0088\u0089\7\37\2\2\u0089\u008b\7&\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7 \2\2\u0090\23\3\2\2\2\u0091\u0092"+
		"\7&\2\2\u0092\u0093\7\6\2\2\u0093\u0094\5\6\4\2\u0094\u0095\7 \2\2\u0095"+
		"\u009d\3\2\2\2\u0096\u0097\7&\2\2\u0097\u0098\7\6\2\2\u0098\u0099\7&\2"+
		"\2\u0099\u009a\7\33\2\2\u009a\u009b\7&\2\2\u009b\u009d\7 \2\2\u009c\u0091"+
		"\3\2\2\2\u009c\u0096\3\2\2\2\u009d\25\3\2\2\2\u009e\u009f\5\6\4\2\u009f"+
		"\u00a0\7\"\2\2\u00a0\u00a1\5\6\4\2\u00a1\27\3\2\2\2\u00a2\u00ac\7\t\2"+
		"\2\u00a3\u00a8\5\4\3\2\u00a4\u00a5\7\33\2\2\u00a5\u00a6\5\6\4\2\u00a6"+
		"\u00a7\7&\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a3\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b0\7\31\2\2\u00b0\u00b1\7 \2\2\u00b1\31\3\2\2\2\u00b2\u00b3"+
		"\7\16\2\2\u00b3\u00b4\7&\2\2\u00b4\u00b5\7\31\2\2\u00b5\u00b6\7 \2\2\u00b6"+
		"\33\3\2\2\2\u00b7\u00b8\7\b\2\2\u00b8\u00ba\7)\2\2\u00b9\u00bb\5\64\33"+
		"\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7*\2\2\u00bf\u00c0\7\17\2\2\u00c0"+
		"\u00c5\5\26\f\2\u00c1\u00c2\t\4\2\2\u00c2\u00c4\5\26\f\2\u00c3\u00c1\3"+
		"\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\31\2\2\u00c9\u00ca\7"+
		" \2\2\u00ca\35\3\2\2\2\u00cb\u00cc\7\13\2\2\u00cc\u00cd\7&\2\2\u00cd\u00ce"+
		"\7\31\2\2\u00ce\u00d2\7)\2\2\u00cf\u00d1\5 \21\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7\7*\2\2\u00d7"+
		"\37\3\2\2\2\u00d8\u00d9\7\r\2\2\u00d9\u00da\5\26\f\2\u00da\u00db\7\21"+
		"\2\2\u00db\u00dd\7)\2\2\u00dc\u00de\5\64\33\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\7\23\2\2\u00e2\u00e3\7 \2\2\u00e3\u00e4\7*\2\2\u00e4"+
		"!\3\2\2\2\u00e5\u00e6\7\3\2\2\u00e6\u00e8\7)\2\2\u00e7\u00e9\5\64\33\2"+
		"\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7*\2\2\u00ed#\3\2\2\2\u00ee\u00ef"+
		"\7\17\2\2\u00ef\u00f4\5\26\f\2\u00f0\u00f1\t\4\2\2\u00f1\u00f3\5\26\f"+
		"\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\31\2\2"+
		"\u00f8\u00fa\7)\2\2\u00f9\u00fb\5\64\33\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\7*\2\2\u00ff%\3\2\2\2\u0100\u0101\7\30\2\2\u0101\u0102\7&\2\2\u0102"+
		"\u0103\7\6\2\2\u0103\u0104\5\6\4\2\u0104\u0105\7\f\2\2\u0105\u0106\5\6"+
		"\4\2\u0106\u0107\7\"\2\2\u0107\u0108\5\6\4\2\u0108\u0109\7\f\2\2\u0109"+
		"\u010a\5\24\13\2\u010a\u010b\7\31\2\2\u010b\u010d\7)\2\2\u010c\u010e\5"+
		"\64\33\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7*\2\2\u0112\'\3\2\2\2"+
		"\u0113\u0114\7\20\2\2\u0114\u0119\5\26\f\2\u0115\u0116\t\4\2\2\u0116\u0118"+
		"\5\26\f\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d"+
		"\7\31\2\2\u011d\u011f\7)\2\2\u011e\u0120\5\64\33\2\u011f\u011e\3\2\2\2"+
		"\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0124\7*\2\2\u0124)\3\2\2\2\u0125\u0126\7\7\2\2\u0126\u012b"+
		"\5\26\f\2\u0127\u0128\t\4\2\2\u0128\u012a\5\26\f\2\u0129\u0127\3\2\2\2"+
		"\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\31\2\2\u012f\u0131\7)\2\2\u0130"+
		"\u0132\5\64\33\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7*\2\2\u0136"+
		"+\3\2\2\2\u0137\u0138\7\27\2\2\u0138\u013a\7)\2\2\u0139\u013b\5\64\33"+
		"\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7*\2\2\u013f-\3\2\2\2\u0140\u0141"+
		"\7\34\2\2\u0141\u0142\7&\2\2\u0142\u0143\7\22\2\2\u0143\u0144\5\6\4\2"+
		"\u0144\u0145\7\24\2\2\u0145\u0146\7 \2\2\u0146/\3\2\2\2\u0147\u0148\7"+
		"&\2\2\u0148\u0149\7\22\2\2\u0149\u014a\5\6\4\2\u014a\u014b\5\62\32\2\u014b"+
		"\u014c\5\6\4\2\u014c\u014d\7 \2\2\u014d\61\3\2\2\2\u014e\u014f\7\35\2"+
		"\2\u014f\63\3\2\2\2\u0150\u0163\5\20\t\2\u0151\u0163\5\22\n\2\u0152\u0163"+
		"\5\24\13\2\u0153\u0163\5\30\r\2\u0154\u0163\5\32\16\2\u0155\u0163\5\34"+
		"\17\2\u0156\u0163\5\36\20\2\u0157\u0163\5 \21\2\u0158\u0163\5\"\22\2\u0159"+
		"\u0163\5$\23\2\u015a\u0163\5&\24\2\u015b\u0163\5(\25\2\u015c\u0163\5*"+
		"\26\2\u015d\u0163\5,\27\2\u015e\u0163\5.\30\2\u015f\u0163\5\60\31\2\u0160"+
		"\u0163\5\b\5\2\u0161\u0163\5\n\6\2\u0162\u0150\3\2\2\2\u0162\u0151\3\2"+
		"\2\2\u0162\u0152\3\2\2\2\u0162\u0153\3\2\2\2\u0162\u0154\3\2\2\2\u0162"+
		"\u0155\3\2\2\2\u0162\u0156\3\2\2\2\u0162\u0157\3\2\2\2\u0162\u0158\3\2"+
		"\2\2\u0162\u0159\3\2\2\2\u0162\u015a\3\2\2\2\u0162\u015b\3\2\2\2\u0162"+
		"\u015c\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0162\u015f\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\65\3\2\2\2\369?EN\\"+
		"gks|\u0080\u008c\u009c\u00a8\u00ac\u00bc\u00c5\u00d2\u00df\u00ea\u00f4"+
		"\u00fc\u010f\u0119\u0121\u012b\u0133\u013c\u0162";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}