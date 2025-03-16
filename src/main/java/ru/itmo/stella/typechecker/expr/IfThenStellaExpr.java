package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.StellaUnexpectedTypeForExpressionException;
import ru.itmo.stella.typechecker.type.StellaType;

public class IfThenStellaExpr extends StellaExpression {
	private final StellaExpression conditionExpr;
	private final StellaExpression trueExpr, falseExpr;
	
	public IfThenStellaExpr(
				StellaExpression condition,
				StellaExpression trueExpression,
				StellaExpression falExpression
			) {
		this.conditionExpr = condition;
		this.trueExpr = trueExpression;
		this.falseExpr = falExpression;
	}
	
	public StellaExpression getConditionExpression() {
		return conditionExpr;
	}
	
	public StellaExpression getTrueBranchExpression() {
		return trueExpr;
	}
	
	public StellaExpression getFalseBranchExpression() {
		return falseExpr;
	}
	
	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		conditionExpr.checkType(context, StellaType.Primitives.BOOL);
		
		try {
			trueExpr.checkType(context, expected);
			falseExpr.checkType(context, expected);
		} catch (StellaUnexpectedTypeForExpressionException e) {
			throw new StellaUnexpectedTypeForExpressionException(this, expected, trueExpr.inferType(context));
		}
		
//		StellaType trueExprType = null;
//		
//		try {
//			trueExprType = trueExpr.inferType(context);
//			falseExpr.checkType(context, trueExprType);
//		} catch (StellaUnexpectedTypeForExpressionException e) {
//			throw new StellaUnexpectedTypeForExpressionException(this, trueExprType, falseExpr.inferType(context));
//		}
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		conditionExpr.checkType(context, StellaType.Primitives.BOOL);
		
		StellaType trueBranchType = trueExpr.inferType(context);
		
		falseExpr.checkType(context, trueBranchType);
		
		return trueBranchType;
	}
	
	public String toString() {
		return String.format("if %s then %s else %s", 
					conditionExpr.toString(),
					trueExpr.toString(),
					falseExpr.toString()
				);
	}
}
