package ru.itmo.stella.typechecker.expr.pattern;

import java.util.Objects;

import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedPatternForTypeException;
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
	public final int hashCode() {
		return Objects.hash(Tag.SUCC, succArgPattern);
	}
	
	public boolean equalsPattern(PatternExpr p) {
		return ((PatternSuccExpr) p).succArgPattern.equals(succArgPattern);
	}
	
	@Override
	public void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypesEquality(expected, StellaType.Primitives.NAT);
		
		succArgPattern.checkType(context, StellaType.Primitives.NAT);
	}
	
	@Override
	public StellaType doTypeInference(ExpressionContext context) throws StellaException {
		succArgPattern.checkType(context, StellaType.Primitives.NAT);
		
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
			
			return succArgPattern.extendContext(context, expected);
		} else if (expected == StellaType.Primitives.NAT)
			return succArgPattern.extendContext(context, expected);
		else
			throw new StellaUnexpectedPatternForTypeException(this, expected);
	}
	
	@Override
	public PatternSuccExpr getStubPattern() {
		return new PatternSuccExpr(succArgPattern.getStubPattern());
	}

	@Override
	public String toString() {
		return String.format("succ(%s)", succArgPattern);
	}
}
