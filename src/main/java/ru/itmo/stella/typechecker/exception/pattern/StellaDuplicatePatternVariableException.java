package ru.itmo.stella.typechecker.exception.pattern;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaDuplicatePatternVariableException extends StellaException {
	public StellaDuplicatePatternVariableException(String varName, PatternExpr expr) {
		super(
			StellaTypeErrorCode.ERROR_DUPLICATE_PATTERN_VARIABLE, 
			"pattern variable %s\\s"
			+ "occurs more than once\\s"
			+ "in the pattern\\S"
			+ "%s",
			varName,
			expr
		);
	}
}
