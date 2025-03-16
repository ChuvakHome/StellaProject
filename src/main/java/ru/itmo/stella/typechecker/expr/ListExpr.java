package ru.itmo.stella.typechecker.expr;

import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.list.StellaAmbiguousListException;
import ru.itmo.stella.typechecker.exception.list.StellaUnexpectedListException;
import ru.itmo.stella.typechecker.type.StellaListType;
import ru.itmo.stella.typechecker.type.StellaType;

public class ListExpr extends StellaExpression {
	private List<StellaExpression> elements;
	
	public ListExpr(List<StellaExpression> elements) {
		this.elements = Collections.unmodifiableList(elements);
	}
	
	public List<StellaExpression> getElements() {
		return elements;
	}
	
	public StellaExpression getElement(int i) {
		return elements.get(i);
	}
	
	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.LIST)
			throw new StellaUnexpectedListException(expected, this);
		
		if (elements.isEmpty())
			return;
		
		StellaListType listType = (StellaListType) expected;
		StellaType listElemType = listType.getElementType();
		
		for (StellaExpression elem: elements)
			elem.checkType(context, listElemType);
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		if (elements.isEmpty())
			throw new StellaAmbiguousListException.StellaEmptyListIsAmbiguousException();
		
		StellaExpression head = elements.get(0);
		StellaType headType = head.inferType(context);
		
		for (int i = 1; i < elements.size(); ++i)
			elements.get(i).checkType(context, headType);
			
		return new StellaListType(headType);
	}

	public String toString() {
		return elements.toString();
	}
}
