package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class SuccExpr extends StellaExpression {
	private StellaExpression argument;
	
	public SuccExpr(StellaExpression argument) {
		this.argument = argument;
	}
	
	public StellaExpression getArgument() {
		return argument;
	}

	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		argument.checkType(context, StellaType.Primitives.NAT);
		
		checkTypeMatching(context, expected, StellaType.Primitives.NAT);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		argument.checkType(context, StellaType.Primitives.NAT);
		
		return StellaType.Primitives.NAT;
	}
	
	public String toString() {
		return String.format("succ(%s)", argument);
	}
}
