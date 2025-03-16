// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class PatternTuple extends Pattern {
  public final ListPattern listpattern_;
  public int line_num, col_num, offset;
  public PatternTuple(ListPattern p1) { listpattern_ = p1; }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.Pattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.PatternTuple) {
      ru.itmo.stella.lang.Absyn.PatternTuple x = (ru.itmo.stella.lang.Absyn.PatternTuple)o;
      return this.listpattern_.equals(x.listpattern_);
    }
    return false;
  }

  public int hashCode() {
    return this.listpattern_.hashCode();
  }


}
