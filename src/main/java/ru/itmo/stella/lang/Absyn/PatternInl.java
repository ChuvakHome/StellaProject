// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class PatternInl extends Pattern {
  public final Pattern pattern_;
  public int line_num, col_num, offset;
  public PatternInl(Pattern p1) { pattern_ = p1; }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.Pattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.PatternInl) {
      ru.itmo.stella.lang.Absyn.PatternInl x = (ru.itmo.stella.lang.Absyn.PatternInl)o;
      return this.pattern_.equals(x.pattern_);
    }
    return false;
  }

  public int hashCode() {
    return this.pattern_.hashCode();
  }


}
