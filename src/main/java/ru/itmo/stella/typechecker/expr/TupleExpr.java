package ru.itmo.stella.typechecker.expr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected == StellaType.TOP)
			checkTypeMatching(context, expected, inferType(context));
		else {
			if (expected.getTypeTag() != Tag.TUPLE)
				throw new StellaUnexpectedTupleException(expected, this);
			
			StellaTupleType expectedTupleType = (StellaTupleType) expected;
			
			final int componentsCount = tupleComponents.size();
			
			if (componentsCount != expectedTupleType.getFieldsCount())
				throw new StellaUnexpectedTupleLengthException(expectedTupleType, componentsCount, this);
			
			Iterator<StellaExpression> actualValues = tupleComponents.iterator();
			Iterator<StellaType> expectedTypesIter = expectedTupleType.getFieldTypes().iterator();
			
			while (expectedTypesIter.hasNext()) {
				StellaExpression actualComponentValue = actualValues.next();
				StellaType expectedComponentType = expectedTypesIter.next();
				
				actualComponentValue.checkType(context, expectedComponentType);
			}
		}
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
