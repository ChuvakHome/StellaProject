package ru.itmo.stella.typechecker.exception.throwing;

import java.util.Arrays;
import java.util.List;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaNonExhaustiveCatchPatternsException extends StellaException {
	public StellaNonExhaustiveCatchPatternsException(StellaType matchType, List<PatternExpr> missingPatterns) {
		super(
			StellaTypeErrorCode.ERROR_NONEXHAUSTIVE_CATCH_PATTERNS,
			"non-exhaustive pattern matches\\s"
			+ "when matching for catch on expression of type\\S"
			+ "%s\\s"
			+ "at least the following patterns are not matched:\\S"
			+ "%s",
			matchType,
			String.join(
						"\\S",
						missingPatterns
						.stream()
//						.map(StellaNonExhaustivePatternsException::decoratePatternVariables)
						.map(p -> p.getStubPattern())
						.map(PatternExpr::toString)
						.toList()
					)
		);
	}
	
	public StellaNonExhaustiveCatchPatternsException(StellaType matchType, PatternExpr... missingPatterns) {
		this(matchType, Arrays.asList(missingPatterns));
	}
}
