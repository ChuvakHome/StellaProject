// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.stella;

/** Abstract Visitor */

public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
    /* Program */
    public R visit(ru.itmo.stella.lang.Absyn.AProgram p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.Program p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* LanguageDecl */
    public R visit(ru.itmo.stella.lang.Absyn.LanguageCore p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.LanguageDecl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Extension */
    public R visit(ru.itmo.stella.lang.Absyn.AnExtension p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.Extension p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Decl */
    public R visit(ru.itmo.stella.lang.Absyn.DeclFun p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.DeclFunGeneric p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.DeclTypeAlias p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.DeclExceptionType p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.DeclExceptionVariant p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.Decl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* LocalDecl */
    public R visit(ru.itmo.stella.lang.Absyn.ALocalDecl p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.LocalDecl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Annotation */
    public R visit(ru.itmo.stella.lang.Absyn.InlineAnnotation p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.Annotation p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* ParamDecl */
    public R visit(ru.itmo.stella.lang.Absyn.AParamDecl p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.ParamDecl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* ReturnType */
    public R visit(ru.itmo.stella.lang.Absyn.NoReturnType p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.SomeReturnType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.ReturnType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* ThrowType */
    public R visit(ru.itmo.stella.lang.Absyn.NoThrowType p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.SomeThrowType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.ThrowType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Type */
    public R visit(ru.itmo.stella.lang.Absyn.TypeAuto p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeFun p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeForAll p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeRec p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeSum p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeTuple p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeRecord p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeVariant p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeList p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeBool p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeNat p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeUnit p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeTop p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeBottom p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeRef p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeVar p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.Type p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* MatchCase */
    public R visit(ru.itmo.stella.lang.Absyn.AMatchCase p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.MatchCase p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* OptionalTyping */
    public R visit(ru.itmo.stella.lang.Absyn.NoTyping p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.SomeTyping p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.OptionalTyping p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* PatternData */
    public R visit(ru.itmo.stella.lang.Absyn.NoPatternData p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.SomePatternData p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.PatternData p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* ExprData */
    public R visit(ru.itmo.stella.lang.Absyn.NoExprData p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.SomeExprData p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.ExprData p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Pattern */
    public R visit(ru.itmo.stella.lang.Absyn.PatternCastAs p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternAsc p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternVariant p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternInl p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternInr p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternTuple p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternRecord p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternList p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternCons p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternFalse p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternTrue p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternUnit p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternInt p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternSucc p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.PatternVar p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.Pattern p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* LabelledPattern */
    public R visit(ru.itmo.stella.lang.Absyn.ALabelledPattern p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.LabelledPattern p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Binding */
    public R visit(ru.itmo.stella.lang.Absyn.ABinding p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.Binding p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Expr */
    public R visit(ru.itmo.stella.lang.Absyn.Sequence p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Let p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.LetRec p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeAbstraction p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Assign p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.If p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.LessThan p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.LessThanOrEqual p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.GreaterThan p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.GreaterThanOrEqual p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Equal p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.NotEqual p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeAsc p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeCast p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Abstraction p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Variant p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Match p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.List p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Add p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Subtract p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.LogicOr p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Multiply p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Divide p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.LogicAnd p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Ref p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Deref p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Application p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TypeApplication p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.DotRecord p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.DotTuple p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Tuple p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Record p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.ConsList p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Head p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.IsEmpty p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Tail p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Panic p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Throw p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TryCatch p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TryWith p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.TryCastAs p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Inl p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Inr p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Succ p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.LogicNot p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Pred p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.IsZero p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Fix p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.NatRec p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Fold p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Unfold p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.ConstTrue p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.ConstFalse p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.ConstUnit p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.ConstInt p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.ConstMemory p, A arg) { return visitDefault(p, arg); }
    public R visit(ru.itmo.stella.lang.Absyn.Var p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.Expr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* PatternBinding */
    public R visit(ru.itmo.stella.lang.Absyn.APatternBinding p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.PatternBinding p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* VariantFieldType */
    public R visit(ru.itmo.stella.lang.Absyn.AVariantFieldType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.VariantFieldType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* RecordFieldType */
    public R visit(ru.itmo.stella.lang.Absyn.ARecordFieldType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.RecordFieldType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Typing */
    public R visit(ru.itmo.stella.lang.Absyn.ATyping p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ru.itmo.stella.lang.Absyn.Typing p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
