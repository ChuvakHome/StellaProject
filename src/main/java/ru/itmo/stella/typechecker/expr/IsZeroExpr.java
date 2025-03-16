package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class IsZeroExpr extends StellaExpression {
private StellaExpression argument;
	
	public IsZeroExpr(StellaExpression argument) {
		this.argument = argument;
	}
	
	public StellaExpression getArgument() {
		return argument;
	}

	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		argument.checkType(context, StellaType.Primitives.NAT);
		
		checkTypesEquality(expected, StellaType.Primitives.BOOL);
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		argument.checkType(context, StellaType.Primitives.NAT);
		
		return StellaType.Primitives.BOOL;
	}
	
	public String toString() {
		return String.format("Nat::iszero(%s)", argument);
	}
}
