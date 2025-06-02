package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class PredExpr extends StellaExpression {
	private StellaExpression argument;
	
	public PredExpr(StellaExpression argument) {
		this.argument = argument;
	}
	
	public StellaExpression getArgument() {
		return argument;
	}

	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		argument.checkType(context, StellaType.Primitives.NAT);
		
		checkTypeMatching(context, expected, StellaType.Primitives.NAT);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		argument.checkType(context, StellaType.Primitives.NAT);
		
		return StellaType.Primitives.NAT;
	}
	
	public String toString() {
		return String.format("Nat::pred(%s)", argument);
	}
}
