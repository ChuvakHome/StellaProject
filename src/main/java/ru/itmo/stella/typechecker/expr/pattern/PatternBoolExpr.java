package ru.itmo.stella.typechecker.expr.pattern;

import java.util.Objects;

import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedPatternForTypeException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternBoolExpr extends PatternExpr {
	private boolean boolPattern;
	
	public PatternBoolExpr(boolean boolPattern) {
		super(Tag.BOOL);
		
		this.boolPattern = boolPattern;
	}
	
	public boolean getBoolPattern() {
		return boolPattern;
	}
	
	@Override
	public final int hashCode() {
		return Objects.hash(Tag.BOOL, boolPattern);
	}
	
	public boolean equalsPattern(PatternExpr p) {
		return ((PatternBoolExpr) p).boolPattern == boolPattern;
	}

	@Override
	public void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypesEquality(expected, StellaType.Primitives.BOOL);
	}
	
	@Override
	public StellaType doTypeInference(ExpressionContext context) throws StellaException {
		return StellaType.Primitives.BOOL;
	}

	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() == StellaType.Tag.TYPE_VAR) {
			context.addConstraint(
						new StellaConstraint(
							StellaType.Primitives.BOOL,
							expected, 
							this
						)
					);
			
			return context;
		} else if (expected == StellaType.Primitives.BOOL)
			return context;
		else
			throw new StellaUnexpectedPatternForTypeException(this, expected);
	}
	
	@Override
	public PatternExpr getStubPattern() {
		return PatternExpr.STUB_PATTERN;
	}

	@Override
	public String toString() {
		return boolPattern ? "true" : "false";
	}
}
