package ru.itmo.stella.typechecker.expr;

import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
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
	protected StellaListType getCachedType(ExpressionContext context) {
		if (cachedInferedType == null)
			cachedInferedType = new StellaListType(context.newAutoTypeVar());
		
		return (StellaListType) cachedInferedType;
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
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
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		if (elements.isEmpty()) {
			if (context.isExtensionUsed(StellaLanguageExtension.AMBIGUOUS_TYPE_AS_BOTTOM))
				return new StellaListType(StellaType.BOTTOM);
			
			throw new StellaAmbiguousListException.StellaEmptyListIsAmbiguousException();
		}
		
		StellaExpression head = elements.get(0);
		StellaType headType = head.inferType(context);
		
		for (int i = 1; i < elements.size(); ++i)
			elements.get(i).checkType(context, headType);
			
		return new StellaListType(headType);
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		if (elements.isEmpty())
			return getCachedType(context);
		
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
