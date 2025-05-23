package ru.itmo.stella.typechecker.exception.letrec;

import java.util.Arrays;
import java.util.List;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.pattern.StellaNonExhaustivePatternsException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaNonExhaustiveLetrecPatternsException extends StellaNonExhaustivePatternsException {
	public StellaNonExhaustiveLetrecPatternsException(StellaExpression matchExpr, List<? extends PatternExpr> missingPatterns) {
		super(
			StellaTypeErrorCode.ERROR_NONEXHAUSTIVE_LETREC_PATTERNS,
			matchExpr,
			missingPatterns
		);
	}
	
	public StellaNonExhaustiveLetrecPatternsException(StellaExpression matchExpr, PatternExpr... missingPatterns) {
		super(StellaTypeErrorCode.ERROR_NONEXHAUSTIVE_LETREC_PATTERNS, matchExpr, Arrays.asList(missingPatterns));
	}
}
