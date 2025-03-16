package ru.itmo.stella.typechecker.expr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.tuple.StellaUnexpectedTupleException;
import ru.itmo.stella.typechecker.exception.tuple.StellaUnexpectedTupleLengthException;
import ru.itmo.stella.typechecker.type.StellaTupleType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaType.Tag;

public class TupleExpr extends StellaExpression {
	private List<StellaExpression> tupleComponents;
	
	public TupleExpr(List<StellaExpression> tupleComponents) {
		this.tupleComponents = Collections.unmodifiableList(tupleComponents);
	}
	
	public List<StellaExpression> getTupleComponents() {
		return tupleComponents;
	}
	
	public StellaExpression getTupleComponent(int i) {
		return tupleComponents.get(i);
	}
	
	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		StellaTupleType actualTupleType = inferType(context);
		
		if (expected.getTypeTag() != Tag.TUPLE)
			throw new StellaUnexpectedTupleException(expected, this);
		else {
			StellaTupleType expectedTupleType = (StellaTupleType) expected;
			
			if (expectedTupleType.getFieldsCount() != actualTupleType.getFieldsCount())
				throw new StellaUnexpectedTupleLengthException(expectedTupleType, actualTupleType.getFieldsCount(), this);
		}
		
		checkTypesEquality(expected, actualTupleType);
	}

	@Override
	public StellaTupleType inferType(ExpressionContext context) throws StellaException {
		List<StellaType> componentsTypes = new ArrayList<>(tupleComponents.size());
		
		for (StellaExpression expr: tupleComponents)
			componentsTypes.add(expr.inferType(context));
		
		return new StellaTupleType(componentsTypes);
	}

	@Override
	public String toString() {
		return String.format("{%s}",
					String.join(", ", tupleComponents.stream().map(StellaExpression::toString).toList())
				);
	}

}
