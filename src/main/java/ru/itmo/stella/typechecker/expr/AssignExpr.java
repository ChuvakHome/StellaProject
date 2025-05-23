package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.reference.StellaNotAReferenceException;
import ru.itmo.stella.typechecker.type.StellaRefType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaType.Tag;

public class AssignExpr extends StellaExpression {
	private StellaExpression lhs;
	private StellaExpression rhs;
	
	public AssignExpr(StellaExpression leftPart, StellaExpression rightPart) {
		this.lhs = leftPart;
		this.rhs = rightPart;
	}
	
	public StellaExpression getLeftPart() {
		return lhs;
	}
	
	public StellaExpression getRightPart() {
		return rhs;
	}
	
	@Override
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypeMatching(context, expected, inferType(context));
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		StellaType lhsType = lhs.inferType(context);
		
		if (lhsType.getTypeTag() != Tag.REF)
			throw new StellaNotAReferenceException(this);
		
		StellaRefType lhsRefType = (StellaRefType) lhsType; 
		
		rhs.checkType(context, lhsRefType.getReferencedType());
		
		return StellaType.Primitives.UNIT;
	}

	@Override
	public String toString() {
		return String.format("%s := %s", lhs, rhs);
	}	
}
