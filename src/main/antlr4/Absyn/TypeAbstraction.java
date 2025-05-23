// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class TypeAbstraction extends Expr {
  public final ListStellaIdent liststellaident_;
  public final Expr expr_;
  public int line_num, col_num, offset;
  public TypeAbstraction(ListStellaIdent p1, Expr p2) { liststellaident_ = p1; expr_ = p2; }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.TypeAbstraction) {
      ru.itmo.stella.lang.Absyn.TypeAbstraction x = (ru.itmo.stella.lang.Absyn.TypeAbstraction)o;
      return this.liststellaident_.equals(x.liststellaident_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.liststellaident_.hashCode())+this.expr_.hashCode();
  }


}
