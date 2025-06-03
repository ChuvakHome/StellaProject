package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class SequenceExpr extends StellaExpression {
	private StellaExpression expr1;
	private StellaExpression expr2;
	
	public SequenceExpr(StellaExpression first, StellaExpression second) {
		this.expr1 = first;
		this.expr2 = second;
	}
	
	public StellaExpression getFirstExpression() {
		return expr1;
	}
	
	public StellaExpression getSecondExpression() {
		return expr2;
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		expr1.checkType(context, StellaType.Primitives.UNIT);
		
		expr2.checkType(context, expected);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		expr1.checkType(context, StellaType.Primitives.UNIT);
		
		return expr2.inferType(context);
	}

	@Override
	public String toString() {
		return String.format("%s; %s", expr1, expr2);
	}
}
