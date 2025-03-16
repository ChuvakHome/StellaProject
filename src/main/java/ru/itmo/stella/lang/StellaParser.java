// Generated from StellaParser.g4 by ANTLR 4.7.1
package ru.itmo.stella.lang;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StellaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Surrogate_id_SYMB_0=1, Surrogate_id_SYMB_1=2, Surrogate_id_SYMB_2=3, Surrogate_id_SYMB_3=4, 
		Surrogate_id_SYMB_4=5, Surrogate_id_SYMB_5=6, Surrogate_id_SYMB_6=7, Surrogate_id_SYMB_7=8, 
		Surrogate_id_SYMB_8=9, Surrogate_id_SYMB_9=10, Surrogate_id_SYMB_10=11, 
		Surrogate_id_SYMB_11=12, Surrogate_id_SYMB_12=13, Surrogate_id_SYMB_13=14, 
		Surrogate_id_SYMB_14=15, Surrogate_id_SYMB_15=16, Surrogate_id_SYMB_16=17, 
		Surrogate_id_SYMB_17=18, Surrogate_id_SYMB_18=19, Surrogate_id_SYMB_19=20, 
		Surrogate_id_SYMB_20=21, Surrogate_id_SYMB_21=22, Surrogate_id_SYMB_22=23, 
		Surrogate_id_SYMB_23=24, Surrogate_id_SYMB_24=25, Surrogate_id_SYMB_25=26, 
		Surrogate_id_SYMB_26=27, Surrogate_id_SYMB_27=28, Surrogate_id_SYMB_28=29, 
		Surrogate_id_SYMB_29=30, Surrogate_id_SYMB_30=31, Surrogate_id_SYMB_31=32, 
		Surrogate_id_SYMB_32=33, Surrogate_id_SYMB_33=34, Surrogate_id_SYMB_34=35, 
		Surrogate_id_SYMB_35=36, Surrogate_id_SYMB_36=37, Surrogate_id_SYMB_37=38, 
		Surrogate_id_SYMB_38=39, Surrogate_id_SYMB_39=40, Surrogate_id_SYMB_40=41, 
		Surrogate_id_SYMB_41=42, Surrogate_id_SYMB_42=43, Surrogate_id_SYMB_43=44, 
		Surrogate_id_SYMB_44=45, Surrogate_id_SYMB_45=46, Surrogate_id_SYMB_46=47, 
		Surrogate_id_SYMB_47=48, Surrogate_id_SYMB_48=49, Surrogate_id_SYMB_49=50, 
		Surrogate_id_SYMB_50=51, Surrogate_id_SYMB_51=52, Surrogate_id_SYMB_52=53, 
		Surrogate_id_SYMB_53=54, Surrogate_id_SYMB_54=55, Surrogate_id_SYMB_55=56, 
		Surrogate_id_SYMB_56=57, Surrogate_id_SYMB_57=58, Surrogate_id_SYMB_58=59, 
		Surrogate_id_SYMB_59=60, Surrogate_id_SYMB_60=61, Surrogate_id_SYMB_61=62, 
		Surrogate_id_SYMB_62=63, Surrogate_id_SYMB_63=64, Surrogate_id_SYMB_64=65, 
		Surrogate_id_SYMB_65=66, Surrogate_id_SYMB_66=67, Surrogate_id_SYMB_67=68, 
		Surrogate_id_SYMB_68=69, Surrogate_id_SYMB_69=70, Surrogate_id_SYMB_70=71, 
		Surrogate_id_SYMB_71=72, Surrogate_id_SYMB_72=73, Surrogate_id_SYMB_73=74, 
		Surrogate_id_SYMB_74=75, Surrogate_id_SYMB_75=76, Surrogate_id_SYMB_76=77, 
		Surrogate_id_SYMB_77=78, Surrogate_id_SYMB_78=79, Surrogate_id_SYMB_79=80, 
		Surrogate_id_SYMB_80=81, COMMENT_antlr_builtin=82, MULTICOMMENT_antlr_builtin=83, 
		StellaIdent=84, ExtensionName=85, MemoryAddress=86, INTEGER=87, WS=88, 
		ErrorToken=89;
	public static final int
		RULE_start_Program = 0, RULE_start_ListStellaIdent = 1, RULE_start_LanguageDecl = 2, 
		RULE_start_Extension = 3, RULE_start_ListExtensionName = 4, RULE_start_ListExtension = 5, 
		RULE_start_Decl = 6, RULE_start_ListDecl = 7, RULE_start_LocalDecl = 8, 
		RULE_start_ListLocalDecl = 9, RULE_start_Annotation = 10, RULE_start_ListAnnotation = 11, 
		RULE_start_ParamDecl = 12, RULE_start_ListParamDecl = 13, RULE_start_ReturnType = 14, 
		RULE_start_ThrowType = 15, RULE_start_Type9 = 16, RULE_start_ListType9 = 17, 
		RULE_start_MatchCase = 18, RULE_start_ListMatchCase = 19, RULE_start_OptionalTyping = 20, 
		RULE_start_PatternData = 21, RULE_start_ExprData = 22, RULE_start_Pattern = 23, 
		RULE_start_ListPattern = 24, RULE_start_LabelledPattern = 25, RULE_start_ListLabelledPattern = 26, 
		RULE_start_Binding = 27, RULE_start_ListBinding = 28, RULE_start_Expr = 29, 
		RULE_start_ListExpr = 30, RULE_start_Expr1 = 31, RULE_start_PatternBinding = 32, 
		RULE_start_ListPatternBinding = 33, RULE_start_Expr2 = 34, RULE_start_ListExpr2 = 35, 
		RULE_start_Expr3 = 36, RULE_start_Expr4 = 37, RULE_start_Expr5 = 38, RULE_start_Expr6 = 39, 
		RULE_start_Expr7 = 40, RULE_start_Type = 41, RULE_start_Type1 = 42, RULE_start_Type2 = 43, 
		RULE_start_Type3 = 44, RULE_start_ListType = 45, RULE_start_VariantFieldType = 46, 
		RULE_start_ListVariantFieldType = 47, RULE_start_RecordFieldType = 48, 
		RULE_start_ListRecordFieldType = 49, RULE_start_Typing = 50, RULE_program = 51, 
		RULE_listStellaIdent = 52, RULE_languageDecl = 53, RULE_extension = 54, 
		RULE_listExtensionName = 55, RULE_listExtension = 56, RULE_decl = 57, 
		RULE_listDecl = 58, RULE_localDecl = 59, RULE_listLocalDecl = 60, RULE_annotation = 61, 
		RULE_listAnnotation = 62, RULE_paramDecl = 63, RULE_listParamDecl = 64, 
		RULE_returnType = 65, RULE_throwType = 66, RULE_type9 = 67, RULE_listType9 = 68, 
		RULE_matchCase = 69, RULE_listMatchCase = 70, RULE_optionalTyping = 71, 
		RULE_patternData = 72, RULE_exprData = 73, RULE_pattern = 74, RULE_listPattern = 75, 
		RULE_labelledPattern = 76, RULE_listLabelledPattern = 77, RULE_binding = 78, 
		RULE_listBinding = 79, RULE_expr = 80, RULE_listExpr = 81, RULE_expr1 = 82, 
		RULE_patternBinding = 83, RULE_listPatternBinding = 84, RULE_expr2 = 85, 
		RULE_listExpr2 = 86, RULE_expr3 = 87, RULE_expr4 = 88, RULE_expr5 = 89, 
		RULE_expr6 = 90, RULE_expr7 = 91, RULE_type = 92, RULE_type1 = 93, RULE_type2 = 94, 
		RULE_type3 = 95, RULE_listType = 96, RULE_variantFieldType = 97, RULE_listVariantFieldType = 98, 
		RULE_recordFieldType = 99, RULE_listRecordFieldType = 100, RULE_typing = 101;
	public static final String[] ruleNames = {
		"start_Program", "start_ListStellaIdent", "start_LanguageDecl", "start_Extension", 
		"start_ListExtensionName", "start_ListExtension", "start_Decl", "start_ListDecl", 
		"start_LocalDecl", "start_ListLocalDecl", "start_Annotation", "start_ListAnnotation", 
		"start_ParamDecl", "start_ListParamDecl", "start_ReturnType", "start_ThrowType", 
		"start_Type9", "start_ListType9", "start_MatchCase", "start_ListMatchCase", 
		"start_OptionalTyping", "start_PatternData", "start_ExprData", "start_Pattern", 
		"start_ListPattern", "start_LabelledPattern", "start_ListLabelledPattern", 
		"start_Binding", "start_ListBinding", "start_Expr", "start_ListExpr", 
		"start_Expr1", "start_PatternBinding", "start_ListPatternBinding", "start_Expr2", 
		"start_ListExpr2", "start_Expr3", "start_Expr4", "start_Expr5", "start_Expr6", 
		"start_Expr7", "start_Type", "start_Type1", "start_Type2", "start_Type3", 
		"start_ListType", "start_VariantFieldType", "start_ListVariantFieldType", 
		"start_RecordFieldType", "start_ListRecordFieldType", "start_Typing", 
		"program", "listStellaIdent", "languageDecl", "extension", "listExtensionName", 
		"listExtension", "decl", "listDecl", "localDecl", "listLocalDecl", "annotation", 
		"listAnnotation", "paramDecl", "listParamDecl", "returnType", "throwType", 
		"type9", "listType9", "matchCase", "listMatchCase", "optionalTyping", 
		"patternData", "exprData", "pattern", "listPattern", "labelledPattern", 
		"listLabelledPattern", "binding", "listBinding", "expr", "listExpr", "expr1", 
		"patternBinding", "listPatternBinding", "expr2", "listExpr2", "expr3", 
		"expr4", "expr5", "expr6", "expr7", "type", "type1", "type2", "type3", 
		"listType", "variantFieldType", "listVariantFieldType", "recordFieldType", 
		"listRecordFieldType", "typing"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "':'", 
		"'->'", "'=>'", "'|'", "'<|'", "'|>'", "':='", "'<'", "'<='", "'>'", "'>='", 
		"'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'.'", "'List::head'", "'List::isempty'", 
		"'List::tail'", "'panic!'", "'Nat::pred'", "'Nat::iszero'", "'Nat::rec'", 
		"'&'", "'Bool'", "'Bot'", "'Nat'", "'Top'", "'Unit'", "'and'", "'as'", 
		"'auto'", "'cast'", "'catch'", "'cons'", "'core'", "'else'", "'exception'", 
		"'extend'", "'false'", "'fix'", "'fn'", "'fold'", "'forall'", "'generic'", 
		"'if'", "'in'", "'inl'", "'inline'", "'inr'", "'language'", "'let'", "'letrec'", 
		"'match'", "'new'", "'not'", "'or'", "'return'", "'succ'", "'then'", "'throw'", 
		"'throws'", "'true'", "'try'", "'type'", "'unfold'", "'unit'", "'variant'", 
		"'with'", "'\u00B5'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Surrogate_id_SYMB_0", "Surrogate_id_SYMB_1", "Surrogate_id_SYMB_2", 
		"Surrogate_id_SYMB_3", "Surrogate_id_SYMB_4", "Surrogate_id_SYMB_5", "Surrogate_id_SYMB_6", 
		"Surrogate_id_SYMB_7", "Surrogate_id_SYMB_8", "Surrogate_id_SYMB_9", "Surrogate_id_SYMB_10", 
		"Surrogate_id_SYMB_11", "Surrogate_id_SYMB_12", "Surrogate_id_SYMB_13", 
		"Surrogate_id_SYMB_14", "Surrogate_id_SYMB_15", "Surrogate_id_SYMB_16", 
		"Surrogate_id_SYMB_17", "Surrogate_id_SYMB_18", "Surrogate_id_SYMB_19", 
		"Surrogate_id_SYMB_20", "Surrogate_id_SYMB_21", "Surrogate_id_SYMB_22", 
		"Surrogate_id_SYMB_23", "Surrogate_id_SYMB_24", "Surrogate_id_SYMB_25", 
		"Surrogate_id_SYMB_26", "Surrogate_id_SYMB_27", "Surrogate_id_SYMB_28", 
		"Surrogate_id_SYMB_29", "Surrogate_id_SYMB_30", "Surrogate_id_SYMB_31", 
		"Surrogate_id_SYMB_32", "Surrogate_id_SYMB_33", "Surrogate_id_SYMB_34", 
		"Surrogate_id_SYMB_35", "Surrogate_id_SYMB_36", "Surrogate_id_SYMB_37", 
		"Surrogate_id_SYMB_38", "Surrogate_id_SYMB_39", "Surrogate_id_SYMB_40", 
		"Surrogate_id_SYMB_41", "Surrogate_id_SYMB_42", "Surrogate_id_SYMB_43", 
		"Surrogate_id_SYMB_44", "Surrogate_id_SYMB_45", "Surrogate_id_SYMB_46", 
		"Surrogate_id_SYMB_47", "Surrogate_id_SYMB_48", "Surrogate_id_SYMB_49", 
		"Surrogate_id_SYMB_50", "Surrogate_id_SYMB_51", "Surrogate_id_SYMB_52", 
		"Surrogate_id_SYMB_53", "Surrogate_id_SYMB_54", "Surrogate_id_SYMB_55", 
		"Surrogate_id_SYMB_56", "Surrogate_id_SYMB_57", "Surrogate_id_SYMB_58", 
		"Surrogate_id_SYMB_59", "Surrogate_id_SYMB_60", "Surrogate_id_SYMB_61", 
		"Surrogate_id_SYMB_62", "Surrogate_id_SYMB_63", "Surrogate_id_SYMB_64", 
		"Surrogate_id_SYMB_65", "Surrogate_id_SYMB_66", "Surrogate_id_SYMB_67", 
		"Surrogate_id_SYMB_68", "Surrogate_id_SYMB_69", "Surrogate_id_SYMB_70", 
		"Surrogate_id_SYMB_71", "Surrogate_id_SYMB_72", "Surrogate_id_SYMB_73", 
		"Surrogate_id_SYMB_74", "Surrogate_id_SYMB_75", "Surrogate_id_SYMB_76", 
		"Surrogate_id_SYMB_77", "Surrogate_id_SYMB_78", "Surrogate_id_SYMB_79", 
		"Surrogate_id_SYMB_80", "COMMENT_antlr_builtin", "MULTICOMMENT_antlr_builtin", 
		"StellaIdent", "ExtensionName", "MemoryAddress", "INTEGER", "WS", "ErrorToken"
	};
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
	public String getGrammarFileName() { return "StellaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StellaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Start_ProgramContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Program result;
		public ProgramContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Start_ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Program(this);
		}
	}

	public final Start_ProgramContext start_Program() throws RecognitionException {
		Start_ProgramContext _localctx = new Start_ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_Program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			((Start_ProgramContext)_localctx).x = program();
			setState(205);
			match(EOF);
			 ((Start_ProgramContext)_localctx).result =  ((Start_ProgramContext)_localctx).x.result; 
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

	public static class Start_ListStellaIdentContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListStellaIdent result;
		public ListStellaIdentContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListStellaIdentContext listStellaIdent() {
			return getRuleContext(ListStellaIdentContext.class,0);
		}
		public Start_ListStellaIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListStellaIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListStellaIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListStellaIdent(this);
		}
	}

	public final Start_ListStellaIdentContext start_ListStellaIdent() throws RecognitionException {
		Start_ListStellaIdentContext _localctx = new Start_ListStellaIdentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start_ListStellaIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((Start_ListStellaIdentContext)_localctx).x = listStellaIdent();
			setState(209);
			match(EOF);
			 ((Start_ListStellaIdentContext)_localctx).result =  ((Start_ListStellaIdentContext)_localctx).x.result; 
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

	public static class Start_LanguageDeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.LanguageDecl result;
		public LanguageDeclContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public LanguageDeclContext languageDecl() {
			return getRuleContext(LanguageDeclContext.class,0);
		}
		public Start_LanguageDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_LanguageDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_LanguageDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_LanguageDecl(this);
		}
	}

	public final Start_LanguageDeclContext start_LanguageDecl() throws RecognitionException {
		Start_LanguageDeclContext _localctx = new Start_LanguageDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start_LanguageDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((Start_LanguageDeclContext)_localctx).x = languageDecl();
			setState(213);
			match(EOF);
			 ((Start_LanguageDeclContext)_localctx).result =  ((Start_LanguageDeclContext)_localctx).x.result; 
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

	public static class Start_ExtensionContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Extension result;
		public ExtensionContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
		}
		public Start_ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Extension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Extension(this);
		}
	}

	public final Start_ExtensionContext start_Extension() throws RecognitionException {
		Start_ExtensionContext _localctx = new Start_ExtensionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_start_Extension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			((Start_ExtensionContext)_localctx).x = extension();
			setState(217);
			match(EOF);
			 ((Start_ExtensionContext)_localctx).result =  ((Start_ExtensionContext)_localctx).x.result; 
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

	public static class Start_ListExtensionNameContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListExtensionName result;
		public ListExtensionNameContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListExtensionNameContext listExtensionName() {
			return getRuleContext(ListExtensionNameContext.class,0);
		}
		public Start_ListExtensionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListExtensionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListExtensionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListExtensionName(this);
		}
	}

	public final Start_ListExtensionNameContext start_ListExtensionName() throws RecognitionException {
		Start_ListExtensionNameContext _localctx = new Start_ListExtensionNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_start_ListExtensionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((Start_ListExtensionNameContext)_localctx).x = listExtensionName();
			setState(221);
			match(EOF);
			 ((Start_ListExtensionNameContext)_localctx).result =  ((Start_ListExtensionNameContext)_localctx).x.result; 
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

	public static class Start_ListExtensionContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListExtension result;
		public ListExtensionContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListExtensionContext listExtension() {
			return getRuleContext(ListExtensionContext.class,0);
		}
		public Start_ListExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListExtension(this);
		}
	}

	public final Start_ListExtensionContext start_ListExtension() throws RecognitionException {
		Start_ListExtensionContext _localctx = new Start_ListExtensionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_start_ListExtension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((Start_ListExtensionContext)_localctx).x = listExtension(0);
			setState(225);
			match(EOF);
			 ((Start_ListExtensionContext)_localctx).result =  ((Start_ListExtensionContext)_localctx).x.result; 
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

	public static class Start_DeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Decl result;
		public DeclContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Start_DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Decl(this);
		}
	}

	public final Start_DeclContext start_Decl() throws RecognitionException {
		Start_DeclContext _localctx = new Start_DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_start_Decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			((Start_DeclContext)_localctx).x = decl();
			setState(229);
			match(EOF);
			 ((Start_DeclContext)_localctx).result =  ((Start_DeclContext)_localctx).x.result; 
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

	public static class Start_ListDeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListDecl result;
		public ListDeclContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public Start_ListDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListDecl(this);
		}
	}

	public final Start_ListDeclContext start_ListDecl() throws RecognitionException {
		Start_ListDeclContext _localctx = new Start_ListDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_start_ListDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((Start_ListDeclContext)_localctx).x = listDecl(0);
			setState(233);
			match(EOF);
			 ((Start_ListDeclContext)_localctx).result =  ((Start_ListDeclContext)_localctx).x.result; 
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

	public static class Start_LocalDeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.LocalDecl result;
		public LocalDeclContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public LocalDeclContext localDecl() {
			return getRuleContext(LocalDeclContext.class,0);
		}
		public Start_LocalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_LocalDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_LocalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_LocalDecl(this);
		}
	}

	public final Start_LocalDeclContext start_LocalDecl() throws RecognitionException {
		Start_LocalDeclContext _localctx = new Start_LocalDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_start_LocalDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			((Start_LocalDeclContext)_localctx).x = localDecl();
			setState(237);
			match(EOF);
			 ((Start_LocalDeclContext)_localctx).result =  ((Start_LocalDeclContext)_localctx).x.result; 
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

	public static class Start_ListLocalDeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListLocalDecl result;
		public ListLocalDeclContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListLocalDeclContext listLocalDecl() {
			return getRuleContext(ListLocalDeclContext.class,0);
		}
		public Start_ListLocalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListLocalDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListLocalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListLocalDecl(this);
		}
	}

	public final Start_ListLocalDeclContext start_ListLocalDecl() throws RecognitionException {
		Start_ListLocalDeclContext _localctx = new Start_ListLocalDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_start_ListLocalDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			((Start_ListLocalDeclContext)_localctx).x = listLocalDecl(0);
			setState(241);
			match(EOF);
			 ((Start_ListLocalDeclContext)_localctx).result =  ((Start_ListLocalDeclContext)_localctx).x.result; 
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

	public static class Start_AnnotationContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Annotation result;
		public AnnotationContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public Start_AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Annotation(this);
		}
	}

	public final Start_AnnotationContext start_Annotation() throws RecognitionException {
		Start_AnnotationContext _localctx = new Start_AnnotationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_start_Annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			((Start_AnnotationContext)_localctx).x = annotation();
			setState(245);
			match(EOF);
			 ((Start_AnnotationContext)_localctx).result =  ((Start_AnnotationContext)_localctx).x.result; 
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

	public static class Start_ListAnnotationContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListAnnotation result;
		public ListAnnotationContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListAnnotationContext listAnnotation() {
			return getRuleContext(ListAnnotationContext.class,0);
		}
		public Start_ListAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListAnnotation(this);
		}
	}

	public final Start_ListAnnotationContext start_ListAnnotation() throws RecognitionException {
		Start_ListAnnotationContext _localctx = new Start_ListAnnotationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_start_ListAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			((Start_ListAnnotationContext)_localctx).x = listAnnotation(0);
			setState(249);
			match(EOF);
			 ((Start_ListAnnotationContext)_localctx).result =  ((Start_ListAnnotationContext)_localctx).x.result; 
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

	public static class Start_ParamDeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ParamDecl result;
		public ParamDeclContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ParamDeclContext paramDecl() {
			return getRuleContext(ParamDeclContext.class,0);
		}
		public Start_ParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ParamDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ParamDecl(this);
		}
	}

	public final Start_ParamDeclContext start_ParamDecl() throws RecognitionException {
		Start_ParamDeclContext _localctx = new Start_ParamDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_start_ParamDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((Start_ParamDeclContext)_localctx).x = paramDecl();
			setState(253);
			match(EOF);
			 ((Start_ParamDeclContext)_localctx).result =  ((Start_ParamDeclContext)_localctx).x.result; 
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

	public static class Start_ListParamDeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListParamDecl result;
		public ListParamDeclContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListParamDeclContext listParamDecl() {
			return getRuleContext(ListParamDeclContext.class,0);
		}
		public Start_ListParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListParamDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListParamDecl(this);
		}
	}

	public final Start_ListParamDeclContext start_ListParamDecl() throws RecognitionException {
		Start_ListParamDeclContext _localctx = new Start_ListParamDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_start_ListParamDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			((Start_ListParamDeclContext)_localctx).x = listParamDecl();
			setState(257);
			match(EOF);
			 ((Start_ListParamDeclContext)_localctx).result =  ((Start_ListParamDeclContext)_localctx).x.result; 
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

	public static class Start_ReturnTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ReturnType result;
		public ReturnTypeContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public Start_ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ReturnType(this);
		}
	}

	public final Start_ReturnTypeContext start_ReturnType() throws RecognitionException {
		Start_ReturnTypeContext _localctx = new Start_ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_start_ReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			((Start_ReturnTypeContext)_localctx).x = returnType();
			setState(261);
			match(EOF);
			 ((Start_ReturnTypeContext)_localctx).result =  ((Start_ReturnTypeContext)_localctx).x.result; 
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

	public static class Start_ThrowTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ThrowType result;
		public ThrowTypeContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ThrowTypeContext throwType() {
			return getRuleContext(ThrowTypeContext.class,0);
		}
		public Start_ThrowTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ThrowType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ThrowType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ThrowType(this);
		}
	}

	public final Start_ThrowTypeContext start_ThrowType() throws RecognitionException {
		Start_ThrowTypeContext _localctx = new Start_ThrowTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_start_ThrowType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			((Start_ThrowTypeContext)_localctx).x = throwType();
			setState(265);
			match(EOF);
			 ((Start_ThrowTypeContext)_localctx).result =  ((Start_ThrowTypeContext)_localctx).x.result; 
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

	public static class Start_Type9Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Type result;
		public Type9Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public Type9Context type9() {
			return getRuleContext(Type9Context.class,0);
		}
		public Start_Type9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Type9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Type9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Type9(this);
		}
	}

	public final Start_Type9Context start_Type9() throws RecognitionException {
		Start_Type9Context _localctx = new Start_Type9Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_start_Type9);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			((Start_Type9Context)_localctx).x = type9();
			setState(269);
			match(EOF);
			 ((Start_Type9Context)_localctx).result =  ((Start_Type9Context)_localctx).x.result; 
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

	public static class Start_ListType9Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListType result;
		public ListType9Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListType9Context listType9() {
			return getRuleContext(ListType9Context.class,0);
		}
		public Start_ListType9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListType9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListType9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListType9(this);
		}
	}

	public final Start_ListType9Context start_ListType9() throws RecognitionException {
		Start_ListType9Context _localctx = new Start_ListType9Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_start_ListType9);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			((Start_ListType9Context)_localctx).x = listType9();
			setState(273);
			match(EOF);
			 ((Start_ListType9Context)_localctx).result =  ((Start_ListType9Context)_localctx).x.result; 
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

	public static class Start_MatchCaseContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.MatchCase result;
		public MatchCaseContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public MatchCaseContext matchCase() {
			return getRuleContext(MatchCaseContext.class,0);
		}
		public Start_MatchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_MatchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_MatchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_MatchCase(this);
		}
	}

	public final Start_MatchCaseContext start_MatchCase() throws RecognitionException {
		Start_MatchCaseContext _localctx = new Start_MatchCaseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_start_MatchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			((Start_MatchCaseContext)_localctx).x = matchCase();
			setState(277);
			match(EOF);
			 ((Start_MatchCaseContext)_localctx).result =  ((Start_MatchCaseContext)_localctx).x.result; 
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

	public static class Start_ListMatchCaseContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListMatchCase result;
		public ListMatchCaseContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListMatchCaseContext listMatchCase() {
			return getRuleContext(ListMatchCaseContext.class,0);
		}
		public Start_ListMatchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListMatchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListMatchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListMatchCase(this);
		}
	}

	public final Start_ListMatchCaseContext start_ListMatchCase() throws RecognitionException {
		Start_ListMatchCaseContext _localctx = new Start_ListMatchCaseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_start_ListMatchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			((Start_ListMatchCaseContext)_localctx).x = listMatchCase();
			setState(281);
			match(EOF);
			 ((Start_ListMatchCaseContext)_localctx).result =  ((Start_ListMatchCaseContext)_localctx).x.result; 
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

	public static class Start_OptionalTypingContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.OptionalTyping result;
		public OptionalTypingContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public OptionalTypingContext optionalTyping() {
			return getRuleContext(OptionalTypingContext.class,0);
		}
		public Start_OptionalTypingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_OptionalTyping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_OptionalTyping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_OptionalTyping(this);
		}
	}

	public final Start_OptionalTypingContext start_OptionalTyping() throws RecognitionException {
		Start_OptionalTypingContext _localctx = new Start_OptionalTypingContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_start_OptionalTyping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			((Start_OptionalTypingContext)_localctx).x = optionalTyping();
			setState(285);
			match(EOF);
			 ((Start_OptionalTypingContext)_localctx).result =  ((Start_OptionalTypingContext)_localctx).x.result; 
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

	public static class Start_PatternDataContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.PatternData result;
		public PatternDataContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public PatternDataContext patternData() {
			return getRuleContext(PatternDataContext.class,0);
		}
		public Start_PatternDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_PatternData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_PatternData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_PatternData(this);
		}
	}

	public final Start_PatternDataContext start_PatternData() throws RecognitionException {
		Start_PatternDataContext _localctx = new Start_PatternDataContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_start_PatternData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			((Start_PatternDataContext)_localctx).x = patternData();
			setState(289);
			match(EOF);
			 ((Start_PatternDataContext)_localctx).result =  ((Start_PatternDataContext)_localctx).x.result; 
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

	public static class Start_ExprDataContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ExprData result;
		public ExprDataContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ExprDataContext exprData() {
			return getRuleContext(ExprDataContext.class,0);
		}
		public Start_ExprDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ExprData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ExprData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ExprData(this);
		}
	}

	public final Start_ExprDataContext start_ExprData() throws RecognitionException {
		Start_ExprDataContext _localctx = new Start_ExprDataContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_start_ExprData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			((Start_ExprDataContext)_localctx).x = exprData();
			setState(293);
			match(EOF);
			 ((Start_ExprDataContext)_localctx).result =  ((Start_ExprDataContext)_localctx).x.result; 
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

	public static class Start_PatternContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Pattern result;
		public PatternContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Start_PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Pattern(this);
		}
	}

	public final Start_PatternContext start_Pattern() throws RecognitionException {
		Start_PatternContext _localctx = new Start_PatternContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_start_Pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((Start_PatternContext)_localctx).x = pattern(0);
			setState(297);
			match(EOF);
			 ((Start_PatternContext)_localctx).result =  ((Start_PatternContext)_localctx).x.result; 
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

	public static class Start_ListPatternContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListPattern result;
		public ListPatternContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListPatternContext listPattern() {
			return getRuleContext(ListPatternContext.class,0);
		}
		public Start_ListPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListPattern(this);
		}
	}

	public final Start_ListPatternContext start_ListPattern() throws RecognitionException {
		Start_ListPatternContext _localctx = new Start_ListPatternContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_start_ListPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			((Start_ListPatternContext)_localctx).x = listPattern();
			setState(301);
			match(EOF);
			 ((Start_ListPatternContext)_localctx).result =  ((Start_ListPatternContext)_localctx).x.result; 
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

	public static class Start_LabelledPatternContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.LabelledPattern result;
		public LabelledPatternContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public LabelledPatternContext labelledPattern() {
			return getRuleContext(LabelledPatternContext.class,0);
		}
		public Start_LabelledPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_LabelledPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_LabelledPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_LabelledPattern(this);
		}
	}

	public final Start_LabelledPatternContext start_LabelledPattern() throws RecognitionException {
		Start_LabelledPatternContext _localctx = new Start_LabelledPatternContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_start_LabelledPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			((Start_LabelledPatternContext)_localctx).x = labelledPattern();
			setState(305);
			match(EOF);
			 ((Start_LabelledPatternContext)_localctx).result =  ((Start_LabelledPatternContext)_localctx).x.result; 
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

	public static class Start_ListLabelledPatternContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListLabelledPattern result;
		public ListLabelledPatternContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListLabelledPatternContext listLabelledPattern() {
			return getRuleContext(ListLabelledPatternContext.class,0);
		}
		public Start_ListLabelledPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListLabelledPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListLabelledPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListLabelledPattern(this);
		}
	}

	public final Start_ListLabelledPatternContext start_ListLabelledPattern() throws RecognitionException {
		Start_ListLabelledPatternContext _localctx = new Start_ListLabelledPatternContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_start_ListLabelledPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			((Start_ListLabelledPatternContext)_localctx).x = listLabelledPattern();
			setState(309);
			match(EOF);
			 ((Start_ListLabelledPatternContext)_localctx).result =  ((Start_ListLabelledPatternContext)_localctx).x.result; 
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

	public static class Start_BindingContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Binding result;
		public BindingContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public BindingContext binding() {
			return getRuleContext(BindingContext.class,0);
		}
		public Start_BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Binding(this);
		}
	}

	public final Start_BindingContext start_Binding() throws RecognitionException {
		Start_BindingContext _localctx = new Start_BindingContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_start_Binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((Start_BindingContext)_localctx).x = binding();
			setState(313);
			match(EOF);
			 ((Start_BindingContext)_localctx).result =  ((Start_BindingContext)_localctx).x.result; 
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

	public static class Start_ListBindingContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListBinding result;
		public ListBindingContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListBindingContext listBinding() {
			return getRuleContext(ListBindingContext.class,0);
		}
		public Start_ListBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListBinding(this);
		}
	}

	public final Start_ListBindingContext start_ListBinding() throws RecognitionException {
		Start_ListBindingContext _localctx = new Start_ListBindingContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_start_ListBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			((Start_ListBindingContext)_localctx).x = listBinding();
			setState(317);
			match(EOF);
			 ((Start_ListBindingContext)_localctx).result =  ((Start_ListBindingContext)_localctx).x.result; 
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

	public static class Start_ExprContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public ExprContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Start_ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Expr(this);
		}
	}

	public final Start_ExprContext start_Expr() throws RecognitionException {
		Start_ExprContext _localctx = new Start_ExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_start_Expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			((Start_ExprContext)_localctx).x = expr();
			setState(321);
			match(EOF);
			 ((Start_ExprContext)_localctx).result =  ((Start_ExprContext)_localctx).x.result; 
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

	public static class Start_ListExprContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListExpr result;
		public ListExprContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public Start_ListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListExpr(this);
		}
	}

	public final Start_ListExprContext start_ListExpr() throws RecognitionException {
		Start_ListExprContext _localctx = new Start_ListExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_start_ListExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			((Start_ListExprContext)_localctx).x = listExpr();
			setState(325);
			match(EOF);
			 ((Start_ListExprContext)_localctx).result =  ((Start_ListExprContext)_localctx).x.result; 
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

	public static class Start_Expr1Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr1Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Start_Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Expr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Expr1(this);
		}
	}

	public final Start_Expr1Context start_Expr1() throws RecognitionException {
		Start_Expr1Context _localctx = new Start_Expr1Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_start_Expr1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			((Start_Expr1Context)_localctx).x = expr1();
			setState(329);
			match(EOF);
			 ((Start_Expr1Context)_localctx).result =  ((Start_Expr1Context)_localctx).x.result; 
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

	public static class Start_PatternBindingContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.PatternBinding result;
		public PatternBindingContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public PatternBindingContext patternBinding() {
			return getRuleContext(PatternBindingContext.class,0);
		}
		public Start_PatternBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_PatternBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_PatternBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_PatternBinding(this);
		}
	}

	public final Start_PatternBindingContext start_PatternBinding() throws RecognitionException {
		Start_PatternBindingContext _localctx = new Start_PatternBindingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_start_PatternBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			((Start_PatternBindingContext)_localctx).x = patternBinding();
			setState(333);
			match(EOF);
			 ((Start_PatternBindingContext)_localctx).result =  ((Start_PatternBindingContext)_localctx).x.result; 
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

	public static class Start_ListPatternBindingContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListPatternBinding result;
		public ListPatternBindingContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListPatternBindingContext listPatternBinding() {
			return getRuleContext(ListPatternBindingContext.class,0);
		}
		public Start_ListPatternBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListPatternBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListPatternBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListPatternBinding(this);
		}
	}

	public final Start_ListPatternBindingContext start_ListPatternBinding() throws RecognitionException {
		Start_ListPatternBindingContext _localctx = new Start_ListPatternBindingContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_start_ListPatternBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			((Start_ListPatternBindingContext)_localctx).x = listPatternBinding();
			setState(337);
			match(EOF);
			 ((Start_ListPatternBindingContext)_localctx).result =  ((Start_ListPatternBindingContext)_localctx).x.result; 
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

	public static class Start_Expr2Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr2Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Start_Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Expr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Expr2(this);
		}
	}

	public final Start_Expr2Context start_Expr2() throws RecognitionException {
		Start_Expr2Context _localctx = new Start_Expr2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_start_Expr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			((Start_Expr2Context)_localctx).x = expr2();
			setState(341);
			match(EOF);
			 ((Start_Expr2Context)_localctx).result =  ((Start_Expr2Context)_localctx).x.result; 
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

	public static class Start_ListExpr2Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListExpr result;
		public ListExpr2Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListExpr2Context listExpr2() {
			return getRuleContext(ListExpr2Context.class,0);
		}
		public Start_ListExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListExpr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListExpr2(this);
		}
	}

	public final Start_ListExpr2Context start_ListExpr2() throws RecognitionException {
		Start_ListExpr2Context _localctx = new Start_ListExpr2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_start_ListExpr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			((Start_ListExpr2Context)_localctx).x = listExpr2();
			setState(345);
			match(EOF);
			 ((Start_ListExpr2Context)_localctx).result =  ((Start_ListExpr2Context)_localctx).x.result; 
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

	public static class Start_Expr3Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr3Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Start_Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Expr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Expr3(this);
		}
	}

	public final Start_Expr3Context start_Expr3() throws RecognitionException {
		Start_Expr3Context _localctx = new Start_Expr3Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_start_Expr3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			((Start_Expr3Context)_localctx).x = expr3(0);
			setState(349);
			match(EOF);
			 ((Start_Expr3Context)_localctx).result =  ((Start_Expr3Context)_localctx).x.result; 
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

	public static class Start_Expr4Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr4Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public Start_Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Expr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Expr4(this);
		}
	}

	public final Start_Expr4Context start_Expr4() throws RecognitionException {
		Start_Expr4Context _localctx = new Start_Expr4Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_start_Expr4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			((Start_Expr4Context)_localctx).x = expr4(0);
			setState(353);
			match(EOF);
			 ((Start_Expr4Context)_localctx).result =  ((Start_Expr4Context)_localctx).x.result; 
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

	public static class Start_Expr5Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr5Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public Start_Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Expr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Expr5(this);
		}
	}

	public final Start_Expr5Context start_Expr5() throws RecognitionException {
		Start_Expr5Context _localctx = new Start_Expr5Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_start_Expr5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			((Start_Expr5Context)_localctx).x = expr5();
			setState(357);
			match(EOF);
			 ((Start_Expr5Context)_localctx).result =  ((Start_Expr5Context)_localctx).x.result; 
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

	public static class Start_Expr6Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr6Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public Start_Expr6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Expr6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Expr6(this);
		}
	}

	public final Start_Expr6Context start_Expr6() throws RecognitionException {
		Start_Expr6Context _localctx = new Start_Expr6Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_start_Expr6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			((Start_Expr6Context)_localctx).x = expr6(0);
			setState(361);
			match(EOF);
			 ((Start_Expr6Context)_localctx).result =  ((Start_Expr6Context)_localctx).x.result; 
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

	public static class Start_Expr7Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr7Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public Expr7Context expr7() {
			return getRuleContext(Expr7Context.class,0);
		}
		public Start_Expr7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Expr7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Expr7(this);
		}
	}

	public final Start_Expr7Context start_Expr7() throws RecognitionException {
		Start_Expr7Context _localctx = new Start_Expr7Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_start_Expr7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			((Start_Expr7Context)_localctx).x = expr7();
			setState(365);
			match(EOF);
			 ((Start_Expr7Context)_localctx).result =  ((Start_Expr7Context)_localctx).x.result; 
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

	public static class Start_TypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Type result;
		public TypeContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Start_TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Type(this);
		}
	}

	public final Start_TypeContext start_Type() throws RecognitionException {
		Start_TypeContext _localctx = new Start_TypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_start_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((Start_TypeContext)_localctx).x = type();
			setState(369);
			match(EOF);
			 ((Start_TypeContext)_localctx).result =  ((Start_TypeContext)_localctx).x.result; 
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

	public static class Start_Type1Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Type result;
		public Type1Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public Type1Context type1() {
			return getRuleContext(Type1Context.class,0);
		}
		public Start_Type1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Type1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Type1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Type1(this);
		}
	}

	public final Start_Type1Context start_Type1() throws RecognitionException {
		Start_Type1Context _localctx = new Start_Type1Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_start_Type1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			((Start_Type1Context)_localctx).x = type1();
			setState(373);
			match(EOF);
			 ((Start_Type1Context)_localctx).result =  ((Start_Type1Context)_localctx).x.result; 
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

	public static class Start_Type2Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Type result;
		public Type2Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public Type2Context type2() {
			return getRuleContext(Type2Context.class,0);
		}
		public Start_Type2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Type2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Type2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Type2(this);
		}
	}

	public final Start_Type2Context start_Type2() throws RecognitionException {
		Start_Type2Context _localctx = new Start_Type2Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_start_Type2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			((Start_Type2Context)_localctx).x = type2();
			setState(377);
			match(EOF);
			 ((Start_Type2Context)_localctx).result =  ((Start_Type2Context)_localctx).x.result; 
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

	public static class Start_Type3Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Type result;
		public Type3Context x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public Type3Context type3() {
			return getRuleContext(Type3Context.class,0);
		}
		public Start_Type3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Type3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Type3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Type3(this);
		}
	}

	public final Start_Type3Context start_Type3() throws RecognitionException {
		Start_Type3Context _localctx = new Start_Type3Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_start_Type3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			((Start_Type3Context)_localctx).x = type3();
			setState(381);
			match(EOF);
			 ((Start_Type3Context)_localctx).result =  ((Start_Type3Context)_localctx).x.result; 
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

	public static class Start_ListTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListType result;
		public ListTypeContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public Start_ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListType(this);
		}
	}

	public final Start_ListTypeContext start_ListType() throws RecognitionException {
		Start_ListTypeContext _localctx = new Start_ListTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_start_ListType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			((Start_ListTypeContext)_localctx).x = listType();
			setState(385);
			match(EOF);
			 ((Start_ListTypeContext)_localctx).result =  ((Start_ListTypeContext)_localctx).x.result; 
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

	public static class Start_VariantFieldTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.VariantFieldType result;
		public VariantFieldTypeContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public VariantFieldTypeContext variantFieldType() {
			return getRuleContext(VariantFieldTypeContext.class,0);
		}
		public Start_VariantFieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_VariantFieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_VariantFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_VariantFieldType(this);
		}
	}

	public final Start_VariantFieldTypeContext start_VariantFieldType() throws RecognitionException {
		Start_VariantFieldTypeContext _localctx = new Start_VariantFieldTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_start_VariantFieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			((Start_VariantFieldTypeContext)_localctx).x = variantFieldType();
			setState(389);
			match(EOF);
			 ((Start_VariantFieldTypeContext)_localctx).result =  ((Start_VariantFieldTypeContext)_localctx).x.result; 
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

	public static class Start_ListVariantFieldTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListVariantFieldType result;
		public ListVariantFieldTypeContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListVariantFieldTypeContext listVariantFieldType() {
			return getRuleContext(ListVariantFieldTypeContext.class,0);
		}
		public Start_ListVariantFieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListVariantFieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListVariantFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListVariantFieldType(this);
		}
	}

	public final Start_ListVariantFieldTypeContext start_ListVariantFieldType() throws RecognitionException {
		Start_ListVariantFieldTypeContext _localctx = new Start_ListVariantFieldTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_start_ListVariantFieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			((Start_ListVariantFieldTypeContext)_localctx).x = listVariantFieldType();
			setState(393);
			match(EOF);
			 ((Start_ListVariantFieldTypeContext)_localctx).result =  ((Start_ListVariantFieldTypeContext)_localctx).x.result; 
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

	public static class Start_RecordFieldTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.RecordFieldType result;
		public RecordFieldTypeContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public RecordFieldTypeContext recordFieldType() {
			return getRuleContext(RecordFieldTypeContext.class,0);
		}
		public Start_RecordFieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_RecordFieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_RecordFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_RecordFieldType(this);
		}
	}

	public final Start_RecordFieldTypeContext start_RecordFieldType() throws RecognitionException {
		Start_RecordFieldTypeContext _localctx = new Start_RecordFieldTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_start_RecordFieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			((Start_RecordFieldTypeContext)_localctx).x = recordFieldType();
			setState(397);
			match(EOF);
			 ((Start_RecordFieldTypeContext)_localctx).result =  ((Start_RecordFieldTypeContext)_localctx).x.result; 
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

	public static class Start_ListRecordFieldTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListRecordFieldType result;
		public ListRecordFieldTypeContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public ListRecordFieldTypeContext listRecordFieldType() {
			return getRuleContext(ListRecordFieldTypeContext.class,0);
		}
		public Start_ListRecordFieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListRecordFieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_ListRecordFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_ListRecordFieldType(this);
		}
	}

	public final Start_ListRecordFieldTypeContext start_ListRecordFieldType() throws RecognitionException {
		Start_ListRecordFieldTypeContext _localctx = new Start_ListRecordFieldTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_start_ListRecordFieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			((Start_ListRecordFieldTypeContext)_localctx).x = listRecordFieldType();
			setState(401);
			match(EOF);
			 ((Start_ListRecordFieldTypeContext)_localctx).result =  ((Start_ListRecordFieldTypeContext)_localctx).x.result; 
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

	public static class Start_TypingContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Typing result;
		public TypingContext x;
		public TerminalNode EOF() { return getToken(StellaParser.EOF, 0); }
		public TypingContext typing() {
			return getRuleContext(TypingContext.class,0);
		}
		public Start_TypingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Typing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterStart_Typing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitStart_Typing(this);
		}
	}

	public final Start_TypingContext start_Typing() throws RecognitionException {
		Start_TypingContext _localctx = new Start_TypingContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_start_Typing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			((Start_TypingContext)_localctx).x = typing();
			setState(405);
			match(EOF);
			 ((Start_TypingContext)_localctx).result =  ((Start_TypingContext)_localctx).x.result; 
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

	public static class ProgramContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Program result;
		public LanguageDeclContext p_1_1;
		public ListExtensionContext p_1_2;
		public ListDeclContext p_1_3;
		public LanguageDeclContext languageDecl() {
			return getRuleContext(LanguageDeclContext.class,0);
		}
		public ListExtensionContext listExtension() {
			return getRuleContext(ListExtensionContext.class,0);
		}
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			((ProgramContext)_localctx).p_1_1 = languageDecl();
			setState(409);
			((ProgramContext)_localctx).p_1_2 = listExtension(0);
			setState(410);
			((ProgramContext)_localctx).p_1_3 = listDecl(0);
			 ((ProgramContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.AProgram(((ProgramContext)_localctx).p_1_1.result,((ProgramContext)_localctx).p_1_2.result,((ProgramContext)_localctx).p_1_3.result); 
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

	public static class ListStellaIdentContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListStellaIdent result;
		public Token p_2_1;
		public Token p_3_1;
		public ListStellaIdentContext p_3_3;
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public ListStellaIdentContext listStellaIdent() {
			return getRuleContext(ListStellaIdentContext.class,0);
		}
		public ListStellaIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStellaIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListStellaIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListStellaIdent(this);
		}
	}

	public final ListStellaIdentContext listStellaIdent() throws RecognitionException {
		ListStellaIdentContext _localctx = new ListStellaIdentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_listStellaIdent);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListStellaIdentContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListStellaIdent(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				((ListStellaIdentContext)_localctx).p_2_1 = match(StellaIdent);
				 ((ListStellaIdentContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListStellaIdent(); _localctx.result.addLast(((ListStellaIdentContext)_localctx).p_2_1.getText()); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				((ListStellaIdentContext)_localctx).p_3_1 = match(StellaIdent);
				setState(417);
				match(Surrogate_id_SYMB_0);
				setState(418);
				((ListStellaIdentContext)_localctx).p_3_3 = listStellaIdent();
				 ((ListStellaIdentContext)_localctx).result =  ((ListStellaIdentContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListStellaIdentContext)_localctx).p_3_1.getText()); 
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

	public static class LanguageDeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.LanguageDecl result;
		public TerminalNode Surrogate_id_SYMB_61() { return getToken(StellaParser.Surrogate_id_SYMB_61, 0); }
		public TerminalNode Surrogate_id_SYMB_46() { return getToken(StellaParser.Surrogate_id_SYMB_46, 0); }
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(StellaParser.Surrogate_id_SYMB_1, 0); }
		public LanguageDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterLanguageDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitLanguageDecl(this);
		}
	}

	public final LanguageDeclContext languageDecl() throws RecognitionException {
		LanguageDeclContext _localctx = new LanguageDeclContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_languageDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(Surrogate_id_SYMB_61);
			setState(424);
			match(Surrogate_id_SYMB_46);
			setState(425);
			match(Surrogate_id_SYMB_1);
			 ((LanguageDeclContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.LanguageCore(); 
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

	public static class ExtensionContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Extension result;
		public ListExtensionNameContext p_1_3;
		public TerminalNode Surrogate_id_SYMB_49() { return getToken(StellaParser.Surrogate_id_SYMB_49, 0); }
		public TerminalNode Surrogate_id_SYMB_79() { return getToken(StellaParser.Surrogate_id_SYMB_79, 0); }
		public ListExtensionNameContext listExtensionName() {
			return getRuleContext(ListExtensionNameContext.class,0);
		}
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitExtension(this);
		}
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_extension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(Surrogate_id_SYMB_49);
			setState(429);
			match(Surrogate_id_SYMB_79);
			setState(430);
			((ExtensionContext)_localctx).p_1_3 = listExtensionName();
			 ((ExtensionContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.AnExtension(((ExtensionContext)_localctx).p_1_3.result); 
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

	public static class ListExtensionNameContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListExtensionName result;
		public Token p_2_1;
		public Token p_3_1;
		public ListExtensionNameContext p_3_3;
		public TerminalNode ExtensionName() { return getToken(StellaParser.ExtensionName, 0); }
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public ListExtensionNameContext listExtensionName() {
			return getRuleContext(ListExtensionNameContext.class,0);
		}
		public ListExtensionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExtensionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListExtensionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListExtensionName(this);
		}
	}

	public final ListExtensionNameContext listExtensionName() throws RecognitionException {
		ListExtensionNameContext _localctx = new ListExtensionNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_listExtensionName);
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListExtensionNameContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListExtensionName(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				((ListExtensionNameContext)_localctx).p_2_1 = match(ExtensionName);
				 ((ListExtensionNameContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListExtensionName(); _localctx.result.addLast(((ListExtensionNameContext)_localctx).p_2_1.getText()); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				((ListExtensionNameContext)_localctx).p_3_1 = match(ExtensionName);
				setState(437);
				match(Surrogate_id_SYMB_0);
				setState(438);
				((ListExtensionNameContext)_localctx).p_3_3 = listExtensionName();
				 ((ListExtensionNameContext)_localctx).result =  ((ListExtensionNameContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListExtensionNameContext)_localctx).p_3_1.getText()); 
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

	public static class ListExtensionContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListExtension result;
		public ListExtensionContext p_2_1;
		public ExtensionContext p_2_2;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(StellaParser.Surrogate_id_SYMB_1, 0); }
		public ListExtensionContext listExtension() {
			return getRuleContext(ListExtensionContext.class,0);
		}
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
		}
		public ListExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListExtension(this);
		}
	}

	public final ListExtensionContext listExtension() throws RecognitionException {
		return listExtension(0);
	}

	private ListExtensionContext listExtension(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListExtensionContext _localctx = new ListExtensionContext(_ctx, _parentState);
		ListExtensionContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_listExtension, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((ListExtensionContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListExtension(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListExtensionContext(_parentctx, _parentState);
					_localctx.p_2_1 = _prevctx;
					_localctx.p_2_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listExtension);
					setState(446);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(447);
					((ListExtensionContext)_localctx).p_2_2 = extension();
					setState(448);
					match(Surrogate_id_SYMB_1);
					 ((ListExtensionContext)_localctx).result =  ((ListExtensionContext)_localctx).p_2_1.result; _localctx.result.addLast(((ListExtensionContext)_localctx).p_2_2.result); 
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Decl result;
		public ListAnnotationContext p_1_1;
		public Token p_1_3;
		public ListParamDeclContext p_1_5;
		public ReturnTypeContext p_1_7;
		public ThrowTypeContext p_1_8;
		public ListDeclContext p_1_10;
		public ExprContext p_1_12;
		public ListAnnotationContext p_2_1;
		public Token p_2_4;
		public ListStellaIdentContext p_2_6;
		public ListParamDeclContext p_2_9;
		public ReturnTypeContext p_2_11;
		public ThrowTypeContext p_2_12;
		public ListDeclContext p_2_14;
		public ExprContext p_2_16;
		public Token p_3_2;
		public TypeContext p_3_4;
		public TypeContext p_4_4;
		public Token p_5_3;
		public TypeContext p_5_5;
		public TerminalNode Surrogate_id_SYMB_52() { return getToken(StellaParser.Surrogate_id_SYMB_52, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(StellaParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(StellaParser.Surrogate_id_SYMB_3, 0); }
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(StellaParser.Surrogate_id_SYMB_4, 0); }
		public TerminalNode Surrogate_id_SYMB_68() { return getToken(StellaParser.Surrogate_id_SYMB_68, 0); }
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(StellaParser.Surrogate_id_SYMB_5, 0); }
		public ListAnnotationContext listAnnotation() {
			return getRuleContext(ListAnnotationContext.class,0);
		}
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public ListParamDeclContext listParamDecl() {
			return getRuleContext(ListParamDeclContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public ThrowTypeContext throwType() {
			return getRuleContext(ThrowTypeContext.class,0);
		}
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_55() { return getToken(StellaParser.Surrogate_id_SYMB_55, 0); }
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(StellaParser.Surrogate_id_SYMB_6, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(StellaParser.Surrogate_id_SYMB_7, 0); }
		public ListStellaIdentContext listStellaIdent() {
			return getRuleContext(ListStellaIdentContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_75() { return getToken(StellaParser.Surrogate_id_SYMB_75, 0); }
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(StellaParser.Surrogate_id_SYMB_8, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_48() { return getToken(StellaParser.Surrogate_id_SYMB_48, 0); }
		public TerminalNode Surrogate_id_SYMB_78() { return getToken(StellaParser.Surrogate_id_SYMB_78, 0); }
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(StellaParser.Surrogate_id_SYMB_9, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_decl);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				((DeclContext)_localctx).p_1_1 = listAnnotation(0);
				setState(457);
				match(Surrogate_id_SYMB_52);
				setState(458);
				((DeclContext)_localctx).p_1_3 = match(StellaIdent);
				setState(459);
				match(Surrogate_id_SYMB_2);
				setState(460);
				((DeclContext)_localctx).p_1_5 = listParamDecl();
				setState(461);
				match(Surrogate_id_SYMB_3);
				setState(462);
				((DeclContext)_localctx).p_1_7 = returnType();
				setState(463);
				((DeclContext)_localctx).p_1_8 = throwType();
				setState(464);
				match(Surrogate_id_SYMB_4);
				setState(465);
				((DeclContext)_localctx).p_1_10 = listDecl(0);
				setState(466);
				match(Surrogate_id_SYMB_68);
				setState(467);
				((DeclContext)_localctx).p_1_12 = expr();
				setState(468);
				match(Surrogate_id_SYMB_5);
				 ((DeclContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.DeclFun(((DeclContext)_localctx).p_1_1.result,((DeclContext)_localctx).p_1_3.getText(),((DeclContext)_localctx).p_1_5.result,((DeclContext)_localctx).p_1_7.result,((DeclContext)_localctx).p_1_8.result,((DeclContext)_localctx).p_1_10.result,((DeclContext)_localctx).p_1_12.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				((DeclContext)_localctx).p_2_1 = listAnnotation(0);
				setState(472);
				match(Surrogate_id_SYMB_55);
				setState(473);
				match(Surrogate_id_SYMB_52);
				setState(474);
				((DeclContext)_localctx).p_2_4 = match(StellaIdent);
				setState(475);
				match(Surrogate_id_SYMB_6);
				setState(476);
				((DeclContext)_localctx).p_2_6 = listStellaIdent();
				setState(477);
				match(Surrogate_id_SYMB_7);
				setState(478);
				match(Surrogate_id_SYMB_2);
				setState(479);
				((DeclContext)_localctx).p_2_9 = listParamDecl();
				setState(480);
				match(Surrogate_id_SYMB_3);
				setState(481);
				((DeclContext)_localctx).p_2_11 = returnType();
				setState(482);
				((DeclContext)_localctx).p_2_12 = throwType();
				setState(483);
				match(Surrogate_id_SYMB_4);
				setState(484);
				((DeclContext)_localctx).p_2_14 = listDecl(0);
				setState(485);
				match(Surrogate_id_SYMB_68);
				setState(486);
				((DeclContext)_localctx).p_2_16 = expr();
				setState(487);
				match(Surrogate_id_SYMB_5);
				 ((DeclContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.DeclFunGeneric(((DeclContext)_localctx).p_2_1.result,((DeclContext)_localctx).p_2_4.getText(),((DeclContext)_localctx).p_2_6.result,((DeclContext)_localctx).p_2_9.result,((DeclContext)_localctx).p_2_11.result,((DeclContext)_localctx).p_2_12.result,((DeclContext)_localctx).p_2_14.result,((DeclContext)_localctx).p_2_16.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(Surrogate_id_SYMB_75);
				setState(491);
				((DeclContext)_localctx).p_3_2 = match(StellaIdent);
				setState(492);
				match(Surrogate_id_SYMB_8);
				setState(493);
				((DeclContext)_localctx).p_3_4 = type();
				 ((DeclContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.DeclTypeAlias(((DeclContext)_localctx).p_3_2.getText(),((DeclContext)_localctx).p_3_4.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				match(Surrogate_id_SYMB_48);
				setState(497);
				match(Surrogate_id_SYMB_75);
				setState(498);
				match(Surrogate_id_SYMB_8);
				setState(499);
				((DeclContext)_localctx).p_4_4 = type();
				 ((DeclContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.DeclExceptionType(((DeclContext)_localctx).p_4_4.result); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
				match(Surrogate_id_SYMB_48);
				setState(503);
				match(Surrogate_id_SYMB_78);
				setState(504);
				((DeclContext)_localctx).p_5_3 = match(StellaIdent);
				setState(505);
				match(Surrogate_id_SYMB_9);
				setState(506);
				((DeclContext)_localctx).p_5_5 = type();
				 ((DeclContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.DeclExceptionVariant(((DeclContext)_localctx).p_5_3.getText(),((DeclContext)_localctx).p_5_5.result); 
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

	public static class ListDeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListDecl result;
		public ListDeclContext p_2_1;
		public DeclContext p_2_2;
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ListDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListDecl(this);
		}
	}

	public final ListDeclContext listDecl() throws RecognitionException {
		return listDecl(0);
	}

	private ListDeclContext listDecl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListDeclContext _localctx = new ListDeclContext(_ctx, _parentState);
		ListDeclContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_listDecl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((ListDeclContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListDecl(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListDeclContext(_parentctx, _parentState);
					_localctx.p_2_1 = _prevctx;
					_localctx.p_2_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listDecl);
					setState(514);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(515);
					((ListDeclContext)_localctx).p_2_2 = decl();
					 ((ListDeclContext)_localctx).result =  ((ListDeclContext)_localctx).p_2_1.result; _localctx.result.addLast(((ListDeclContext)_localctx).p_2_2.result); 
					}
					} 
				}
				setState(522);
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

	public static class LocalDeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.LocalDecl result;
		public DeclContext p_1_1;
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public LocalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterLocalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitLocalDecl(this);
		}
	}

	public final LocalDeclContext localDecl() throws RecognitionException {
		LocalDeclContext _localctx = new LocalDeclContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_localDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			((LocalDeclContext)_localctx).p_1_1 = decl();
			 ((LocalDeclContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ALocalDecl(((LocalDeclContext)_localctx).p_1_1.result); 
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

	public static class ListLocalDeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListLocalDecl result;
		public ListLocalDeclContext p_2_1;
		public LocalDeclContext p_2_2;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(StellaParser.Surrogate_id_SYMB_1, 0); }
		public ListLocalDeclContext listLocalDecl() {
			return getRuleContext(ListLocalDeclContext.class,0);
		}
		public LocalDeclContext localDecl() {
			return getRuleContext(LocalDeclContext.class,0);
		}
		public ListLocalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLocalDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListLocalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListLocalDecl(this);
		}
	}

	public final ListLocalDeclContext listLocalDecl() throws RecognitionException {
		return listLocalDecl(0);
	}

	private ListLocalDeclContext listLocalDecl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListLocalDeclContext _localctx = new ListLocalDeclContext(_ctx, _parentState);
		ListLocalDeclContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_listLocalDecl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((ListLocalDeclContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListLocalDecl(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListLocalDeclContext(_parentctx, _parentState);
					_localctx.p_2_1 = _prevctx;
					_localctx.p_2_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listLocalDecl);
					setState(529);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(530);
					((ListLocalDeclContext)_localctx).p_2_2 = localDecl();
					setState(531);
					match(Surrogate_id_SYMB_1);
					 ((ListLocalDeclContext)_localctx).result =  ((ListLocalDeclContext)_localctx).p_2_1.result; _localctx.result.addLast(((ListLocalDeclContext)_localctx).p_2_2.result); 
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class AnnotationContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Annotation result;
		public TerminalNode Surrogate_id_SYMB_59() { return getToken(StellaParser.Surrogate_id_SYMB_59, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(Surrogate_id_SYMB_59);
			 ((AnnotationContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.InlineAnnotation(); 
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

	public static class ListAnnotationContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListAnnotation result;
		public ListAnnotationContext p_2_1;
		public AnnotationContext p_2_2;
		public ListAnnotationContext listAnnotation() {
			return getRuleContext(ListAnnotationContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ListAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListAnnotation(this);
		}
	}

	public final ListAnnotationContext listAnnotation() throws RecognitionException {
		return listAnnotation(0);
	}

	private ListAnnotationContext listAnnotation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListAnnotationContext _localctx = new ListAnnotationContext(_ctx, _parentState);
		ListAnnotationContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_listAnnotation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((ListAnnotationContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListAnnotation(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListAnnotationContext(_parentctx, _parentState);
					_localctx.p_2_1 = _prevctx;
					_localctx.p_2_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listAnnotation);
					setState(545);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(546);
					((ListAnnotationContext)_localctx).p_2_2 = annotation();
					 ((ListAnnotationContext)_localctx).result =  ((ListAnnotationContext)_localctx).p_2_1.result; _localctx.result.addLast(((ListAnnotationContext)_localctx).p_2_2.result); 
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ParamDeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ParamDecl result;
		public Token p_1_1;
		public TypeContext p_1_3;
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(StellaParser.Surrogate_id_SYMB_9, 0); }
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitParamDecl(this);
		}
	}

	public final ParamDeclContext paramDecl() throws RecognitionException {
		ParamDeclContext _localctx = new ParamDeclContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_paramDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			((ParamDeclContext)_localctx).p_1_1 = match(StellaIdent);
			setState(555);
			match(Surrogate_id_SYMB_9);
			setState(556);
			((ParamDeclContext)_localctx).p_1_3 = type();
			 ((ParamDeclContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.AParamDecl(((ParamDeclContext)_localctx).p_1_1.getText(),((ParamDeclContext)_localctx).p_1_3.result); 
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

	public static class ListParamDeclContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListParamDecl result;
		public ParamDeclContext p_2_1;
		public ParamDeclContext p_3_1;
		public ListParamDeclContext p_3_3;
		public ParamDeclContext paramDecl() {
			return getRuleContext(ParamDeclContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public ListParamDeclContext listParamDecl() {
			return getRuleContext(ListParamDeclContext.class,0);
		}
		public ListParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParamDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListParamDecl(this);
		}
	}

	public final ListParamDeclContext listParamDecl() throws RecognitionException {
		ListParamDeclContext _localctx = new ListParamDeclContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_listParamDecl);
		try {
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListParamDeclContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListParamDecl(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				((ListParamDeclContext)_localctx).p_2_1 = paramDecl();
				 ((ListParamDeclContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListParamDecl(); _localctx.result.addLast(((ListParamDeclContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				((ListParamDeclContext)_localctx).p_3_1 = paramDecl();
				setState(564);
				match(Surrogate_id_SYMB_0);
				setState(565);
				((ListParamDeclContext)_localctx).p_3_3 = listParamDecl();
				 ((ListParamDeclContext)_localctx).result =  ((ListParamDeclContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListParamDeclContext)_localctx).p_3_1.result); 
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ReturnType result;
		public TypeContext p_2_2;
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(StellaParser.Surrogate_id_SYMB_10, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_returnType);
		try {
			setState(575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case Surrogate_id_SYMB_4:
			case Surrogate_id_SYMB_72:
				enterOuterAlt(_localctx, 1);
				{
				 ((ReturnTypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.NoReturnType(); 
				}
				break;
			case Surrogate_id_SYMB_10:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(Surrogate_id_SYMB_10);
				setState(572);
				((ReturnTypeContext)_localctx).p_2_2 = type();
				 ((ReturnTypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.SomeReturnType(((ReturnTypeContext)_localctx).p_2_2.result); 
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

	public static class ThrowTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ThrowType result;
		public ListType9Context p_2_2;
		public TerminalNode Surrogate_id_SYMB_72() { return getToken(StellaParser.Surrogate_id_SYMB_72, 0); }
		public ListType9Context listType9() {
			return getRuleContext(ListType9Context.class,0);
		}
		public ThrowTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterThrowType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitThrowType(this);
		}
	}

	public final ThrowTypeContext throwType() throws RecognitionException {
		ThrowTypeContext _localctx = new ThrowTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_throwType);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case Surrogate_id_SYMB_4:
				enterOuterAlt(_localctx, 1);
				{
				 ((ThrowTypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.NoThrowType(); 
				}
				break;
			case Surrogate_id_SYMB_72:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				match(Surrogate_id_SYMB_72);
				setState(579);
				((ThrowTypeContext)_localctx).p_2_2 = listType9();
				 ((ThrowTypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.SomeThrowType(((ThrowTypeContext)_localctx).p_2_2.result); 
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

	public static class Type9Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Type result;
		public TypeContext p_1_1;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterType9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitType9(this);
		}
	}

	public final Type9Context type9() throws RecognitionException {
		Type9Context _localctx = new Type9Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_type9);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			((Type9Context)_localctx).p_1_1 = type();
			 ((Type9Context)_localctx).result =  ((Type9Context)_localctx).p_1_1.result; 
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

	public static class ListType9Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListType result;
		public Type9Context p_1_1;
		public Type9Context p_2_1;
		public ListType9Context p_2_3;
		public Type9Context type9() {
			return getRuleContext(Type9Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public ListType9Context listType9() {
			return getRuleContext(ListType9Context.class,0);
		}
		public ListType9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListType9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListType9(this);
		}
	}

	public final ListType9Context listType9() throws RecognitionException {
		ListType9Context _localctx = new ListType9Context(_ctx, getState());
		enterRule(_localctx, 136, RULE_listType9);
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				((ListType9Context)_localctx).p_1_1 = type9();
				 ((ListType9Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListType(); _localctx.result.addLast(((ListType9Context)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				((ListType9Context)_localctx).p_2_1 = type9();
				setState(591);
				match(Surrogate_id_SYMB_0);
				setState(592);
				((ListType9Context)_localctx).p_2_3 = listType9();
				 ((ListType9Context)_localctx).result =  ((ListType9Context)_localctx).p_2_3.result; _localctx.result.addFirst(((ListType9Context)_localctx).p_2_1.result); 
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

	public static class MatchCaseContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.MatchCase result;
		public PatternContext p_1_1;
		public ExprContext p_1_3;
		public TerminalNode Surrogate_id_SYMB_11() { return getToken(StellaParser.Surrogate_id_SYMB_11, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MatchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterMatchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitMatchCase(this);
		}
	}

	public final MatchCaseContext matchCase() throws RecognitionException {
		MatchCaseContext _localctx = new MatchCaseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_matchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			((MatchCaseContext)_localctx).p_1_1 = pattern(0);
			setState(598);
			match(Surrogate_id_SYMB_11);
			setState(599);
			((MatchCaseContext)_localctx).p_1_3 = expr();
			 ((MatchCaseContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.AMatchCase(((MatchCaseContext)_localctx).p_1_1.result,((MatchCaseContext)_localctx).p_1_3.result); 
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

	public static class ListMatchCaseContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListMatchCase result;
		public MatchCaseContext p_2_1;
		public MatchCaseContext p_3_1;
		public ListMatchCaseContext p_3_3;
		public MatchCaseContext matchCase() {
			return getRuleContext(MatchCaseContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_12() { return getToken(StellaParser.Surrogate_id_SYMB_12, 0); }
		public ListMatchCaseContext listMatchCase() {
			return getRuleContext(ListMatchCaseContext.class,0);
		}
		public ListMatchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listMatchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListMatchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListMatchCase(this);
		}
	}

	public final ListMatchCaseContext listMatchCase() throws RecognitionException {
		ListMatchCaseContext _localctx = new ListMatchCaseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_listMatchCase);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListMatchCaseContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListMatchCase(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				((ListMatchCaseContext)_localctx).p_2_1 = matchCase();
				 ((ListMatchCaseContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListMatchCase(); _localctx.result.addLast(((ListMatchCaseContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				((ListMatchCaseContext)_localctx).p_3_1 = matchCase();
				setState(607);
				match(Surrogate_id_SYMB_12);
				setState(608);
				((ListMatchCaseContext)_localctx).p_3_3 = listMatchCase();
				 ((ListMatchCaseContext)_localctx).result =  ((ListMatchCaseContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListMatchCaseContext)_localctx).p_3_1.result); 
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

	public static class OptionalTypingContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.OptionalTyping result;
		public TypeContext p_2_2;
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(StellaParser.Surrogate_id_SYMB_9, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OptionalTypingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalTyping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterOptionalTyping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitOptionalTyping(this);
		}
	}

	public final OptionalTypingContext optionalTyping() throws RecognitionException {
		OptionalTypingContext _localctx = new OptionalTypingContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_optionalTyping);
		try {
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case Surrogate_id_SYMB_0:
			case Surrogate_id_SYMB_14:
				enterOuterAlt(_localctx, 1);
				{
				 ((OptionalTypingContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.NoTyping(); 
				}
				break;
			case Surrogate_id_SYMB_9:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(Surrogate_id_SYMB_9);
				setState(615);
				((OptionalTypingContext)_localctx).p_2_2 = type();
				 ((OptionalTypingContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.SomeTyping(((OptionalTypingContext)_localctx).p_2_2.result); 
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

	public static class PatternDataContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.PatternData result;
		public PatternContext p_2_2;
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(StellaParser.Surrogate_id_SYMB_8, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterPatternData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitPatternData(this);
		}
	}

	public final PatternDataContext patternData() throws RecognitionException {
		PatternDataContext _localctx = new PatternDataContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_patternData);
		try {
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case Surrogate_id_SYMB_14:
				enterOuterAlt(_localctx, 1);
				{
				 ((PatternDataContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.NoPatternData(); 
				}
				break;
			case Surrogate_id_SYMB_8:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				match(Surrogate_id_SYMB_8);
				setState(622);
				((PatternDataContext)_localctx).p_2_2 = pattern(0);
				 ((PatternDataContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.SomePatternData(((PatternDataContext)_localctx).p_2_2.result); 
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

	public static class ExprDataContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ExprData result;
		public ExprContext p_2_2;
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(StellaParser.Surrogate_id_SYMB_8, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterExprData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitExprData(this);
		}
	}

	public final ExprDataContext exprData() throws RecognitionException {
		ExprDataContext _localctx = new ExprDataContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_exprData);
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case Surrogate_id_SYMB_14:
				enterOuterAlt(_localctx, 1);
				{
				 ((ExprDataContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.NoExprData(); 
				}
				break;
			case Surrogate_id_SYMB_8:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				match(Surrogate_id_SYMB_8);
				setState(629);
				((ExprDataContext)_localctx).p_2_2 = expr();
				 ((ExprDataContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.SomeExprData(((ExprDataContext)_localctx).p_2_2.result); 
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

	public static class PatternContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Pattern result;
		public PatternContext p_1_1;
		public PatternContext p_2_1;
		public Token p_3_2;
		public PatternDataContext p_3_3;
		public PatternContext p_4_3;
		public PatternContext p_5_3;
		public ListPatternContext p_6_2;
		public ListLabelledPatternContext p_7_2;
		public ListPatternContext p_8_2;
		public PatternContext p_9_3;
		public PatternContext p_9_5;
		public PatternContext p_10_2;
		public PatternContext p_10_4;
		public Token p_14_1;
		public PatternContext p_15_3;
		public Token p_16_1;
		public PatternContext p_17_2;
		public TypeContext p_1_4;
		public TypeContext p_2_3;
		public TerminalNode Surrogate_id_SYMB_13() { return getToken(StellaParser.Surrogate_id_SYMB_13, 0); }
		public TerminalNode Surrogate_id_SYMB_14() { return getToken(StellaParser.Surrogate_id_SYMB_14, 0); }
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public PatternDataContext patternData() {
			return getRuleContext(PatternDataContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_58() { return getToken(StellaParser.Surrogate_id_SYMB_58, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(StellaParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(StellaParser.Surrogate_id_SYMB_3, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_60() { return getToken(StellaParser.Surrogate_id_SYMB_60, 0); }
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(StellaParser.Surrogate_id_SYMB_4, 0); }
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(StellaParser.Surrogate_id_SYMB_5, 0); }
		public ListPatternContext listPattern() {
			return getRuleContext(ListPatternContext.class,0);
		}
		public ListLabelledPatternContext listLabelledPattern() {
			return getRuleContext(ListLabelledPatternContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(StellaParser.Surrogate_id_SYMB_6, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(StellaParser.Surrogate_id_SYMB_7, 0); }
		public TerminalNode Surrogate_id_SYMB_45() { return getToken(StellaParser.Surrogate_id_SYMB_45, 0); }
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public TerminalNode Surrogate_id_SYMB_50() { return getToken(StellaParser.Surrogate_id_SYMB_50, 0); }
		public TerminalNode Surrogate_id_SYMB_73() { return getToken(StellaParser.Surrogate_id_SYMB_73, 0); }
		public TerminalNode Surrogate_id_SYMB_77() { return getToken(StellaParser.Surrogate_id_SYMB_77, 0); }
		public TerminalNode INTEGER() { return getToken(StellaParser.INTEGER, 0); }
		public TerminalNode Surrogate_id_SYMB_69() { return getToken(StellaParser.Surrogate_id_SYMB_69, 0); }
		public TerminalNode Surrogate_id_SYMB_43() { return getToken(StellaParser.Surrogate_id_SYMB_43, 0); }
		public TerminalNode Surrogate_id_SYMB_41() { return getToken(StellaParser.Surrogate_id_SYMB_41, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(635);
				match(Surrogate_id_SYMB_13);
				setState(636);
				((PatternContext)_localctx).p_3_2 = match(StellaIdent);
				setState(637);
				((PatternContext)_localctx).p_3_3 = patternData();
				setState(638);
				match(Surrogate_id_SYMB_14);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternVariant(((PatternContext)_localctx).p_3_2.getText(),((PatternContext)_localctx).p_3_3.result); 
				}
				break;
			case 2:
				{
				setState(641);
				match(Surrogate_id_SYMB_58);
				setState(642);
				match(Surrogate_id_SYMB_2);
				setState(643);
				((PatternContext)_localctx).p_4_3 = pattern(0);
				setState(644);
				match(Surrogate_id_SYMB_3);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternInl(((PatternContext)_localctx).p_4_3.result); 
				}
				break;
			case 3:
				{
				setState(647);
				match(Surrogate_id_SYMB_60);
				setState(648);
				match(Surrogate_id_SYMB_2);
				setState(649);
				((PatternContext)_localctx).p_5_3 = pattern(0);
				setState(650);
				match(Surrogate_id_SYMB_3);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternInr(((PatternContext)_localctx).p_5_3.result); 
				}
				break;
			case 4:
				{
				setState(653);
				match(Surrogate_id_SYMB_4);
				setState(654);
				((PatternContext)_localctx).p_6_2 = listPattern();
				setState(655);
				match(Surrogate_id_SYMB_5);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternTuple(((PatternContext)_localctx).p_6_2.result); 
				}
				break;
			case 5:
				{
				setState(658);
				match(Surrogate_id_SYMB_4);
				setState(659);
				((PatternContext)_localctx).p_7_2 = listLabelledPattern();
				setState(660);
				match(Surrogate_id_SYMB_5);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternRecord(((PatternContext)_localctx).p_7_2.result); 
				}
				break;
			case 6:
				{
				setState(663);
				match(Surrogate_id_SYMB_6);
				setState(664);
				((PatternContext)_localctx).p_8_2 = listPattern();
				setState(665);
				match(Surrogate_id_SYMB_7);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternList(((PatternContext)_localctx).p_8_2.result); 
				}
				break;
			case 7:
				{
				setState(668);
				match(Surrogate_id_SYMB_45);
				setState(669);
				match(Surrogate_id_SYMB_2);
				setState(670);
				((PatternContext)_localctx).p_9_3 = pattern(0);
				setState(671);
				match(Surrogate_id_SYMB_0);
				setState(672);
				((PatternContext)_localctx).p_9_5 = pattern(0);
				setState(673);
				match(Surrogate_id_SYMB_3);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternCons(((PatternContext)_localctx).p_9_3.result,((PatternContext)_localctx).p_9_5.result); 
				}
				break;
			case 8:
				{
				setState(676);
				match(Surrogate_id_SYMB_2);
				setState(677);
				((PatternContext)_localctx).p_10_2 = pattern(0);
				setState(678);
				match(Surrogate_id_SYMB_0);
				setState(679);
				((PatternContext)_localctx).p_10_4 = pattern(0);
				setState(680);
				match(Surrogate_id_SYMB_3);
				 ((PatternContext)_localctx).result =  ru.itmo.stella.lang.AbsynDef.patternCons(((PatternContext)_localctx).p_10_2.result,((PatternContext)_localctx).p_10_4.result); 
				}
				break;
			case 9:
				{
				setState(683);
				match(Surrogate_id_SYMB_50);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternFalse(); 
				}
				break;
			case 10:
				{
				setState(685);
				match(Surrogate_id_SYMB_73);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternTrue(); 
				}
				break;
			case 11:
				{
				setState(687);
				match(Surrogate_id_SYMB_77);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternUnit(); 
				}
				break;
			case 12:
				{
				setState(689);
				((PatternContext)_localctx).p_14_1 = match(INTEGER);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternInt(Integer.parseInt(((PatternContext)_localctx).p_14_1.getText())); 
				}
				break;
			case 13:
				{
				setState(691);
				match(Surrogate_id_SYMB_69);
				setState(692);
				match(Surrogate_id_SYMB_2);
				setState(693);
				((PatternContext)_localctx).p_15_3 = pattern(0);
				setState(694);
				match(Surrogate_id_SYMB_3);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternSucc(((PatternContext)_localctx).p_15_3.result); 
				}
				break;
			case 14:
				{
				setState(697);
				((PatternContext)_localctx).p_16_1 = match(StellaIdent);
				 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternVar(((PatternContext)_localctx).p_16_1.getText()); 
				}
				break;
			case 15:
				{
				setState(699);
				match(Surrogate_id_SYMB_2);
				setState(700);
				((PatternContext)_localctx).p_17_2 = pattern(0);
				setState(701);
				match(Surrogate_id_SYMB_3);
				 ((PatternContext)_localctx).result =  ((PatternContext)_localctx).p_17_2.result; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(719);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(717);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new PatternContext(_parentctx, _parentState);
						_localctx.p_1_1 = _prevctx;
						_localctx.p_1_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_pattern);
						setState(706);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(707);
						match(Surrogate_id_SYMB_43);
						setState(708);
						match(Surrogate_id_SYMB_41);
						setState(709);
						((PatternContext)_localctx).p_1_4 = type();
						 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternCastAs(((PatternContext)_localctx).p_1_1.result,((PatternContext)_localctx).p_1_4.result); 
						}
						break;
					case 2:
						{
						_localctx = new PatternContext(_parentctx, _parentState);
						_localctx.p_2_1 = _prevctx;
						_localctx.p_2_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_pattern);
						setState(712);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(713);
						match(Surrogate_id_SYMB_41);
						setState(714);
						((PatternContext)_localctx).p_2_3 = type();
						 ((PatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.PatternAsc(((PatternContext)_localctx).p_2_1.result,((PatternContext)_localctx).p_2_3.result); 
						}
						break;
					}
					} 
				}
				setState(721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class ListPatternContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListPattern result;
		public PatternContext p_2_1;
		public PatternContext p_3_1;
		public ListPatternContext p_3_3;
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public ListPatternContext listPattern() {
			return getRuleContext(ListPatternContext.class,0);
		}
		public ListPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListPattern(this);
		}
	}

	public final ListPatternContext listPattern() throws RecognitionException {
		ListPatternContext _localctx = new ListPatternContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_listPattern);
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListPatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListPattern(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				((ListPatternContext)_localctx).p_2_1 = pattern(0);
				 ((ListPatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListPattern(); _localctx.result.addLast(((ListPatternContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				((ListPatternContext)_localctx).p_3_1 = pattern(0);
				setState(727);
				match(Surrogate_id_SYMB_0);
				setState(728);
				((ListPatternContext)_localctx).p_3_3 = listPattern();
				 ((ListPatternContext)_localctx).result =  ((ListPatternContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListPatternContext)_localctx).p_3_1.result); 
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

	public static class LabelledPatternContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.LabelledPattern result;
		public Token p_1_1;
		public PatternContext p_1_3;
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(StellaParser.Surrogate_id_SYMB_8, 0); }
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public LabelledPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterLabelledPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitLabelledPattern(this);
		}
	}

	public final LabelledPatternContext labelledPattern() throws RecognitionException {
		LabelledPatternContext _localctx = new LabelledPatternContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_labelledPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			((LabelledPatternContext)_localctx).p_1_1 = match(StellaIdent);
			setState(734);
			match(Surrogate_id_SYMB_8);
			setState(735);
			((LabelledPatternContext)_localctx).p_1_3 = pattern(0);
			 ((LabelledPatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ALabelledPattern(((LabelledPatternContext)_localctx).p_1_1.getText(),((LabelledPatternContext)_localctx).p_1_3.result); 
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

	public static class ListLabelledPatternContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListLabelledPattern result;
		public LabelledPatternContext p_1_1;
		public LabelledPatternContext p_2_1;
		public ListLabelledPatternContext p_2_3;
		public LabelledPatternContext labelledPattern() {
			return getRuleContext(LabelledPatternContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public ListLabelledPatternContext listLabelledPattern() {
			return getRuleContext(ListLabelledPatternContext.class,0);
		}
		public ListLabelledPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLabelledPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListLabelledPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListLabelledPattern(this);
		}
	}

	public final ListLabelledPatternContext listLabelledPattern() throws RecognitionException {
		ListLabelledPatternContext _localctx = new ListLabelledPatternContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_listLabelledPattern);
		try {
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				((ListLabelledPatternContext)_localctx).p_1_1 = labelledPattern();
				 ((ListLabelledPatternContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListLabelledPattern(); _localctx.result.addLast(((ListLabelledPatternContext)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				((ListLabelledPatternContext)_localctx).p_2_1 = labelledPattern();
				setState(742);
				match(Surrogate_id_SYMB_0);
				setState(743);
				((ListLabelledPatternContext)_localctx).p_2_3 = listLabelledPattern();
				 ((ListLabelledPatternContext)_localctx).result =  ((ListLabelledPatternContext)_localctx).p_2_3.result; _localctx.result.addFirst(((ListLabelledPatternContext)_localctx).p_2_1.result); 
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

	public static class BindingContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Binding result;
		public Token p_1_1;
		public ExprContext p_1_3;
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(StellaParser.Surrogate_id_SYMB_8, 0); }
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitBinding(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			((BindingContext)_localctx).p_1_1 = match(StellaIdent);
			setState(749);
			match(Surrogate_id_SYMB_8);
			setState(750);
			((BindingContext)_localctx).p_1_3 = expr();
			 ((BindingContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ABinding(((BindingContext)_localctx).p_1_1.getText(),((BindingContext)_localctx).p_1_3.result); 
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

	public static class ListBindingContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListBinding result;
		public BindingContext p_1_1;
		public BindingContext p_2_1;
		public ListBindingContext p_2_3;
		public BindingContext binding() {
			return getRuleContext(BindingContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public ListBindingContext listBinding() {
			return getRuleContext(ListBindingContext.class,0);
		}
		public ListBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListBinding(this);
		}
	}

	public final ListBindingContext listBinding() throws RecognitionException {
		ListBindingContext _localctx = new ListBindingContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_listBinding);
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				((ListBindingContext)_localctx).p_1_1 = binding();
				 ((ListBindingContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListBinding(); _localctx.result.addLast(((ListBindingContext)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				((ListBindingContext)_localctx).p_2_1 = binding();
				setState(757);
				match(Surrogate_id_SYMB_0);
				setState(758);
				((ListBindingContext)_localctx).p_2_3 = listBinding();
				 ((ListBindingContext)_localctx).result =  ((ListBindingContext)_localctx).p_2_3.result; _localctx.result.addFirst(((ListBindingContext)_localctx).p_2_1.result); 
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

	public static class ExprContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr1Context p_1_1;
		public ExprContext p_1_3;
		public Expr1Context p_2_1;
		public ListPatternBindingContext p_3_2;
		public ExprContext p_3_4;
		public ListPatternBindingContext p_4_2;
		public ExprContext p_4_4;
		public ListStellaIdentContext p_5_3;
		public ExprContext p_5_5;
		public Expr1Context p_6_1;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(StellaParser.Surrogate_id_SYMB_1, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_62() { return getToken(StellaParser.Surrogate_id_SYMB_62, 0); }
		public TerminalNode Surrogate_id_SYMB_57() { return getToken(StellaParser.Surrogate_id_SYMB_57, 0); }
		public ListPatternBindingContext listPatternBinding() {
			return getRuleContext(ListPatternBindingContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_63() { return getToken(StellaParser.Surrogate_id_SYMB_63, 0); }
		public TerminalNode Surrogate_id_SYMB_55() { return getToken(StellaParser.Surrogate_id_SYMB_55, 0); }
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(StellaParser.Surrogate_id_SYMB_6, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(StellaParser.Surrogate_id_SYMB_7, 0); }
		public ListStellaIdentContext listStellaIdent() {
			return getRuleContext(ListStellaIdentContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_expr);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				((ExprContext)_localctx).p_1_1 = expr1();
				setState(764);
				match(Surrogate_id_SYMB_1);
				setState(765);
				((ExprContext)_localctx).p_1_3 = expr();
				 ((ExprContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.Sequence(((ExprContext)_localctx).p_1_1.result,((ExprContext)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				((ExprContext)_localctx).p_2_1 = expr1();
				setState(769);
				match(Surrogate_id_SYMB_1);
				 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).p_2_1.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				match(Surrogate_id_SYMB_62);
				setState(773);
				((ExprContext)_localctx).p_3_2 = listPatternBinding();
				setState(774);
				match(Surrogate_id_SYMB_57);
				setState(775);
				((ExprContext)_localctx).p_3_4 = expr();
				 ((ExprContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.Let(((ExprContext)_localctx).p_3_2.result,((ExprContext)_localctx).p_3_4.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(778);
				match(Surrogate_id_SYMB_63);
				setState(779);
				((ExprContext)_localctx).p_4_2 = listPatternBinding();
				setState(780);
				match(Surrogate_id_SYMB_57);
				setState(781);
				((ExprContext)_localctx).p_4_4 = expr();
				 ((ExprContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.LetRec(((ExprContext)_localctx).p_4_2.result,((ExprContext)_localctx).p_4_4.result); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(784);
				match(Surrogate_id_SYMB_55);
				setState(785);
				match(Surrogate_id_SYMB_6);
				setState(786);
				((ExprContext)_localctx).p_5_3 = listStellaIdent();
				setState(787);
				match(Surrogate_id_SYMB_7);
				setState(788);
				((ExprContext)_localctx).p_5_5 = expr();
				 ((ExprContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeAbstraction(((ExprContext)_localctx).p_5_3.result,((ExprContext)_localctx).p_5_5.result); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(791);
				((ExprContext)_localctx).p_6_1 = expr1();
				 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).p_6_1.result; 
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

	public static class ListExprContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListExpr result;
		public ExprContext p_2_1;
		public ExprContext p_3_1;
		public ListExprContext p_3_3;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public ListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListExpr(this);
		}
	}

	public final ListExprContext listExpr() throws RecognitionException {
		ListExprContext _localctx = new ListExprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_listExpr);
		try {
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListExprContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListExpr(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				((ListExprContext)_localctx).p_2_1 = expr();
				 ((ListExprContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListExpr(); _localctx.result.addLast(((ListExprContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
				((ListExprContext)_localctx).p_3_1 = expr();
				setState(801);
				match(Surrogate_id_SYMB_0);
				setState(802);
				((ListExprContext)_localctx).p_3_3 = listExpr();
				 ((ListExprContext)_localctx).result =  ((ListExprContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListExprContext)_localctx).p_3_1.result); 
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

	public static class Expr1Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr2Context p_1_1;
		public Expr1Context p_1_3;
		public Expr1Context p_2_2;
		public Expr1Context p_2_4;
		public Expr1Context p_2_6;
		public Expr2Context p_3_1;
		public TerminalNode Surrogate_id_SYMB_15() { return getToken(StellaParser.Surrogate_id_SYMB_15, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_56() { return getToken(StellaParser.Surrogate_id_SYMB_56, 0); }
		public TerminalNode Surrogate_id_SYMB_70() { return getToken(StellaParser.Surrogate_id_SYMB_70, 0); }
		public TerminalNode Surrogate_id_SYMB_47() { return getToken(StellaParser.Surrogate_id_SYMB_47, 0); }
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitExpr1(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 164, RULE_expr1);
		try {
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				((Expr1Context)_localctx).p_1_1 = expr2();
				setState(808);
				match(Surrogate_id_SYMB_15);
				setState(809);
				((Expr1Context)_localctx).p_1_3 = expr1();
				 ((Expr1Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Assign(((Expr1Context)_localctx).p_1_1.result,((Expr1Context)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				match(Surrogate_id_SYMB_56);
				setState(813);
				((Expr1Context)_localctx).p_2_2 = expr1();
				setState(814);
				match(Surrogate_id_SYMB_70);
				setState(815);
				((Expr1Context)_localctx).p_2_4 = expr1();
				setState(816);
				match(Surrogate_id_SYMB_47);
				setState(817);
				((Expr1Context)_localctx).p_2_6 = expr1();
				 ((Expr1Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.If(((Expr1Context)_localctx).p_2_2.result,((Expr1Context)_localctx).p_2_4.result,((Expr1Context)_localctx).p_2_6.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				((Expr1Context)_localctx).p_3_1 = expr2();
				 ((Expr1Context)_localctx).result =  ((Expr1Context)_localctx).p_3_1.result; 
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

	public static class PatternBindingContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.PatternBinding result;
		public PatternContext p_1_1;
		public ExprContext p_1_3;
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(StellaParser.Surrogate_id_SYMB_8, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PatternBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterPatternBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitPatternBinding(this);
		}
	}

	public final PatternBindingContext patternBinding() throws RecognitionException {
		PatternBindingContext _localctx = new PatternBindingContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_patternBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			((PatternBindingContext)_localctx).p_1_1 = pattern(0);
			setState(826);
			match(Surrogate_id_SYMB_8);
			setState(827);
			((PatternBindingContext)_localctx).p_1_3 = expr();
			 ((PatternBindingContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.APatternBinding(((PatternBindingContext)_localctx).p_1_1.result,((PatternBindingContext)_localctx).p_1_3.result); 
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

	public static class ListPatternBindingContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListPatternBinding result;
		public PatternBindingContext p_1_1;
		public PatternBindingContext p_2_1;
		public ListPatternBindingContext p_2_3;
		public PatternBindingContext patternBinding() {
			return getRuleContext(PatternBindingContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public ListPatternBindingContext listPatternBinding() {
			return getRuleContext(ListPatternBindingContext.class,0);
		}
		public ListPatternBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listPatternBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListPatternBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListPatternBinding(this);
		}
	}

	public final ListPatternBindingContext listPatternBinding() throws RecognitionException {
		ListPatternBindingContext _localctx = new ListPatternBindingContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_listPatternBinding);
		try {
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				((ListPatternBindingContext)_localctx).p_1_1 = patternBinding();
				 ((ListPatternBindingContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListPatternBinding(); _localctx.result.addLast(((ListPatternBindingContext)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				((ListPatternBindingContext)_localctx).p_2_1 = patternBinding();
				setState(834);
				match(Surrogate_id_SYMB_0);
				setState(835);
				((ListPatternBindingContext)_localctx).p_2_3 = listPatternBinding();
				 ((ListPatternBindingContext)_localctx).result =  ((ListPatternBindingContext)_localctx).p_2_3.result; _localctx.result.addFirst(((ListPatternBindingContext)_localctx).p_2_1.result); 
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

	public static class Expr2Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr3Context p_1_1;
		public Expr3Context p_1_3;
		public Expr3Context p_2_1;
		public Expr3Context p_2_3;
		public Expr3Context p_3_1;
		public Expr3Context p_3_3;
		public Expr3Context p_4_1;
		public Expr3Context p_4_3;
		public Expr3Context p_5_1;
		public Expr3Context p_5_3;
		public Expr3Context p_6_1;
		public Expr3Context p_6_3;
		public Expr3Context p_7_1;
		public TerminalNode Surrogate_id_SYMB_16() { return getToken(StellaParser.Surrogate_id_SYMB_16, 0); }
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_17() { return getToken(StellaParser.Surrogate_id_SYMB_17, 0); }
		public TerminalNode Surrogate_id_SYMB_18() { return getToken(StellaParser.Surrogate_id_SYMB_18, 0); }
		public TerminalNode Surrogate_id_SYMB_19() { return getToken(StellaParser.Surrogate_id_SYMB_19, 0); }
		public TerminalNode Surrogate_id_SYMB_20() { return getToken(StellaParser.Surrogate_id_SYMB_20, 0); }
		public TerminalNode Surrogate_id_SYMB_21() { return getToken(StellaParser.Surrogate_id_SYMB_21, 0); }
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitExpr2(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 170, RULE_expr2);
		try {
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				((Expr2Context)_localctx).p_1_1 = expr3(0);
				setState(841);
				match(Surrogate_id_SYMB_16);
				setState(842);
				((Expr2Context)_localctx).p_1_3 = expr3(0);
				 ((Expr2Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.LessThan(((Expr2Context)_localctx).p_1_1.result,((Expr2Context)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				((Expr2Context)_localctx).p_2_1 = expr3(0);
				setState(846);
				match(Surrogate_id_SYMB_17);
				setState(847);
				((Expr2Context)_localctx).p_2_3 = expr3(0);
				 ((Expr2Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.LessThanOrEqual(((Expr2Context)_localctx).p_2_1.result,((Expr2Context)_localctx).p_2_3.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(850);
				((Expr2Context)_localctx).p_3_1 = expr3(0);
				setState(851);
				match(Surrogate_id_SYMB_18);
				setState(852);
				((Expr2Context)_localctx).p_3_3 = expr3(0);
				 ((Expr2Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.GreaterThan(((Expr2Context)_localctx).p_3_1.result,((Expr2Context)_localctx).p_3_3.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(855);
				((Expr2Context)_localctx).p_4_1 = expr3(0);
				setState(856);
				match(Surrogate_id_SYMB_19);
				setState(857);
				((Expr2Context)_localctx).p_4_3 = expr3(0);
				 ((Expr2Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.GreaterThanOrEqual(((Expr2Context)_localctx).p_4_1.result,((Expr2Context)_localctx).p_4_3.result); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(860);
				((Expr2Context)_localctx).p_5_1 = expr3(0);
				setState(861);
				match(Surrogate_id_SYMB_20);
				setState(862);
				((Expr2Context)_localctx).p_5_3 = expr3(0);
				 ((Expr2Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Equal(((Expr2Context)_localctx).p_5_1.result,((Expr2Context)_localctx).p_5_3.result); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(865);
				((Expr2Context)_localctx).p_6_1 = expr3(0);
				setState(866);
				match(Surrogate_id_SYMB_21);
				setState(867);
				((Expr2Context)_localctx).p_6_3 = expr3(0);
				 ((Expr2Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.NotEqual(((Expr2Context)_localctx).p_6_1.result,((Expr2Context)_localctx).p_6_3.result); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(870);
				((Expr2Context)_localctx).p_7_1 = expr3(0);
				 ((Expr2Context)_localctx).result =  ((Expr2Context)_localctx).p_7_1.result; 
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

	public static class ListExpr2Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListExpr result;
		public Expr2Context p_1_1;
		public Expr2Context p_2_1;
		public ListExpr2Context p_2_3;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(StellaParser.Surrogate_id_SYMB_1, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ListExpr2Context listExpr2() {
			return getRuleContext(ListExpr2Context.class,0);
		}
		public ListExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListExpr2(this);
		}
	}

	public final ListExpr2Context listExpr2() throws RecognitionException {
		ListExpr2Context _localctx = new ListExpr2Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_listExpr2);
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				((ListExpr2Context)_localctx).p_1_1 = expr2();
				setState(876);
				match(Surrogate_id_SYMB_1);
				 ((ListExpr2Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListExpr(); _localctx.result.addLast(((ListExpr2Context)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				((ListExpr2Context)_localctx).p_2_1 = expr2();
				setState(880);
				match(Surrogate_id_SYMB_1);
				setState(881);
				((ListExpr2Context)_localctx).p_2_3 = listExpr2();
				 ((ListExpr2Context)_localctx).result =  ((ListExpr2Context)_localctx).p_2_3.result; _localctx.result.addFirst(((ListExpr2Context)_localctx).p_2_1.result); 
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

	public static class Expr3Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr3Context p_1_1;
		public Expr3Context p_2_1;
		public Expr3Context p_7_1;
		public Expr3Context p_8_1;
		public Expr3Context p_9_1;
		public ListParamDeclContext p_3_3;
		public ExprContext p_3_7;
		public Token p_4_2;
		public ExprDataContext p_4_3;
		public Expr2Context p_5_2;
		public ListMatchCaseContext p_5_4;
		public ListExprContext p_6_2;
		public Expr4Context p_10_1;
		public Type2Context p_1_3;
		public Type2Context p_2_4;
		public Expr4Context p_7_3;
		public Expr4Context p_8_3;
		public Expr4Context p_9_3;
		public TerminalNode Surrogate_id_SYMB_52() { return getToken(StellaParser.Surrogate_id_SYMB_52, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(StellaParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(StellaParser.Surrogate_id_SYMB_3, 0); }
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(StellaParser.Surrogate_id_SYMB_4, 0); }
		public TerminalNode Surrogate_id_SYMB_68() { return getToken(StellaParser.Surrogate_id_SYMB_68, 0); }
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(StellaParser.Surrogate_id_SYMB_5, 0); }
		public ListParamDeclContext listParamDecl() {
			return getRuleContext(ListParamDeclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_13() { return getToken(StellaParser.Surrogate_id_SYMB_13, 0); }
		public TerminalNode Surrogate_id_SYMB_14() { return getToken(StellaParser.Surrogate_id_SYMB_14, 0); }
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public ExprDataContext exprData() {
			return getRuleContext(ExprDataContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_64() { return getToken(StellaParser.Surrogate_id_SYMB_64, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ListMatchCaseContext listMatchCase() {
			return getRuleContext(ListMatchCaseContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(StellaParser.Surrogate_id_SYMB_6, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(StellaParser.Surrogate_id_SYMB_7, 0); }
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_41() { return getToken(StellaParser.Surrogate_id_SYMB_41, 0); }
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Type2Context type2() {
			return getRuleContext(Type2Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_43() { return getToken(StellaParser.Surrogate_id_SYMB_43, 0); }
		public TerminalNode Surrogate_id_SYMB_22() { return getToken(StellaParser.Surrogate_id_SYMB_22, 0); }
		public TerminalNode Surrogate_id_SYMB_23() { return getToken(StellaParser.Surrogate_id_SYMB_23, 0); }
		public TerminalNode Surrogate_id_SYMB_67() { return getToken(StellaParser.Surrogate_id_SYMB_67, 0); }
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitExpr3(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		return expr3(0);
	}

	private Expr3Context expr3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr3Context _localctx = new Expr3Context(_ctx, _parentState);
		Expr3Context _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_expr3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_52:
				{
				setState(887);
				match(Surrogate_id_SYMB_52);
				setState(888);
				match(Surrogate_id_SYMB_2);
				setState(889);
				((Expr3Context)_localctx).p_3_3 = listParamDecl();
				setState(890);
				match(Surrogate_id_SYMB_3);
				setState(891);
				match(Surrogate_id_SYMB_4);
				setState(892);
				match(Surrogate_id_SYMB_68);
				setState(893);
				((Expr3Context)_localctx).p_3_7 = expr();
				setState(894);
				match(Surrogate_id_SYMB_5);
				 ((Expr3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Abstraction(((Expr3Context)_localctx).p_3_3.result,((Expr3Context)_localctx).p_3_7.result); 
				}
				break;
			case Surrogate_id_SYMB_13:
				{
				setState(897);
				match(Surrogate_id_SYMB_13);
				setState(898);
				((Expr3Context)_localctx).p_4_2 = match(StellaIdent);
				setState(899);
				((Expr3Context)_localctx).p_4_3 = exprData();
				setState(900);
				match(Surrogate_id_SYMB_14);
				 ((Expr3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Variant(((Expr3Context)_localctx).p_4_2.getText(),((Expr3Context)_localctx).p_4_3.result); 
				}
				break;
			case Surrogate_id_SYMB_64:
				{
				setState(903);
				match(Surrogate_id_SYMB_64);
				setState(904);
				((Expr3Context)_localctx).p_5_2 = expr2();
				setState(905);
				match(Surrogate_id_SYMB_4);
				setState(906);
				((Expr3Context)_localctx).p_5_4 = listMatchCase();
				setState(907);
				match(Surrogate_id_SYMB_5);
				 ((Expr3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Match(((Expr3Context)_localctx).p_5_2.result,((Expr3Context)_localctx).p_5_4.result); 
				}
				break;
			case Surrogate_id_SYMB_6:
				{
				setState(910);
				match(Surrogate_id_SYMB_6);
				setState(911);
				((Expr3Context)_localctx).p_6_2 = listExpr();
				setState(912);
				match(Surrogate_id_SYMB_7);
				 ((Expr3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.List(((Expr3Context)_localctx).p_6_2.result); 
				}
				break;
			case Surrogate_id_SYMB_2:
			case Surrogate_id_SYMB_4:
			case Surrogate_id_SYMB_24:
			case Surrogate_id_SYMB_27:
			case Surrogate_id_SYMB_28:
			case Surrogate_id_SYMB_29:
			case Surrogate_id_SYMB_30:
			case Surrogate_id_SYMB_31:
			case Surrogate_id_SYMB_32:
			case Surrogate_id_SYMB_33:
			case Surrogate_id_SYMB_45:
			case Surrogate_id_SYMB_50:
			case Surrogate_id_SYMB_51:
			case Surrogate_id_SYMB_53:
			case Surrogate_id_SYMB_58:
			case Surrogate_id_SYMB_60:
			case Surrogate_id_SYMB_65:
			case Surrogate_id_SYMB_66:
			case Surrogate_id_SYMB_69:
			case Surrogate_id_SYMB_71:
			case Surrogate_id_SYMB_73:
			case Surrogate_id_SYMB_74:
			case Surrogate_id_SYMB_76:
			case Surrogate_id_SYMB_77:
			case StellaIdent:
			case MemoryAddress:
			case INTEGER:
				{
				setState(915);
				((Expr3Context)_localctx).p_10_1 = expr4(0);
				 ((Expr3Context)_localctx).result =  ((Expr3Context)_localctx).p_10_1.result; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(948);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(946);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Expr3Context(_parentctx, _parentState);
						_localctx.p_1_1 = _prevctx;
						_localctx.p_1_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr3);
						setState(920);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(921);
						match(Surrogate_id_SYMB_41);
						setState(922);
						((Expr3Context)_localctx).p_1_3 = type2();
						 ((Expr3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeAsc(((Expr3Context)_localctx).p_1_1.result,((Expr3Context)_localctx).p_1_3.result); 
						}
						break;
					case 2:
						{
						_localctx = new Expr3Context(_parentctx, _parentState);
						_localctx.p_2_1 = _prevctx;
						_localctx.p_2_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr3);
						setState(925);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(926);
						match(Surrogate_id_SYMB_43);
						setState(927);
						match(Surrogate_id_SYMB_41);
						setState(928);
						((Expr3Context)_localctx).p_2_4 = type2();
						 ((Expr3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeCast(((Expr3Context)_localctx).p_2_1.result,((Expr3Context)_localctx).p_2_4.result); 
						}
						break;
					case 3:
						{
						_localctx = new Expr3Context(_parentctx, _parentState);
						_localctx.p_7_1 = _prevctx;
						_localctx.p_7_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr3);
						setState(931);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(932);
						match(Surrogate_id_SYMB_22);
						setState(933);
						((Expr3Context)_localctx).p_7_3 = expr4(0);
						 ((Expr3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Add(((Expr3Context)_localctx).p_7_1.result,((Expr3Context)_localctx).p_7_3.result); 
						}
						break;
					case 4:
						{
						_localctx = new Expr3Context(_parentctx, _parentState);
						_localctx.p_8_1 = _prevctx;
						_localctx.p_8_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr3);
						setState(936);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(937);
						match(Surrogate_id_SYMB_23);
						setState(938);
						((Expr3Context)_localctx).p_8_3 = expr4(0);
						 ((Expr3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Subtract(((Expr3Context)_localctx).p_8_1.result,((Expr3Context)_localctx).p_8_3.result); 
						}
						break;
					case 5:
						{
						_localctx = new Expr3Context(_parentctx, _parentState);
						_localctx.p_9_1 = _prevctx;
						_localctx.p_9_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr3);
						setState(941);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(942);
						match(Surrogate_id_SYMB_67);
						setState(943);
						((Expr3Context)_localctx).p_9_3 = expr4(0);
						 ((Expr3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.LogicOr(((Expr3Context)_localctx).p_9_1.result,((Expr3Context)_localctx).p_9_3.result); 
						}
						break;
					}
					} 
				}
				setState(950);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Expr4Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr4Context p_1_1;
		public Expr4Context p_2_1;
		public Expr4Context p_3_1;
		public Expr5Context p_4_1;
		public Expr5Context p_1_3;
		public Expr5Context p_2_3;
		public Expr5Context p_3_3;
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_24() { return getToken(StellaParser.Surrogate_id_SYMB_24, 0); }
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_25() { return getToken(StellaParser.Surrogate_id_SYMB_25, 0); }
		public TerminalNode Surrogate_id_SYMB_40() { return getToken(StellaParser.Surrogate_id_SYMB_40, 0); }
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterExpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitExpr4(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		return expr4(0);
	}

	private Expr4Context expr4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr4Context _localctx = new Expr4Context(_ctx, _parentState);
		Expr4Context _prevctx = _localctx;
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_expr4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(952);
			((Expr4Context)_localctx).p_4_1 = expr5();
			 ((Expr4Context)_localctx).result =  ((Expr4Context)_localctx).p_4_1.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(972);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(970);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						_localctx.p_1_1 = _prevctx;
						_localctx.p_1_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(955);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(956);
						match(Surrogate_id_SYMB_24);
						setState(957);
						((Expr4Context)_localctx).p_1_3 = expr5();
						 ((Expr4Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Multiply(((Expr4Context)_localctx).p_1_1.result,((Expr4Context)_localctx).p_1_3.result); 
						}
						break;
					case 2:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						_localctx.p_2_1 = _prevctx;
						_localctx.p_2_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(960);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(961);
						match(Surrogate_id_SYMB_25);
						setState(962);
						((Expr4Context)_localctx).p_2_3 = expr5();
						 ((Expr4Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Divide(((Expr4Context)_localctx).p_2_1.result,((Expr4Context)_localctx).p_2_3.result); 
						}
						break;
					case 3:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						_localctx.p_3_1 = _prevctx;
						_localctx.p_3_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(965);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(966);
						match(Surrogate_id_SYMB_40);
						setState(967);
						((Expr4Context)_localctx).p_3_3 = expr5();
						 ((Expr4Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.LogicAnd(((Expr4Context)_localctx).p_3_1.result,((Expr4Context)_localctx).p_3_3.result); 
						}
						break;
					}
					} 
				}
				setState(974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Expr5Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public ExprContext p_1_3;
		public Expr5Context p_2_2;
		public Expr6Context p_3_1;
		public TerminalNode Surrogate_id_SYMB_65() { return getToken(StellaParser.Surrogate_id_SYMB_65, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(StellaParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(StellaParser.Surrogate_id_SYMB_3, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_24() { return getToken(StellaParser.Surrogate_id_SYMB_24, 0); }
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterExpr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitExpr5(this);
		}
	}

	public final Expr5Context expr5() throws RecognitionException {
		Expr5Context _localctx = new Expr5Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_expr5);
		try {
			setState(988);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_65:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
				match(Surrogate_id_SYMB_65);
				setState(976);
				match(Surrogate_id_SYMB_2);
				setState(977);
				((Expr5Context)_localctx).p_1_3 = expr();
				setState(978);
				match(Surrogate_id_SYMB_3);
				 ((Expr5Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Ref(((Expr5Context)_localctx).p_1_3.result); 
				}
				break;
			case Surrogate_id_SYMB_24:
				enterOuterAlt(_localctx, 2);
				{
				setState(981);
				match(Surrogate_id_SYMB_24);
				setState(982);
				((Expr5Context)_localctx).p_2_2 = expr5();
				 ((Expr5Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Deref(((Expr5Context)_localctx).p_2_2.result); 
				}
				break;
			case Surrogate_id_SYMB_2:
			case Surrogate_id_SYMB_4:
			case Surrogate_id_SYMB_27:
			case Surrogate_id_SYMB_28:
			case Surrogate_id_SYMB_29:
			case Surrogate_id_SYMB_30:
			case Surrogate_id_SYMB_31:
			case Surrogate_id_SYMB_32:
			case Surrogate_id_SYMB_33:
			case Surrogate_id_SYMB_45:
			case Surrogate_id_SYMB_50:
			case Surrogate_id_SYMB_51:
			case Surrogate_id_SYMB_53:
			case Surrogate_id_SYMB_58:
			case Surrogate_id_SYMB_60:
			case Surrogate_id_SYMB_66:
			case Surrogate_id_SYMB_69:
			case Surrogate_id_SYMB_71:
			case Surrogate_id_SYMB_73:
			case Surrogate_id_SYMB_74:
			case Surrogate_id_SYMB_76:
			case Surrogate_id_SYMB_77:
			case StellaIdent:
			case MemoryAddress:
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(985);
				((Expr5Context)_localctx).p_3_1 = expr6(0);
				 ((Expr5Context)_localctx).result =  ((Expr5Context)_localctx).p_3_1.result; 
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

	public static class Expr6Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Expr6Context p_1_1;
		public Expr6Context p_2_1;
		public Expr6Context p_3_1;
		public Expr6Context p_4_1;
		public ListExprContext p_5_2;
		public ListBindingContext p_6_2;
		public ExprContext p_7_3;
		public ExprContext p_7_5;
		public ExprContext p_8_3;
		public ExprContext p_9_3;
		public ExprContext p_10_3;
		public ExprContext p_12_3;
		public ExprContext p_13_3;
		public PatternContext p_13_7;
		public ExprContext p_13_9;
		public ExprContext p_14_3;
		public ExprContext p_14_7;
		public ExprContext p_15_3;
		public TypeContext p_15_7;
		public PatternContext p_15_9;
		public ExprContext p_15_11;
		public ExprContext p_15_15;
		public ExprContext p_16_3;
		public ExprContext p_17_3;
		public ExprContext p_18_3;
		public ExprContext p_19_3;
		public ExprContext p_20_3;
		public ExprContext p_21_3;
		public ExprContext p_22_3;
		public ExprContext p_23_3;
		public ExprContext p_23_5;
		public ExprContext p_23_7;
		public TypeContext p_24_3;
		public Expr7Context p_24_5;
		public TypeContext p_25_3;
		public Expr7Context p_25_5;
		public Expr7Context p_26_1;
		public ListExprContext p_1_3;
		public ListTypeContext p_2_3;
		public Token p_3_3;
		public Token p_4_3;
		public List<TerminalNode> Surrogate_id_SYMB_4() { return getTokens(StellaParser.Surrogate_id_SYMB_4); }
		public TerminalNode Surrogate_id_SYMB_4(int i) {
			return getToken(StellaParser.Surrogate_id_SYMB_4, i);
		}
		public List<TerminalNode> Surrogate_id_SYMB_5() { return getTokens(StellaParser.Surrogate_id_SYMB_5); }
		public TerminalNode Surrogate_id_SYMB_5(int i) {
			return getToken(StellaParser.Surrogate_id_SYMB_5, i);
		}
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public ListBindingContext listBinding() {
			return getRuleContext(ListBindingContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_45() { return getToken(StellaParser.Surrogate_id_SYMB_45, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(StellaParser.Surrogate_id_SYMB_2, 0); }
		public List<TerminalNode> Surrogate_id_SYMB_0() { return getTokens(StellaParser.Surrogate_id_SYMB_0); }
		public TerminalNode Surrogate_id_SYMB_0(int i) {
			return getToken(StellaParser.Surrogate_id_SYMB_0, i);
		}
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(StellaParser.Surrogate_id_SYMB_3, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_27() { return getToken(StellaParser.Surrogate_id_SYMB_27, 0); }
		public TerminalNode Surrogate_id_SYMB_28() { return getToken(StellaParser.Surrogate_id_SYMB_28, 0); }
		public TerminalNode Surrogate_id_SYMB_29() { return getToken(StellaParser.Surrogate_id_SYMB_29, 0); }
		public TerminalNode Surrogate_id_SYMB_30() { return getToken(StellaParser.Surrogate_id_SYMB_30, 0); }
		public TerminalNode Surrogate_id_SYMB_71() { return getToken(StellaParser.Surrogate_id_SYMB_71, 0); }
		public TerminalNode Surrogate_id_SYMB_74() { return getToken(StellaParser.Surrogate_id_SYMB_74, 0); }
		public TerminalNode Surrogate_id_SYMB_44() { return getToken(StellaParser.Surrogate_id_SYMB_44, 0); }
		public TerminalNode Surrogate_id_SYMB_11() { return getToken(StellaParser.Surrogate_id_SYMB_11, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_79() { return getToken(StellaParser.Surrogate_id_SYMB_79, 0); }
		public TerminalNode Surrogate_id_SYMB_43() { return getToken(StellaParser.Surrogate_id_SYMB_43, 0); }
		public TerminalNode Surrogate_id_SYMB_41() { return getToken(StellaParser.Surrogate_id_SYMB_41, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_58() { return getToken(StellaParser.Surrogate_id_SYMB_58, 0); }
		public TerminalNode Surrogate_id_SYMB_60() { return getToken(StellaParser.Surrogate_id_SYMB_60, 0); }
		public TerminalNode Surrogate_id_SYMB_69() { return getToken(StellaParser.Surrogate_id_SYMB_69, 0); }
		public TerminalNode Surrogate_id_SYMB_66() { return getToken(StellaParser.Surrogate_id_SYMB_66, 0); }
		public TerminalNode Surrogate_id_SYMB_31() { return getToken(StellaParser.Surrogate_id_SYMB_31, 0); }
		public TerminalNode Surrogate_id_SYMB_32() { return getToken(StellaParser.Surrogate_id_SYMB_32, 0); }
		public TerminalNode Surrogate_id_SYMB_51() { return getToken(StellaParser.Surrogate_id_SYMB_51, 0); }
		public TerminalNode Surrogate_id_SYMB_33() { return getToken(StellaParser.Surrogate_id_SYMB_33, 0); }
		public TerminalNode Surrogate_id_SYMB_53() { return getToken(StellaParser.Surrogate_id_SYMB_53, 0); }
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(StellaParser.Surrogate_id_SYMB_6, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(StellaParser.Surrogate_id_SYMB_7, 0); }
		public Expr7Context expr7() {
			return getRuleContext(Expr7Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_76() { return getToken(StellaParser.Surrogate_id_SYMB_76, 0); }
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_26() { return getToken(StellaParser.Surrogate_id_SYMB_26, 0); }
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public TerminalNode INTEGER() { return getToken(StellaParser.INTEGER, 0); }
		public Expr6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterExpr6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitExpr6(this);
		}
	}

	public final Expr6Context expr6() throws RecognitionException {
		return expr6(0);
	}

	private Expr6Context expr6(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr6Context _localctx = new Expr6Context(_ctx, _parentState);
		Expr6Context _prevctx = _localctx;
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_expr6, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(991);
				match(Surrogate_id_SYMB_4);
				setState(992);
				((Expr6Context)_localctx).p_5_2 = listExpr();
				setState(993);
				match(Surrogate_id_SYMB_5);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Tuple(((Expr6Context)_localctx).p_5_2.result); 
				}
				break;
			case 2:
				{
				setState(996);
				match(Surrogate_id_SYMB_4);
				setState(997);
				((Expr6Context)_localctx).p_6_2 = listBinding();
				setState(998);
				match(Surrogate_id_SYMB_5);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Record(((Expr6Context)_localctx).p_6_2.result); 
				}
				break;
			case 3:
				{
				setState(1001);
				match(Surrogate_id_SYMB_45);
				setState(1002);
				match(Surrogate_id_SYMB_2);
				setState(1003);
				((Expr6Context)_localctx).p_7_3 = expr();
				setState(1004);
				match(Surrogate_id_SYMB_0);
				setState(1005);
				((Expr6Context)_localctx).p_7_5 = expr();
				setState(1006);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.ConsList(((Expr6Context)_localctx).p_7_3.result,((Expr6Context)_localctx).p_7_5.result); 
				}
				break;
			case 4:
				{
				setState(1009);
				match(Surrogate_id_SYMB_27);
				setState(1010);
				match(Surrogate_id_SYMB_2);
				setState(1011);
				((Expr6Context)_localctx).p_8_3 = expr();
				setState(1012);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Head(((Expr6Context)_localctx).p_8_3.result); 
				}
				break;
			case 5:
				{
				setState(1015);
				match(Surrogate_id_SYMB_28);
				setState(1016);
				match(Surrogate_id_SYMB_2);
				setState(1017);
				((Expr6Context)_localctx).p_9_3 = expr();
				setState(1018);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.IsEmpty(((Expr6Context)_localctx).p_9_3.result); 
				}
				break;
			case 6:
				{
				setState(1021);
				match(Surrogate_id_SYMB_29);
				setState(1022);
				match(Surrogate_id_SYMB_2);
				setState(1023);
				((Expr6Context)_localctx).p_10_3 = expr();
				setState(1024);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Tail(((Expr6Context)_localctx).p_10_3.result); 
				}
				break;
			case 7:
				{
				setState(1027);
				match(Surrogate_id_SYMB_30);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Panic(); 
				}
				break;
			case 8:
				{
				setState(1029);
				match(Surrogate_id_SYMB_71);
				setState(1030);
				match(Surrogate_id_SYMB_2);
				setState(1031);
				((Expr6Context)_localctx).p_12_3 = expr();
				setState(1032);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Throw(((Expr6Context)_localctx).p_12_3.result); 
				}
				break;
			case 9:
				{
				setState(1035);
				match(Surrogate_id_SYMB_74);
				setState(1036);
				match(Surrogate_id_SYMB_4);
				setState(1037);
				((Expr6Context)_localctx).p_13_3 = expr();
				setState(1038);
				match(Surrogate_id_SYMB_5);
				setState(1039);
				match(Surrogate_id_SYMB_44);
				setState(1040);
				match(Surrogate_id_SYMB_4);
				setState(1041);
				((Expr6Context)_localctx).p_13_7 = pattern(0);
				setState(1042);
				match(Surrogate_id_SYMB_11);
				setState(1043);
				((Expr6Context)_localctx).p_13_9 = expr();
				setState(1044);
				match(Surrogate_id_SYMB_5);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TryCatch(((Expr6Context)_localctx).p_13_3.result,((Expr6Context)_localctx).p_13_7.result,((Expr6Context)_localctx).p_13_9.result); 
				}
				break;
			case 10:
				{
				setState(1047);
				match(Surrogate_id_SYMB_74);
				setState(1048);
				match(Surrogate_id_SYMB_4);
				setState(1049);
				((Expr6Context)_localctx).p_14_3 = expr();
				setState(1050);
				match(Surrogate_id_SYMB_5);
				setState(1051);
				match(Surrogate_id_SYMB_79);
				setState(1052);
				match(Surrogate_id_SYMB_4);
				setState(1053);
				((Expr6Context)_localctx).p_14_7 = expr();
				setState(1054);
				match(Surrogate_id_SYMB_5);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TryWith(((Expr6Context)_localctx).p_14_3.result,((Expr6Context)_localctx).p_14_7.result); 
				}
				break;
			case 11:
				{
				setState(1057);
				match(Surrogate_id_SYMB_74);
				setState(1058);
				match(Surrogate_id_SYMB_4);
				setState(1059);
				((Expr6Context)_localctx).p_15_3 = expr();
				setState(1060);
				match(Surrogate_id_SYMB_5);
				setState(1061);
				match(Surrogate_id_SYMB_43);
				setState(1062);
				match(Surrogate_id_SYMB_41);
				setState(1063);
				((Expr6Context)_localctx).p_15_7 = type();
				setState(1064);
				match(Surrogate_id_SYMB_4);
				setState(1065);
				((Expr6Context)_localctx).p_15_9 = pattern(0);
				setState(1066);
				match(Surrogate_id_SYMB_11);
				setState(1067);
				((Expr6Context)_localctx).p_15_11 = expr();
				setState(1068);
				match(Surrogate_id_SYMB_5);
				setState(1069);
				match(Surrogate_id_SYMB_79);
				setState(1070);
				match(Surrogate_id_SYMB_4);
				setState(1071);
				((Expr6Context)_localctx).p_15_15 = expr();
				setState(1072);
				match(Surrogate_id_SYMB_5);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TryCastAs(((Expr6Context)_localctx).p_15_3.result,((Expr6Context)_localctx).p_15_7.result,((Expr6Context)_localctx).p_15_9.result,((Expr6Context)_localctx).p_15_11.result,((Expr6Context)_localctx).p_15_15.result); 
				}
				break;
			case 12:
				{
				setState(1075);
				match(Surrogate_id_SYMB_58);
				setState(1076);
				match(Surrogate_id_SYMB_2);
				setState(1077);
				((Expr6Context)_localctx).p_16_3 = expr();
				setState(1078);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Inl(((Expr6Context)_localctx).p_16_3.result); 
				}
				break;
			case 13:
				{
				setState(1081);
				match(Surrogate_id_SYMB_60);
				setState(1082);
				match(Surrogate_id_SYMB_2);
				setState(1083);
				((Expr6Context)_localctx).p_17_3 = expr();
				setState(1084);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Inr(((Expr6Context)_localctx).p_17_3.result); 
				}
				break;
			case 14:
				{
				setState(1087);
				match(Surrogate_id_SYMB_69);
				setState(1088);
				match(Surrogate_id_SYMB_2);
				setState(1089);
				((Expr6Context)_localctx).p_18_3 = expr();
				setState(1090);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Succ(((Expr6Context)_localctx).p_18_3.result); 
				}
				break;
			case 15:
				{
				setState(1093);
				match(Surrogate_id_SYMB_66);
				setState(1094);
				match(Surrogate_id_SYMB_2);
				setState(1095);
				((Expr6Context)_localctx).p_19_3 = expr();
				setState(1096);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.LogicNot(((Expr6Context)_localctx).p_19_3.result); 
				}
				break;
			case 16:
				{
				setState(1099);
				match(Surrogate_id_SYMB_31);
				setState(1100);
				match(Surrogate_id_SYMB_2);
				setState(1101);
				((Expr6Context)_localctx).p_20_3 = expr();
				setState(1102);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Pred(((Expr6Context)_localctx).p_20_3.result); 
				}
				break;
			case 17:
				{
				setState(1105);
				match(Surrogate_id_SYMB_32);
				setState(1106);
				match(Surrogate_id_SYMB_2);
				setState(1107);
				((Expr6Context)_localctx).p_21_3 = expr();
				setState(1108);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.IsZero(((Expr6Context)_localctx).p_21_3.result); 
				}
				break;
			case 18:
				{
				setState(1111);
				match(Surrogate_id_SYMB_51);
				setState(1112);
				match(Surrogate_id_SYMB_2);
				setState(1113);
				((Expr6Context)_localctx).p_22_3 = expr();
				setState(1114);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Fix(((Expr6Context)_localctx).p_22_3.result); 
				}
				break;
			case 19:
				{
				setState(1117);
				match(Surrogate_id_SYMB_33);
				setState(1118);
				match(Surrogate_id_SYMB_2);
				setState(1119);
				((Expr6Context)_localctx).p_23_3 = expr();
				setState(1120);
				match(Surrogate_id_SYMB_0);
				setState(1121);
				((Expr6Context)_localctx).p_23_5 = expr();
				setState(1122);
				match(Surrogate_id_SYMB_0);
				setState(1123);
				((Expr6Context)_localctx).p_23_7 = expr();
				setState(1124);
				match(Surrogate_id_SYMB_3);
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.NatRec(((Expr6Context)_localctx).p_23_3.result,((Expr6Context)_localctx).p_23_5.result,((Expr6Context)_localctx).p_23_7.result); 
				}
				break;
			case 20:
				{
				setState(1127);
				match(Surrogate_id_SYMB_53);
				setState(1128);
				match(Surrogate_id_SYMB_6);
				setState(1129);
				((Expr6Context)_localctx).p_24_3 = type();
				setState(1130);
				match(Surrogate_id_SYMB_7);
				setState(1131);
				((Expr6Context)_localctx).p_24_5 = expr7();
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Fold(((Expr6Context)_localctx).p_24_3.result,((Expr6Context)_localctx).p_24_5.result); 
				}
				break;
			case 21:
				{
				setState(1134);
				match(Surrogate_id_SYMB_76);
				setState(1135);
				match(Surrogate_id_SYMB_6);
				setState(1136);
				((Expr6Context)_localctx).p_25_3 = type();
				setState(1137);
				match(Surrogate_id_SYMB_7);
				setState(1138);
				((Expr6Context)_localctx).p_25_5 = expr7();
				 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Unfold(((Expr6Context)_localctx).p_25_3.result,((Expr6Context)_localctx).p_25_5.result); 
				}
				break;
			case 22:
				{
				setState(1141);
				((Expr6Context)_localctx).p_26_1 = expr7();
				 ((Expr6Context)_localctx).result =  ((Expr6Context)_localctx).p_26_1.result; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new Expr6Context(_parentctx, _parentState);
						_localctx.p_1_1 = _prevctx;
						_localctx.p_1_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr6);
						setState(1146);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1147);
						match(Surrogate_id_SYMB_2);
						setState(1148);
						((Expr6Context)_localctx).p_1_3 = listExpr();
						setState(1149);
						match(Surrogate_id_SYMB_3);
						 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Application(((Expr6Context)_localctx).p_1_1.result,((Expr6Context)_localctx).p_1_3.result); 
						}
						break;
					case 2:
						{
						_localctx = new Expr6Context(_parentctx, _parentState);
						_localctx.p_2_1 = _prevctx;
						_localctx.p_2_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr6);
						setState(1152);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1153);
						match(Surrogate_id_SYMB_6);
						setState(1154);
						((Expr6Context)_localctx).p_2_3 = listType();
						setState(1155);
						match(Surrogate_id_SYMB_7);
						 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeApplication(((Expr6Context)_localctx).p_2_1.result,((Expr6Context)_localctx).p_2_3.result); 
						}
						break;
					case 3:
						{
						_localctx = new Expr6Context(_parentctx, _parentState);
						_localctx.p_3_1 = _prevctx;
						_localctx.p_3_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr6);
						setState(1158);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1159);
						match(Surrogate_id_SYMB_26);
						setState(1160);
						((Expr6Context)_localctx).p_3_3 = match(StellaIdent);
						 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.DotRecord(((Expr6Context)_localctx).p_3_1.result,((Expr6Context)_localctx).p_3_3.getText()); 
						}
						break;
					case 4:
						{
						_localctx = new Expr6Context(_parentctx, _parentState);
						_localctx.p_4_1 = _prevctx;
						_localctx.p_4_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr6);
						setState(1162);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1163);
						match(Surrogate_id_SYMB_26);
						setState(1164);
						((Expr6Context)_localctx).p_4_3 = match(INTEGER);
						 ((Expr6Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.DotTuple(((Expr6Context)_localctx).p_4_1.result,Integer.parseInt(((Expr6Context)_localctx).p_4_3.getText())); 
						}
						break;
					}
					} 
				}
				setState(1170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class Expr7Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Expr result;
		public Token p_4_1;
		public Token p_5_1;
		public Token p_6_1;
		public ExprContext p_7_2;
		public TerminalNode Surrogate_id_SYMB_73() { return getToken(StellaParser.Surrogate_id_SYMB_73, 0); }
		public TerminalNode Surrogate_id_SYMB_50() { return getToken(StellaParser.Surrogate_id_SYMB_50, 0); }
		public TerminalNode Surrogate_id_SYMB_77() { return getToken(StellaParser.Surrogate_id_SYMB_77, 0); }
		public TerminalNode INTEGER() { return getToken(StellaParser.INTEGER, 0); }
		public TerminalNode MemoryAddress() { return getToken(StellaParser.MemoryAddress, 0); }
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(StellaParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(StellaParser.Surrogate_id_SYMB_3, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterExpr7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitExpr7(this);
		}
	}

	public final Expr7Context expr7() throws RecognitionException {
		Expr7Context _localctx = new Expr7Context(_ctx, getState());
		enterRule(_localctx, 182, RULE_expr7);
		try {
			setState(1188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_73:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				match(Surrogate_id_SYMB_73);
				 ((Expr7Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.ConstTrue(); 
				}
				break;
			case Surrogate_id_SYMB_50:
				enterOuterAlt(_localctx, 2);
				{
				setState(1173);
				match(Surrogate_id_SYMB_50);
				 ((Expr7Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.ConstFalse(); 
				}
				break;
			case Surrogate_id_SYMB_77:
				enterOuterAlt(_localctx, 3);
				{
				setState(1175);
				match(Surrogate_id_SYMB_77);
				 ((Expr7Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.ConstUnit(); 
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1177);
				((Expr7Context)_localctx).p_4_1 = match(INTEGER);
				 ((Expr7Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.ConstInt(Integer.parseInt(((Expr7Context)_localctx).p_4_1.getText())); 
				}
				break;
			case MemoryAddress:
				enterOuterAlt(_localctx, 5);
				{
				setState(1179);
				((Expr7Context)_localctx).p_5_1 = match(MemoryAddress);
				 ((Expr7Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.ConstMemory(((Expr7Context)_localctx).p_5_1.getText()); 
				}
				break;
			case StellaIdent:
				enterOuterAlt(_localctx, 6);
				{
				setState(1181);
				((Expr7Context)_localctx).p_6_1 = match(StellaIdent);
				 ((Expr7Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.Var(((Expr7Context)_localctx).p_6_1.getText()); 
				}
				break;
			case Surrogate_id_SYMB_2:
				enterOuterAlt(_localctx, 7);
				{
				setState(1183);
				match(Surrogate_id_SYMB_2);
				setState(1184);
				((Expr7Context)_localctx).p_7_2 = expr();
				setState(1185);
				match(Surrogate_id_SYMB_3);
				 ((Expr7Context)_localctx).result =  ((Expr7Context)_localctx).p_7_2.result; 
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

	public static class TypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Type result;
		public ListTypeContext p_2_3;
		public TypeContext p_2_6;
		public ListStellaIdentContext p_3_2;
		public TypeContext p_3_4;
		public Token p_4_2;
		public TypeContext p_4_4;
		public Type1Context p_5_1;
		public TerminalNode Surrogate_id_SYMB_42() { return getToken(StellaParser.Surrogate_id_SYMB_42, 0); }
		public TerminalNode Surrogate_id_SYMB_52() { return getToken(StellaParser.Surrogate_id_SYMB_52, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(StellaParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(StellaParser.Surrogate_id_SYMB_3, 0); }
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(StellaParser.Surrogate_id_SYMB_10, 0); }
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_54() { return getToken(StellaParser.Surrogate_id_SYMB_54, 0); }
		public TerminalNode Surrogate_id_SYMB_26() { return getToken(StellaParser.Surrogate_id_SYMB_26, 0); }
		public ListStellaIdentContext listStellaIdent() {
			return getRuleContext(ListStellaIdentContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_80() { return getToken(StellaParser.Surrogate_id_SYMB_80, 0); }
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public Type1Context type1() {
			return getRuleContext(Type1Context.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_type);
		try {
			setState(1215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_42:
				enterOuterAlt(_localctx, 1);
				{
				setState(1190);
				match(Surrogate_id_SYMB_42);
				 ((TypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeAuto(); 
				}
				break;
			case Surrogate_id_SYMB_52:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				match(Surrogate_id_SYMB_52);
				setState(1193);
				match(Surrogate_id_SYMB_2);
				setState(1194);
				((TypeContext)_localctx).p_2_3 = listType();
				setState(1195);
				match(Surrogate_id_SYMB_3);
				setState(1196);
				match(Surrogate_id_SYMB_10);
				setState(1197);
				((TypeContext)_localctx).p_2_6 = type();
				 ((TypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeFun(((TypeContext)_localctx).p_2_3.result,((TypeContext)_localctx).p_2_6.result); 
				}
				break;
			case Surrogate_id_SYMB_54:
				enterOuterAlt(_localctx, 3);
				{
				setState(1200);
				match(Surrogate_id_SYMB_54);
				setState(1201);
				((TypeContext)_localctx).p_3_2 = listStellaIdent();
				setState(1202);
				match(Surrogate_id_SYMB_26);
				setState(1203);
				((TypeContext)_localctx).p_3_4 = type();
				 ((TypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeForAll(((TypeContext)_localctx).p_3_2.result,((TypeContext)_localctx).p_3_4.result); 
				}
				break;
			case Surrogate_id_SYMB_80:
				enterOuterAlt(_localctx, 4);
				{
				setState(1206);
				match(Surrogate_id_SYMB_80);
				setState(1207);
				((TypeContext)_localctx).p_4_2 = match(StellaIdent);
				setState(1208);
				match(Surrogate_id_SYMB_26);
				setState(1209);
				((TypeContext)_localctx).p_4_4 = type();
				 ((TypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeRec(((TypeContext)_localctx).p_4_2.getText(),((TypeContext)_localctx).p_4_4.result); 
				}
				break;
			case Surrogate_id_SYMB_2:
			case Surrogate_id_SYMB_4:
			case Surrogate_id_SYMB_6:
			case Surrogate_id_SYMB_13:
			case Surrogate_id_SYMB_34:
			case Surrogate_id_SYMB_35:
			case Surrogate_id_SYMB_36:
			case Surrogate_id_SYMB_37:
			case Surrogate_id_SYMB_38:
			case Surrogate_id_SYMB_39:
			case StellaIdent:
				enterOuterAlt(_localctx, 5);
				{
				setState(1212);
				((TypeContext)_localctx).p_5_1 = type1();
				 ((TypeContext)_localctx).result =  ((TypeContext)_localctx).p_5_1.result; 
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

	public static class Type1Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Type result;
		public Type2Context p_1_1;
		public Type2Context p_1_3;
		public Type2Context p_2_1;
		public TerminalNode Surrogate_id_SYMB_22() { return getToken(StellaParser.Surrogate_id_SYMB_22, 0); }
		public List<Type2Context> type2() {
			return getRuleContexts(Type2Context.class);
		}
		public Type2Context type2(int i) {
			return getRuleContext(Type2Context.class,i);
		}
		public Type1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterType1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitType1(this);
		}
	}

	public final Type1Context type1() throws RecognitionException {
		Type1Context _localctx = new Type1Context(_ctx, getState());
		enterRule(_localctx, 186, RULE_type1);
		try {
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				((Type1Context)_localctx).p_1_1 = type2();
				setState(1218);
				match(Surrogate_id_SYMB_22);
				setState(1219);
				((Type1Context)_localctx).p_1_3 = type2();
				 ((Type1Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeSum(((Type1Context)_localctx).p_1_1.result,((Type1Context)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1222);
				((Type1Context)_localctx).p_2_1 = type2();
				 ((Type1Context)_localctx).result =  ((Type1Context)_localctx).p_2_1.result; 
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

	public static class Type2Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Type result;
		public ListTypeContext p_1_2;
		public ListRecordFieldTypeContext p_2_2;
		public ListVariantFieldTypeContext p_3_2;
		public TypeContext p_4_2;
		public Type3Context p_5_1;
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(StellaParser.Surrogate_id_SYMB_4, 0); }
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(StellaParser.Surrogate_id_SYMB_5, 0); }
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public ListRecordFieldTypeContext listRecordFieldType() {
			return getRuleContext(ListRecordFieldTypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_13() { return getToken(StellaParser.Surrogate_id_SYMB_13, 0); }
		public TerminalNode Surrogate_id_SYMB_14() { return getToken(StellaParser.Surrogate_id_SYMB_14, 0); }
		public ListVariantFieldTypeContext listVariantFieldType() {
			return getRuleContext(ListVariantFieldTypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(StellaParser.Surrogate_id_SYMB_6, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(StellaParser.Surrogate_id_SYMB_7, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type3Context type3() {
			return getRuleContext(Type3Context.class,0);
		}
		public Type2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterType2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitType2(this);
		}
	}

	public final Type2Context type2() throws RecognitionException {
		Type2Context _localctx = new Type2Context(_ctx, getState());
		enterRule(_localctx, 188, RULE_type2);
		try {
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1227);
				match(Surrogate_id_SYMB_4);
				setState(1228);
				((Type2Context)_localctx).p_1_2 = listType();
				setState(1229);
				match(Surrogate_id_SYMB_5);
				 ((Type2Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeTuple(((Type2Context)_localctx).p_1_2.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232);
				match(Surrogate_id_SYMB_4);
				setState(1233);
				((Type2Context)_localctx).p_2_2 = listRecordFieldType();
				setState(1234);
				match(Surrogate_id_SYMB_5);
				 ((Type2Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeRecord(((Type2Context)_localctx).p_2_2.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1237);
				match(Surrogate_id_SYMB_13);
				setState(1238);
				((Type2Context)_localctx).p_3_2 = listVariantFieldType();
				setState(1239);
				match(Surrogate_id_SYMB_14);
				 ((Type2Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeVariant(((Type2Context)_localctx).p_3_2.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1242);
				match(Surrogate_id_SYMB_6);
				setState(1243);
				((Type2Context)_localctx).p_4_2 = type();
				setState(1244);
				match(Surrogate_id_SYMB_7);
				 ((Type2Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeList(((Type2Context)_localctx).p_4_2.result); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1247);
				((Type2Context)_localctx).p_5_1 = type3();
				 ((Type2Context)_localctx).result =  ((Type2Context)_localctx).p_5_1.result; 
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

	public static class Type3Context extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Type result;
		public Type2Context p_6_2;
		public Token p_7_1;
		public TypeContext p_8_2;
		public TerminalNode Surrogate_id_SYMB_35() { return getToken(StellaParser.Surrogate_id_SYMB_35, 0); }
		public TerminalNode Surrogate_id_SYMB_37() { return getToken(StellaParser.Surrogate_id_SYMB_37, 0); }
		public TerminalNode Surrogate_id_SYMB_39() { return getToken(StellaParser.Surrogate_id_SYMB_39, 0); }
		public TerminalNode Surrogate_id_SYMB_38() { return getToken(StellaParser.Surrogate_id_SYMB_38, 0); }
		public TerminalNode Surrogate_id_SYMB_36() { return getToken(StellaParser.Surrogate_id_SYMB_36, 0); }
		public TerminalNode Surrogate_id_SYMB_34() { return getToken(StellaParser.Surrogate_id_SYMB_34, 0); }
		public Type2Context type2() {
			return getRuleContext(Type2Context.class,0);
		}
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(StellaParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(StellaParser.Surrogate_id_SYMB_3, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterType3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitType3(this);
		}
	}

	public final Type3Context type3() throws RecognitionException {
		Type3Context _localctx = new Type3Context(_ctx, getState());
		enterRule(_localctx, 190, RULE_type3);
		try {
			setState(1273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_35:
				enterOuterAlt(_localctx, 1);
				{
				setState(1252);
				match(Surrogate_id_SYMB_35);
				 ((Type3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeBool(); 
				}
				break;
			case Surrogate_id_SYMB_37:
				enterOuterAlt(_localctx, 2);
				{
				setState(1254);
				match(Surrogate_id_SYMB_37);
				 ((Type3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeNat(); 
				}
				break;
			case Surrogate_id_SYMB_39:
				enterOuterAlt(_localctx, 3);
				{
				setState(1256);
				match(Surrogate_id_SYMB_39);
				 ((Type3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeUnit(); 
				}
				break;
			case Surrogate_id_SYMB_38:
				enterOuterAlt(_localctx, 4);
				{
				setState(1258);
				match(Surrogate_id_SYMB_38);
				 ((Type3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeTop(); 
				}
				break;
			case Surrogate_id_SYMB_36:
				enterOuterAlt(_localctx, 5);
				{
				setState(1260);
				match(Surrogate_id_SYMB_36);
				 ((Type3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeBottom(); 
				}
				break;
			case Surrogate_id_SYMB_34:
				enterOuterAlt(_localctx, 6);
				{
				setState(1262);
				match(Surrogate_id_SYMB_34);
				setState(1263);
				((Type3Context)_localctx).p_6_2 = type2();
				 ((Type3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeRef(((Type3Context)_localctx).p_6_2.result); 
				}
				break;
			case StellaIdent:
				enterOuterAlt(_localctx, 7);
				{
				setState(1266);
				((Type3Context)_localctx).p_7_1 = match(StellaIdent);
				 ((Type3Context)_localctx).result =  new ru.itmo.stella.lang.Absyn.TypeVar(((Type3Context)_localctx).p_7_1.getText()); 
				}
				break;
			case Surrogate_id_SYMB_2:
				enterOuterAlt(_localctx, 8);
				{
				setState(1268);
				match(Surrogate_id_SYMB_2);
				setState(1269);
				((Type3Context)_localctx).p_8_2 = type();
				setState(1270);
				match(Surrogate_id_SYMB_3);
				 ((Type3Context)_localctx).result =  ((Type3Context)_localctx).p_8_2.result; 
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

	public static class ListTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListType result;
		public TypeContext p_2_1;
		public TypeContext p_3_1;
		public ListTypeContext p_3_3;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListType(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_listType);
		try {
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListTypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListType(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1276);
				((ListTypeContext)_localctx).p_2_1 = type();
				 ((ListTypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListType(); _localctx.result.addLast(((ListTypeContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1279);
				((ListTypeContext)_localctx).p_3_1 = type();
				setState(1280);
				match(Surrogate_id_SYMB_0);
				setState(1281);
				((ListTypeContext)_localctx).p_3_3 = listType();
				 ((ListTypeContext)_localctx).result =  ((ListTypeContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListTypeContext)_localctx).p_3_1.result); 
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

	public static class VariantFieldTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.VariantFieldType result;
		public Token p_1_1;
		public OptionalTypingContext p_1_2;
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public OptionalTypingContext optionalTyping() {
			return getRuleContext(OptionalTypingContext.class,0);
		}
		public VariantFieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantFieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterVariantFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitVariantFieldType(this);
		}
	}

	public final VariantFieldTypeContext variantFieldType() throws RecognitionException {
		VariantFieldTypeContext _localctx = new VariantFieldTypeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_variantFieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			((VariantFieldTypeContext)_localctx).p_1_1 = match(StellaIdent);
			setState(1287);
			((VariantFieldTypeContext)_localctx).p_1_2 = optionalTyping();
			 ((VariantFieldTypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.AVariantFieldType(((VariantFieldTypeContext)_localctx).p_1_1.getText(),((VariantFieldTypeContext)_localctx).p_1_2.result); 
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

	public static class ListVariantFieldTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListVariantFieldType result;
		public VariantFieldTypeContext p_2_1;
		public VariantFieldTypeContext p_3_1;
		public ListVariantFieldTypeContext p_3_3;
		public VariantFieldTypeContext variantFieldType() {
			return getRuleContext(VariantFieldTypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public ListVariantFieldTypeContext listVariantFieldType() {
			return getRuleContext(ListVariantFieldTypeContext.class,0);
		}
		public ListVariantFieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVariantFieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListVariantFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListVariantFieldType(this);
		}
	}

	public final ListVariantFieldTypeContext listVariantFieldType() throws RecognitionException {
		ListVariantFieldTypeContext _localctx = new ListVariantFieldTypeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_listVariantFieldType);
		try {
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListVariantFieldTypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListVariantFieldType(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1291);
				((ListVariantFieldTypeContext)_localctx).p_2_1 = variantFieldType();
				 ((ListVariantFieldTypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListVariantFieldType(); _localctx.result.addLast(((ListVariantFieldTypeContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1294);
				((ListVariantFieldTypeContext)_localctx).p_3_1 = variantFieldType();
				setState(1295);
				match(Surrogate_id_SYMB_0);
				setState(1296);
				((ListVariantFieldTypeContext)_localctx).p_3_3 = listVariantFieldType();
				 ((ListVariantFieldTypeContext)_localctx).result =  ((ListVariantFieldTypeContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListVariantFieldTypeContext)_localctx).p_3_1.result); 
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

	public static class RecordFieldTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.RecordFieldType result;
		public Token p_1_1;
		public TypeContext p_1_3;
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(StellaParser.Surrogate_id_SYMB_9, 0); }
		public TerminalNode StellaIdent() { return getToken(StellaParser.StellaIdent, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RecordFieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordFieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterRecordFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitRecordFieldType(this);
		}
	}

	public final RecordFieldTypeContext recordFieldType() throws RecognitionException {
		RecordFieldTypeContext _localctx = new RecordFieldTypeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_recordFieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			((RecordFieldTypeContext)_localctx).p_1_1 = match(StellaIdent);
			setState(1302);
			match(Surrogate_id_SYMB_9);
			setState(1303);
			((RecordFieldTypeContext)_localctx).p_1_3 = type();
			 ((RecordFieldTypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ARecordFieldType(((RecordFieldTypeContext)_localctx).p_1_1.getText(),((RecordFieldTypeContext)_localctx).p_1_3.result); 
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

	public static class ListRecordFieldTypeContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.ListRecordFieldType result;
		public RecordFieldTypeContext p_1_1;
		public RecordFieldTypeContext p_2_1;
		public ListRecordFieldTypeContext p_2_3;
		public RecordFieldTypeContext recordFieldType() {
			return getRuleContext(RecordFieldTypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(StellaParser.Surrogate_id_SYMB_0, 0); }
		public ListRecordFieldTypeContext listRecordFieldType() {
			return getRuleContext(ListRecordFieldTypeContext.class,0);
		}
		public ListRecordFieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listRecordFieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterListRecordFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitListRecordFieldType(this);
		}
	}

	public final ListRecordFieldTypeContext listRecordFieldType() throws RecognitionException {
		ListRecordFieldTypeContext _localctx = new ListRecordFieldTypeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_listRecordFieldType);
		try {
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				((ListRecordFieldTypeContext)_localctx).p_1_1 = recordFieldType();
				 ((ListRecordFieldTypeContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ListRecordFieldType(); _localctx.result.addLast(((ListRecordFieldTypeContext)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1309);
				((ListRecordFieldTypeContext)_localctx).p_2_1 = recordFieldType();
				setState(1310);
				match(Surrogate_id_SYMB_0);
				setState(1311);
				((ListRecordFieldTypeContext)_localctx).p_2_3 = listRecordFieldType();
				 ((ListRecordFieldTypeContext)_localctx).result =  ((ListRecordFieldTypeContext)_localctx).p_2_3.result; _localctx.result.addFirst(((ListRecordFieldTypeContext)_localctx).p_2_1.result); 
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

	public static class TypingContext extends ParserRuleContext {
		public ru.itmo.stella.lang.Absyn.Typing result;
		public ExprContext p_1_1;
		public TypeContext p_1_3;
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(StellaParser.Surrogate_id_SYMB_9, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).enterTyping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellaParserListener ) ((StellaParserListener)listener).exitTyping(this);
		}
	}

	public final TypingContext typing() throws RecognitionException {
		TypingContext _localctx = new TypingContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_typing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			((TypingContext)_localctx).p_1_1 = expr();
			setState(1317);
			match(Surrogate_id_SYMB_9);
			setState(1318);
			((TypingContext)_localctx).p_1_3 = type();
			 ((TypingContext)_localctx).result =  new ru.itmo.stella.lang.Absyn.ATyping(((TypingContext)_localctx).p_1_1.result,((TypingContext)_localctx).p_1_3.result); 
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
		case 56:
			return listExtension_sempred((ListExtensionContext)_localctx, predIndex);
		case 58:
			return listDecl_sempred((ListDeclContext)_localctx, predIndex);
		case 60:
			return listLocalDecl_sempred((ListLocalDeclContext)_localctx, predIndex);
		case 62:
			return listAnnotation_sempred((ListAnnotationContext)_localctx, predIndex);
		case 74:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 87:
			return expr3_sempred((Expr3Context)_localctx, predIndex);
		case 88:
			return expr4_sempred((Expr4Context)_localctx, predIndex);
		case 90:
			return expr6_sempred((Expr6Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean listExtension_sempred(ListExtensionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean listDecl_sempred(ListDeclContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean listLocalDecl_sempred(ListLocalDeclContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean listAnnotation_sempred(ListAnnotationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		}
		return true;
	}
	private boolean expr3_sempred(Expr3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr4_sempred(Expr4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr6_sempred(Expr6Context _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 26);
		case 15:
			return precpred(_ctx, 25);
		case 16:
			return precpred(_ctx, 24);
		case 17:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u052c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01a8"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\39\39"+
		"\59\u01bc\n9\3:\3:\3:\3:\3:\3:\3:\3:\7:\u01c6\n:\f:\16:\u01c9\13:\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\5;\u0200\n;\3<\3<\3<\3<\3<\3<\3<\7<\u0209\n<\f<\16<\u020c"+
		"\13<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\7>\u0219\n>\f>\16>\u021c\13>\3?"+
		"\3?\3?\3@\3@\3@\3@\3@\3@\3@\7@\u0228\n@\f@\16@\u022b\13@\3A\3A\3A\3A\3"+
		"A\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u023b\nB\3C\3C\3C\3C\3C\5C\u0242\nC\3"+
		"D\3D\3D\3D\3D\5D\u0249\nD\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0256\n"+
		"F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0266\nH\3I\3I\3I\3I\3"+
		"I\5I\u026d\nI\3J\3J\3J\3J\3J\5J\u0274\nJ\3K\3K\3K\3K\3K\5K\u027b\nK\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\5L\u02c3\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\7L\u02d0\nL\fL\16L\u02d3"+
		"\13L\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u02de\nM\3N\3N\3N\3N\3N\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\5O\u02ed\nO\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u02fc"+
		"\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u031d\nR\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S"+
		"\u0328\nS\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u033a\nT"+
		"\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0349\nV\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\5W\u036c\nW\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0377\nX\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0399\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u03b5\nY\fY\16Y\u03b8\13"+
		"Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u03cd\n"+
		"Z\fZ\16Z\u03d0\13Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u03df\n["+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u047b\n\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\7\\\u0491\n\\\f\\\16\\\u0494\13\\\3]\3]\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u04a7\n]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u04c2\n^\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\5_\u04cc\n_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\5`\u04e5\n`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u04fc\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\5"+
		"b\u0507\nb\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0516\nd\3e\3e\3"+
		"e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0525\nf\3g\3g\3g\3g\3g\3g\2\nrvz~"+
		"\u0096\u00b0\u00b2\u00b6h\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\2\2\2\u0542\2\u00ce\3\2\2\2\4\u00d2\3\2\2\2\6\u00d6\3\2\2\2\b\u00da\3"+
		"\2\2\2\n\u00de\3\2\2\2\f\u00e2\3\2\2\2\16\u00e6\3\2\2\2\20\u00ea\3\2\2"+
		"\2\22\u00ee\3\2\2\2\24\u00f2\3\2\2\2\26\u00f6\3\2\2\2\30\u00fa\3\2\2\2"+
		"\32\u00fe\3\2\2\2\34\u0102\3\2\2\2\36\u0106\3\2\2\2 \u010a\3\2\2\2\"\u010e"+
		"\3\2\2\2$\u0112\3\2\2\2&\u0116\3\2\2\2(\u011a\3\2\2\2*\u011e\3\2\2\2,"+
		"\u0122\3\2\2\2.\u0126\3\2\2\2\60\u012a\3\2\2\2\62\u012e\3\2\2\2\64\u0132"+
		"\3\2\2\2\66\u0136\3\2\2\28\u013a\3\2\2\2:\u013e\3\2\2\2<\u0142\3\2\2\2"+
		">\u0146\3\2\2\2@\u014a\3\2\2\2B\u014e\3\2\2\2D\u0152\3\2\2\2F\u0156\3"+
		"\2\2\2H\u015a\3\2\2\2J\u015e\3\2\2\2L\u0162\3\2\2\2N\u0166\3\2\2\2P\u016a"+
		"\3\2\2\2R\u016e\3\2\2\2T\u0172\3\2\2\2V\u0176\3\2\2\2X\u017a\3\2\2\2Z"+
		"\u017e\3\2\2\2\\\u0182\3\2\2\2^\u0186\3\2\2\2`\u018a\3\2\2\2b\u018e\3"+
		"\2\2\2d\u0192\3\2\2\2f\u0196\3\2\2\2h\u019a\3\2\2\2j\u01a7\3\2\2\2l\u01a9"+
		"\3\2\2\2n\u01ae\3\2\2\2p\u01bb\3\2\2\2r\u01bd\3\2\2\2t\u01ff\3\2\2\2v"+
		"\u0201\3\2\2\2x\u020d\3\2\2\2z\u0210\3\2\2\2|\u021d\3\2\2\2~\u0220\3\2"+
		"\2\2\u0080\u022c\3\2\2\2\u0082\u023a\3\2\2\2\u0084\u0241\3\2\2\2\u0086"+
		"\u0248\3\2\2\2\u0088\u024a\3\2\2\2\u008a\u0255\3\2\2\2\u008c\u0257\3\2"+
		"\2\2\u008e\u0265\3\2\2\2\u0090\u026c\3\2\2\2\u0092\u0273\3\2\2\2\u0094"+
		"\u027a\3\2\2\2\u0096\u02c2\3\2\2\2\u0098\u02dd\3\2\2\2\u009a\u02df\3\2"+
		"\2\2\u009c\u02ec\3\2\2\2\u009e\u02ee\3\2\2\2\u00a0\u02fb\3\2\2\2\u00a2"+
		"\u031c\3\2\2\2\u00a4\u0327\3\2\2\2\u00a6\u0339\3\2\2\2\u00a8\u033b\3\2"+
		"\2\2\u00aa\u0348\3\2\2\2\u00ac\u036b\3\2\2\2\u00ae\u0376\3\2\2\2\u00b0"+
		"\u0398\3\2\2\2\u00b2\u03b9\3\2\2\2\u00b4\u03de\3\2\2\2\u00b6\u047a\3\2"+
		"\2\2\u00b8\u04a6\3\2\2\2\u00ba\u04c1\3\2\2\2\u00bc\u04cb\3\2\2\2\u00be"+
		"\u04e4\3\2\2\2\u00c0\u04fb\3\2\2\2\u00c2\u0506\3\2\2\2\u00c4\u0508\3\2"+
		"\2\2\u00c6\u0515\3\2\2\2\u00c8\u0517\3\2\2\2\u00ca\u0524\3\2\2\2\u00cc"+
		"\u0526\3\2\2\2\u00ce\u00cf\5h\65\2\u00cf\u00d0\7\2\2\3\u00d0\u00d1\b\2"+
		"\1\2\u00d1\3\3\2\2\2\u00d2\u00d3\5j\66\2\u00d3\u00d4\7\2\2\3\u00d4\u00d5"+
		"\b\3\1\2\u00d5\5\3\2\2\2\u00d6\u00d7\5l\67\2\u00d7\u00d8\7\2\2\3\u00d8"+
		"\u00d9\b\4\1\2\u00d9\7\3\2\2\2\u00da\u00db\5n8\2\u00db\u00dc\7\2\2\3\u00dc"+
		"\u00dd\b\5\1\2\u00dd\t\3\2\2\2\u00de\u00df\5p9\2\u00df\u00e0\7\2\2\3\u00e0"+
		"\u00e1\b\6\1\2\u00e1\13\3\2\2\2\u00e2\u00e3\5r:\2\u00e3\u00e4\7\2\2\3"+
		"\u00e4\u00e5\b\7\1\2\u00e5\r\3\2\2\2\u00e6\u00e7\5t;\2\u00e7\u00e8\7\2"+
		"\2\3\u00e8\u00e9\b\b\1\2\u00e9\17\3\2\2\2\u00ea\u00eb\5v<\2\u00eb\u00ec"+
		"\7\2\2\3\u00ec\u00ed\b\t\1\2\u00ed\21\3\2\2\2\u00ee\u00ef\5x=\2\u00ef"+
		"\u00f0\7\2\2\3\u00f0\u00f1\b\n\1\2\u00f1\23\3\2\2\2\u00f2\u00f3\5z>\2"+
		"\u00f3\u00f4\7\2\2\3\u00f4\u00f5\b\13\1\2\u00f5\25\3\2\2\2\u00f6\u00f7"+
		"\5|?\2\u00f7\u00f8\7\2\2\3\u00f8\u00f9\b\f\1\2\u00f9\27\3\2\2\2\u00fa"+
		"\u00fb\5~@\2\u00fb\u00fc\7\2\2\3\u00fc\u00fd\b\r\1\2\u00fd\31\3\2\2\2"+
		"\u00fe\u00ff\5\u0080A\2\u00ff\u0100\7\2\2\3\u0100\u0101\b\16\1\2\u0101"+
		"\33\3\2\2\2\u0102\u0103\5\u0082B\2\u0103\u0104\7\2\2\3\u0104\u0105\b\17"+
		"\1\2\u0105\35\3\2\2\2\u0106\u0107\5\u0084C\2\u0107\u0108\7\2\2\3\u0108"+
		"\u0109\b\20\1\2\u0109\37\3\2\2\2\u010a\u010b\5\u0086D\2\u010b\u010c\7"+
		"\2\2\3\u010c\u010d\b\21\1\2\u010d!\3\2\2\2\u010e\u010f\5\u0088E\2\u010f"+
		"\u0110\7\2\2\3\u0110\u0111\b\22\1\2\u0111#\3\2\2\2\u0112\u0113\5\u008a"+
		"F\2\u0113\u0114\7\2\2\3\u0114\u0115\b\23\1\2\u0115%\3\2\2\2\u0116\u0117"+
		"\5\u008cG\2\u0117\u0118\7\2\2\3\u0118\u0119\b\24\1\2\u0119\'\3\2\2\2\u011a"+
		"\u011b\5\u008eH\2\u011b\u011c\7\2\2\3\u011c\u011d\b\25\1\2\u011d)\3\2"+
		"\2\2\u011e\u011f\5\u0090I\2\u011f\u0120\7\2\2\3\u0120\u0121\b\26\1\2\u0121"+
		"+\3\2\2\2\u0122\u0123\5\u0092J\2\u0123\u0124\7\2\2\3\u0124\u0125\b\27"+
		"\1\2\u0125-\3\2\2\2\u0126\u0127\5\u0094K\2\u0127\u0128\7\2\2\3\u0128\u0129"+
		"\b\30\1\2\u0129/\3\2\2\2\u012a\u012b\5\u0096L\2\u012b\u012c\7\2\2\3\u012c"+
		"\u012d\b\31\1\2\u012d\61\3\2\2\2\u012e\u012f\5\u0098M\2\u012f\u0130\7"+
		"\2\2\3\u0130\u0131\b\32\1\2\u0131\63\3\2\2\2\u0132\u0133\5\u009aN\2\u0133"+
		"\u0134\7\2\2\3\u0134\u0135\b\33\1\2\u0135\65\3\2\2\2\u0136\u0137\5\u009c"+
		"O\2\u0137\u0138\7\2\2\3\u0138\u0139\b\34\1\2\u0139\67\3\2\2\2\u013a\u013b"+
		"\5\u009eP\2\u013b\u013c\7\2\2\3\u013c\u013d\b\35\1\2\u013d9\3\2\2\2\u013e"+
		"\u013f\5\u00a0Q\2\u013f\u0140\7\2\2\3\u0140\u0141\b\36\1\2\u0141;\3\2"+
		"\2\2\u0142\u0143\5\u00a2R\2\u0143\u0144\7\2\2\3\u0144\u0145\b\37\1\2\u0145"+
		"=\3\2\2\2\u0146\u0147\5\u00a4S\2\u0147\u0148\7\2\2\3\u0148\u0149\b \1"+
		"\2\u0149?\3\2\2\2\u014a\u014b\5\u00a6T\2\u014b\u014c\7\2\2\3\u014c\u014d"+
		"\b!\1\2\u014dA\3\2\2\2\u014e\u014f\5\u00a8U\2\u014f\u0150\7\2\2\3\u0150"+
		"\u0151\b\"\1\2\u0151C\3\2\2\2\u0152\u0153\5\u00aaV\2\u0153\u0154\7\2\2"+
		"\3\u0154\u0155\b#\1\2\u0155E\3\2\2\2\u0156\u0157\5\u00acW\2\u0157\u0158"+
		"\7\2\2\3\u0158\u0159\b$\1\2\u0159G\3\2\2\2\u015a\u015b\5\u00aeX\2\u015b"+
		"\u015c\7\2\2\3\u015c\u015d\b%\1\2\u015dI\3\2\2\2\u015e\u015f\5\u00b0Y"+
		"\2\u015f\u0160\7\2\2\3\u0160\u0161\b&\1\2\u0161K\3\2\2\2\u0162\u0163\5"+
		"\u00b2Z\2\u0163\u0164\7\2\2\3\u0164\u0165\b\'\1\2\u0165M\3\2\2\2\u0166"+
		"\u0167\5\u00b4[\2\u0167\u0168\7\2\2\3\u0168\u0169\b(\1\2\u0169O\3\2\2"+
		"\2\u016a\u016b\5\u00b6\\\2\u016b\u016c\7\2\2\3\u016c\u016d\b)\1\2\u016d"+
		"Q\3\2\2\2\u016e\u016f\5\u00b8]\2\u016f\u0170\7\2\2\3\u0170\u0171\b*\1"+
		"\2\u0171S\3\2\2\2\u0172\u0173\5\u00ba^\2\u0173\u0174\7\2\2\3\u0174\u0175"+
		"\b+\1\2\u0175U\3\2\2\2\u0176\u0177\5\u00bc_\2\u0177\u0178\7\2\2\3\u0178"+
		"\u0179\b,\1\2\u0179W\3\2\2\2\u017a\u017b\5\u00be`\2\u017b\u017c\7\2\2"+
		"\3\u017c\u017d\b-\1\2\u017dY\3\2\2\2\u017e\u017f\5\u00c0a\2\u017f\u0180"+
		"\7\2\2\3\u0180\u0181\b.\1\2\u0181[\3\2\2\2\u0182\u0183\5\u00c2b\2\u0183"+
		"\u0184\7\2\2\3\u0184\u0185\b/\1\2\u0185]\3\2\2\2\u0186\u0187\5\u00c4c"+
		"\2\u0187\u0188\7\2\2\3\u0188\u0189\b\60\1\2\u0189_\3\2\2\2\u018a\u018b"+
		"\5\u00c6d\2\u018b\u018c\7\2\2\3\u018c\u018d\b\61\1\2\u018da\3\2\2\2\u018e"+
		"\u018f\5\u00c8e\2\u018f\u0190\7\2\2\3\u0190\u0191\b\62\1\2\u0191c\3\2"+
		"\2\2\u0192\u0193\5\u00caf\2\u0193\u0194\7\2\2\3\u0194\u0195\b\63\1\2\u0195"+
		"e\3\2\2\2\u0196\u0197\5\u00ccg\2\u0197\u0198\7\2\2\3\u0198\u0199\b\64"+
		"\1\2\u0199g\3\2\2\2\u019a\u019b\5l\67\2\u019b\u019c\5r:\2\u019c\u019d"+
		"\5v<\2\u019d\u019e\b\65\1\2\u019ei\3\2\2\2\u019f\u01a8\b\66\1\2\u01a0"+
		"\u01a1\7V\2\2\u01a1\u01a8\b\66\1\2\u01a2\u01a3\7V\2\2\u01a3\u01a4\7\3"+
		"\2\2\u01a4\u01a5\5j\66\2\u01a5\u01a6\b\66\1\2\u01a6\u01a8\3\2\2\2\u01a7"+
		"\u019f\3\2\2\2\u01a7\u01a0\3\2\2\2\u01a7\u01a2\3\2\2\2\u01a8k\3\2\2\2"+
		"\u01a9\u01aa\7@\2\2\u01aa\u01ab\7\61\2\2\u01ab\u01ac\7\4\2\2\u01ac\u01ad"+
		"\b\67\1\2\u01adm\3\2\2\2\u01ae\u01af\7\64\2\2\u01af\u01b0\7R\2\2\u01b0"+
		"\u01b1\5p9\2\u01b1\u01b2\b8\1\2\u01b2o\3\2\2\2\u01b3\u01bc\b9\1\2\u01b4"+
		"\u01b5\7W\2\2\u01b5\u01bc\b9\1\2\u01b6\u01b7\7W\2\2\u01b7\u01b8\7\3\2"+
		"\2\u01b8\u01b9\5p9\2\u01b9\u01ba\b9\1\2\u01ba\u01bc\3\2\2\2\u01bb\u01b3"+
		"\3\2\2\2\u01bb\u01b4\3\2\2\2\u01bb\u01b6\3\2\2\2\u01bcq\3\2\2\2\u01bd"+
		"\u01be\b:\1\2\u01be\u01bf\b:\1\2\u01bf\u01c7\3\2\2\2\u01c0\u01c1\f\3\2"+
		"\2\u01c1\u01c2\5n8\2\u01c2\u01c3\7\4\2\2\u01c3\u01c4\b:\1\2\u01c4\u01c6"+
		"\3\2\2\2\u01c5\u01c0\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8s\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\5~@\2\u01cb"+
		"\u01cc\7\67\2\2\u01cc\u01cd\7V\2\2\u01cd\u01ce\7\5\2\2\u01ce\u01cf\5\u0082"+
		"B\2\u01cf\u01d0\7\6\2\2\u01d0\u01d1\5\u0084C\2\u01d1\u01d2\5\u0086D\2"+
		"\u01d2\u01d3\7\7\2\2\u01d3\u01d4\5v<\2\u01d4\u01d5\7G\2\2\u01d5\u01d6"+
		"\5\u00a2R\2\u01d6\u01d7\7\b\2\2\u01d7\u01d8\b;\1\2\u01d8\u0200\3\2\2\2"+
		"\u01d9\u01da\5~@\2\u01da\u01db\7:\2\2\u01db\u01dc\7\67\2\2\u01dc\u01dd"+
		"\7V\2\2\u01dd\u01de\7\t\2\2\u01de\u01df\5j\66\2\u01df\u01e0\7\n\2\2\u01e0"+
		"\u01e1\7\5\2\2\u01e1\u01e2\5\u0082B\2\u01e2\u01e3\7\6\2\2\u01e3\u01e4"+
		"\5\u0084C\2\u01e4\u01e5\5\u0086D\2\u01e5\u01e6\7\7\2\2\u01e6\u01e7\5v"+
		"<\2\u01e7\u01e8\7G\2\2\u01e8\u01e9\5\u00a2R\2\u01e9\u01ea\7\b\2\2\u01ea"+
		"\u01eb\b;\1\2\u01eb\u0200\3\2\2\2\u01ec\u01ed\7N\2\2\u01ed\u01ee\7V\2"+
		"\2\u01ee\u01ef\7\13\2\2\u01ef\u01f0\5\u00ba^\2\u01f0\u01f1\b;\1\2\u01f1"+
		"\u0200\3\2\2\2\u01f2\u01f3\7\63\2\2\u01f3\u01f4\7N\2\2\u01f4\u01f5\7\13"+
		"\2\2\u01f5\u01f6\5\u00ba^\2\u01f6\u01f7\b;\1\2\u01f7\u0200\3\2\2\2\u01f8"+
		"\u01f9\7\63\2\2\u01f9\u01fa\7Q\2\2\u01fa\u01fb\7V\2\2\u01fb\u01fc\7\f"+
		"\2\2\u01fc\u01fd\5\u00ba^\2\u01fd\u01fe\b;\1\2\u01fe\u0200\3\2\2\2\u01ff"+
		"\u01ca\3\2\2\2\u01ff\u01d9\3\2\2\2\u01ff\u01ec\3\2\2\2\u01ff\u01f2\3\2"+
		"\2\2\u01ff\u01f8\3\2\2\2\u0200u\3\2\2\2\u0201\u0202\b<\1\2\u0202\u0203"+
		"\b<\1\2\u0203\u020a\3\2\2\2\u0204\u0205\f\3\2\2\u0205\u0206\5t;\2\u0206"+
		"\u0207\b<\1\2\u0207\u0209\3\2\2\2\u0208\u0204\3\2\2\2\u0209\u020c\3\2"+
		"\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020bw\3\2\2\2\u020c\u020a"+
		"\3\2\2\2\u020d\u020e\5t;\2\u020e\u020f\b=\1\2\u020fy\3\2\2\2\u0210\u0211"+
		"\b>\1\2\u0211\u0212\b>\1\2\u0212\u021a\3\2\2\2\u0213\u0214\f\3\2\2\u0214"+
		"\u0215\5x=\2\u0215\u0216\7\4\2\2\u0216\u0217\b>\1\2\u0217\u0219\3\2\2"+
		"\2\u0218\u0213\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b"+
		"\3\2\2\2\u021b{\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\7>\2\2\u021e\u021f"+
		"\b?\1\2\u021f}\3\2\2\2\u0220\u0221\b@\1\2\u0221\u0222\b@\1\2\u0222\u0229"+
		"\3\2\2\2\u0223\u0224\f\3\2\2\u0224\u0225\5|?\2\u0225\u0226\b@\1\2\u0226"+
		"\u0228\3\2\2\2\u0227\u0223\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\177\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d"+
		"\7V\2\2\u022d\u022e\7\f\2\2\u022e\u022f\5\u00ba^\2\u022f\u0230\bA\1\2"+
		"\u0230\u0081\3\2\2\2\u0231\u023b\bB\1\2\u0232\u0233\5\u0080A\2\u0233\u0234"+
		"\bB\1\2\u0234\u023b\3\2\2\2\u0235\u0236\5\u0080A\2\u0236\u0237\7\3\2\2"+
		"\u0237\u0238\5\u0082B\2\u0238\u0239\bB\1\2\u0239\u023b\3\2\2\2\u023a\u0231"+
		"\3\2\2\2\u023a\u0232\3\2\2\2\u023a\u0235\3\2\2\2\u023b\u0083\3\2\2\2\u023c"+
		"\u0242\bC\1\2\u023d\u023e\7\r\2\2\u023e\u023f\5\u00ba^\2\u023f\u0240\b"+
		"C\1\2\u0240\u0242\3\2\2\2\u0241\u023c\3\2\2\2\u0241\u023d\3\2\2\2\u0242"+
		"\u0085\3\2\2\2\u0243\u0249\bD\1\2\u0244\u0245\7K\2\2\u0245\u0246\5\u008a"+
		"F\2\u0246\u0247\bD\1\2\u0247\u0249\3\2\2\2\u0248\u0243\3\2\2\2\u0248\u0244"+
		"\3\2\2\2\u0249\u0087\3\2\2\2\u024a\u024b\5\u00ba^\2\u024b\u024c\bE\1\2"+
		"\u024c\u0089\3\2\2\2\u024d\u024e\5\u0088E\2\u024e\u024f\bF\1\2\u024f\u0256"+
		"\3\2\2\2\u0250\u0251\5\u0088E\2\u0251\u0252\7\3\2\2\u0252\u0253\5\u008a"+
		"F\2\u0253\u0254\bF\1\2\u0254\u0256\3\2\2\2\u0255\u024d\3\2\2\2\u0255\u0250"+
		"\3\2\2\2\u0256\u008b\3\2\2\2\u0257\u0258\5\u0096L\2\u0258\u0259\7\16\2"+
		"\2\u0259\u025a\5\u00a2R\2\u025a\u025b\bG\1\2\u025b\u008d\3\2\2\2\u025c"+
		"\u0266\bH\1\2\u025d\u025e\5\u008cG\2\u025e\u025f\bH\1\2\u025f\u0266\3"+
		"\2\2\2\u0260\u0261\5\u008cG\2\u0261\u0262\7\17\2\2\u0262\u0263\5\u008e"+
		"H\2\u0263\u0264\bH\1\2\u0264\u0266\3\2\2\2\u0265\u025c\3\2\2\2\u0265\u025d"+
		"\3\2\2\2\u0265\u0260\3\2\2\2\u0266\u008f\3\2\2\2\u0267\u026d\bI\1\2\u0268"+
		"\u0269\7\f\2\2\u0269\u026a\5\u00ba^\2\u026a\u026b\bI\1\2\u026b\u026d\3"+
		"\2\2\2\u026c\u0267\3\2\2\2\u026c\u0268\3\2\2\2\u026d\u0091\3\2\2\2\u026e"+
		"\u0274\bJ\1\2\u026f\u0270\7\13\2\2\u0270\u0271\5\u0096L\2\u0271\u0272"+
		"\bJ\1\2\u0272\u0274\3\2\2\2\u0273\u026e\3\2\2\2\u0273\u026f\3\2\2\2\u0274"+
		"\u0093\3\2\2\2\u0275\u027b\bK\1\2\u0276\u0277\7\13\2\2\u0277\u0278\5\u00a2"+
		"R\2\u0278\u0279\bK\1\2\u0279\u027b\3\2\2\2\u027a\u0275\3\2\2\2\u027a\u0276"+
		"\3\2\2\2\u027b\u0095\3\2\2\2\u027c\u027d\bL\1\2\u027d\u027e\7\20\2\2\u027e"+
		"\u027f\7V\2\2\u027f\u0280\5\u0092J\2\u0280\u0281\7\21\2\2\u0281\u0282"+
		"\bL\1\2\u0282\u02c3\3\2\2\2\u0283\u0284\7=\2\2\u0284\u0285\7\5\2\2\u0285"+
		"\u0286\5\u0096L\2\u0286\u0287\7\6\2\2\u0287\u0288\bL\1\2\u0288\u02c3\3"+
		"\2\2\2\u0289\u028a\7?\2\2\u028a\u028b\7\5\2\2\u028b\u028c\5\u0096L\2\u028c"+
		"\u028d\7\6\2\2\u028d\u028e\bL\1\2\u028e\u02c3\3\2\2\2\u028f\u0290\7\7"+
		"\2\2\u0290\u0291\5\u0098M\2\u0291\u0292\7\b\2\2\u0292\u0293\bL\1\2\u0293"+
		"\u02c3\3\2\2\2\u0294\u0295\7\7\2\2\u0295\u0296\5\u009cO\2\u0296\u0297"+
		"\7\b\2\2\u0297\u0298\bL\1\2\u0298\u02c3\3\2\2\2\u0299\u029a\7\t\2\2\u029a"+
		"\u029b\5\u0098M\2\u029b\u029c\7\n\2\2\u029c\u029d\bL\1\2\u029d\u02c3\3"+
		"\2\2\2\u029e\u029f\7\60\2\2\u029f\u02a0\7\5\2\2\u02a0\u02a1\5\u0096L\2"+
		"\u02a1\u02a2\7\3\2\2\u02a2\u02a3\5\u0096L\2\u02a3\u02a4\7\6\2\2\u02a4"+
		"\u02a5\bL\1\2\u02a5\u02c3\3\2\2\2\u02a6\u02a7\7\5\2\2\u02a7\u02a8\5\u0096"+
		"L\2\u02a8\u02a9\7\3\2\2\u02a9\u02aa\5\u0096L\2\u02aa\u02ab\7\6\2\2\u02ab"+
		"\u02ac\bL\1\2\u02ac\u02c3\3\2\2\2\u02ad\u02ae\7\65\2\2\u02ae\u02c3\bL"+
		"\1\2\u02af\u02b0\7L\2\2\u02b0\u02c3\bL\1\2\u02b1\u02b2\7P\2\2\u02b2\u02c3"+
		"\bL\1\2\u02b3\u02b4\7Y\2\2\u02b4\u02c3\bL\1\2\u02b5\u02b6\7H\2\2\u02b6"+
		"\u02b7\7\5\2\2\u02b7\u02b8\5\u0096L\2\u02b8\u02b9\7\6\2\2\u02b9\u02ba"+
		"\bL\1\2\u02ba\u02c3\3\2\2\2\u02bb\u02bc\7V\2\2\u02bc\u02c3\bL\1\2\u02bd"+
		"\u02be\7\5\2\2\u02be\u02bf\5\u0096L\2\u02bf\u02c0\7\6\2\2\u02c0\u02c1"+
		"\bL\1\2\u02c1\u02c3\3\2\2\2\u02c2\u027c\3\2\2\2\u02c2\u0283\3\2\2\2\u02c2"+
		"\u0289\3\2\2\2\u02c2\u028f\3\2\2\2\u02c2\u0294\3\2\2\2\u02c2\u0299\3\2"+
		"\2\2\u02c2\u029e\3\2\2\2\u02c2\u02a6\3\2\2\2\u02c2\u02ad\3\2\2\2\u02c2"+
		"\u02af\3\2\2\2\u02c2\u02b1\3\2\2\2\u02c2\u02b3\3\2\2\2\u02c2\u02b5\3\2"+
		"\2\2\u02c2\u02bb\3\2\2\2\u02c2\u02bd\3\2\2\2\u02c3\u02d1\3\2\2\2\u02c4"+
		"\u02c5\f\23\2\2\u02c5\u02c6\7.\2\2\u02c6\u02c7\7,\2\2\u02c7\u02c8\5\u00ba"+
		"^\2\u02c8\u02c9\bL\1\2\u02c9\u02d0\3\2\2\2\u02ca\u02cb\f\22\2\2\u02cb"+
		"\u02cc\7,\2\2\u02cc\u02cd\5\u00ba^\2\u02cd\u02ce\bL\1\2\u02ce\u02d0\3"+
		"\2\2\2\u02cf\u02c4\3\2\2\2\u02cf\u02ca\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u0097\3\2\2\2\u02d3\u02d1\3\2"+
		"\2\2\u02d4\u02de\bM\1\2\u02d5\u02d6\5\u0096L\2\u02d6\u02d7\bM\1\2\u02d7"+
		"\u02de\3\2\2\2\u02d8\u02d9\5\u0096L\2\u02d9\u02da\7\3\2\2\u02da\u02db"+
		"\5\u0098M\2\u02db\u02dc\bM\1\2\u02dc\u02de\3\2\2\2\u02dd\u02d4\3\2\2\2"+
		"\u02dd\u02d5\3\2\2\2\u02dd\u02d8\3\2\2\2\u02de\u0099\3\2\2\2\u02df\u02e0"+
		"\7V\2\2\u02e0\u02e1\7\13\2\2\u02e1\u02e2\5\u0096L\2\u02e2\u02e3\bN\1\2"+
		"\u02e3\u009b\3\2\2\2\u02e4\u02e5\5\u009aN\2\u02e5\u02e6\bO\1\2\u02e6\u02ed"+
		"\3\2\2\2\u02e7\u02e8\5\u009aN\2\u02e8\u02e9\7\3\2\2\u02e9\u02ea\5\u009c"+
		"O\2\u02ea\u02eb\bO\1\2\u02eb\u02ed\3\2\2\2\u02ec\u02e4\3\2\2\2\u02ec\u02e7"+
		"\3\2\2\2\u02ed\u009d\3\2\2\2\u02ee\u02ef\7V\2\2\u02ef\u02f0\7\13\2\2\u02f0"+
		"\u02f1\5\u00a2R\2\u02f1\u02f2\bP\1\2\u02f2\u009f\3\2\2\2\u02f3\u02f4\5"+
		"\u009eP\2\u02f4\u02f5\bQ\1\2\u02f5\u02fc\3\2\2\2\u02f6\u02f7\5\u009eP"+
		"\2\u02f7\u02f8\7\3\2\2\u02f8\u02f9\5\u00a0Q\2\u02f9\u02fa\bQ\1\2\u02fa"+
		"\u02fc\3\2\2\2\u02fb\u02f3\3\2\2\2\u02fb\u02f6\3\2\2\2\u02fc\u00a1\3\2"+
		"\2\2\u02fd\u02fe\5\u00a6T\2\u02fe\u02ff\7\4\2\2\u02ff\u0300\5\u00a2R\2"+
		"\u0300\u0301\bR\1\2\u0301\u031d\3\2\2\2\u0302\u0303\5\u00a6T\2\u0303\u0304"+
		"\7\4\2\2\u0304\u0305\bR\1\2\u0305\u031d\3\2\2\2\u0306\u0307\7A\2\2\u0307"+
		"\u0308\5\u00aaV\2\u0308\u0309\7<\2\2\u0309\u030a\5\u00a2R\2\u030a\u030b"+
		"\bR\1\2\u030b\u031d\3\2\2\2\u030c\u030d\7B\2\2\u030d\u030e\5\u00aaV\2"+
		"\u030e\u030f\7<\2\2\u030f\u0310\5\u00a2R\2\u0310\u0311\bR\1\2\u0311\u031d"+
		"\3\2\2\2\u0312\u0313\7:\2\2\u0313\u0314\7\t\2\2\u0314\u0315\5j\66\2\u0315"+
		"\u0316\7\n\2\2\u0316\u0317\5\u00a2R\2\u0317\u0318\bR\1\2\u0318\u031d\3"+
		"\2\2\2\u0319\u031a\5\u00a6T\2\u031a\u031b\bR\1\2\u031b\u031d\3\2\2\2\u031c"+
		"\u02fd\3\2\2\2\u031c\u0302\3\2\2\2\u031c\u0306\3\2\2\2\u031c\u030c\3\2"+
		"\2\2\u031c\u0312\3\2\2\2\u031c\u0319\3\2\2\2\u031d\u00a3\3\2\2\2\u031e"+
		"\u0328\bS\1\2\u031f\u0320\5\u00a2R\2\u0320\u0321\bS\1\2\u0321\u0328\3"+
		"\2\2\2\u0322\u0323\5\u00a2R\2\u0323\u0324\7\3\2\2\u0324\u0325\5\u00a4"+
		"S\2\u0325\u0326\bS\1\2\u0326\u0328\3\2\2\2\u0327\u031e\3\2\2\2\u0327\u031f"+
		"\3\2\2\2\u0327\u0322\3\2\2\2\u0328\u00a5\3\2\2\2\u0329\u032a\5\u00acW"+
		"\2\u032a\u032b\7\22\2\2\u032b\u032c\5\u00a6T\2\u032c\u032d\bT\1\2\u032d"+
		"\u033a\3\2\2\2\u032e\u032f\7;\2\2\u032f\u0330\5\u00a6T\2\u0330\u0331\7"+
		"I\2\2\u0331\u0332\5\u00a6T\2\u0332\u0333\7\62\2\2\u0333\u0334\5\u00a6"+
		"T\2\u0334\u0335\bT\1\2\u0335\u033a\3\2\2\2\u0336\u0337\5\u00acW\2\u0337"+
		"\u0338\bT\1\2\u0338\u033a\3\2\2\2\u0339\u0329\3\2\2\2\u0339\u032e\3\2"+
		"\2\2\u0339\u0336\3\2\2\2\u033a\u00a7\3\2\2\2\u033b\u033c\5\u0096L\2\u033c"+
		"\u033d\7\13\2\2\u033d\u033e\5\u00a2R\2\u033e\u033f\bU\1\2\u033f\u00a9"+
		"\3\2\2\2\u0340\u0341\5\u00a8U\2\u0341\u0342\bV\1\2\u0342\u0349\3\2\2\2"+
		"\u0343\u0344\5\u00a8U\2\u0344\u0345\7\3\2\2\u0345\u0346\5\u00aaV\2\u0346"+
		"\u0347\bV\1\2\u0347\u0349\3\2\2\2\u0348\u0340\3\2\2\2\u0348\u0343\3\2"+
		"\2\2\u0349\u00ab\3\2\2\2\u034a\u034b\5\u00b0Y\2\u034b\u034c\7\23\2\2\u034c"+
		"\u034d\5\u00b0Y\2\u034d\u034e\bW\1\2\u034e\u036c\3\2\2\2\u034f\u0350\5"+
		"\u00b0Y\2\u0350\u0351\7\24\2\2\u0351\u0352\5\u00b0Y\2\u0352\u0353\bW\1"+
		"\2\u0353\u036c\3\2\2\2\u0354\u0355\5\u00b0Y\2\u0355\u0356\7\25\2\2\u0356"+
		"\u0357\5\u00b0Y\2\u0357\u0358\bW\1\2\u0358\u036c\3\2\2\2\u0359\u035a\5"+
		"\u00b0Y\2\u035a\u035b\7\26\2\2\u035b\u035c\5\u00b0Y\2\u035c\u035d\bW\1"+
		"\2\u035d\u036c\3\2\2\2\u035e\u035f\5\u00b0Y\2\u035f\u0360\7\27\2\2\u0360"+
		"\u0361\5\u00b0Y\2\u0361\u0362\bW\1\2\u0362\u036c\3\2\2\2\u0363\u0364\5"+
		"\u00b0Y\2\u0364\u0365\7\30\2\2\u0365\u0366\5\u00b0Y\2\u0366\u0367\bW\1"+
		"\2\u0367\u036c\3\2\2\2\u0368\u0369\5\u00b0Y\2\u0369\u036a\bW\1\2\u036a"+
		"\u036c\3\2\2\2\u036b\u034a\3\2\2\2\u036b\u034f\3\2\2\2\u036b\u0354\3\2"+
		"\2\2\u036b\u0359\3\2\2\2\u036b\u035e\3\2\2\2\u036b\u0363\3\2\2\2\u036b"+
		"\u0368\3\2\2\2\u036c\u00ad\3\2\2\2\u036d\u036e\5\u00acW\2\u036e\u036f"+
		"\7\4\2\2\u036f\u0370\bX\1\2\u0370\u0377\3\2\2\2\u0371\u0372\5\u00acW\2"+
		"\u0372\u0373\7\4\2\2\u0373\u0374\5\u00aeX\2\u0374\u0375\bX\1\2\u0375\u0377"+
		"\3\2\2\2\u0376\u036d\3\2\2\2\u0376\u0371\3\2\2\2\u0377\u00af\3\2\2\2\u0378"+
		"\u0379\bY\1\2\u0379\u037a\7\67\2\2\u037a\u037b\7\5\2\2\u037b\u037c\5\u0082"+
		"B\2\u037c\u037d\7\6\2\2\u037d\u037e\7\7\2\2\u037e\u037f\7G\2\2\u037f\u0380"+
		"\5\u00a2R\2\u0380\u0381\7\b\2\2\u0381\u0382\bY\1\2\u0382\u0399\3\2\2\2"+
		"\u0383\u0384\7\20\2\2\u0384\u0385\7V\2\2\u0385\u0386\5\u0094K\2\u0386"+
		"\u0387\7\21\2\2\u0387\u0388\bY\1\2\u0388\u0399\3\2\2\2\u0389\u038a\7C"+
		"\2\2\u038a\u038b\5\u00acW\2\u038b\u038c\7\7\2\2\u038c\u038d\5\u008eH\2"+
		"\u038d\u038e\7\b\2\2\u038e\u038f\bY\1\2\u038f\u0399\3\2\2\2\u0390\u0391"+
		"\7\t\2\2\u0391\u0392\5\u00a4S\2\u0392\u0393\7\n\2\2\u0393\u0394\bY\1\2"+
		"\u0394\u0399\3\2\2\2\u0395\u0396\5\u00b2Z\2\u0396\u0397\bY\1\2\u0397\u0399"+
		"\3\2\2\2\u0398\u0378\3\2\2\2\u0398\u0383\3\2\2\2\u0398\u0389\3\2\2\2\u0398"+
		"\u0390\3\2\2\2\u0398\u0395\3\2\2\2\u0399\u03b6\3\2\2\2\u039a\u039b\f\f"+
		"\2\2\u039b\u039c\7,\2\2\u039c\u039d\5\u00be`\2\u039d\u039e\bY\1\2\u039e"+
		"\u03b5\3\2\2\2\u039f\u03a0\f\13\2\2\u03a0\u03a1\7.\2\2\u03a1\u03a2\7,"+
		"\2\2\u03a2\u03a3\5\u00be`\2\u03a3\u03a4\bY\1\2\u03a4\u03b5\3\2\2\2\u03a5"+
		"\u03a6\f\6\2\2\u03a6\u03a7\7\31\2\2\u03a7\u03a8\5\u00b2Z\2\u03a8\u03a9"+
		"\bY\1\2\u03a9\u03b5\3\2\2\2\u03aa\u03ab\f\5\2\2\u03ab\u03ac\7\32\2\2\u03ac"+
		"\u03ad\5\u00b2Z\2\u03ad\u03ae\bY\1\2\u03ae\u03b5\3\2\2\2\u03af\u03b0\f"+
		"\4\2\2\u03b0\u03b1\7F\2\2\u03b1\u03b2\5\u00b2Z\2\u03b2\u03b3\bY\1\2\u03b3"+
		"\u03b5\3\2\2\2\u03b4\u039a\3\2\2\2\u03b4\u039f\3\2\2\2\u03b4\u03a5\3\2"+
		"\2\2\u03b4\u03aa\3\2\2\2\u03b4\u03af\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u00b1\3\2\2\2\u03b8\u03b6\3\2"+
		"\2\2\u03b9\u03ba\bZ\1\2\u03ba\u03bb\5\u00b4[\2\u03bb\u03bc\bZ\1\2\u03bc"+
		"\u03ce\3\2\2\2\u03bd\u03be\f\6\2\2\u03be\u03bf\7\33\2\2\u03bf\u03c0\5"+
		"\u00b4[\2\u03c0\u03c1\bZ\1\2\u03c1\u03cd\3\2\2\2\u03c2\u03c3\f\5\2\2\u03c3"+
		"\u03c4\7\34\2\2\u03c4\u03c5\5\u00b4[\2\u03c5\u03c6\bZ\1\2\u03c6\u03cd"+
		"\3\2\2\2\u03c7\u03c8\f\4\2\2\u03c8\u03c9\7+\2\2\u03c9\u03ca\5\u00b4[\2"+
		"\u03ca\u03cb\bZ\1\2\u03cb\u03cd\3\2\2\2\u03cc\u03bd\3\2\2\2\u03cc\u03c2"+
		"\3\2\2\2\u03cc\u03c7\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce"+
		"\u03cf\3\2\2\2\u03cf\u00b3\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d2\7D"+
		"\2\2\u03d2\u03d3\7\5\2\2\u03d3\u03d4\5\u00a2R\2\u03d4\u03d5\7\6\2\2\u03d5"+
		"\u03d6\b[\1\2\u03d6\u03df\3\2\2\2\u03d7\u03d8\7\33\2\2\u03d8\u03d9\5\u00b4"+
		"[\2\u03d9\u03da\b[\1\2\u03da\u03df\3\2\2\2\u03db\u03dc\5\u00b6\\\2\u03dc"+
		"\u03dd\b[\1\2\u03dd\u03df\3\2\2\2\u03de\u03d1\3\2\2\2\u03de\u03d7\3\2"+
		"\2\2\u03de\u03db\3\2\2\2\u03df\u00b5\3\2\2\2\u03e0\u03e1\b\\\1\2\u03e1"+
		"\u03e2\7\7\2\2\u03e2\u03e3\5\u00a4S\2\u03e3\u03e4\7\b\2\2\u03e4\u03e5"+
		"\b\\\1\2\u03e5\u047b\3\2\2\2\u03e6\u03e7\7\7\2\2\u03e7\u03e8\5\u00a0Q"+
		"\2\u03e8\u03e9\7\b\2\2\u03e9\u03ea\b\\\1\2\u03ea\u047b\3\2\2\2\u03eb\u03ec"+
		"\7\60\2\2\u03ec\u03ed\7\5\2\2\u03ed\u03ee\5\u00a2R\2\u03ee\u03ef\7\3\2"+
		"\2\u03ef\u03f0\5\u00a2R\2\u03f0\u03f1\7\6\2\2\u03f1\u03f2\b\\\1\2\u03f2"+
		"\u047b\3\2\2\2\u03f3\u03f4\7\36\2\2\u03f4\u03f5\7\5\2\2\u03f5\u03f6\5"+
		"\u00a2R\2\u03f6\u03f7\7\6\2\2\u03f7\u03f8\b\\\1\2\u03f8\u047b\3\2\2\2"+
		"\u03f9\u03fa\7\37\2\2\u03fa\u03fb\7\5\2\2\u03fb\u03fc\5\u00a2R\2\u03fc"+
		"\u03fd\7\6\2\2\u03fd\u03fe\b\\\1\2\u03fe\u047b\3\2\2\2\u03ff\u0400\7 "+
		"\2\2\u0400\u0401\7\5\2\2\u0401\u0402\5\u00a2R\2\u0402\u0403\7\6\2\2\u0403"+
		"\u0404\b\\\1\2\u0404\u047b\3\2\2\2\u0405\u0406\7!\2\2\u0406\u047b\b\\"+
		"\1\2\u0407\u0408\7J\2\2\u0408\u0409\7\5\2\2\u0409\u040a\5\u00a2R\2\u040a"+
		"\u040b\7\6\2\2\u040b\u040c\b\\\1\2\u040c\u047b\3\2\2\2\u040d\u040e\7M"+
		"\2\2\u040e\u040f\7\7\2\2\u040f\u0410\5\u00a2R\2\u0410\u0411\7\b\2\2\u0411"+
		"\u0412\7/\2\2\u0412\u0413\7\7\2\2\u0413\u0414\5\u0096L\2\u0414\u0415\7"+
		"\16\2\2\u0415\u0416\5\u00a2R\2\u0416\u0417\7\b\2\2\u0417\u0418\b\\\1\2"+
		"\u0418\u047b\3\2\2\2\u0419\u041a\7M\2\2\u041a\u041b\7\7\2\2\u041b\u041c"+
		"\5\u00a2R\2\u041c\u041d\7\b\2\2\u041d\u041e\7R\2\2\u041e\u041f\7\7\2\2"+
		"\u041f\u0420\5\u00a2R\2\u0420\u0421\7\b\2\2\u0421\u0422\b\\\1\2\u0422"+
		"\u047b\3\2\2\2\u0423\u0424\7M\2\2\u0424\u0425\7\7\2\2\u0425\u0426\5\u00a2"+
		"R\2\u0426\u0427\7\b\2\2\u0427\u0428\7.\2\2\u0428\u0429\7,\2\2\u0429\u042a"+
		"\5\u00ba^\2\u042a\u042b\7\7\2\2\u042b\u042c\5\u0096L\2\u042c\u042d\7\16"+
		"\2\2\u042d\u042e\5\u00a2R\2\u042e\u042f\7\b\2\2\u042f\u0430\7R\2\2\u0430"+
		"\u0431\7\7\2\2\u0431\u0432\5\u00a2R\2\u0432\u0433\7\b\2\2\u0433\u0434"+
		"\b\\\1\2\u0434\u047b\3\2\2\2\u0435\u0436\7=\2\2\u0436\u0437\7\5\2\2\u0437"+
		"\u0438\5\u00a2R\2\u0438\u0439\7\6\2\2\u0439\u043a\b\\\1\2\u043a\u047b"+
		"\3\2\2\2\u043b\u043c\7?\2\2\u043c\u043d\7\5\2\2\u043d\u043e\5\u00a2R\2"+
		"\u043e\u043f\7\6\2\2\u043f\u0440\b\\\1\2\u0440\u047b\3\2\2\2\u0441\u0442"+
		"\7H\2\2\u0442\u0443\7\5\2\2\u0443\u0444\5\u00a2R\2\u0444\u0445\7\6\2\2"+
		"\u0445\u0446\b\\\1\2\u0446\u047b\3\2\2\2\u0447\u0448\7E\2\2\u0448\u0449"+
		"\7\5\2\2\u0449\u044a\5\u00a2R\2\u044a\u044b\7\6\2\2\u044b\u044c\b\\\1"+
		"\2\u044c\u047b\3\2\2\2\u044d\u044e\7\"\2\2\u044e\u044f\7\5\2\2\u044f\u0450"+
		"\5\u00a2R\2\u0450\u0451\7\6\2\2\u0451\u0452\b\\\1\2\u0452\u047b\3\2\2"+
		"\2\u0453\u0454\7#\2\2\u0454\u0455\7\5\2\2\u0455\u0456\5\u00a2R\2\u0456"+
		"\u0457\7\6\2\2\u0457\u0458\b\\\1\2\u0458\u047b\3\2\2\2\u0459\u045a\7\66"+
		"\2\2\u045a\u045b\7\5\2\2\u045b\u045c\5\u00a2R\2\u045c\u045d\7\6\2\2\u045d"+
		"\u045e\b\\\1\2\u045e\u047b\3\2\2\2\u045f\u0460\7$\2\2\u0460\u0461\7\5"+
		"\2\2\u0461\u0462\5\u00a2R\2\u0462\u0463\7\3\2\2\u0463\u0464\5\u00a2R\2"+
		"\u0464\u0465\7\3\2\2\u0465\u0466\5\u00a2R\2\u0466\u0467\7\6\2\2\u0467"+
		"\u0468\b\\\1\2\u0468\u047b\3\2\2\2\u0469\u046a\78\2\2\u046a\u046b\7\t"+
		"\2\2\u046b\u046c\5\u00ba^\2\u046c\u046d\7\n\2\2\u046d\u046e\5\u00b8]\2"+
		"\u046e\u046f\b\\\1\2\u046f\u047b\3\2\2\2\u0470\u0471\7O\2\2\u0471\u0472"+
		"\7\t\2\2\u0472\u0473\5\u00ba^\2\u0473\u0474\7\n\2\2\u0474\u0475\5\u00b8"+
		"]\2\u0475\u0476\b\\\1\2\u0476\u047b\3\2\2\2\u0477\u0478\5\u00b8]\2\u0478"+
		"\u0479\b\\\1\2\u0479\u047b\3\2\2\2\u047a\u03e0\3\2\2\2\u047a\u03e6\3\2"+
		"\2\2\u047a\u03eb\3\2\2\2\u047a\u03f3\3\2\2\2\u047a\u03f9\3\2\2\2\u047a"+
		"\u03ff\3\2\2\2\u047a\u0405\3\2\2\2\u047a\u0407\3\2\2\2\u047a\u040d\3\2"+
		"\2\2\u047a\u0419\3\2\2\2\u047a\u0423\3\2\2\2\u047a\u0435\3\2\2\2\u047a"+
		"\u043b\3\2\2\2\u047a\u0441\3\2\2\2\u047a\u0447\3\2\2\2\u047a\u044d\3\2"+
		"\2\2\u047a\u0453\3\2\2\2\u047a\u0459\3\2\2\2\u047a\u045f\3\2\2\2\u047a"+
		"\u0469\3\2\2\2\u047a\u0470\3\2\2\2\u047a\u0477\3\2\2\2\u047b\u0492\3\2"+
		"\2\2\u047c\u047d\f\34\2\2\u047d\u047e\7\5\2\2\u047e\u047f\5\u00a4S\2\u047f"+
		"\u0480\7\6\2\2\u0480\u0481\b\\\1\2\u0481\u0491\3\2\2\2\u0482\u0483\f\33"+
		"\2\2\u0483\u0484\7\t\2\2\u0484\u0485\5\u00c2b\2\u0485\u0486\7\n\2\2\u0486"+
		"\u0487\b\\\1\2\u0487\u0491\3\2\2\2\u0488\u0489\f\32\2\2\u0489\u048a\7"+
		"\35\2\2\u048a\u048b\7V\2\2\u048b\u0491\b\\\1\2\u048c\u048d\f\31\2\2\u048d"+
		"\u048e\7\35\2\2\u048e\u048f\7Y\2\2\u048f\u0491\b\\\1\2\u0490\u047c\3\2"+
		"\2\2\u0490\u0482\3\2\2\2\u0490\u0488\3\2\2\2\u0490\u048c\3\2\2\2\u0491"+
		"\u0494\3\2\2\2\u0492\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u00b7\3\2"+
		"\2\2\u0494\u0492\3\2\2\2\u0495\u0496\7L\2\2\u0496\u04a7\b]\1\2\u0497\u0498"+
		"\7\65\2\2\u0498\u04a7\b]\1\2\u0499\u049a\7P\2\2\u049a\u04a7\b]\1\2\u049b"+
		"\u049c\7Y\2\2\u049c\u04a7\b]\1\2\u049d\u049e\7X\2\2\u049e\u04a7\b]\1\2"+
		"\u049f\u04a0\7V\2\2\u04a0\u04a7\b]\1\2\u04a1\u04a2\7\5\2\2\u04a2\u04a3"+
		"\5\u00a2R\2\u04a3\u04a4\7\6\2\2\u04a4\u04a5\b]\1\2\u04a5\u04a7\3\2\2\2"+
		"\u04a6\u0495\3\2\2\2\u04a6\u0497\3\2\2\2\u04a6\u0499\3\2\2\2\u04a6\u049b"+
		"\3\2\2\2\u04a6\u049d\3\2\2\2\u04a6\u049f\3\2\2\2\u04a6\u04a1\3\2\2\2\u04a7"+
		"\u00b9\3\2\2\2\u04a8\u04a9\7-\2\2\u04a9\u04c2\b^\1\2\u04aa\u04ab\7\67"+
		"\2\2\u04ab\u04ac\7\5\2\2\u04ac\u04ad\5\u00c2b\2\u04ad\u04ae\7\6\2\2\u04ae"+
		"\u04af\7\r\2\2\u04af\u04b0\5\u00ba^\2\u04b0\u04b1\b^\1\2\u04b1\u04c2\3"+
		"\2\2\2\u04b2\u04b3\79\2\2\u04b3\u04b4\5j\66\2\u04b4\u04b5\7\35\2\2\u04b5"+
		"\u04b6\5\u00ba^\2\u04b6\u04b7\b^\1\2\u04b7\u04c2\3\2\2\2\u04b8\u04b9\7"+
		"S\2\2\u04b9\u04ba\7V\2\2\u04ba\u04bb\7\35\2\2\u04bb\u04bc\5\u00ba^\2\u04bc"+
		"\u04bd\b^\1\2\u04bd\u04c2\3\2\2\2\u04be\u04bf\5\u00bc_\2\u04bf\u04c0\b"+
		"^\1\2\u04c0\u04c2\3\2\2\2\u04c1\u04a8\3\2\2\2\u04c1\u04aa\3\2\2\2\u04c1"+
		"\u04b2\3\2\2\2\u04c1\u04b8\3\2\2\2\u04c1\u04be\3\2\2\2\u04c2\u00bb\3\2"+
		"\2\2\u04c3\u04c4\5\u00be`\2\u04c4\u04c5\7\31\2\2\u04c5\u04c6\5\u00be`"+
		"\2\u04c6\u04c7\b_\1\2\u04c7\u04cc\3\2\2\2\u04c8\u04c9\5\u00be`\2\u04c9"+
		"\u04ca\b_\1\2\u04ca\u04cc\3\2\2\2\u04cb\u04c3\3\2\2\2\u04cb\u04c8\3\2"+
		"\2\2\u04cc\u00bd\3\2\2\2\u04cd\u04ce\7\7\2\2\u04ce\u04cf\5\u00c2b\2\u04cf"+
		"\u04d0\7\b\2\2\u04d0\u04d1\b`\1\2\u04d1\u04e5\3\2\2\2\u04d2\u04d3\7\7"+
		"\2\2\u04d3\u04d4\5\u00caf\2\u04d4\u04d5\7\b\2\2\u04d5\u04d6\b`\1\2\u04d6"+
		"\u04e5\3\2\2\2\u04d7\u04d8\7\20\2\2\u04d8\u04d9\5\u00c6d\2\u04d9\u04da"+
		"\7\21\2\2\u04da\u04db\b`\1\2\u04db\u04e5\3\2\2\2\u04dc\u04dd\7\t\2\2\u04dd"+
		"\u04de\5\u00ba^\2\u04de\u04df\7\n\2\2\u04df\u04e0\b`\1\2\u04e0\u04e5\3"+
		"\2\2\2\u04e1\u04e2\5\u00c0a\2\u04e2\u04e3\b`\1\2\u04e3\u04e5\3\2\2\2\u04e4"+
		"\u04cd\3\2\2\2\u04e4\u04d2\3\2\2\2\u04e4\u04d7\3\2\2\2\u04e4\u04dc\3\2"+
		"\2\2\u04e4\u04e1\3\2\2\2\u04e5\u00bf\3\2\2\2\u04e6\u04e7\7&\2\2\u04e7"+
		"\u04fc\ba\1\2\u04e8\u04e9\7(\2\2\u04e9\u04fc\ba\1\2\u04ea\u04eb\7*\2\2"+
		"\u04eb\u04fc\ba\1\2\u04ec\u04ed\7)\2\2\u04ed\u04fc\ba\1\2\u04ee\u04ef"+
		"\7\'\2\2\u04ef\u04fc\ba\1\2\u04f0\u04f1\7%\2\2\u04f1\u04f2\5\u00be`\2"+
		"\u04f2\u04f3\ba\1\2\u04f3\u04fc\3\2\2\2\u04f4\u04f5\7V\2\2\u04f5\u04fc"+
		"\ba\1\2\u04f6\u04f7\7\5\2\2\u04f7\u04f8\5\u00ba^\2\u04f8\u04f9\7\6\2\2"+
		"\u04f9\u04fa\ba\1\2\u04fa\u04fc\3\2\2\2\u04fb\u04e6\3\2\2\2\u04fb\u04e8"+
		"\3\2\2\2\u04fb\u04ea\3\2\2\2\u04fb\u04ec\3\2\2\2\u04fb\u04ee\3\2\2\2\u04fb"+
		"\u04f0\3\2\2\2\u04fb\u04f4\3\2\2\2\u04fb\u04f6\3\2\2\2\u04fc\u00c1\3\2"+
		"\2\2\u04fd\u0507\bb\1\2\u04fe\u04ff\5\u00ba^\2\u04ff\u0500\bb\1\2\u0500"+
		"\u0507\3\2\2\2\u0501\u0502\5\u00ba^\2\u0502\u0503\7\3\2\2\u0503\u0504"+
		"\5\u00c2b\2\u0504\u0505\bb\1\2\u0505\u0507\3\2\2\2\u0506\u04fd\3\2\2\2"+
		"\u0506\u04fe\3\2\2\2\u0506\u0501\3\2\2\2\u0507\u00c3\3\2\2\2\u0508\u0509"+
		"\7V\2\2\u0509\u050a\5\u0090I\2\u050a\u050b\bc\1\2\u050b\u00c5\3\2\2\2"+
		"\u050c\u0516\bd\1\2\u050d\u050e\5\u00c4c\2\u050e\u050f\bd\1\2\u050f\u0516"+
		"\3\2\2\2\u0510\u0511\5\u00c4c\2\u0511\u0512\7\3\2\2\u0512\u0513\5\u00c6"+
		"d\2\u0513\u0514\bd\1\2\u0514\u0516\3\2\2\2\u0515\u050c\3\2\2\2\u0515\u050d"+
		"\3\2\2\2\u0515\u0510\3\2\2\2\u0516\u00c7\3\2\2\2\u0517\u0518\7V\2\2\u0518"+
		"\u0519\7\f\2\2\u0519\u051a\5\u00ba^\2\u051a\u051b\be\1\2\u051b\u00c9\3"+
		"\2\2\2\u051c\u051d\5\u00c8e\2\u051d\u051e\bf\1\2\u051e\u0525\3\2\2\2\u051f"+
		"\u0520\5\u00c8e\2\u0520\u0521\7\3\2\2\u0521\u0522\5\u00caf\2\u0522\u0523"+
		"\bf\1\2\u0523\u0525\3\2\2\2\u0524\u051c\3\2\2\2\u0524\u051f\3\2\2\2\u0525"+
		"\u00cb\3\2\2\2\u0526\u0527\5\u00a2R\2\u0527\u0528\7\f\2\2\u0528\u0529"+
		"\5\u00ba^\2\u0529\u052a\bg\1\2\u052a\u00cd\3\2\2\2.\u01a7\u01bb\u01c7"+
		"\u01ff\u020a\u021a\u0229\u023a\u0241\u0248\u0255\u0265\u026c\u0273\u027a"+
		"\u02c2\u02cf\u02d1\u02dd\u02ec\u02fb\u031c\u0327\u0339\u0348\u036b\u0376"+
		"\u0398\u03b4\u03b6\u03cc\u03ce\u03de\u047a\u0490\u0492\u04a6\u04c1\u04cb"+
		"\u04e4\u04fb\u0506\u0515\u0524";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}