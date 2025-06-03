package ru.itmo.stella.typechecker.expr;

import java.util.List;

import ru.itmo.stella.typechecker.constraint.StellaConstraint;
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
	protected void doTypeCheckConstrainted(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType lhsType = lhs.inferType(context);
		
		StellaType referencedType = getCachedType(context); 
		
		context.addConstraints(
					List.of(
						new StellaConstraint(lhsType, new StellaRefType(referencedType), lhs),
						new StellaConstraint(StellaType.Primitives.UNIT, expected, this)
					)
				);
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypeMatching(context, expected, inferType(context));
	}
	
	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		StellaType lhsType = lhs.inferType(context);
		
		if (lhsType.getTypeTag() != Tag.REF) {
			if (lhsType.getTypeTag() != Tag.TYPE_VAR)
				throw new StellaNotAReferenceException.StellaNotAssignableReferenceException(lhs);
			
			return doTypeInferenceConstrainted(context);
		}
		
		return doTypeInference(context); 
	}
	
	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		StellaRefType lhsRefType = (StellaRefType) lhs.inferType(context); 
		
		rhs.checkType(context, lhsRefType.getReferencedType());
		
		return StellaType.Primitives.UNIT;
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		StellaType lhsType = lhs.inferType(context);
		
		StellaType referencedType = getCachedType(context); 
		
		context.addConstraint(
					new StellaConstraint(lhsType, new StellaRefType(referencedType), lhs)
				);
		
		return StellaType.Primitives.UNIT;
	}

	@Override
	public String toString() {
		return String.format("%s := %s", lhs, rhs);
	}	
}
