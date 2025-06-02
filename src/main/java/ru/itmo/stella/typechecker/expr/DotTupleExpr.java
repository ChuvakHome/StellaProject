package ru.itmo.stella.typechecker.expr;

import java.util.List;

import ru.itmo.stella.typechecker.constraint.StellaConstraint;
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
	protected void doTypeCheckConstrainted(ExpressionContext context, StellaType expected) throws StellaException {
		if (number <= 0 || number > 2)
			throw new StellaTupleIndexOutOfBoundsException(number, this);
		
		StellaType exprType = tupleExpr.inferType(context);
		
		List<StellaType> tupleFieldsTypes = List.of(context.newAutoTypeVar(), context.newAutoTypeVar());
		
		context.addConstraints(
					List.of(
						new StellaConstraint(
							exprType,
							new StellaTupleType(tupleFieldsTypes),
							tupleExpr
						),
						new StellaConstraint(
							tupleFieldsTypes.get(number - 1),
							expected,
							this
						)
					)
				);
	}
	
	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypeMatching(context, expected, inferType(context));
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		StellaType exprType = tupleExpr.inferType(context);
		
		if (exprType.getTypeTag() != StellaType.Tag.TUPLE)
			throw new StellaNotATupleException(tupleExpr, exprType, this);
		
		StellaTupleType tupleType = (StellaTupleType) exprType;
		
		if (number <= 0)
			throw new StellaTupleIndexOutOfBoundsException(number, this);
		else if (tupleType.getFieldsCount() < number)
			throw new StellaTupleIndexOutOfBoundsException(number, tupleExpr, tupleType);
		
		return tupleType.getFieldType(number - 1);
	}

	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		if (number <= 0 || number > 2)
			throw new StellaTupleIndexOutOfBoundsException(number, this);
		
		StellaType exprType = tupleExpr.inferType(context);
		
		List<StellaType> tupleFieldsTypes = List.of(context.newAutoTypeVar(), context.newAutoTypeVar());
		
		context.addConstraint(
					new StellaConstraint(
						exprType,
						new StellaTupleType(tupleFieldsTypes),
						tupleExpr
					)
				);
		
		return tupleFieldsTypes.get(number - 1);
	}
	
	@Override
	public String toString() {
		return String.format("%s.%d", tupleExpr, number);
	}
}
