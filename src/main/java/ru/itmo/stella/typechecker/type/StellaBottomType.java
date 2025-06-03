package ru.itmo.stella.typechecker.type;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaBottomType extends StellaType {
	StellaBottomType() {
		super(Tag.BOTTOM);
	}
	
	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		return Collections.emptyList();
	}
	
	@Override
	public StellaType replaceType(StellaType replace, StellaType replacement) {
		return this;
	}
	
	@Override
	public boolean equalsWeak(StellaType stellaType) {
		return equalsFast(stellaType) || stellaType == this;
	}
	
	@Override
	public boolean equalsStrict(StellaType stellaType) {
		return stellaType == this;
	}
	
	@Override
	public final boolean isSubtype(StellaType type) {
		return true;
	}
	
	@Override
	public String toString() {
		return "Bot";
	}
}
