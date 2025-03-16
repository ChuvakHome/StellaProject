package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.tuple.StellaNotATupleException;
import ru.itmo.stella.typechecker.exception.tuple.StellaTupleIndexOutOfBoundsException;
import ru.itmo.stella.typechecker.type.StellaTupleType;
import ru.itmo.stella.typechecker.type.StellaType;

public class DotTupleExpr extends StellaExpression {
	private StellaExpression tupleExpr;
	private int number;
	
	public DotTupleExpr(StellaExpression tupleExpr, int number) {
		this.tupleExpr = tupleExpr;
		this.number = number;
	}
	
	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypesEquality(expected, inferType(context));
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		StellaType exprType = tupleExpr.inferType(context);
		
		if (exprType.getTypeTag() != StellaType.Tag.TUPLE)
			throw new StellaNotATupleException(tupleExpr, exprType, this);
		
		StellaTupleType tupleType = (StellaTupleType) exprType;
		
		if (tupleType.getFieldsCount() < number)
			throw new StellaTupleIndexOutOfBoundsException(number, tupleExpr, tupleType);
		
		return tupleType.getFieldType(number - 1);
	}

	@Override
	public String toString() {
		return String.format("%s.%d", tupleExpr, number);
	}
}
