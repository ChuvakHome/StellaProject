package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.sumtype.StellaAmbiguousSumTypeException;
import ru.itmo.stella.typechecker.exception.sumtype.StellaUnexpectedInjectionException;
import ru.itmo.stella.typechecker.type.StellaSumType;
import ru.itmo.stella.typechecker.type.StellaType;

public class InlExpr extends StellaExpression {
	private StellaExpression arg;
	
	public InlExpr(StellaExpression argument) {
		this.arg = argument;
	}
	
	public StellaExpression getArgument() {
		return arg;
	}

	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.SUM)
			throw new StellaUnexpectedInjectionException(expected, arg);
		
		StellaSumType expectedSumType = (StellaSumType) expected;
		
		arg.checkType(context, expectedSumType.getLeftType());
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		throw new StellaAmbiguousSumTypeException();
	}

	@Override
	public String toString() {
		return String.format("inl(%s)", arg);
	}
}
