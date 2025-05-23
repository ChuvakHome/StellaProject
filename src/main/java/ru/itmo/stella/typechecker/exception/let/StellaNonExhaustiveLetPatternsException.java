package ru.itmo.stella.typechecker.exception.let;

import java.util.Arrays;
import java.util.List;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.pattern.StellaNonExhaustivePatternsException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaNonExhaustiveLetPatternsException extends StellaNonExhaustivePatternsException {
	public StellaNonExhaustiveLetPatternsException(StellaExpression matchExpr, List<? extends PatternExpr> missingPatterns) {
		super(
			StellaTypeErrorCode.ERROR_NONEXHAUSTIVE_LET_PATTERNS,
			matchExpr,
			missingPatterns
		);
	}
	
	public StellaNonExhaustiveLetPatternsException(StellaExpression matchExpr, PatternExpr... missingPatterns) {
		super(StellaTypeErrorCode.ERROR_NONEXHAUSTIVE_LET_PATTERNS, matchExpr, Arrays.asList(missingPatterns));
	}
}
