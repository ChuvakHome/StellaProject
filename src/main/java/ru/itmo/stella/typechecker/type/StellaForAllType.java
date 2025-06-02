package ru.itmo.stella.typechecker.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaForAllType extends StellaType {
	private List<StellaTypeVar> typeVariables;
	private StellaType innerType;
	
	public StellaForAllType(List<StellaTypeVar> typeVariables, StellaType innerType) {
		super(Tag.FOR_ALL_TYPE);
		
		this.typeVariables = new ArrayList<>(typeVariables);
		this.innerType = innerType;
	}
	
	public List<StellaTypeVar> getTypeVariables() {
		return typeVariables;
	}
	
	public StellaTypeVar getTypeVariable(int i) {
		return typeVariables.get(i);
	}

	public StellaType getInnerType() {
		return innerType;
	}
	
	@Override
	public StellaType replaceType(StellaType replace, StellaType replacement) {
		innerType.replaceType(replace, replacement);
		
		return this;
	}
	
	public boolean equalsStrict0(StellaType otherType, boolean strict) {
		if (!(otherType instanceof StellaForAllType))
			return false;
		
		StellaForAllType forAllType = (StellaForAllType) otherType;
		
		List<StellaTypeVar> otherTypeVars = forAllType.getTypeVariables();
		
		if (typeVariables.size() != otherTypeVars.size())
			return false;
		
		final int sz = typeVariables.size();
		
		for (int i = 0; i < sz; ++i) {
			StellaTypeVar typeVar = typeVariables.get(i);
			StellaTypeVar otherTypeVar = otherTypeVars.get(i);
			
			forAllType.replaceType(otherTypeVar, typeVar);
		}
		
		boolean eq = strict 
						? forAllType.innerType.equalsStrict(innerType)
						: forAllType.innerType.equalsWeak(innerType);
		
		for (int i = 0; i < sz; ++i) {
			StellaTypeVar typeVar = typeVariables.get(i);
			StellaTypeVar otherTypeVar = otherTypeVars.get(i);
			
			forAllType.replaceType(typeVar, otherTypeVar);
		}
		
		return eq;
	}

	@Override
	public boolean equalsStrict(StellaType otherType) {
		if (!(otherType instanceof StellaForAllType))
			return false;
		
		return equalsStrict0(otherType, true);
	}
	
	@Override
	public boolean equalsWeak(StellaType otherType) {
		if (equalsFast(otherType))
			return true;
		
		return equalsStrict0(otherType, false);
	}

	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		return List.of();
	}
	
	public String toString() {
		return String.format(
					"forall %s.%s", 
					String.join(", ", typeVariables.stream().map(StellaTypeVar::toString).toList()),
					innerType
				);
	}
}
