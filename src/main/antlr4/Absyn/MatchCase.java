// File generated by the BNF Converter (bnfc 2.9.6).

package ru.itmo.stella.lang.Absyn;

public abstract class MatchCase implements java.io.Serializable {
  public abstract <R,A> R accept(MatchCase.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(ru.itmo.stella.lang.Absyn.AMatchCase p, A arg);

  }

}
