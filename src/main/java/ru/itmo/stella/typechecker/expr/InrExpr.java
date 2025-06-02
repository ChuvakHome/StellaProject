package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.sumtype.StellaAmbiguousSumTypeException;
import ru.itmo.stella.typechecker.exception.sumtype.StellaUnexpectedInjectionException;
import ru.itmo.stella.typechecker.type.StellaSumType;
import ru.itmo.stella.typechecker.type.StellaType;

public class InrExpr extends StellaExpression {
	private StellaExpression arg;
	
	public InrExpr(StellaExpression argument) {
		this.arg = argument;
	}
	
	public StellaExpression getArgument() {
		return arg;
	}

	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.SUM)
			throw new StellaUnexpectedInjectionException(expected, arg);
		
		StellaSumType expectedSumType = (StellaSumType) expected;
		
		arg.checkType(context, expectedSumType.getRightType());
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		if (!context.isExtensionUsed(StellaLanguageExtension.AMBIGUOUS_TYPE_AS_BOTTOM))
			throw new StellaAmbiguousSumTypeException();
		
		StellaType rightType = arg.inferType(context);
		
		return new StellaSumType(StellaType.BOTTOM, rightType);
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		StellaType rightType = arg.inferType(context);
		
		return new StellaSumType(getCachedType(context), rightType);
	}

	@Override
	public String toString() {
		return String.format("inr(%s)", arg);
	}
}
