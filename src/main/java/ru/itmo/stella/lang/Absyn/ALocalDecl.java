// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public class ALocalDecl extends LocalDecl {
  public final Decl decl_;
  public int line_num, col_num, offset;
  public ALocalDecl(Decl p1) { decl_ = p1; }

  public <R,A> R accept(ru.itmo.stella.lang.Absyn.LocalDecl.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof ru.itmo.stella.lang.Absyn.ALocalDecl) {
      ru.itmo.stella.lang.Absyn.ALocalDecl x = (ru.itmo.stella.lang.Absyn.ALocalDecl)o;
      return this.decl_.equals(x.decl_);
    }
    return false;
  }

  public int hashCode() {
    return this.decl_.hashCode();
  }


}
