package ru.itmo.stella.typechecker.type;

import ru.itmo.stella.typechecker.expr.StellaExpression;

public abstract class StellaType {
	public static enum Tag {
		PRIMITIVE,
		FUNCTION,
		LIST,
		TUPLE,
		RECORD,
		VARIANT,
		SUM
	}
	
	private final Tag tag;
	
	public StellaType(Tag tag) {
		this.tag = tag;
	}
	
	public Tag getTypeTag() {
		return tag;
	}
	
	@Override
	public abstract boolean equals(Object o);
	
	public static class StellaPrimitiveType extends StellaType {
		public StellaPrimitiveType() {
			super(StellaType.Tag.PRIMITIVE);
		}
		
		public boolean equals(Object o) {
			return o == this;
		}
	}
	
	public static abstract class StellaComplexType extends StellaType {
		public StellaComplexType(Tag tag) {
			super(tag);
		}
		
		public boolean equalsType(StellaExpression expr, StellaType type) {
			return equalsType(type);
		}
		
		public abstract boolean equalsType(StellaType type);
		
		public boolean equals(Object o) {
			if (!(o instanceof StellaType))
				return false;
			
			return equalsType((StellaType) o);
		}
	}
	
	public static final class Primitives {
		public static final StellaNatType NAT = new StellaNatType();
		public static final StellaBoolType BOOL = new StellaBoolType();
		public static final StellaUnitType UNIT = new StellaUnitType();
		
		private Primitives() {}
	}
}
