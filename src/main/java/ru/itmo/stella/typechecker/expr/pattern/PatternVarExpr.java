package ru.itmo.stella.typechecker.expr.pattern;

import java.util.Map;
import java.util.Objects;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaAmbiguousPatternTypeException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternVarExpr extends PatternExpr {
	private String varName;
	
	public PatternVarExpr(String varName) {
		super(Tag.VAR);
		
		this.varName = varName;
	}
	
	public String getVariableName() {
		return varName;
	}
	
	@Override
	public final int hashCode() {
		return Objects.hash(Tag.VAR, varName);
	}
	
	public boolean equalsPattern(PatternExpr p) {
		return true;
	}

	@Override
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		
	}
	
	@Override
	public StellaType doTypeInference(ExpressionContext context) throws StellaException {
		throw new StellaAmbiguousPatternTypeException(this);
	}
	
	@Override
	public StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		return getCachedType(context);
	}
	
	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		return new ExpressionContext(context, Map.of(varName, expected));
	}
	
	@Override
	public PatternVarExpr getStubPattern() {
		return STUB_PATTERN;
	}

	@Override
	public String toString() {
		return varName;
	}
}
