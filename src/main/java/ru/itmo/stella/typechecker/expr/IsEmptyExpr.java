package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.list.StellaNotAListException;
import ru.itmo.stella.typechecker.type.StellaListType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaType.Tag;

public class IsEmptyExpr extends StellaExpression {
	private StellaExpression arg;
	
	public IsEmptyExpr(StellaExpression arg) {
		this.arg = arg;
	}
	
	public StellaExpression getArgument() {
		return arg;
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType argType = arg.inferType(context);
		
		if (argType.getTypeTag() != StellaType.Tag.LIST)
			throw new StellaNotAListException(argType, arg, this);
		
		checkTypeMatching(context, expected, StellaType.Primitives.BOOL);
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
		return StellaType.Primitives.BOOL;
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		StellaType argType = arg.inferType(context);
		
		StellaType elementType = getCachedType(context);
		
		context.addConstraint(
					new StellaConstraint(argType, new StellaListType(elementType), arg)
				);
		
		return StellaType.Primitives.BOOL;
	}

	public String toString() {
		return String.format("List::isempty(%s)", arg);
	}
}
