// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class Inl extends Expr {
  public final Expr expr_;
  public int line_num, col_num, offset;
  public Inl(Expr p1) { expr_ = p1; }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.Inl) {
      ru.itmo.stella.lang.Absyn.Inl x = (ru.itmo.stella.lang.Absyn.Inl)o;
      return this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return this.expr_.hashCode();
  }


}
