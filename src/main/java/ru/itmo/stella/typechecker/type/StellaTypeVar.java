package ru.itmo.stella.typechecker.type;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaTypeVar extends StellaType {
	private String varName;
	
	public StellaTypeVar(String varName) {
		super(Tag.TYPE_VAR);
		
		this.varName = varName;
	}
	
	public String getVarName() {
		return varName;
	}
	
	public int hashCode() {
		return Objects.hash(Tag.TYPE_VAR, varName);
	}

	public String toString() {
		return varName;
	}
	
	@Override
	public boolean equalsWeak(StellaType stellaType) {
		if (stellaType.getTypeTag() == Tag.TYPE_VAR)
			return ((StellaTypeVar) stellaType).varName.equals(varName);
		
		return true;
	}
	
	@Override
	public boolean equalsStrict(StellaType stellaType) {
		if (stellaType.getTypeTag() == Tag.TYPE_VAR)
			return ((StellaTypeVar) stellaType).varName.equals(varName);
		
		return false;
	}
	
	@Override
	public StellaType replaceType(StellaType replace, StellaType replacement) {
		if (replace instanceof StellaTypeVar typeVar && typeVar.varName.equals(varName))
			return replacement;
		
		return this;
	}

	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		return null;
	}
}
