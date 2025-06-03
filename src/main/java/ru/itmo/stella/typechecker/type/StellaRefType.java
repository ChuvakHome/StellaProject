package ru.itmo.stella.typechecker.type;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaRefType extends StellaType.StellaComplexType {
	private StellaType referencedType;
	
	public StellaRefType(StellaType referencedType) {
		super(StellaType.Tag.REF);

		this.referencedType = referencedType;
	}
	
	public StellaType getReferencedType() {
		return referencedType;
	}
	
	@Override
	public StellaType replaceType(StellaType replace, StellaType replacement) {
		referencedType = referencedType.replaceType(replace, replacement);
		
		return this;
	}
	
	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		return Collections.emptyList();
	}

	@Override
	public boolean equalsType(StellaType type) {
		if (type.getTypeTag() != Tag.REF)
			return false;
		
		StellaRefType refType = (StellaRefType) type;
		
		return refType.referencedType.equals(referencedType);
	}
	
	@Override
	public final boolean isSubtype(StellaType type) { // TODO: write the correct impl!
		if (super.isSubtype(type))
			return true;
		else if (type.getTypeTag() != Tag.REF)
			return false;
		
		StellaRefType refType = (StellaRefType) type;
		
		return referencedType.isSubtype(refType.referencedType) && refType.referencedType.isSubtype(referencedType); 
	}
	
	@Override
	public String toString() {
		return "&" + referencedType;
	}
}
