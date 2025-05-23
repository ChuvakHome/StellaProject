package ru.itmo.stella.typechecker.expr;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.type.StellaType;

public class ExpressionContext  {
	public static final ExpressionContext EMPTY_CONTEXT = new ExpressionContext();
	
	private StellaType exceptionType;
	private Set<StellaLanguageExtension> extensions;
	
	private ExpressionContext parentContext;
	private Map<String, StellaType> varTypes;
	
	public ExpressionContext(ExpressionContext parentContext, Map<String, StellaType> map) {
		this.parentContext = parentContext; 
		this.varTypes = new HashMap<>(map);
		this.extensions = parentContext != null ? parentContext.extensions : new HashSet<>();
		this.exceptionType = parentContext != null ? parentContext.exceptionType : null;
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
		
		if (t != null)
			return t;
		
		return parentContext == null ? null : parentContext.getVarType(varName);
	}
	
	public boolean hasVarType(String varName) {
		return getVarType(varName) != null;
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
	
	public String toString() {
		return varTypes.toString(); 
	}
}
