// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class ConstInt extends Expr {
  public final Integer integer_;
  public int line_num, col_num, offset;
  public ConstInt(Integer p1) { integer_ = p1; }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.ConstInt) {
      ru.itmo.stella.lang.Absyn.ConstInt x = (ru.itmo.stella.lang.Absyn.ConstInt)o;
      return this.integer_.equals(x.integer_);
    }
    return false;
  }

  public int hashCode() {
    return this.integer_.hashCode();
  }


}
