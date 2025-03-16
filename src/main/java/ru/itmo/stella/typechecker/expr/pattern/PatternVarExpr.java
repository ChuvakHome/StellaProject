package ru.itmo.stella.typechecker.expr.pattern;

import java.util.Map;

import ru.itmo.stella.typechecker.exception.StellaException;
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
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		
	}
	
	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		return new ExpressionContext(context, Map.of(varName, expected));
	}

	@Override
	public String toString() {
		return varName;
	}
}
