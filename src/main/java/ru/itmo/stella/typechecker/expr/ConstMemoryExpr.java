package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.reference.StellaAmbiguousReferenceTypeException;
import ru.itmo.stella.typechecker.exception.reference.StellaUnexpectedReferenceException;
import ru.itmo.stella.typechecker.type.StellaRefType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaType.Tag;

public class ConstMemoryExpr extends StellaExpression {
	private String address;
	
	public ConstMemoryExpr(String address) {
		this.address = address;
	}
	
	@Override
	protected StellaRefType getCachedType(ExpressionContext context) {
		if (cachedInferedType == null)
			cachedInferedType = new StellaRefType(context.newAutoTypeVar());
		
		return (StellaRefType) cachedInferedType;
	}
	
	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != Tag.REF)
			throw new StellaUnexpectedReferenceException(expected, this);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		throw new StellaAmbiguousReferenceTypeException();
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		return getCachedType(context);
	}

	@Override
	public String toString() {
		return address;
	}
}
