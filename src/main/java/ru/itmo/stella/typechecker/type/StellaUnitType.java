package ru.itmo.stella.typechecker.type;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternUnitExpr;

public final class StellaUnitType extends StellaType.StellaPrimitiveType {
	StellaUnitType() {
		
	}
	
	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		return patterns.stream().anyMatch(p -> p.getPatternTag() == PatternExpr.Tag.UNIT) 
				? Collections.emptyList()
				: Arrays.asList(new PatternUnitExpr());
	}
	
	public String toString() {
		return "Unit";
	}
}
