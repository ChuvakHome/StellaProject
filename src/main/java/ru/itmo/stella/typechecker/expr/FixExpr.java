package ru.itmo.stella.typechecker.expr;

import java.util.Arrays;

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
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType argType = arg.inferType(context);
		
		if (argType.getTypeTag() != StellaType.Tag.FUNCTION)
			throw new StellaNotAFunctionException(argType, arg, this);
		
		StellaFunctionType fixRequiredArgType = new StellaFunctionType(
					Arrays.asList(expected), 
					expected
				);
		
		arg.checkType(context, fixRequiredArgType);
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		StellaType argType = arg.inferType(context);
		
		if (argType.getTypeTag() != StellaType.Tag.FUNCTION)
			throw new StellaNotAFunctionException(argType, arg, this);
		
		StellaFunctionType argFnType = (StellaFunctionType) argType;
		
		StellaType retType = argFnType.getReturnType();
		
		StellaFunctionType fixRequiredArgType = new StellaFunctionType(
					Arrays.asList(retType), 
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
