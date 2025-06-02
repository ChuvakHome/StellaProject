package ru.itmo.stella.typechecker.type;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaNoType extends StellaType {
	StellaNoType() {
		super(Tag.NO_TYPE);
	}

	public String toString() {
		return "";
	}

	public StellaType replaceType(StellaType replace, StellaType replacement) {
		return this;
	}
	
	@Override
	public boolean equalsWeak(StellaType stellaType) {
		return stellaType == StellaType.NO_TYPE;
	}
	
	@Override
	public boolean equalsStrict(StellaType stellaType) {
		return stellaType == StellaType.NO_TYPE;
	}

	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		return Collections.emptyList();
	}
}
