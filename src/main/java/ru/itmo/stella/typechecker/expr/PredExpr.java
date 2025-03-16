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
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		argument.checkType(context, StellaType.Primitives.NAT);
		
		checkTypesEquality(expected, StellaType.Primitives.NAT);
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		argument.checkType(context, StellaType.Primitives.NAT);
		
		return StellaType.Primitives.NAT;
	}
	
	public String toString() {
		return String.format("Nat::pred(%s)", argument);
	}
}
