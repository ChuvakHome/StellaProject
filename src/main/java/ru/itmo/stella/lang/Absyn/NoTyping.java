// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class NoTyping extends OptionalTyping {
  public int line_num, col_num, offset;
  public NoTyping() { }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.OptionalTyping.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.NoTyping) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
