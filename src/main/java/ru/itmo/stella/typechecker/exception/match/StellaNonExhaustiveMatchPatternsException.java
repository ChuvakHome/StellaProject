package ru.itmo.stella.typechecker.exception.match;

import java.util.Arrays;
import java.util.List;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaNonExhaustiveMatchPatternsException extends StellaException {
	public StellaNonExhaustiveMatchPatternsException(StellaExpression matchExpr, List<PatternExpr> missingPatterns) {
		super(
			StellaTypeErrorCode.ERROR_NONEXHAUSTIVE_MATCH_PATTERNS,
			"non-exhaustive pattern matches\\s"
			+ "when matching on expression\\S"
			+ "%s\\s"
			+ "at least the following patterns are not matched:\\S"
			+ "%s",
			matchExpr,
			String.join(
						"\\S",
						missingPatterns.stream().map(PatternExpr::toString).toList()
					)
		);
	}
	
	public StellaNonExhaustiveMatchPatternsException(StellaExpression matchExpr, PatternExpr... missingPatterns) {
		this(matchExpr, Arrays.asList(missingPatterns));
	}
}
