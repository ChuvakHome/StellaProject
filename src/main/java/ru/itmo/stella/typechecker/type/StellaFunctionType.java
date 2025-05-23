package ru.itmo.stella.typechecker.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public final class StellaFunctionType extends StellaType.StellaComplexType {
	private final int arity;
	private Map<String, StellaType> argsTypes;
	private StellaType returnType;
	
	public StellaFunctionType(Map<String, StellaType> argsTypes, StellaType returnType) {
		super(StellaType.Tag.FUNCTION);
		
		this.arity = argsTypes.values().size();
		this.argsTypes = Collections.unmodifiableMap(argsTypes);
		this.returnType = returnType;
	}
	
	public StellaFunctionType(List<StellaType> argsTypes, StellaType returnType) {
		this(convertAnnonymousArgs(argsTypes), returnType);
	}
	
	public int getArity() {
		return arity;
	}
	
	public Map<String, StellaType> getArgumensTypes() {
		return argsTypes;
	}
	
	public List<StellaType> getArgumensTypesList() {
		return Collections.unmodifiableList(
					new ArrayList<>(
							argsTypes.values()
						)
				);
	}
	
	public StellaType getReturnType() {
		return returnType;
	}
	
	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		return Collections.emptyList();
	}
	
	public boolean equalsType(StellaType type) {
		StellaFunctionType fnType = (StellaFunctionType) type;
		
		if (arity != fnType.arity)
			return false;
		
		Iterator<StellaType> it1 = argsTypes.values().iterator();
		Iterator<StellaType> it2 = fnType.argsTypes.values().iterator();
	
		while (it1.hasNext() && it2.hasNext()) {
			StellaType type1 = it1.next();
			StellaType type2 = it2.next();
			
			if (!type2.equals(type1))
				return false;
		}
		
		return returnType.equals(fnType.returnType);
	}
	
	@Override
	public final boolean isSubtype(StellaType type) { // TODO: write the correct impl!
		if (super.isSubtype(type))
			return true;
		else if (type.getTypeTag() != Tag.FUNCTION)
			return false;
		
		StellaFunctionType fnType = (StellaFunctionType) type;
		
		if (arity != fnType.arity)
			return false;
		
		Iterator<StellaType> it1 = argsTypes.values().iterator();
		Iterator<StellaType> it2 = fnType.argsTypes.values().iterator();
	
		while (it1.hasNext() && it2.hasNext()) {
			StellaType argType = it1.next();
			StellaType otherArgType = it2.next();
			
			if (!otherArgType.isSubtype(argType))
				return false;
		}
		
		return returnType.isSubtype(fnType.returnType);
	}
	
	public String toString() {
		return String.format("fn(%s) -> %s",
					String.join(", ", argsTypes.values().stream().map(StellaType::toString).toList()),
					returnType
				);
	}
	
	private static Map<String, StellaType> convertAnnonymousArgs(List<StellaType> argsList) {
		Map<String, StellaType> argsMap = new LinkedHashMap<>(argsList.size());
		
		for (int i = 0; i < argsList.size(); ++i)
			argsMap.put("$" + i, argsList.get(i));
		
		return argsMap;
	}
}
