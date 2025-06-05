package ru.itmo.stella.typechecker.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternIntExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternSuccExpr;

public class StellaNatType extends StellaType.StellaPrimitiveType {
	StellaNatType() {
		
	}
	
	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		boolean zeroPattern = false;
		List<PatternExpr> succPatterns = new ArrayList<>();
		
		for (PatternExpr pattern: patterns) {
			switch (pattern.getPatternTag()) {
				case INT:
					zeroPattern = zeroPattern || ((PatternIntExpr) pattern).getIntPattern() == 0; 
					break;
				case SUCC:
					PatternSuccExpr succPattern = (PatternSuccExpr) pattern;
					succPatterns.add(succPattern.getSuccPattern());
					break;
				default:
					break;
			}
		}
		
		List<PatternExpr> missingPatterns = new ArrayList<>();
		
		if (!zeroPattern && succPatterns.isEmpty())
			return List.of(PatternExpr.STUB_PATTERN);
		
		if (!zeroPattern)
			missingPatterns.add(new PatternIntExpr(0));
		
		if (succPatterns.isEmpty())
			missingPatterns.add(new PatternSuccExpr(PatternExpr.STUB_PATTERN));
		else
			missingPatterns.addAll(
					StellaType.Primitives.NAT.checkPatternsExhaustiveness(succPatterns)
					.stream()
					.map(p -> new PatternSuccExpr(p))
					.toList()
			);	
		
		return missingPatterns;
	}
	
	public int hashCode() {
		return Objects.hash(StellaType.Tag.PRIMITIVE, PrimitiveTypeKind.NAT);
	}
	
	public String toString() {
		return "Nat";
	}
}
