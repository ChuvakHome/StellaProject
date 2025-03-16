package ru.itmo.stella.typechecker.expr;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.function.StellaUnexpectedLambdaException;
import ru.itmo.stella.typechecker.exception.function.StellaUnexpectedNumberOfParametersInLambdaException;
import ru.itmo.stella.typechecker.exception.function.StellaUnexpectedTypeForParameterException;
import ru.itmo.stella.typechecker.type.StellaFunctionType;
import ru.itmo.stella.typechecker.type.StellaType;

public class AbstractionExpr extends StellaExpression {
	private Map<String, StellaType> fnArgs;
	private StellaExpression fnBody;
	
	public AbstractionExpr(Map<String, StellaType> fnArgs, StellaExpression fnBody) {
		this.fnArgs = Collections.unmodifiableMap(fnArgs);
		this.fnBody = fnBody;
	}
	
	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.FUNCTION)
			throw new StellaUnexpectedLambdaException(expected, this);
		
		StellaFunctionType expectedFnType = (StellaFunctionType) expected;
		
		if (expectedFnType.getArity() != fnArgs.size())
			throw new StellaUnexpectedNumberOfParametersInLambdaException(
						expectedFnType,
						fnArgs.size(),
						this
					); 
		
		Iterator<Map.Entry<String, StellaType>> it1 = fnArgs.entrySet().iterator();
		Iterator<StellaType> it2 = expectedFnType.getArgumensTypesList().iterator();
	
		while (it1.hasNext() && it2.hasNext()) {
			Map.Entry<String, StellaType> entry = it1.next();
			StellaType argType = it2.next();
			
			if (!argType.equals(entry.getValue()))
				throw new StellaUnexpectedTypeForParameterException(this, entry.getKey(), argType, entry.getValue());
		}
		
		
		ExpressionContext subctx = new ExpressionContext(context, fnArgs);
		
		fnBody.checkType(subctx, expectedFnType.getReturnType());
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		ExpressionContext subctx = new ExpressionContext(context, fnArgs);
		
		StellaType returnType = fnBody.inferType(subctx);
		
		return new StellaFunctionType(fnArgs, returnType);
	}

	public String toString() {
		return String.format(
					"fn(%s)\n{\n  return %s\n}",
					String.join(
						",",
						fnArgs.entrySet().stream().map(e -> e.getKey() + " : " + e.getValue()).toList()
					),
					fnBody.toString()
				);
	}
}
