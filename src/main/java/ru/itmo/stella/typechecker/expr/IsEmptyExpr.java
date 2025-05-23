package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.list.StellaNotAListException;
import ru.itmo.stella.typechecker.type.StellaType;

public class IsEmptyExpr extends StellaExpression {
	private StellaExpression arg;
	
	public IsEmptyExpr(StellaExpression arg) {
		this.arg = arg;
	}
	
	public StellaExpression getArgument() {
		return arg;
	}
	
	@Override
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypeMatching(context, expected, inferType(context));
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		StellaType argType = arg.inferType(context);
		
		if (argType.getTypeTag() != StellaType.Tag.LIST)
			throw new StellaNotAListException(argType, arg, this);
		
		return StellaType.Primitives.BOOL;
	}

	public String toString() {
		return String.format("List::isempty(%s)", arg);
	}
}
