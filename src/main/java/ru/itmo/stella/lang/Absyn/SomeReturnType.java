// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class SomeReturnType extends ReturnType {
  public final Type type_;
  public int line_num, col_num, offset;
  public SomeReturnType(Type p1) { type_ = p1; }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.ReturnType.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.SomeReturnType) {
      ru.itmo.stella.lang.Absyn.SomeReturnType x = (ru.itmo.stella.lang.Absyn.SomeReturnType)o;
      return this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return this.type_.hashCode();
  }


}
