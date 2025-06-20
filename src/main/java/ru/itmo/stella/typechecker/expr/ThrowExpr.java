package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.throwing.StellaAmbiguousThrowTypeException;
import ru.itmo.stella.typechecker.exception.throwing.StellaExceptionTypeNotDeclaredException;
import ru.itmo.stella.typechecker.type.StellaType;

public class ThrowExpr extends StellaExpression {
	private StellaExpression expr;
	
	public ThrowExpr(StellaExpression expression) {
		this.expr = expression;
	}
	
	public StellaExpression getExpression() {
		return expr;
	}
	
//	@Override
//	protected void doTypeCheckConstrainted(ExpressionContext context, StellaType expected) throws StellaException {
//		
//	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType exceptionType = context.getExceptionType(); 
		
		if (exceptionType == null)
			throw new StellaExceptionTypeNotDeclaredException();
		
		expr.checkType(context, exceptionType);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		if (context.isExtensionUsed(StellaLanguageExtension.AMBIGUOUS_TYPE_AS_BOTTOM))
			return StellaType.BOTTOM;
					
		throw new StellaAmbiguousThrowTypeException();
	}

	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {		
		return getCachedType(context);
	}
	
	@Override
	public String toString() {
		return String.format("throw(%s)", expr);
	}
}
