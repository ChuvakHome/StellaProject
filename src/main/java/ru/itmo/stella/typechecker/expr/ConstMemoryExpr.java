package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.reference.StellaAmbiguousReferenceTypeException;
import ru.itmo.stella.typechecker.exception.reference.StellaUnexpectedReferenceException;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaType.Tag;

public class ConstMemoryExpr extends StellaExpression {
	private String address;
	
	public ConstMemoryExpr(String address) {
		this.address = address;
	}
	
	@Override
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != Tag.REF)
			throw new StellaUnexpectedReferenceException(expected, this);
		
//		StellaRefType expectedRefType = (StellaRefType) expected;
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		throw new StellaAmbiguousReferenceTypeException();
	}

	@Override
	public String toString() {
		return address;
	}
}
