package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.list.StellaNotAListException;
import ru.itmo.stella.typechecker.type.StellaListType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaType.Tag;

public class TailExpr extends StellaExpression {
	private StellaExpression arg;
	
	public TailExpr(StellaExpression arg) {
		this.arg = arg;
	}
	
	public StellaExpression getArgument() {
		return arg;
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.LIST)
			checkTypeMatching(context, expected, inferType(context));
		else
			arg.checkType(context, expected);
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
		return arg.inferType(context);
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		StellaListType listType = new StellaListType(getCachedType(context));
		
		arg.checkType(context, listType);
		
		return listType;
	}

	public String toString() {
		return String.format("List::tail(%s)", arg);
	}
}
