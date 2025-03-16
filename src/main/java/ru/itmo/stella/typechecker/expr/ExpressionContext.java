package ru.itmo.stella.typechecker.expr;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import ru.itmo.stella.typechecker.type.StellaType;

public class ExpressionContext  {
	public static final ExpressionContext EMPTY_CONTEXT = new ExpressionContext();
	
	private ExpressionContext parentContext;
	private Map<String, StellaType> varTypes;
	
	public ExpressionContext(ExpressionContext parentContext, Map<String, StellaType> map) {
		this.parentContext = parentContext; 
		this.varTypes = new HashMap<>(map);
	}
	
	public ExpressionContext(ExpressionContext parentContext) {
		this(parentContext, Collections.emptyMap());
	}
	
	public ExpressionContext(Map<String, StellaType> map) {
		this(null, map);
	}
	
	public ExpressionContext() {
		this(Collections.emptyMap());
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
		
		return Optional.ofNullable(t).orElse(parentContext == null ? null : parentContext.getVarType(varName));
	}
	
	public boolean hasVarType(String varName) {
		return getVarType(varName) != null;
	}
	
	public String toString() {
		return varTypes.toString(); 
	}
}
