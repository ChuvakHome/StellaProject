package ru.itmo.stella.typechecker.expr.pattern;

import java.util.Objects;

import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedPatternForTypeException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternIntExpr extends PatternExpr {
	private int intPattern;
	
	public PatternIntExpr(int intPattern) {
		super(Tag.INT);
		
		this.intPattern = intPattern;
	}
	
	public int getIntPattern() {
		return intPattern;
	}
	
	@Override
	public final int hashCode() {
		return Objects.hash(Tag.INT, intPattern);
	}
	
	public boolean equalsPattern(PatternExpr p) {
		return ((PatternIntExpr) p).intPattern == intPattern;
	}

	@Override
	public void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypesEquality(expected, StellaType.Primitives.NAT);
	}
	
	@Override
	public StellaType doTypeInference(ExpressionContext context) throws StellaException {
		return StellaType.Primitives.NAT;
	}
	
	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() == StellaType.Tag.TYPE_VAR) {
			context.addConstraint(
						new StellaConstraint(
							StellaType.Primitives.NAT,
							expected, 
							this
						)
					);
			
			return context;
		} else if (expected == StellaType.Primitives.NAT)
			return context;
		else
			throw new StellaUnexpectedPatternForTypeException(this, expected);
	}
	
	@Override
	public PatternExpr getStubPattern() {
		return intPattern == 0 ? this : new PatternIntExpr(0);
	}

	@Override
	public String toString() {
		return String.valueOf(intPattern);
	}
}
