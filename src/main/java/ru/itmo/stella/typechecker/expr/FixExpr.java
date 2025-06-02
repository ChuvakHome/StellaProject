package ru.itmo.stella.typechecker.expr;

import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.function.StellaNotAFunctionException;
import ru.itmo.stella.typechecker.type.StellaFunctionType;
import ru.itmo.stella.typechecker.type.StellaType;

public class FixExpr extends StellaExpression {
	private StellaExpression arg;
	
	public FixExpr(StellaExpression argument) {
		this.arg = argument;
	}
	
	public StellaExpression getArgument() {
		return arg;
	}
	
	@Override
	protected void doTypeCheckConstrainted(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType retType = expected;
		
		StellaFunctionType fixRequiredArgType = new StellaFunctionType(
					List.of(retType), 
					retType
				);
		
		arg.checkType(context, fixRequiredArgType);
	}

	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType argType = arg.inferType(context);
		
		if (argType.getTypeTag() != StellaType.Tag.FUNCTION)
			throw new StellaNotAFunctionException(argType, arg, this);
		
		StellaFunctionType fixRequiredArgType = new StellaFunctionType(
					List.of(expected), 
					expected
				);
		
		arg.checkType(context, fixRequiredArgType);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		StellaType argType = arg.inferType(context);
		
		if (argType.getTypeTag() != StellaType.Tag.FUNCTION)
			throw new StellaNotAFunctionException(argType, arg, this);
		
		StellaFunctionType argFnType = (StellaFunctionType) argType;
		
		StellaType retType = argFnType.getReturnType();
		
		StellaFunctionType fixRequiredArgType = new StellaFunctionType(
					List.of(retType), 
					retType
				);
		
		arg.checkType(context, fixRequiredArgType);
		
		return retType;
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		StellaType retType = getCachedType(context);
		
		StellaFunctionType fixRequiredArgType = new StellaFunctionType(
					List.of(retType), 
					retType
				);
		
		arg.checkType(context, fixRequiredArgType);
		
		return retType;
	}

	@Override
	public String toString() {
		return String.format("fix(%s)", arg);
	}
}
