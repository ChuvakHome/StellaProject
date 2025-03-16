package ru.itmo.stella.typechecker.type;

import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.tuple.StellaUnexpectedTupleLengthException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType.StellaComplexType;

public class StellaTupleType extends StellaComplexType {
	private List<StellaType> fieldTypes;
	
	public StellaTupleType(List<StellaType> fieldTypes) {
		super(StellaType.Tag.TUPLE);
		
		this.fieldTypes = Collections.unmodifiableList(fieldTypes);
	}
	
	public int getFieldsCount() {
		return fieldTypes.size();
	}
	
	public List<StellaType> getFieldTypes() {
		return fieldTypes;
	}
	
	public StellaType getFieldType(int i) {
		return fieldTypes.get(i);
	}

	@Override
	public boolean equalsType(StellaType type) {
		StellaTupleType tupleType = (StellaTupleType) type;
		
		return tupleType.fieldTypes.equals(fieldTypes);
	}
	
	public static void checkTupleTypes(StellaTupleType expectedType, StellaTupleType actualType, StellaExpression actualExpr) throws StellaException {
		if (expectedType.getFieldsCount() != actualType.getFieldsCount())
			throw new StellaUnexpectedTupleLengthException(expectedType, actualType.getFieldsCount(), actualExpr);
	}
	
	public String toString() {
		return String.format(
					"{%s}", 
					String.join(
						", ", 
						fieldTypes.stream().map(StellaType::toString).toList()
					)
				);
	}
}
