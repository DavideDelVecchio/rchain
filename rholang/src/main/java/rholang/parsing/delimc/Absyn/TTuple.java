package rholang.parsing.delimc.Absyn; // Java Package generated by the BNF Converter.

public class TTuple extends Type {
  public final TType ttype_;
  public TTuple(TType p1) { ttype_ = p1; }

  public <R,A> R accept(rholang.parsing.delimc.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.delimc.Absyn.TTuple) {
      rholang.parsing.delimc.Absyn.TTuple x = (rholang.parsing.delimc.Absyn.TTuple)o;
      return this.ttype_.equals(x.ttype_);
    }
    return false;
  }

  public int hashCode() {
    return this.ttype_.hashCode();
  }


}
