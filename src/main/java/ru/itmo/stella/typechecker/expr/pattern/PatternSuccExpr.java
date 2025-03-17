package ru.itmo.stella.typechecker.expr.pattern;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternSuccExpr extends PatternExpr {
	private PatternExpr succArgPattern;
	
	public PatternSuccExpr(PatternExpr succExpr) {
		super(Tag.SUCC);
		
		this.succArgPattern = succExpr;
	}
	
	public PatternExpr getSuccPattern() {
		return succArgPattern;
	}

	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		succArgPattern.checkTypesEquality(StellaType.Primitives.NAT, expected);
		
		checkTypesEquality(expected, StellaType.Primitives.NAT);
	}
	
	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		return succArgPattern.extendContext(context, expected);
	}

	@Override
	public String toString() {
		return String.format("succ(%s)", succArgPattern);
	}
}
