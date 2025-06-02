package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public abstract class StellaConstExpression extends StellaExpression {

	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType actual = inferType(context);
		
		checkTypeMatching(context, expected, actual);
	}
}
