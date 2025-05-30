// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class DotTuple extends Expr {
  public final Expr expr_;
  public final Integer integer_;
  public int line_num, col_num, offset;
  public DotTuple(Expr p1, Integer p2) { expr_ = p1; integer_ = p2; }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.DotTuple) {
      ru.itmo.stella.lang.Absyn.DotTuple x = (ru.itmo.stella.lang.Absyn.DotTuple)o;
      return this.expr_.equals(x.expr_) && this.integer_.equals(x.integer_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.expr_.hashCode())+this.integer_.hashCode();
  }


}
