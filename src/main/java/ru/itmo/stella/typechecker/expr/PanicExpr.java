package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.panic.StellaAmbiguousPanicTypeException;
import ru.itmo.stella.typechecker.type.StellaType;

public class PanicExpr extends StellaExpression {
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		if (context.isExtensionUsed(StellaLanguageExtension.AMBIGUOUS_TYPE_AS_BOTTOM))
			return StellaType.BOTTOM;
		
		throw new StellaAmbiguousPanicTypeException();
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		return getCachedType(context);
	}

	@Override
	public String toString() {
		return "panic!";
	}
}
