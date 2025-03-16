package ru.itmo.stella.typechecker.type;

public class StellaListType extends StellaType.StellaComplexType {
	private StellaType elementType;
	
	public StellaListType(StellaType elementType) {
		super(StellaType.Tag.LIST);
		
		this.elementType = elementType;
	}
	
	public StellaType getElementType() {
		return elementType;
	}

	@Override
	public boolean equalsType(StellaType type) {
		if (type.getTypeTag() != Tag.LIST)
			return false;
		
		StellaListType listType = (StellaListType) type;
		
		return listType.elementType.equals(elementType);
	}
	
	@Override
	public String toString() {
		return String.format("[%s]", elementType);
	}
}
