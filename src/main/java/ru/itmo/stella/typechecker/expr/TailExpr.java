package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.list.StellaNotAListException;
import ru.itmo.stella.typechecker.type.StellaListType;
import ru.itmo.stella.typechecker.type.StellaType;

public class TailExpr extends StellaExpression {
	private StellaExpression arg;
	
	public TailExpr(StellaExpression arg) {
		this.arg = arg;
	}
	
	public StellaExpression getArgument() {
		return arg;
	}
	
	@Override
	protected void doTypeCheckConstrainted(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType argType = arg.inferType(context);
		
		context.addConstraint(
					new StellaConstraint(
						argType,
						new StellaListType(getCachedType(context)),
						this
					)
				);
	}
	
	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.LIST)
			checkTypeMatching(context, expected, inferType(context));
		else
			arg.checkType(context, expected);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		StellaType argType = arg.inferType(context);
		
		if (argType.getTypeTag() != StellaType.Tag.LIST)
			throw new StellaNotAListException(argType, arg, this);
		
		return argType;
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		StellaType argType = arg.inferType(context);
		
		StellaListType listType = new StellaListType(getCachedType(context));
		
		context.addConstraint(
					new StellaConstraint(
						argType,
						listType,
						this
					)
				);
		
		return listType;
	}

	public String toString() {
		return String.format("List::tail(%s)", arg);
	}
}
