package ru.itmo.stella.typechecker.type;

public class StellaSumType extends StellaType.StellaComplexType {
	private StellaType left, right;
	
	public StellaSumType(StellaType left, StellaType right) {
		super(StellaType.Tag.SUM);
		
		this.left = left;
		this.right = right;
	}
	
	public StellaType[] getTypes() {
		return new StellaType[] { left, right };
	}
	
	public StellaType getLeftType() {
		return left;
	}
	
	public StellaType getRightType() {
		return right;
	}

	@Override
	public boolean equalsType(StellaType type) {
		StellaSumType sumType = (StellaSumType) type;
		
		return sumType.left.equals(left) && sumType.right.equals(right); 
	}
	
	public String toString() {
		return String.format("%s + %s", left, right);
	}
}
