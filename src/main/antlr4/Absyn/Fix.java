// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class Fix extends Expr {
  public final Expr expr_;
  public int line_num, col_num, offset;
  public Fix(Expr p1) { expr_ = p1; }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.Fix) {
      ru.itmo.stella.lang.Absyn.Fix x = (ru.itmo.stella.lang.Absyn.Fix)o;
      return this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return this.expr_.hashCode();
  }


}
