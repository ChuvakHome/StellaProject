package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.list.StellaNotAListException;
import ru.itmo.stella.typechecker.type.StellaListType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaType.Tag;

public class HeadExpr extends StellaExpression {
	private StellaExpression arg;
	
	public HeadExpr(StellaExpression arg) {
		this.arg = arg;
	}
	
	public StellaExpression getArgument() {
		return arg;
	}
	
	@Override
	protected void doTypeCheckConstrainted(ExpressionContext context, StellaType expected) throws StellaException {
		arg.checkType(context, new StellaListType(expected));
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		arg.checkType(context, new StellaListType(expected));
	}
	
	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		StellaType argType = arg.inferType(context);
		
		if (argType.getTypeTag() != StellaType.Tag.LIST) {
			if (argType.getTypeTag() != Tag.TYPE_VAR || !context.isExtensionUsed(StellaLanguageExtension.TYPE_RECONSTRUCTION))
				throw new StellaNotAListException(argType, arg, this);
		
			return doTypeInferenceConstrainted(context);
		}
	
		return doTypeInference(context);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		StellaListType argListType = (StellaListType) arg.inferType(context);
		
		return argListType.getElementType();
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		StellaType elementListType = getCachedType(context);
		
		arg.checkType(context, new StellaListType(elementListType));
		
		return elementListType;
	}

	public String toString() {
		return String.format("List::head(%s)", arg);
	}
}
