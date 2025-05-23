package ru.itmo.stella.typechecker.exception.match;

import java.util.Arrays;
import java.util.List;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.pattern.StellaNonExhaustivePatternsException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaNonExhaustiveMatchPatternsException extends StellaNonExhaustivePatternsException {
	public StellaNonExhaustiveMatchPatternsException(StellaExpression matchExpr, List<? extends PatternExpr> missingPatterns) {
		super(
			StellaTypeErrorCode.ERROR_NONEXHAUSTIVE_MATCH_PATTERNS,
			matchExpr,
			missingPatterns
		);
	}
	
	public StellaNonExhaustiveMatchPatternsException(StellaExpression matchExpr, PatternExpr... missingPatterns) {
		super(StellaTypeErrorCode.ERROR_NONEXHAUSTIVE_MATCH_PATTERNS, matchExpr, Arrays.asList(missingPatterns));
	}
}
