package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
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
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.SUM)
			throw new StellaUnexpectedInjectionException(expected, arg);
		
		StellaSumType expectedSumType = (StellaSumType) expected;
		
		arg.checkType(context, expectedSumType.getLeftType());
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		if (!context.isExtensionUsed(StellaLanguageExtension.AMBIGUOUS_TYPE_AS_BOTTOM))
			throw new StellaAmbiguousSumTypeException();
		
		StellaType leftType = arg.inferType(context);
		
		return new StellaSumType(leftType, StellaType.BOTTOM);
	}

	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		StellaType leftType = arg.inferType(context);
		
		return new StellaSumType(leftType, getCachedType(context));
	}
	
	@Override
	public String toString() {
		return String.format("inl(%s)", arg);
	}
}
