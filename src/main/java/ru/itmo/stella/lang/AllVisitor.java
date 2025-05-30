// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang;

/** All Visitor */

public interface AllVisitor<R,A> extends
  ru.itmo.stella.lang.Absyn.Program.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.LanguageDecl.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.Extension.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.Decl.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.LocalDecl.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.Annotation.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.ParamDecl.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.ReturnType.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.ThrowType.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.Type.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.MatchCase.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.OptionalTyping.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.PatternData.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.ExprData.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.Pattern.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.LabelledPattern.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.Binding.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.Expr.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.PatternBinding.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.VariantFieldType.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.RecordFieldType.Visitor<R,A>,
  ru.itmo.stella.lang.Absyn.Typing.Visitor<R,A>
{}
