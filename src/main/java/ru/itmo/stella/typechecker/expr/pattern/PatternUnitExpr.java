package ru.itmo.stella.typechecker.expr.pattern;

import java.util.Objects;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternUnitExpr extends PatternExpr {	
	public PatternUnitExpr() {
		super(Tag.UNIT);
	}
	
	public boolean equalsPattern(PatternExpr p) {
		return true;
	}
	
	@Override
	public final int hashCode() {
		return Objects.hash(Tag.UNIT);
	}

	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypesEquality(expected, StellaType.Primitives.UNIT);
	}
	
	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		return StellaType.Primitives.UNIT;
	}
	
	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		return context;
	}
	
	@Override
	public PatternExpr getStubPattern() {
		return this;
	}

	@Override
	public String toString() {
		return "unit";
	}
}
