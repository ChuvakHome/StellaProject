package ru.itmo.stella.typechecker.expr;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaTypeVar;
import ru.itmo.stella.typechecker.util.IntCounter;

public class ExpressionContext  {
	public static final ExpressionContext EMPTY_CONTEXT = new ExpressionContext(new IntCounter(1));
	
	private Set<StellaConstraint> constraints;
	
	private StellaType exceptionType;
	private Set<StellaLanguageExtension> extensions;
	
	private ExpressionContext parentContext;
	private Map<String, StellaType> varTypes;
	
	private IntCounter typeVarCounter;
	
	private Set<StellaTypeVar> typeVariables;
	
	public ExpressionContext(
		ExpressionContext parentContext, 
		Map<String, StellaType> map, 
		Set<StellaTypeVar> typeVariables,
		List<StellaConstraint> constraints,
		IntCounter typeVarCounter
	) {
		this.parentContext = parentContext; 
		this.varTypes = new HashMap<>(map);
		this.constraints = new LinkedHashSet<>(constraints);
		this.extensions = parentContext != null ? parentContext.extensions : new HashSet<>();
		this.exceptionType = parentContext != null ? parentContext.exceptionType : null;
		
		this.typeVarCounter = typeVarCounter;
		this.typeVariables = new HashSet<>(typeVariables);
	}
	
	public ExpressionContext(ExpressionContext parentContext, Map<String, StellaType> map, IntCounter typeVarCounter) {
		this(parentContext, map, Set.of(), List.of(), typeVarCounter);
	}
	
	public ExpressionContext(ExpressionContext parentContext, Map<String, StellaType> map) {
		this(parentContext, map, Set.of(), List.of(), parentContext != null ? parentContext.getTypeVarCounter() : null);
	}
	
	public ExpressionContext(ExpressionContext parentContext, IntCounter typeVarCounter) {
		this(parentContext, Map.of(), Set.of(), List.of(), typeVarCounter);
	}
	
	public ExpressionContext(ExpressionContext parentContext) {
		this(parentContext, Map.of(), Set.of(), List.of(), parentContext != null ? parentContext.getTypeVarCounter() : null);
	}
	
	public ExpressionContext(Map<String, StellaType> map, List<StellaConstraint> constraints, IntCounter typeVarCounter) {
		this(null, map, Set.of(), constraints, typeVarCounter);
	}
	
	public ExpressionContext(IntCounter typeVarCounter) {
		this(Collections.emptyMap(), List.of(), typeVarCounter);
	}
	
	public void add(String var, StellaType type) {
		varTypes.put(var, type);
	}
	
	public void addAll(Map<String, StellaType> types) {
		varTypes.putAll(types);
	}
	
	public void addAll(ExpressionContext ctx) {
		varTypes.putAll(ctx.varTypes);
		
		if (ctx.parentContext != null)
			addAll(ctx.parentContext);
	}
	
	public Set<Map.Entry<String, StellaType>> getDeclaredVarsTypes() {
		return varTypes.entrySet();
	}
	
	public Set<String> getDeclaredVars() {
		return varTypes.keySet();
	}
	
	public StellaType getVarType(String varName) {
		if (varName == null)
			return null;
		
		StellaType t = varTypes.get(varName);
		
		if (t != null)
			return t;
		
		return parentContext == null ? null : parentContext.getVarType(varName);
	}
	
	public boolean hasVarType(String varName) {
		return getVarType(varName) != null;
	}
	
	public void addConstraint(StellaConstraint constraint) {
//		if (!constraint.isPrimitive())
			constraints.add(constraint);
	}
	
	public void addConstraints(Collection<StellaConstraint> constraints) {
		constraints.forEach(this::addConstraint);
	}
	
	public Set<StellaConstraint> getConstraints() {
		return constraints;
	}
	
	public void setExceptionType(StellaType exceptionType) {
		this.exceptionType = exceptionType;
	}
	
	public StellaType getExceptionType() {
		return exceptionType;
	}
	
	public void addExtension(StellaLanguageExtension extension) {
		if (extension != null)
			extensions.add(extension);
	}
	
	public boolean isExtensionUsed(StellaLanguageExtension extension) {
		return extensions.contains(extension);
	}
	
	public IntCounter getTypeVarCounter() {
		return typeVarCounter;
	}
	
	public String newAutoTypeVarName() {
		return "?T" + typeVarCounter.postIncCounter();
	}
	
	public StellaTypeVar newAutoTypeVar() {
		return new StellaTypeVar(newAutoTypeVarName());
	}
	
	public void addTypeVariable(StellaTypeVar typeVar) {
		typeVariables.add(typeVar);
	}
	
	public void addTypeVariable(String typeVarName) {
		addTypeVariable(new StellaTypeVar(typeVarName));
	}
	
	public Set<StellaTypeVar> getTypeVariables() {
		return typeVariables;
	}
	
	public boolean hasTypeVariable(String typeVarName) {
		return hasTypeVariable(new StellaTypeVar(typeVarName));
	}
	
	public boolean hasTypeVariable(StellaTypeVar typeVar) {
		if (typeVariables.contains(typeVar))
			return true;
		
		return parentContext != null ? parentContext.hasTypeVariable(typeVar) : false;
	}
	
	public String toString() {
		return varTypes.toString(); 
	}
}
