package ru.itmo.stella.typechecker.constraint;

import java.util.Objects;
import java.util.Set;

import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaTypeVar;
import ru.itmo.stella.typechecker.util.TypeVarUtils;

public class StellaConstraint {
	private StellaType leftType;
	private StellaType rightType;
	
	private Set<StellaTypeVar> leftVarTypes;
	private Set<StellaTypeVar> rightVarTypes;
	
	private StellaExpression relatedExpr;
	
	public StellaConstraint(StellaType leftType, StellaType rightType, StellaExpression relatedExpression) {
		this.leftType = leftType;
		leftVarTypes = TypeVarUtils.collectVarTypes(leftType);
		
		this.rightType = rightType;
		rightVarTypes = TypeVarUtils.collectVarTypes(rightType);
		
		this.relatedExpr = relatedExpression;
	}
	
	public StellaType getLeftType() {
		return leftType;
	}
	
	public Set<StellaTypeVar> getLeftTypeVariables() {
		return leftVarTypes;
	}
	
	public StellaType getRightType() {
		return rightType;
	}
	
	public Set<StellaTypeVar> getRightTypeVariables() {
		return rightVarTypes;
	}
	
	public StellaExpression getRelatedExpression() {
		return relatedExpr;
	}
	
	public boolean isPrimitive() {
		StellaType.Tag leftTag = leftType.getTypeTag();
		StellaType.Tag rightTag = rightType.getTypeTag();
		
		if (leftTag != rightTag)
			return false;
		
		return leftType.equals(rightType);
	}
	
	public int hashCode() {
		return Objects.hash(leftType, rightType);
	}
	
	public boolean equals(Object o) {
		if (o instanceof StellaConstraint constraint) {
			return constraint.leftType.equals(leftType) && constraint.rightType.equals(rightType);
		}
		
		return false;
	}
			
	public String toString() {
		return String.format("%s = %s", leftType, rightType);
	}
}
