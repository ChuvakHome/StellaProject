package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.list.StellaUnexpectedListException;
import ru.itmo.stella.typechecker.type.StellaListType;
import ru.itmo.stella.typechecker.type.StellaType;

public class ConsListExpr extends StellaExpression {
	private StellaExpression head;
	private StellaExpression tail;
	
	public ConsListExpr(StellaExpression head, StellaExpression tail) {
		this.head = head;
		this.tail = tail;
	}
	
	public StellaExpression getHead() {
		return head;
	}
	
	public StellaExpression getTail() {
		return tail;
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected == StellaType.TOP)
			inferType(context);
		else {
			if (expected.getTypeTag() != StellaType.Tag.LIST)
				throw new StellaUnexpectedListException(expected, this);
			
			StellaListType expectedListType = (StellaListType) expected;
			
			head.checkType(context, expectedListType.getElementType());
			tail.checkType(context, expectedListType);
		}
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		StellaType headType = head.inferType(context);
		
		StellaListType listType = new StellaListType(headType);
		
		tail.checkType(context, listType);
		
		return listType;
	}

	public String toString() {
		return String.format("cons(%s, %s)", head, tail);
	}
}
