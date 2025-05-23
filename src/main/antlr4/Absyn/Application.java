// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class Application extends Expr {
  public final Expr expr_;
  public final ListExpr listexpr_;
  public int line_num, col_num, offset;
  public Application(Expr p1, ListExpr p2) { expr_ = p1; listexpr_ = p2; }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.Application) {
      ru.itmo.stella.lang.Absyn.Application x = (ru.itmo.stella.lang.Absyn.Application)o;
      return this.expr_.equals(x.expr_) && this.listexpr_.equals(x.listexpr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.expr_.hashCode())+this.listexpr_.hashCode();
  }


}
