// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class DeclFunGeneric extends Decl {
  public final ListAnnotation listannotation_;
  public final String stellaident_;
  public final ListStellaIdent liststellaident_;
  public final ListParamDecl listparamdecl_;
  public final ReturnType returntype_;
  public final ThrowType throwtype_;
  public final ListDecl listdecl_;
  public final Expr expr_;
  public int line_num, col_num, offset;
  public DeclFunGeneric(ListAnnotation p1, String p2, ListStellaIdent p3, ListParamDecl p4, ReturnType p5, ThrowType p6, ListDecl p7, Expr p8) { listannotation_ = p1; stellaident_ = p2; liststellaident_ = p3; listparamdecl_ = p4; returntype_ = p5; throwtype_ = p6; listdecl_ = p7; expr_ = p8; }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.Decl.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.DeclFunGeneric) {
      ru.itmo.stella.lang.Absyn.DeclFunGeneric x = (ru.itmo.stella.lang.Absyn.DeclFunGeneric)o;
      return this.listannotation_.equals(x.listannotation_) && this.stellaident_.equals(x.stellaident_) && this.liststellaident_.equals(x.liststellaident_) && this.listparamdecl_.equals(x.listparamdecl_) && this.returntype_.equals(x.returntype_) && this.throwtype_.equals(x.throwtype_) && this.listdecl_.equals(x.listdecl_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(37*(37*(37*(37*(this.listannotation_.hashCode())+this.stellaident_.hashCode())+this.liststellaident_.hashCode())+this.listparamdecl_.hashCode())+this.returntype_.hashCode())+this.throwtype_.hashCode())+this.listdecl_.hashCode())+this.expr_.hashCode();
  }


}
