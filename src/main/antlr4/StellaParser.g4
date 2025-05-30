// -*- Java -*- File generated by the BNF Converter (bnfc 2.9.6).

// Parser definition for use with ANTLRv4
parser grammar StellaParser;

options {
  tokenVocab = StellaLexer;
}


start_Program returns [ ru.itmo.stella.lang.Absyn.Program result ]
  : x=program EOF
    { $result = $x.result; }
  ;
start_ListStellaIdent returns [ ru.itmo.stella.lang.Absyn.ListStellaIdent result ]
  : x=listStellaIdent EOF
    { $result = $x.result; }
  ;
start_LanguageDecl returns [ ru.itmo.stella.lang.Absyn.LanguageDecl result ]
  : x=languageDecl EOF
    { $result = $x.result; }
  ;
start_Extension returns [ ru.itmo.stella.lang.Absyn.Extension result ]
  : x=extension EOF
    { $result = $x.result; }
  ;
start_ListExtensionName returns [ ru.itmo.stella.lang.Absyn.ListExtensionName result ]
  : x=listExtensionName EOF
    { $result = $x.result; }
  ;
start_ListExtension returns [ ru.itmo.stella.lang.Absyn.ListExtension result ]
  : x=listExtension EOF
    { $result = $x.result; }
  ;
start_Decl returns [ ru.itmo.stella.lang.Absyn.Decl result ]
  : x=decl EOF
    { $result = $x.result; }
  ;
start_ListDecl returns [ ru.itmo.stella.lang.Absyn.ListDecl result ]
  : x=listDecl EOF
    { $result = $x.result; }
  ;
start_LocalDecl returns [ ru.itmo.stella.lang.Absyn.LocalDecl result ]
  : x=localDecl EOF
    { $result = $x.result; }
  ;
start_ListLocalDecl returns [ ru.itmo.stella.lang.Absyn.ListLocalDecl result ]
  : x=listLocalDecl EOF
    { $result = $x.result; }
  ;
start_Annotation returns [ ru.itmo.stella.lang.Absyn.Annotation result ]
  : x=annotation EOF
    { $result = $x.result; }
  ;
start_ListAnnotation returns [ ru.itmo.stella.lang.Absyn.ListAnnotation result ]
  : x=listAnnotation EOF
    { $result = $x.result; }
  ;
start_ParamDecl returns [ ru.itmo.stella.lang.Absyn.ParamDecl result ]
  : x=paramDecl EOF
    { $result = $x.result; }
  ;
start_ListParamDecl returns [ ru.itmo.stella.lang.Absyn.ListParamDecl result ]
  : x=listParamDecl EOF
    { $result = $x.result; }
  ;
start_ReturnType returns [ ru.itmo.stella.lang.Absyn.ReturnType result ]
  : x=returnType EOF
    { $result = $x.result; }
  ;
start_ThrowType returns [ ru.itmo.stella.lang.Absyn.ThrowType result ]
  : x=throwType EOF
    { $result = $x.result; }
  ;
start_Type9 returns [ ru.itmo.stella.lang.Absyn.Type result ]
  : x=type9 EOF
    { $result = $x.result; }
  ;
start_ListType9 returns [ ru.itmo.stella.lang.Absyn.ListType result ]
  : x=listType9 EOF
    { $result = $x.result; }
  ;
start_MatchCase returns [ ru.itmo.stella.lang.Absyn.MatchCase result ]
  : x=matchCase EOF
    { $result = $x.result; }
  ;
start_ListMatchCase returns [ ru.itmo.stella.lang.Absyn.ListMatchCase result ]
  : x=listMatchCase EOF
    { $result = $x.result; }
  ;
start_OptionalTyping returns [ ru.itmo.stella.lang.Absyn.OptionalTyping result ]
  : x=optionalTyping EOF
    { $result = $x.result; }
  ;
start_PatternData returns [ ru.itmo.stella.lang.Absyn.PatternData result ]
  : x=patternData EOF
    { $result = $x.result; }
  ;
start_ExprData returns [ ru.itmo.stella.lang.Absyn.ExprData result ]
  : x=exprData EOF
    { $result = $x.result; }
  ;
start_Pattern returns [ ru.itmo.stella.lang.Absyn.Pattern result ]
  : x=pattern EOF
    { $result = $x.result; }
  ;
start_ListPattern returns [ ru.itmo.stella.lang.Absyn.ListPattern result ]
  : x=listPattern EOF
    { $result = $x.result; }
  ;
start_LabelledPattern returns [ ru.itmo.stella.lang.Absyn.LabelledPattern result ]
  : x=labelledPattern EOF
    { $result = $x.result; }
  ;
start_ListLabelledPattern returns [ ru.itmo.stella.lang.Absyn.ListLabelledPattern result ]
  : x=listLabelledPattern EOF
    { $result = $x.result; }
  ;
start_Binding returns [ ru.itmo.stella.lang.Absyn.Binding result ]
  : x=binding EOF
    { $result = $x.result; }
  ;
start_ListBinding returns [ ru.itmo.stella.lang.Absyn.ListBinding result ]
  : x=listBinding EOF
    { $result = $x.result; }
  ;
start_Expr returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : x=expr EOF
    { $result = $x.result; }
  ;
start_ListExpr returns [ ru.itmo.stella.lang.Absyn.ListExpr result ]
  : x=listExpr EOF
    { $result = $x.result; }
  ;
start_Expr1 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : x=expr1 EOF
    { $result = $x.result; }
  ;
start_PatternBinding returns [ ru.itmo.stella.lang.Absyn.PatternBinding result ]
  : x=patternBinding EOF
    { $result = $x.result; }
  ;
start_ListPatternBinding returns [ ru.itmo.stella.lang.Absyn.ListPatternBinding result ]
  : x=listPatternBinding EOF
    { $result = $x.result; }
  ;
start_Expr2 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : x=expr2 EOF
    { $result = $x.result; }
  ;
start_ListExpr2 returns [ ru.itmo.stella.lang.Absyn.ListExpr result ]
  : x=listExpr2 EOF
    { $result = $x.result; }
  ;
start_Expr3 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : x=expr3 EOF
    { $result = $x.result; }
  ;
start_Expr4 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : x=expr4 EOF
    { $result = $x.result; }
  ;
start_Expr5 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : x=expr5 EOF
    { $result = $x.result; }
  ;
start_Expr6 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : x=expr6 EOF
    { $result = $x.result; }
  ;
start_Expr7 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : x=expr7 EOF
    { $result = $x.result; }
  ;
start_Type returns [ ru.itmo.stella.lang.Absyn.Type result ]
  : x=type EOF
    { $result = $x.result; }
  ;
start_Type1 returns [ ru.itmo.stella.lang.Absyn.Type result ]
  : x=type1 EOF
    { $result = $x.result; }
  ;
start_Type2 returns [ ru.itmo.stella.lang.Absyn.Type result ]
  : x=type2 EOF
    { $result = $x.result; }
  ;
start_Type3 returns [ ru.itmo.stella.lang.Absyn.Type result ]
  : x=type3 EOF
    { $result = $x.result; }
  ;
start_ListType returns [ ru.itmo.stella.lang.Absyn.ListType result ]
  : x=listType EOF
    { $result = $x.result; }
  ;
start_VariantFieldType returns [ ru.itmo.stella.lang.Absyn.VariantFieldType result ]
  : x=variantFieldType EOF
    { $result = $x.result; }
  ;
start_ListVariantFieldType returns [ ru.itmo.stella.lang.Absyn.ListVariantFieldType result ]
  : x=listVariantFieldType EOF
    { $result = $x.result; }
  ;
start_RecordFieldType returns [ ru.itmo.stella.lang.Absyn.RecordFieldType result ]
  : x=recordFieldType EOF
    { $result = $x.result; }
  ;
start_ListRecordFieldType returns [ ru.itmo.stella.lang.Absyn.ListRecordFieldType result ]
  : x=listRecordFieldType EOF
    { $result = $x.result; }
  ;
start_Typing returns [ ru.itmo.stella.lang.Absyn.Typing result ]
  : x=typing EOF
    { $result = $x.result; }
  ;

program returns [ ru.itmo.stella.lang.Absyn.Program result ]
  : p_1_1=languageDecl p_1_2=listExtension p_1_3=listDecl
    { $result = new ru.itmo.stella.lang.Absyn.AProgram($p_1_1.result,$p_1_2.result,$p_1_3.result); }
  ;
listStellaIdent returns [ ru.itmo.stella.lang.Absyn.ListStellaIdent result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.ListStellaIdent(); }
  | p_2_1=StellaIdent
    { $result = new ru.itmo.stella.lang.Absyn.ListStellaIdent(); $result.addLast($p_2_1.getText()); }
  | p_3_1=StellaIdent Surrogate_id_SYMB_0 p_3_3=listStellaIdent
    { $result = $p_3_3.result; $result.addFirst($p_3_1.getText()); }
  ;
languageDecl returns [ ru.itmo.stella.lang.Absyn.LanguageDecl result ]
  : Surrogate_id_SYMB_61 Surrogate_id_SYMB_46 Surrogate_id_SYMB_1
    { $result = new ru.itmo.stella.lang.Absyn.LanguageCore(); }
  ;
extension returns [ ru.itmo.stella.lang.Absyn.Extension result ]
  : Surrogate_id_SYMB_49 Surrogate_id_SYMB_79 p_1_3=listExtensionName
    { $result = new ru.itmo.stella.lang.Absyn.AnExtension($p_1_3.result); }
  ;
listExtensionName returns [ ru.itmo.stella.lang.Absyn.ListExtensionName result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.ListExtensionName(); }
  | p_2_1=ExtensionName
    { $result = new ru.itmo.stella.lang.Absyn.ListExtensionName(); $result.addLast($p_2_1.getText()); }
  | p_3_1=ExtensionName Surrogate_id_SYMB_0 p_3_3=listExtensionName
    { $result = $p_3_3.result; $result.addFirst($p_3_1.getText()); }
  ;
listExtension returns [ ru.itmo.stella.lang.Absyn.ListExtension result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.ListExtension(); }
  | p_2_1=listExtension p_2_2=extension Surrogate_id_SYMB_1
    { $result = $p_2_1.result; $result.addLast($p_2_2.result); }
  ;
decl returns [ ru.itmo.stella.lang.Absyn.Decl result ]
  : p_1_1=listAnnotation Surrogate_id_SYMB_52 p_1_3=StellaIdent Surrogate_id_SYMB_2 p_1_5=listParamDecl Surrogate_id_SYMB_3 p_1_7=returnType p_1_8=throwType Surrogate_id_SYMB_4 p_1_10=listDecl Surrogate_id_SYMB_68 p_1_12=expr Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.DeclFun($p_1_1.result,$p_1_3.getText(),$p_1_5.result,$p_1_7.result,$p_1_8.result,$p_1_10.result,$p_1_12.result); }
  | p_2_1=listAnnotation Surrogate_id_SYMB_55 Surrogate_id_SYMB_52 p_2_4=StellaIdent Surrogate_id_SYMB_6 p_2_6=listStellaIdent Surrogate_id_SYMB_7 Surrogate_id_SYMB_2 p_2_9=listParamDecl Surrogate_id_SYMB_3 p_2_11=returnType p_2_12=throwType Surrogate_id_SYMB_4 p_2_14=listDecl Surrogate_id_SYMB_68 p_2_16=expr Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.DeclFunGeneric($p_2_1.result,$p_2_4.getText(),$p_2_6.result,$p_2_9.result,$p_2_11.result,$p_2_12.result,$p_2_14.result,$p_2_16.result); }
  | Surrogate_id_SYMB_75 p_3_2=StellaIdent Surrogate_id_SYMB_8 p_3_4=type
    { $result = new ru.itmo.stella.lang.Absyn.DeclTypeAlias($p_3_2.getText(),$p_3_4.result); }
  | Surrogate_id_SYMB_48 Surrogate_id_SYMB_75 Surrogate_id_SYMB_8 p_4_4=type
    { $result = new ru.itmo.stella.lang.Absyn.DeclExceptionType($p_4_4.result); }
  | Surrogate_id_SYMB_48 Surrogate_id_SYMB_78 p_5_3=StellaIdent Surrogate_id_SYMB_9 p_5_5=type
    { $result = new ru.itmo.stella.lang.Absyn.DeclExceptionVariant($p_5_3.getText(),$p_5_5.result); }
  ;
listDecl returns [ ru.itmo.stella.lang.Absyn.ListDecl result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.ListDecl(); }
  | p_2_1=listDecl p_2_2=decl
    { $result = $p_2_1.result; $result.addLast($p_2_2.result); }
  ;
localDecl returns [ ru.itmo.stella.lang.Absyn.LocalDecl result ]
  : p_1_1=decl
    { $result = new ru.itmo.stella.lang.Absyn.ALocalDecl($p_1_1.result); }
  ;
listLocalDecl returns [ ru.itmo.stella.lang.Absyn.ListLocalDecl result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.ListLocalDecl(); }
  | p_2_1=listLocalDecl p_2_2=localDecl Surrogate_id_SYMB_1
    { $result = $p_2_1.result; $result.addLast($p_2_2.result); }
  ;
annotation returns [ ru.itmo.stella.lang.Absyn.Annotation result ]
  : Surrogate_id_SYMB_59
    { $result = new ru.itmo.stella.lang.Absyn.InlineAnnotation(); }
  ;
listAnnotation returns [ ru.itmo.stella.lang.Absyn.ListAnnotation result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.ListAnnotation(); }
  | p_2_1=listAnnotation p_2_2=annotation
    { $result = $p_2_1.result; $result.addLast($p_2_2.result); }
  ;
paramDecl returns [ ru.itmo.stella.lang.Absyn.ParamDecl result ]
  : p_1_1=StellaIdent Surrogate_id_SYMB_9 p_1_3=type
    { $result = new ru.itmo.stella.lang.Absyn.AParamDecl($p_1_1.getText(),$p_1_3.result); }
  ;
listParamDecl returns [ ru.itmo.stella.lang.Absyn.ListParamDecl result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.ListParamDecl(); }
  | p_2_1=paramDecl
    { $result = new ru.itmo.stella.lang.Absyn.ListParamDecl(); $result.addLast($p_2_1.result); }
  | p_3_1=paramDecl Surrogate_id_SYMB_0 p_3_3=listParamDecl
    { $result = $p_3_3.result; $result.addFirst($p_3_1.result); }
  ;
returnType returns [ ru.itmo.stella.lang.Absyn.ReturnType result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.NoReturnType(); }
  | Surrogate_id_SYMB_10 p_2_2=type
    { $result = new ru.itmo.stella.lang.Absyn.SomeReturnType($p_2_2.result); }
  ;
throwType returns [ ru.itmo.stella.lang.Absyn.ThrowType result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.NoThrowType(); }
  | Surrogate_id_SYMB_72 p_2_2=listType9
    { $result = new ru.itmo.stella.lang.Absyn.SomeThrowType($p_2_2.result); }
  ;
type9 returns [ ru.itmo.stella.lang.Absyn.Type result ]
  : p_1_1=type
    { $result = $p_1_1.result; }
  ;
listType9 returns [ ru.itmo.stella.lang.Absyn.ListType result ]
  : p_1_1=type9
    { $result = new ru.itmo.stella.lang.Absyn.ListType(); $result.addLast($p_1_1.result); }
  | p_2_1=type9 Surrogate_id_SYMB_0 p_2_3=listType9
    { $result = $p_2_3.result; $result.addFirst($p_2_1.result); }
  ;
matchCase returns [ ru.itmo.stella.lang.Absyn.MatchCase result ]
  : p_1_1=pattern Surrogate_id_SYMB_11 p_1_3=expr
    { $result = new ru.itmo.stella.lang.Absyn.AMatchCase($p_1_1.result,$p_1_3.result); }
  ;
listMatchCase returns [ ru.itmo.stella.lang.Absyn.ListMatchCase result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.ListMatchCase(); }
  | p_2_1=matchCase
    { $result = new ru.itmo.stella.lang.Absyn.ListMatchCase(); $result.addLast($p_2_1.result); }
  | p_3_1=matchCase Surrogate_id_SYMB_12 p_3_3=listMatchCase
    { $result = $p_3_3.result; $result.addFirst($p_3_1.result); }
  ;
optionalTyping returns [ ru.itmo.stella.lang.Absyn.OptionalTyping result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.NoTyping(); }
  | Surrogate_id_SYMB_9 p_2_2=type
    { $result = new ru.itmo.stella.lang.Absyn.SomeTyping($p_2_2.result); }
  ;
patternData returns [ ru.itmo.stella.lang.Absyn.PatternData result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.NoPatternData(); }
  | Surrogate_id_SYMB_8 p_2_2=pattern
    { $result = new ru.itmo.stella.lang.Absyn.SomePatternData($p_2_2.result); }
  ;
exprData returns [ ru.itmo.stella.lang.Absyn.ExprData result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.NoExprData(); }
  | Surrogate_id_SYMB_8 p_2_2=expr
    { $result = new ru.itmo.stella.lang.Absyn.SomeExprData($p_2_2.result); }
  ;
pattern returns [ ru.itmo.stella.lang.Absyn.Pattern result ]
  : p_1_1=pattern Surrogate_id_SYMB_43 Surrogate_id_SYMB_41 p_1_4=type
    { $result = new ru.itmo.stella.lang.Absyn.PatternCastAs($p_1_1.result,$p_1_4.result); }
  | p_2_1=pattern Surrogate_id_SYMB_41 p_2_3=type
    { $result = new ru.itmo.stella.lang.Absyn.PatternAsc($p_2_1.result,$p_2_3.result); }
  | Surrogate_id_SYMB_13 p_3_2=StellaIdent p_3_3=patternData Surrogate_id_SYMB_14
    { $result = new ru.itmo.stella.lang.Absyn.PatternVariant($p_3_2.getText(),$p_3_3.result); }
  | Surrogate_id_SYMB_58 Surrogate_id_SYMB_2 p_4_3=pattern Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.PatternInl($p_4_3.result); }
  | Surrogate_id_SYMB_60 Surrogate_id_SYMB_2 p_5_3=pattern Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.PatternInr($p_5_3.result); }
  | Surrogate_id_SYMB_4 p_6_2=listPattern Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.PatternTuple($p_6_2.result); }
  | Surrogate_id_SYMB_4 p_7_2=listLabelledPattern Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.PatternRecord($p_7_2.result); }
  | Surrogate_id_SYMB_6 p_8_2=listPattern Surrogate_id_SYMB_7
    { $result = new ru.itmo.stella.lang.Absyn.PatternList($p_8_2.result); }
  | Surrogate_id_SYMB_45 Surrogate_id_SYMB_2 p_9_3=pattern Surrogate_id_SYMB_0 p_9_5=pattern Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.PatternCons($p_9_3.result,$p_9_5.result); }
  | Surrogate_id_SYMB_2 p_10_2=pattern Surrogate_id_SYMB_0 p_10_4=pattern Surrogate_id_SYMB_3
    { $result = ru.itmo.stella.lang.AbsynDef.patternCons($p_10_2.result,$p_10_4.result); }
  | Surrogate_id_SYMB_50
    { $result = new ru.itmo.stella.lang.Absyn.PatternFalse(); }
  | Surrogate_id_SYMB_73
    { $result = new ru.itmo.stella.lang.Absyn.PatternTrue(); }
  | Surrogate_id_SYMB_77
    { $result = new ru.itmo.stella.lang.Absyn.PatternUnit(); }
  | p_14_1=INTEGER
    { $result = new ru.itmo.stella.lang.Absyn.PatternInt(Integer.parseInt($p_14_1.getText())); }
  | Surrogate_id_SYMB_69 Surrogate_id_SYMB_2 p_15_3=pattern Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.PatternSucc($p_15_3.result); }
  | p_16_1=StellaIdent
    { $result = new ru.itmo.stella.lang.Absyn.PatternVar($p_16_1.getText()); }
  | Surrogate_id_SYMB_2 p_17_2=pattern Surrogate_id_SYMB_3
    { $result = $p_17_2.result; }
  ;
listPattern returns [ ru.itmo.stella.lang.Absyn.ListPattern result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.ListPattern(); }
  | p_2_1=pattern
    { $result = new ru.itmo.stella.lang.Absyn.ListPattern(); $result.addLast($p_2_1.result); }
  | p_3_1=pattern Surrogate_id_SYMB_0 p_3_3=listPattern
    { $result = $p_3_3.result; $result.addFirst($p_3_1.result); }
  ;
labelledPattern returns [ ru.itmo.stella.lang.Absyn.LabelledPattern result ]
  : p_1_1=StellaIdent Surrogate_id_SYMB_8 p_1_3=pattern
    { $result = new ru.itmo.stella.lang.Absyn.ALabelledPattern($p_1_1.getText(),$p_1_3.result); }
  ;
listLabelledPattern returns [ ru.itmo.stella.lang.Absyn.ListLabelledPattern result ]
  : p_1_1=labelledPattern
    { $result = new ru.itmo.stella.lang.Absyn.ListLabelledPattern(); $result.addLast($p_1_1.result); }
  | p_2_1=labelledPattern Surrogate_id_SYMB_0 p_2_3=listLabelledPattern
    { $result = $p_2_3.result; $result.addFirst($p_2_1.result); }
  ;
binding returns [ ru.itmo.stella.lang.Absyn.Binding result ]
  : p_1_1=StellaIdent Surrogate_id_SYMB_8 p_1_3=expr
    { $result = new ru.itmo.stella.lang.Absyn.ABinding($p_1_1.getText(),$p_1_3.result); }
  ;
listBinding returns [ ru.itmo.stella.lang.Absyn.ListBinding result ]
  : p_1_1=binding
    { $result = new ru.itmo.stella.lang.Absyn.ListBinding(); $result.addLast($p_1_1.result); }
  | p_2_1=binding Surrogate_id_SYMB_0 p_2_3=listBinding
    { $result = $p_2_3.result; $result.addFirst($p_2_1.result); }
  ;
expr returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : p_1_1=expr1 Surrogate_id_SYMB_1 p_1_3=expr
    { $result = new ru.itmo.stella.lang.Absyn.Sequence($p_1_1.result,$p_1_3.result); }
  | p_2_1=expr1 Surrogate_id_SYMB_1
    { $result = $p_2_1.result; }
  | Surrogate_id_SYMB_62 p_3_2=listPatternBinding Surrogate_id_SYMB_57 p_3_4=expr
    { $result = new ru.itmo.stella.lang.Absyn.Let($p_3_2.result,$p_3_4.result); }
  | Surrogate_id_SYMB_63 p_4_2=listPatternBinding Surrogate_id_SYMB_57 p_4_4=expr
    { $result = new ru.itmo.stella.lang.Absyn.LetRec($p_4_2.result,$p_4_4.result); }
  | Surrogate_id_SYMB_55 Surrogate_id_SYMB_6 p_5_3=listStellaIdent Surrogate_id_SYMB_7 p_5_5=expr
    { $result = new ru.itmo.stella.lang.Absyn.TypeAbstraction($p_5_3.result,$p_5_5.result); }
  | p_6_1=expr1
    { $result = $p_6_1.result; }
  ;
listExpr returns [ ru.itmo.stella.lang.Absyn.ListExpr result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.ListExpr(); }
  | p_2_1=expr
    { $result = new ru.itmo.stella.lang.Absyn.ListExpr(); $result.addLast($p_2_1.result); }
  | p_3_1=expr Surrogate_id_SYMB_0 p_3_3=listExpr
    { $result = $p_3_3.result; $result.addFirst($p_3_1.result); }
  ;
expr1 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : p_1_1=expr2 Surrogate_id_SYMB_15 p_1_3=expr1
    { $result = new ru.itmo.stella.lang.Absyn.Assign($p_1_1.result,$p_1_3.result); }
  | Surrogate_id_SYMB_56 p_2_2=expr1 Surrogate_id_SYMB_70 p_2_4=expr1 Surrogate_id_SYMB_47 p_2_6=expr1
    { $result = new ru.itmo.stella.lang.Absyn.If($p_2_2.result,$p_2_4.result,$p_2_6.result); }
  | p_3_1=expr2
    { $result = $p_3_1.result; }
  ;
patternBinding returns [ ru.itmo.stella.lang.Absyn.PatternBinding result ]
  : p_1_1=pattern Surrogate_id_SYMB_8 p_1_3=expr
    { $result = new ru.itmo.stella.lang.Absyn.APatternBinding($p_1_1.result,$p_1_3.result); }
  ;
listPatternBinding returns [ ru.itmo.stella.lang.Absyn.ListPatternBinding result ]
  : p_1_1=patternBinding
    { $result = new ru.itmo.stella.lang.Absyn.ListPatternBinding(); $result.addLast($p_1_1.result); }
  | p_2_1=patternBinding Surrogate_id_SYMB_0 p_2_3=listPatternBinding
    { $result = $p_2_3.result; $result.addFirst($p_2_1.result); }
  ;
expr2 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : p_1_1=expr3 Surrogate_id_SYMB_16 p_1_3=expr3
    { $result = new ru.itmo.stella.lang.Absyn.LessThan($p_1_1.result,$p_1_3.result); }
  | p_2_1=expr3 Surrogate_id_SYMB_17 p_2_3=expr3
    { $result = new ru.itmo.stella.lang.Absyn.LessThanOrEqual($p_2_1.result,$p_2_3.result); }
  | p_3_1=expr3 Surrogate_id_SYMB_18 p_3_3=expr3
    { $result = new ru.itmo.stella.lang.Absyn.GreaterThan($p_3_1.result,$p_3_3.result); }
  | p_4_1=expr3 Surrogate_id_SYMB_19 p_4_3=expr3
    { $result = new ru.itmo.stella.lang.Absyn.GreaterThanOrEqual($p_4_1.result,$p_4_3.result); }
  | p_5_1=expr3 Surrogate_id_SYMB_20 p_5_3=expr3
    { $result = new ru.itmo.stella.lang.Absyn.Equal($p_5_1.result,$p_5_3.result); }
  | p_6_1=expr3 Surrogate_id_SYMB_21 p_6_3=expr3
    { $result = new ru.itmo.stella.lang.Absyn.NotEqual($p_6_1.result,$p_6_3.result); }
  | p_7_1=expr3
    { $result = $p_7_1.result; }
  ;
listExpr2 returns [ ru.itmo.stella.lang.Absyn.ListExpr result ]
  : p_1_1=expr2 Surrogate_id_SYMB_1
    { $result = new ru.itmo.stella.lang.Absyn.ListExpr(); $result.addLast($p_1_1.result); }
  | p_2_1=expr2 Surrogate_id_SYMB_1 p_2_3=listExpr2
    { $result = $p_2_3.result; $result.addFirst($p_2_1.result); }
  ;
expr3 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : p_1_1=expr3 Surrogate_id_SYMB_41 p_1_3=type2
    { $result = new ru.itmo.stella.lang.Absyn.TypeAsc($p_1_1.result,$p_1_3.result); }
  | p_2_1=expr3 Surrogate_id_SYMB_43 Surrogate_id_SYMB_41 p_2_4=type2
    { $result = new ru.itmo.stella.lang.Absyn.TypeCast($p_2_1.result,$p_2_4.result); }
  | Surrogate_id_SYMB_52 Surrogate_id_SYMB_2 p_3_3=listParamDecl Surrogate_id_SYMB_3 Surrogate_id_SYMB_4 Surrogate_id_SYMB_68 p_3_7=expr Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.Abstraction($p_3_3.result,$p_3_7.result); }
  | Surrogate_id_SYMB_13 p_4_2=StellaIdent p_4_3=exprData Surrogate_id_SYMB_14
    { $result = new ru.itmo.stella.lang.Absyn.Variant($p_4_2.getText(),$p_4_3.result); }
  | Surrogate_id_SYMB_64 p_5_2=expr2 Surrogate_id_SYMB_4 p_5_4=listMatchCase Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.Match($p_5_2.result,$p_5_4.result); }
  | Surrogate_id_SYMB_6 p_6_2=listExpr Surrogate_id_SYMB_7
    { $result = new ru.itmo.stella.lang.Absyn.List($p_6_2.result); }
  | p_7_1=expr3 Surrogate_id_SYMB_22 p_7_3=expr4
    { $result = new ru.itmo.stella.lang.Absyn.Add($p_7_1.result,$p_7_3.result); }
  | p_8_1=expr3 Surrogate_id_SYMB_23 p_8_3=expr4
    { $result = new ru.itmo.stella.lang.Absyn.Subtract($p_8_1.result,$p_8_3.result); }
  | p_9_1=expr3 Surrogate_id_SYMB_67 p_9_3=expr4
    { $result = new ru.itmo.stella.lang.Absyn.LogicOr($p_9_1.result,$p_9_3.result); }
  | p_10_1=expr4
    { $result = $p_10_1.result; }
  ;
expr4 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : p_1_1=expr4 Surrogate_id_SYMB_24 p_1_3=expr5
    { $result = new ru.itmo.stella.lang.Absyn.Multiply($p_1_1.result,$p_1_3.result); }
  | p_2_1=expr4 Surrogate_id_SYMB_25 p_2_3=expr5
    { $result = new ru.itmo.stella.lang.Absyn.Divide($p_2_1.result,$p_2_3.result); }
  | p_3_1=expr4 Surrogate_id_SYMB_40 p_3_3=expr5
    { $result = new ru.itmo.stella.lang.Absyn.LogicAnd($p_3_1.result,$p_3_3.result); }
  | p_4_1=expr5
    { $result = $p_4_1.result; }
  ;
expr5 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : Surrogate_id_SYMB_65 Surrogate_id_SYMB_2 p_1_3=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.Ref($p_1_3.result); }
  | Surrogate_id_SYMB_24 p_2_2=expr5
    { $result = new ru.itmo.stella.lang.Absyn.Deref($p_2_2.result); }
  | p_3_1=expr6
    { $result = $p_3_1.result; }
  ;
expr6 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : p_1_1=expr6 Surrogate_id_SYMB_2 p_1_3=listExpr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.Application($p_1_1.result,$p_1_3.result); }
  | p_2_1=expr6 Surrogate_id_SYMB_6 p_2_3=listType Surrogate_id_SYMB_7
    { $result = new ru.itmo.stella.lang.Absyn.TypeApplication($p_2_1.result,$p_2_3.result); }
  | p_3_1=expr6 Surrogate_id_SYMB_26 p_3_3=StellaIdent
    { $result = new ru.itmo.stella.lang.Absyn.DotRecord($p_3_1.result,$p_3_3.getText()); }
  | p_4_1=expr6 Surrogate_id_SYMB_26 p_4_3=INTEGER
    { $result = new ru.itmo.stella.lang.Absyn.DotTuple($p_4_1.result,Integer.parseInt($p_4_3.getText())); }
  | Surrogate_id_SYMB_4 p_5_2=listExpr Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.Tuple($p_5_2.result); }
  | Surrogate_id_SYMB_4 p_6_2=listBinding Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.Record($p_6_2.result); }
  | Surrogate_id_SYMB_45 Surrogate_id_SYMB_2 p_7_3=expr Surrogate_id_SYMB_0 p_7_5=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.ConsList($p_7_3.result,$p_7_5.result); }
  | Surrogate_id_SYMB_27 Surrogate_id_SYMB_2 p_8_3=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.Head($p_8_3.result); }
  | Surrogate_id_SYMB_28 Surrogate_id_SYMB_2 p_9_3=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.IsEmpty($p_9_3.result); }
  | Surrogate_id_SYMB_29 Surrogate_id_SYMB_2 p_10_3=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.Tail($p_10_3.result); }
  | Surrogate_id_SYMB_30
    { $result = new ru.itmo.stella.lang.Absyn.Panic(); }
  | Surrogate_id_SYMB_71 Surrogate_id_SYMB_2 p_12_3=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.Throw($p_12_3.result); }
  | Surrogate_id_SYMB_74 Surrogate_id_SYMB_4 p_13_3=expr Surrogate_id_SYMB_5 Surrogate_id_SYMB_44 Surrogate_id_SYMB_4 p_13_7=pattern Surrogate_id_SYMB_11 p_13_9=expr Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.TryCatch($p_13_3.result,$p_13_7.result,$p_13_9.result); }
  | Surrogate_id_SYMB_74 Surrogate_id_SYMB_4 p_14_3=expr Surrogate_id_SYMB_5 Surrogate_id_SYMB_79 Surrogate_id_SYMB_4 p_14_7=expr Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.TryWith($p_14_3.result,$p_14_7.result); }
  | Surrogate_id_SYMB_74 Surrogate_id_SYMB_4 p_15_3=expr Surrogate_id_SYMB_5 Surrogate_id_SYMB_43 Surrogate_id_SYMB_41 p_15_7=type Surrogate_id_SYMB_4 p_15_9=pattern Surrogate_id_SYMB_11 p_15_11=expr Surrogate_id_SYMB_5 Surrogate_id_SYMB_79 Surrogate_id_SYMB_4 p_15_15=expr Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.TryCastAs($p_15_3.result,$p_15_7.result,$p_15_9.result,$p_15_11.result,$p_15_15.result); }
  | Surrogate_id_SYMB_58 Surrogate_id_SYMB_2 p_16_3=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.Inl($p_16_3.result); }
  | Surrogate_id_SYMB_60 Surrogate_id_SYMB_2 p_17_3=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.Inr($p_17_3.result); }
  | Surrogate_id_SYMB_69 Surrogate_id_SYMB_2 p_18_3=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.Succ($p_18_3.result); }
  | Surrogate_id_SYMB_66 Surrogate_id_SYMB_2 p_19_3=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.LogicNot($p_19_3.result); }
  | Surrogate_id_SYMB_31 Surrogate_id_SYMB_2 p_20_3=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.Pred($p_20_3.result); }
  | Surrogate_id_SYMB_32 Surrogate_id_SYMB_2 p_21_3=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.IsZero($p_21_3.result); }
  | Surrogate_id_SYMB_51 Surrogate_id_SYMB_2 p_22_3=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.Fix($p_22_3.result); }
  | Surrogate_id_SYMB_33 Surrogate_id_SYMB_2 p_23_3=expr Surrogate_id_SYMB_0 p_23_5=expr Surrogate_id_SYMB_0 p_23_7=expr Surrogate_id_SYMB_3
    { $result = new ru.itmo.stella.lang.Absyn.NatRec($p_23_3.result,$p_23_5.result,$p_23_7.result); }
  | Surrogate_id_SYMB_53 Surrogate_id_SYMB_6 p_24_3=type Surrogate_id_SYMB_7 p_24_5=expr7
    { $result = new ru.itmo.stella.lang.Absyn.Fold($p_24_3.result,$p_24_5.result); }
  | Surrogate_id_SYMB_76 Surrogate_id_SYMB_6 p_25_3=type Surrogate_id_SYMB_7 p_25_5=expr7
    { $result = new ru.itmo.stella.lang.Absyn.Unfold($p_25_3.result,$p_25_5.result); }
  | p_26_1=expr7
    { $result = $p_26_1.result; }
  ;
expr7 returns [ ru.itmo.stella.lang.Absyn.Expr result ]
  : Surrogate_id_SYMB_73
    { $result = new ru.itmo.stella.lang.Absyn.ConstTrue(); }
  | Surrogate_id_SYMB_50
    { $result = new ru.itmo.stella.lang.Absyn.ConstFalse(); }
  | Surrogate_id_SYMB_77
    { $result = new ru.itmo.stella.lang.Absyn.ConstUnit(); }
  | p_4_1=INTEGER
    { $result = new ru.itmo.stella.lang.Absyn.ConstInt(Integer.parseInt($p_4_1.getText())); }
  | p_5_1=MemoryAddress
    { $result = new ru.itmo.stella.lang.Absyn.ConstMemory($p_5_1.getText()); }
  | p_6_1=StellaIdent
    { $result = new ru.itmo.stella.lang.Absyn.Var($p_6_1.getText()); }
  | Surrogate_id_SYMB_2 p_7_2=expr Surrogate_id_SYMB_3
    { $result = $p_7_2.result; }
  ;
type returns [ ru.itmo.stella.lang.Absyn.Type result ]
  : Surrogate_id_SYMB_42
    { $result = new ru.itmo.stella.lang.Absyn.TypeAuto(); }
  | Surrogate_id_SYMB_52 Surrogate_id_SYMB_2 p_2_3=listType Surrogate_id_SYMB_3 Surrogate_id_SYMB_10 p_2_6=type
    { $result = new ru.itmo.stella.lang.Absyn.TypeFun($p_2_3.result,$p_2_6.result); }
  | Surrogate_id_SYMB_54 p_3_2=listStellaIdent Surrogate_id_SYMB_26 p_3_4=type
    { $result = new ru.itmo.stella.lang.Absyn.TypeForAll($p_3_2.result,$p_3_4.result); }
  | Surrogate_id_SYMB_80 p_4_2=StellaIdent Surrogate_id_SYMB_26 p_4_4=type
    { $result = new ru.itmo.stella.lang.Absyn.TypeRec($p_4_2.getText(),$p_4_4.result); }
  | p_5_1=type1
    { $result = $p_5_1.result; }
  ;
type1 returns [ ru.itmo.stella.lang.Absyn.Type result ]
  : p_1_1=type2 Surrogate_id_SYMB_22 p_1_3=type2
    { $result = new ru.itmo.stella.lang.Absyn.TypeSum($p_1_1.result,$p_1_3.result); }
  | p_2_1=type2
    { $result = $p_2_1.result; }
  ;
type2 returns [ ru.itmo.stella.lang.Absyn.Type result ]
  : Surrogate_id_SYMB_4 p_1_2=listType Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.TypeTuple($p_1_2.result); }
  | Surrogate_id_SYMB_4 p_2_2=listRecordFieldType Surrogate_id_SYMB_5
    { $result = new ru.itmo.stella.lang.Absyn.TypeRecord($p_2_2.result); }
  | Surrogate_id_SYMB_13 p_3_2=listVariantFieldType Surrogate_id_SYMB_14
    { $result = new ru.itmo.stella.lang.Absyn.TypeVariant($p_3_2.result); }
  | Surrogate_id_SYMB_6 p_4_2=type Surrogate_id_SYMB_7
    { $result = new ru.itmo.stella.lang.Absyn.TypeList($p_4_2.result); }
  | p_5_1=type3
    { $result = $p_5_1.result; }
  ;
type3 returns [ ru.itmo.stella.lang.Absyn.Type result ]
  : Surrogate_id_SYMB_35
    { $result = new ru.itmo.stella.lang.Absyn.TypeBool(); }
  | Surrogate_id_SYMB_37
    { $result = new ru.itmo.stella.lang.Absyn.TypeNat(); }
  | Surrogate_id_SYMB_39
    { $result = new ru.itmo.stella.lang.Absyn.TypeUnit(); }
  | Surrogate_id_SYMB_38
    { $result = new ru.itmo.stella.lang.Absyn.TypeTop(); }
  | Surrogate_id_SYMB_36
    { $result = new ru.itmo.stella.lang.Absyn.TypeBottom(); }
  | Surrogate_id_SYMB_34 p_6_2=type2
    { $result = new ru.itmo.stella.lang.Absyn.TypeRef($p_6_2.result); }
  | p_7_1=StellaIdent
    { $result = new ru.itmo.stella.lang.Absyn.TypeVar($p_7_1.getText()); }
  | Surrogate_id_SYMB_2 p_8_2=type Surrogate_id_SYMB_3
    { $result = $p_8_2.result; }
  ;
listType returns [ ru.itmo.stella.lang.Absyn.ListType result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.ListType(); }
  | p_2_1=type
    { $result = new ru.itmo.stella.lang.Absyn.ListType(); $result.addLast($p_2_1.result); }
  | p_3_1=type Surrogate_id_SYMB_0 p_3_3=listType
    { $result = $p_3_3.result; $result.addFirst($p_3_1.result); }
  ;
variantFieldType returns [ ru.itmo.stella.lang.Absyn.VariantFieldType result ]
  : p_1_1=StellaIdent p_1_2=optionalTyping
    { $result = new ru.itmo.stella.lang.Absyn.AVariantFieldType($p_1_1.getText(),$p_1_2.result); }
  ;
listVariantFieldType returns [ ru.itmo.stella.lang.Absyn.ListVariantFieldType result ]
  :  /* empty */
    { $result = new ru.itmo.stella.lang.Absyn.ListVariantFieldType(); }
  | p_2_1=variantFieldType
    { $result = new ru.itmo.stella.lang.Absyn.ListVariantFieldType(); $result.addLast($p_2_1.result); }
  | p_3_1=variantFieldType Surrogate_id_SYMB_0 p_3_3=listVariantFieldType
    { $result = $p_3_3.result; $result.addFirst($p_3_1.result); }
  ;
recordFieldType returns [ ru.itmo.stella.lang.Absyn.RecordFieldType result ]
  : p_1_1=StellaIdent Surrogate_id_SYMB_9 p_1_3=type
    { $result = new ru.itmo.stella.lang.Absyn.ARecordFieldType($p_1_1.getText(),$p_1_3.result); }
  ;
listRecordFieldType returns [ ru.itmo.stella.lang.Absyn.ListRecordFieldType result ]
  : p_1_1=recordFieldType
    { $result = new ru.itmo.stella.lang.Absyn.ListRecordFieldType(); $result.addLast($p_1_1.result); }
  | p_2_1=recordFieldType Surrogate_id_SYMB_0 p_2_3=listRecordFieldType
    { $result = $p_2_3.result; $result.addFirst($p_2_1.result); }
  ;
typing returns [ ru.itmo.stella.lang.Absyn.Typing result ]
  : p_1_1=expr Surrogate_id_SYMB_9 p_1_3=type
    { $result = new ru.itmo.stella.lang.Absyn.ATyping($p_1_1.result,$p_1_3.result); }
  ;

