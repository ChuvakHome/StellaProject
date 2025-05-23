// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class Record extends Expr {
  public final ListBinding listbinding_;
  public int line_num, col_num, offset;
  public Record(ListBinding p1) { listbinding_ = p1; }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.Record) {
      ru.itmo.stella.lang.Absyn.Record x = (ru.itmo.stella.lang.Absyn.Record)o;
      return this.listbinding_.equals(x.listbinding_);
    }
    return false;
  }

  public int hashCode() {
    return this.listbinding_.hashCode();
  }


}
