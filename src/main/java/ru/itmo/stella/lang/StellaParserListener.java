// Generated from StellaParser.g4 by ANTLR 4.7.1
package ru.itmo.stella.lang;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StellaParser}.
 */
public interface StellaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Program}.
	 * @param ctx the parse tree
	 */
	void enterStart_Program(StellaParser.Start_ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Program}.
	 * @param ctx the parse tree
	 */
	void exitStart_Program(StellaParser.Start_ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListStellaIdent}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListStellaIdent(StellaParser.Start_ListStellaIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListStellaIdent}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListStellaIdent(StellaParser.Start_ListStellaIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_LanguageDecl}.
	 * @param ctx the parse tree
	 */
	void enterStart_LanguageDecl(StellaParser.Start_LanguageDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_LanguageDecl}.
	 * @param ctx the parse tree
	 */
	void exitStart_LanguageDecl(StellaParser.Start_LanguageDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Extension}.
	 * @param ctx the parse tree
	 */
	void enterStart_Extension(StellaParser.Start_ExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Extension}.
	 * @param ctx the parse tree
	 */
	void exitStart_Extension(StellaParser.Start_ExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListExtensionName}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListExtensionName(StellaParser.Start_ListExtensionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListExtensionName}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListExtensionName(StellaParser.Start_ListExtensionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListExtension}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListExtension(StellaParser.Start_ListExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListExtension}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListExtension(StellaParser.Start_ListExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Decl}.
	 * @param ctx the parse tree
	 */
	void enterStart_Decl(StellaParser.Start_DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Decl}.
	 * @param ctx the parse tree
	 */
	void exitStart_Decl(StellaParser.Start_DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListDecl}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListDecl(StellaParser.Start_ListDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListDecl}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListDecl(StellaParser.Start_ListDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_LocalDecl}.
	 * @param ctx the parse tree
	 */
	void enterStart_LocalDecl(StellaParser.Start_LocalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_LocalDecl}.
	 * @param ctx the parse tree
	 */
	void exitStart_LocalDecl(StellaParser.Start_LocalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListLocalDecl}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListLocalDecl(StellaParser.Start_ListLocalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListLocalDecl}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListLocalDecl(StellaParser.Start_ListLocalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Annotation}.
	 * @param ctx the parse tree
	 */
	void enterStart_Annotation(StellaParser.Start_AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Annotation}.
	 * @param ctx the parse tree
	 */
	void exitStart_Annotation(StellaParser.Start_AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListAnnotation(StellaParser.Start_ListAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListAnnotation(StellaParser.Start_ListAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ParamDecl}.
	 * @param ctx the parse tree
	 */
	void enterStart_ParamDecl(StellaParser.Start_ParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ParamDecl}.
	 * @param ctx the parse tree
	 */
	void exitStart_ParamDecl(StellaParser.Start_ParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListParamDecl}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListParamDecl(StellaParser.Start_ListParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListParamDecl}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListParamDecl(StellaParser.Start_ListParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ReturnType}.
	 * @param ctx the parse tree
	 */
	void enterStart_ReturnType(StellaParser.Start_ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ReturnType}.
	 * @param ctx the parse tree
	 */
	void exitStart_ReturnType(StellaParser.Start_ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ThrowType}.
	 * @param ctx the parse tree
	 */
	void enterStart_ThrowType(StellaParser.Start_ThrowTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ThrowType}.
	 * @param ctx the parse tree
	 */
	void exitStart_ThrowType(StellaParser.Start_ThrowTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Type9}.
	 * @param ctx the parse tree
	 */
	void enterStart_Type9(StellaParser.Start_Type9Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Type9}.
	 * @param ctx the parse tree
	 */
	void exitStart_Type9(StellaParser.Start_Type9Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListType9}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListType9(StellaParser.Start_ListType9Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListType9}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListType9(StellaParser.Start_ListType9Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_MatchCase}.
	 * @param ctx the parse tree
	 */
	void enterStart_MatchCase(StellaParser.Start_MatchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_MatchCase}.
	 * @param ctx the parse tree
	 */
	void exitStart_MatchCase(StellaParser.Start_MatchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListMatchCase}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListMatchCase(StellaParser.Start_ListMatchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListMatchCase}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListMatchCase(StellaParser.Start_ListMatchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_OptionalTyping}.
	 * @param ctx the parse tree
	 */
	void enterStart_OptionalTyping(StellaParser.Start_OptionalTypingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_OptionalTyping}.
	 * @param ctx the parse tree
	 */
	void exitStart_OptionalTyping(StellaParser.Start_OptionalTypingContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_PatternData}.
	 * @param ctx the parse tree
	 */
	void enterStart_PatternData(StellaParser.Start_PatternDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_PatternData}.
	 * @param ctx the parse tree
	 */
	void exitStart_PatternData(StellaParser.Start_PatternDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ExprData}.
	 * @param ctx the parse tree
	 */
	void enterStart_ExprData(StellaParser.Start_ExprDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ExprData}.
	 * @param ctx the parse tree
	 */
	void exitStart_ExprData(StellaParser.Start_ExprDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Pattern}.
	 * @param ctx the parse tree
	 */
	void enterStart_Pattern(StellaParser.Start_PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Pattern}.
	 * @param ctx the parse tree
	 */
	void exitStart_Pattern(StellaParser.Start_PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListPattern}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListPattern(StellaParser.Start_ListPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListPattern}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListPattern(StellaParser.Start_ListPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_LabelledPattern}.
	 * @param ctx the parse tree
	 */
	void enterStart_LabelledPattern(StellaParser.Start_LabelledPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_LabelledPattern}.
	 * @param ctx the parse tree
	 */
	void exitStart_LabelledPattern(StellaParser.Start_LabelledPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListLabelledPattern}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListLabelledPattern(StellaParser.Start_ListLabelledPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListLabelledPattern}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListLabelledPattern(StellaParser.Start_ListLabelledPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Binding}.
	 * @param ctx the parse tree
	 */
	void enterStart_Binding(StellaParser.Start_BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Binding}.
	 * @param ctx the parse tree
	 */
	void exitStart_Binding(StellaParser.Start_BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListBinding}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListBinding(StellaParser.Start_ListBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListBinding}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListBinding(StellaParser.Start_ListBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Expr}.
	 * @param ctx the parse tree
	 */
	void enterStart_Expr(StellaParser.Start_ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Expr}.
	 * @param ctx the parse tree
	 */
	void exitStart_Expr(StellaParser.Start_ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListExpr}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListExpr(StellaParser.Start_ListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListExpr}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListExpr(StellaParser.Start_ListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Expr1}.
	 * @param ctx the parse tree
	 */
	void enterStart_Expr1(StellaParser.Start_Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Expr1}.
	 * @param ctx the parse tree
	 */
	void exitStart_Expr1(StellaParser.Start_Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_PatternBinding}.
	 * @param ctx the parse tree
	 */
	void enterStart_PatternBinding(StellaParser.Start_PatternBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_PatternBinding}.
	 * @param ctx the parse tree
	 */
	void exitStart_PatternBinding(StellaParser.Start_PatternBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListPatternBinding}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListPatternBinding(StellaParser.Start_ListPatternBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListPatternBinding}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListPatternBinding(StellaParser.Start_ListPatternBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Expr2}.
	 * @param ctx the parse tree
	 */
	void enterStart_Expr2(StellaParser.Start_Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Expr2}.
	 * @param ctx the parse tree
	 */
	void exitStart_Expr2(StellaParser.Start_Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListExpr2}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListExpr2(StellaParser.Start_ListExpr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListExpr2}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListExpr2(StellaParser.Start_ListExpr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Expr3}.
	 * @param ctx the parse tree
	 */
	void enterStart_Expr3(StellaParser.Start_Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Expr3}.
	 * @param ctx the parse tree
	 */
	void exitStart_Expr3(StellaParser.Start_Expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Expr4}.
	 * @param ctx the parse tree
	 */
	void enterStart_Expr4(StellaParser.Start_Expr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Expr4}.
	 * @param ctx the parse tree
	 */
	void exitStart_Expr4(StellaParser.Start_Expr4Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Expr5}.
	 * @param ctx the parse tree
	 */
	void enterStart_Expr5(StellaParser.Start_Expr5Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Expr5}.
	 * @param ctx the parse tree
	 */
	void exitStart_Expr5(StellaParser.Start_Expr5Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Expr6}.
	 * @param ctx the parse tree
	 */
	void enterStart_Expr6(StellaParser.Start_Expr6Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Expr6}.
	 * @param ctx the parse tree
	 */
	void exitStart_Expr6(StellaParser.Start_Expr6Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Expr7}.
	 * @param ctx the parse tree
	 */
	void enterStart_Expr7(StellaParser.Start_Expr7Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Expr7}.
	 * @param ctx the parse tree
	 */
	void exitStart_Expr7(StellaParser.Start_Expr7Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Type}.
	 * @param ctx the parse tree
	 */
	void enterStart_Type(StellaParser.Start_TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Type}.
	 * @param ctx the parse tree
	 */
	void exitStart_Type(StellaParser.Start_TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Type1}.
	 * @param ctx the parse tree
	 */
	void enterStart_Type1(StellaParser.Start_Type1Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Type1}.
	 * @param ctx the parse tree
	 */
	void exitStart_Type1(StellaParser.Start_Type1Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Type2}.
	 * @param ctx the parse tree
	 */
	void enterStart_Type2(StellaParser.Start_Type2Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Type2}.
	 * @param ctx the parse tree
	 */
	void exitStart_Type2(StellaParser.Start_Type2Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Type3}.
	 * @param ctx the parse tree
	 */
	void enterStart_Type3(StellaParser.Start_Type3Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Type3}.
	 * @param ctx the parse tree
	 */
	void exitStart_Type3(StellaParser.Start_Type3Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListType}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListType(StellaParser.Start_ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListType}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListType(StellaParser.Start_ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_VariantFieldType}.
	 * @param ctx the parse tree
	 */
	void enterStart_VariantFieldType(StellaParser.Start_VariantFieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_VariantFieldType}.
	 * @param ctx the parse tree
	 */
	void exitStart_VariantFieldType(StellaParser.Start_VariantFieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListVariantFieldType}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListVariantFieldType(StellaParser.Start_ListVariantFieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListVariantFieldType}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListVariantFieldType(StellaParser.Start_ListVariantFieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_RecordFieldType}.
	 * @param ctx the parse tree
	 */
	void enterStart_RecordFieldType(StellaParser.Start_RecordFieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_RecordFieldType}.
	 * @param ctx the parse tree
	 */
	void exitStart_RecordFieldType(StellaParser.Start_RecordFieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_ListRecordFieldType}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListRecordFieldType(StellaParser.Start_ListRecordFieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_ListRecordFieldType}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListRecordFieldType(StellaParser.Start_ListRecordFieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#start_Typing}.
	 * @param ctx the parse tree
	 */
	void enterStart_Typing(StellaParser.Start_TypingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#start_Typing}.
	 * @param ctx the parse tree
	 */
	void exitStart_Typing(StellaParser.Start_TypingContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StellaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StellaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listStellaIdent}.
	 * @param ctx the parse tree
	 */
	void enterListStellaIdent(StellaParser.ListStellaIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listStellaIdent}.
	 * @param ctx the parse tree
	 */
	void exitListStellaIdent(StellaParser.ListStellaIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#languageDecl}.
	 * @param ctx the parse tree
	 */
	void enterLanguageDecl(StellaParser.LanguageDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#languageDecl}.
	 * @param ctx the parse tree
	 */
	void exitLanguageDecl(StellaParser.LanguageDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#extension}.
	 * @param ctx the parse tree
	 */
	void enterExtension(StellaParser.ExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#extension}.
	 * @param ctx the parse tree
	 */
	void exitExtension(StellaParser.ExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listExtensionName}.
	 * @param ctx the parse tree
	 */
	void enterListExtensionName(StellaParser.ListExtensionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listExtensionName}.
	 * @param ctx the parse tree
	 */
	void exitListExtensionName(StellaParser.ListExtensionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listExtension}.
	 * @param ctx the parse tree
	 */
	void enterListExtension(StellaParser.ListExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listExtension}.
	 * @param ctx the parse tree
	 */
	void exitListExtension(StellaParser.ListExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(StellaParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(StellaParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void enterListDecl(StellaParser.ListDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void exitListDecl(StellaParser.ListDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#localDecl}.
	 * @param ctx the parse tree
	 */
	void enterLocalDecl(StellaParser.LocalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#localDecl}.
	 * @param ctx the parse tree
	 */
	void exitLocalDecl(StellaParser.LocalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listLocalDecl}.
	 * @param ctx the parse tree
	 */
	void enterListLocalDecl(StellaParser.ListLocalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listLocalDecl}.
	 * @param ctx the parse tree
	 */
	void exitListLocalDecl(StellaParser.ListLocalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(StellaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(StellaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterListAnnotation(StellaParser.ListAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitListAnnotation(StellaParser.ListAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void enterParamDecl(StellaParser.ParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void exitParamDecl(StellaParser.ParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listParamDecl}.
	 * @param ctx the parse tree
	 */
	void enterListParamDecl(StellaParser.ListParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listParamDecl}.
	 * @param ctx the parse tree
	 */
	void exitListParamDecl(StellaParser.ListParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(StellaParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(StellaParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#throwType}.
	 * @param ctx the parse tree
	 */
	void enterThrowType(StellaParser.ThrowTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#throwType}.
	 * @param ctx the parse tree
	 */
	void exitThrowType(StellaParser.ThrowTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#type9}.
	 * @param ctx the parse tree
	 */
	void enterType9(StellaParser.Type9Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#type9}.
	 * @param ctx the parse tree
	 */
	void exitType9(StellaParser.Type9Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listType9}.
	 * @param ctx the parse tree
	 */
	void enterListType9(StellaParser.ListType9Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listType9}.
	 * @param ctx the parse tree
	 */
	void exitListType9(StellaParser.ListType9Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#matchCase}.
	 * @param ctx the parse tree
	 */
	void enterMatchCase(StellaParser.MatchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#matchCase}.
	 * @param ctx the parse tree
	 */
	void exitMatchCase(StellaParser.MatchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listMatchCase}.
	 * @param ctx the parse tree
	 */
	void enterListMatchCase(StellaParser.ListMatchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listMatchCase}.
	 * @param ctx the parse tree
	 */
	void exitListMatchCase(StellaParser.ListMatchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#optionalTyping}.
	 * @param ctx the parse tree
	 */
	void enterOptionalTyping(StellaParser.OptionalTypingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#optionalTyping}.
	 * @param ctx the parse tree
	 */
	void exitOptionalTyping(StellaParser.OptionalTypingContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#patternData}.
	 * @param ctx the parse tree
	 */
	void enterPatternData(StellaParser.PatternDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#patternData}.
	 * @param ctx the parse tree
	 */
	void exitPatternData(StellaParser.PatternDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#exprData}.
	 * @param ctx the parse tree
	 */
	void enterExprData(StellaParser.ExprDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#exprData}.
	 * @param ctx the parse tree
	 */
	void exitExprData(StellaParser.ExprDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(StellaParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(StellaParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listPattern}.
	 * @param ctx the parse tree
	 */
	void enterListPattern(StellaParser.ListPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listPattern}.
	 * @param ctx the parse tree
	 */
	void exitListPattern(StellaParser.ListPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#labelledPattern}.
	 * @param ctx the parse tree
	 */
	void enterLabelledPattern(StellaParser.LabelledPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#labelledPattern}.
	 * @param ctx the parse tree
	 */
	void exitLabelledPattern(StellaParser.LabelledPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listLabelledPattern}.
	 * @param ctx the parse tree
	 */
	void enterListLabelledPattern(StellaParser.ListLabelledPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listLabelledPattern}.
	 * @param ctx the parse tree
	 */
	void exitListLabelledPattern(StellaParser.ListLabelledPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(StellaParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(StellaParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listBinding}.
	 * @param ctx the parse tree
	 */
	void enterListBinding(StellaParser.ListBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listBinding}.
	 * @param ctx the parse tree
	 */
	void exitListBinding(StellaParser.ListBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(StellaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(StellaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(StellaParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(StellaParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(StellaParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(StellaParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#patternBinding}.
	 * @param ctx the parse tree
	 */
	void enterPatternBinding(StellaParser.PatternBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#patternBinding}.
	 * @param ctx the parse tree
	 */
	void exitPatternBinding(StellaParser.PatternBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listPatternBinding}.
	 * @param ctx the parse tree
	 */
	void enterListPatternBinding(StellaParser.ListPatternBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listPatternBinding}.
	 * @param ctx the parse tree
	 */
	void exitListPatternBinding(StellaParser.ListPatternBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(StellaParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(StellaParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listExpr2}.
	 * @param ctx the parse tree
	 */
	void enterListExpr2(StellaParser.ListExpr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listExpr2}.
	 * @param ctx the parse tree
	 */
	void exitListExpr2(StellaParser.ListExpr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(StellaParser.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(StellaParser.Expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterExpr4(StellaParser.Expr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitExpr4(StellaParser.Expr4Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#expr5}.
	 * @param ctx the parse tree
	 */
	void enterExpr5(StellaParser.Expr5Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#expr5}.
	 * @param ctx the parse tree
	 */
	void exitExpr5(StellaParser.Expr5Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterExpr6(StellaParser.Expr6Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitExpr6(StellaParser.Expr6Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#expr7}.
	 * @param ctx the parse tree
	 */
	void enterExpr7(StellaParser.Expr7Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#expr7}.
	 * @param ctx the parse tree
	 */
	void exitExpr7(StellaParser.Expr7Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(StellaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(StellaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#type1}.
	 * @param ctx the parse tree
	 */
	void enterType1(StellaParser.Type1Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#type1}.
	 * @param ctx the parse tree
	 */
	void exitType1(StellaParser.Type1Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#type2}.
	 * @param ctx the parse tree
	 */
	void enterType2(StellaParser.Type2Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#type2}.
	 * @param ctx the parse tree
	 */
	void exitType2(StellaParser.Type2Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#type3}.
	 * @param ctx the parse tree
	 */
	void enterType3(StellaParser.Type3Context ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#type3}.
	 * @param ctx the parse tree
	 */
	void exitType3(StellaParser.Type3Context ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(StellaParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(StellaParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#variantFieldType}.
	 * @param ctx the parse tree
	 */
	void enterVariantFieldType(StellaParser.VariantFieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#variantFieldType}.
	 * @param ctx the parse tree
	 */
	void exitVariantFieldType(StellaParser.VariantFieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listVariantFieldType}.
	 * @param ctx the parse tree
	 */
	void enterListVariantFieldType(StellaParser.ListVariantFieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listVariantFieldType}.
	 * @param ctx the parse tree
	 */
	void exitListVariantFieldType(StellaParser.ListVariantFieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#recordFieldType}.
	 * @param ctx the parse tree
	 */
	void enterRecordFieldType(StellaParser.RecordFieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#recordFieldType}.
	 * @param ctx the parse tree
	 */
	void exitRecordFieldType(StellaParser.RecordFieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#listRecordFieldType}.
	 * @param ctx the parse tree
	 */
	void enterListRecordFieldType(StellaParser.ListRecordFieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#listRecordFieldType}.
	 * @param ctx the parse tree
	 */
	void exitListRecordFieldType(StellaParser.ListRecordFieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellaParser#typing}.
	 * @param ctx the parse tree
	 */
	void enterTyping(StellaParser.TypingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellaParser#typing}.
	 * @param ctx the parse tree
	 */
	void exitTyping(StellaParser.TypingContext ctx);
}