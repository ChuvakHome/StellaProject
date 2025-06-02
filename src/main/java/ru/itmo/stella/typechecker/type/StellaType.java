package ru.itmo.stella.typechecker.type;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternAscExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public abstract class StellaType {
	public static enum Tag {
		NO_TYPE,
		PRIMITIVE,
		FUNCTION,
		LIST,
		TUPLE,
		RECORD,
		VARIANT,
		SUM,
		REF,
		
		TOP,
		BOTTOM,
		
		TYPE_VAR,
		
		FOR_ALL_TYPE,
	}
	
	private final Tag tag;
	
	public StellaType(Tag tag) {
		this.tag = tag;
	}
	
	public Tag getTypeTag() {
		return tag;
	}
	
	public boolean isSubtype(StellaType type) {
		return equals(type) || type == StellaType.TOP;
	}
	
	public abstract StellaType replaceType(StellaType replace, StellaType replacement);
	
	public boolean equalsFast(StellaType type) {
		if (type.getTypeTag() == Tag.TYPE_VAR)
			return type.equals(this);
		
		return false;
	}
	
	public abstract boolean equalsStrict(StellaType type);
	
	public boolean equalsWeak(StellaType type) {
		if (equalsFast(type))
			return true;
		
		return equalsStrict(type);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof StellaType stellaType)
			return equalsWeak(stellaType);
		
		return false;
	}
	
	protected abstract List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException;
	
	private static PatternExpr unpackPattern(PatternExpr pattern) {
		switch (pattern.getPatternTag()) {
			case ASC:
				return unpackPattern(((PatternAscExpr) pattern).getAscriptionPattern());
			default:
				return pattern;
		}
	}
	
	public List<? extends PatternExpr> checkPatternsExhaustiveness(Collection<? extends PatternExpr> patterns) throws StellaException {
		List<PatternExpr> unpackedPatterns = patterns.stream().map(StellaType::unpackPattern).toList();
		
		if (unpackedPatterns.stream().anyMatch(p -> p.getPatternTag() == PatternExpr.Tag.VAR))
			return Collections.emptyList();
		
		return checkPatternsExhaustivenessForType(unpackedPatterns);
	}
	
	public static abstract class StellaPrimitiveType extends StellaType {
		public static enum PrimitiveTypeKind {
			NAT,
			BOOL,
			UNIT
		}
		
		public StellaPrimitiveType() {
			super(StellaType.Tag.PRIMITIVE);
		}
		
		@Override
		public StellaType replaceType(StellaType replace, StellaType replacement) {
			return this;
		}
		
		public boolean equalsStrict(StellaType stellaType) {
			return stellaType == this;
		}
	}
	
	public static abstract class StellaComplexType extends StellaType {
		public StellaComplexType(Tag tag) {
			super(tag);
		}
		
		public abstract boolean equalsType(StellaType type);
		
		public boolean equalsStrict(StellaType otherType) {
			Tag tag = getTypeTag();
			Tag otherTag = otherType.getTypeTag();
			
			if (tag != otherTag)
				return false;
			
			return equalsType(otherType);
		}
	}
	
	public static final class Primitives {
		public static final StellaNatType NAT = new StellaNatType();
		public static final StellaBoolType BOOL = new StellaBoolType();
		public static final StellaUnitType UNIT = new StellaUnitType();
		
		private Primitives() {}
	}
	
	public static final StellaTopType TOP = new StellaTopType();
	public static final StellaBottomType BOTTOM = new StellaBottomType();
	
	public static final StellaNoType NO_TYPE = new StellaNoType();
}
