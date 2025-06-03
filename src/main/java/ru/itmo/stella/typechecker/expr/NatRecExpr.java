package ru.itmo.stella.typechecker.expr;

import java.util.Arrays;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaFunctionType;
import ru.itmo.stella.typechecker.type.StellaType;

public class NatRecExpr extends StellaExpression {
	private StellaExpression iterCountExpr;
	private StellaExpression initValueExpr;
	private StellaExpression iterFunc;
	
	public NatRecExpr(StellaExpression iterCountExpr, StellaExpression initValueExpr, StellaExpression iterFunc) {
		this.iterCountExpr = iterCountExpr;
		this.initValueExpr = initValueExpr;
		this.iterFunc = iterFunc;
	}
	
	public StellaExpression getIterationsCount() {
		return iterCountExpr;
	}
	
	public StellaExpression getInitValue() {
		return initValueExpr;
	}
	
	public StellaExpression getIiterationsFunc() {
		return iterFunc;
	}

	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		iterCountExpr.checkType(context, StellaType.Primitives.NAT);
		initValueExpr.checkType(context, expected);
		
		StellaFunctionType iterFuncType = new StellaFunctionType(
				Arrays.asList(StellaType.Primitives.NAT), 
				new StellaFunctionType(
							Arrays.asList(expected),
							expected
						)
			);
		
		iterFunc.checkType(context, iterFuncType);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		iterCountExpr.checkType(context, StellaType.Primitives.NAT);
		
		StellaType initValueType = initValueExpr.inferType(context);
		
		StellaFunctionType iterFuncType = new StellaFunctionType(
					Arrays.asList(StellaType.Primitives.NAT), 
					new StellaFunctionType(
								Arrays.asList(initValueType),
								initValueType
							)
				);
		
		iterFunc.checkType(context, iterFuncType);
		
		return initValueType;
	}

	@Override
	public String toString() {
		return String.format("Nat::rec(%s, %s, %s)", iterCountExpr, initValueExpr, iterFunc);
	}
}
