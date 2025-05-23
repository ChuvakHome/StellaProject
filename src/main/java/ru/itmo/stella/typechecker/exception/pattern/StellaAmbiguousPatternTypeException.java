package ru.itmo.stella.typechecker.exception.pattern;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaAmbiguousPatternTypeException extends StellaException {
	private PatternExpr pattern;
	
	public StellaAmbiguousPatternTypeException(PatternExpr pattern) {
		super(
			StellaTypeErrorCode.ERROR_AMBIGUOUS_PATTERN_TYPE,
			"cannot infer the type for pattern\\S"
		  + "%s",
		  	pattern
		);
		
		this.pattern = pattern;
	}
	
	public PatternExpr getPattern() {
		return pattern;
	}
}
