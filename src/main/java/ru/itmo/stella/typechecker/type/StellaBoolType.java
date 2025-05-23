package ru.itmo.stella.typechecker.type;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternBoolExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaBoolType extends StellaType.StellaPrimitiveType {
	StellaBoolType() {
		
	}
	
	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		boolean truePattern = false;
		boolean falsePattern = false;
		
		for (PatternExpr pattern: patterns) {
			switch (pattern.getPatternTag()) {
				case BOOL:
					PatternBoolExpr boolPattern = (PatternBoolExpr) pattern;
					
					if (boolPattern.getBoolPattern())
						truePattern = true;
					else
						falsePattern = true;
					
					break;
				case VAR:
					return Collections.emptyList();
				default:
					break;
			}
		}
		
		if (!truePattern)
			return Arrays.asList(new PatternBoolExpr(true));
		else if (!falsePattern)
			return Arrays.asList(new PatternBoolExpr(false));
		
		return Collections.emptyList();
	}
	
	public String toString() {
		return "Bool";
	}
}
