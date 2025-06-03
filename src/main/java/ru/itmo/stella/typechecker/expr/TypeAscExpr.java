package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class TypeAscExpr extends StellaExpression {
	private StellaExpression subexpr;
	private StellaType type;

	public TypeAscExpr(StellaExpression subexpr, StellaType type) {
		this.subexpr = subexpr;
		this.type = type;
	}
	
	@Override
	protected void doTypeCheckConstrainted(ExpressionContext context, StellaType expected) throws StellaException {
		subexpr.checkType(context, type);
		
		context.addConstraint(
			new StellaConstraint(
				type,
				expected,
				subexpr
			)
		);
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		subexpr.checkType(context, type);
		
		checkTypeMatching(context, expected, type);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		subexpr.checkType(context, type);
		
		return type;
	}

	@Override
	public String toString() {
		return String.format("%s as %s", subexpr, type);
	}
}
