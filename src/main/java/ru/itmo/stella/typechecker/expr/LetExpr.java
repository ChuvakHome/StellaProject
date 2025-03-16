package ru.itmo.stella.typechecker.expr;

import java.util.Map;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class LetExpr extends StellaExpression {
	private String replaceName;
	private StellaExpression subexpression;
	private StellaExpression expression;
	
	public LetExpr(String replaceName, StellaExpression subexpression, StellaExpression expression) {
		this.replaceName = replaceName;
		this.subexpression = subexpression;
		this.expression = expression;
	}
	
	public String getReplaceName() {
		return replaceName;
	}
	
	public StellaExpression getSubexpression() {
		return subexpression;
	}
	
	public StellaExpression getExpression() {
		return expression;
	}
	
	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypesEquality(expected, inferType(context));
	}
	
	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		StellaType subexprType = subexpression.inferType(context);
		
		ExpressionContext subctx = new ExpressionContext(context, Map.of(replaceName, subexprType));
		
		return expression.inferType(subctx);
	}
	
	@Override
	public String toString() {
		return String.format("let %s = %s in %s", replaceName, subexpression, expression);
	}
}
