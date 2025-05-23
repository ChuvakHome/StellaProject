package ru.itmo.stella.typechecker.expr;

import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.function.StellaIncorrectNumberOfArgumentsException;
import ru.itmo.stella.typechecker.exception.function.StellaNotAFunctionException;
import ru.itmo.stella.typechecker.type.StellaFunctionType;
import ru.itmo.stella.typechecker.type.StellaType;

public class ApplicationExpr extends StellaExpression {
	private StellaExpression fnExpr;
	private List<StellaExpression> arguments;
	
	public ApplicationExpr(StellaExpression fnExpr, List<StellaExpression> arguments) {
		this.fnExpr = fnExpr;
		this.arguments = Collections.unmodifiableList(arguments);
	}
	
	public StellaExpression getFunctionExpression() {
		return fnExpr;
	}
	
	public List<StellaExpression> getArguments() {
		return arguments;
	}
	
	public StellaExpression getArgument(int i) {
		return arguments.get(i);
	}

	@Override
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType fnRawType = fnExpr.inferType(context);
		
		if (fnRawType.getTypeTag() != StellaType.Tag.FUNCTION)
			throw new StellaNotAFunctionException(fnRawType, fnExpr, this);
		
		StellaFunctionType fnType = (StellaFunctionType) fnRawType;
		
		if (fnType.getArity() != arguments.size())
			throw new StellaIncorrectNumberOfArgumentsException(
						fnType,
						fnExpr,
						arguments.size(),
						this
					);
		
		List<StellaType> argsTypes = fnType.getArgumensTypesList();
		
		for (int i = 0; i < arguments.size(); ++i) {
			StellaExpression arg = arguments.get(i);
			
			arg.checkType(context, argsTypes.get(i));
		}
		
		checkTypeMatching(context, expected, fnType.getReturnType());
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		StellaType fnRawType = fnExpr.inferType(context);
		
		if (fnRawType.getTypeTag() != StellaType.Tag.FUNCTION)
			throw new StellaNotAFunctionException(fnRawType, fnExpr, this);
		
		StellaFunctionType fnType = (StellaFunctionType) fnRawType;
		
		if (fnType.getArity() != arguments.size())
			throw new StellaIncorrectNumberOfArgumentsException(
						fnType,
						fnExpr,
						arguments.size(),
						this
					);
		
		List<StellaType> argsTypes = fnType.getArgumensTypesList();
		
		for (int i = 0; i < arguments.size(); ++i) {
			StellaExpression arg = arguments.get(i);
			
			arg.checkType(context, argsTypes.get(i));
		}
		
		doTypeCheck(context, fnType.getReturnType());
		
		return fnType.getReturnType();
	}

	public String toString() {
		if (fnExpr instanceof VarExpr fnVar)
			return String.format("%s(%s)", fnVar, String.join(", ", arguments.stream().map(StellaExpression::toString).toList()));
		
		return String.format("(%s)(%s)", fnExpr, String.join(", ", arguments.stream().map(StellaExpression::toString).toList()));
	}
}
