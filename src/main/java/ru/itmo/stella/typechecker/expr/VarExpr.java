package ru.itmo.stella.typechecker.expr;

import java.util.Optional;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.StellaUndefinedVariableException;
import ru.itmo.stella.typechecker.type.StellaType;

public class VarExpr extends StellaExpression {
	private String varName;
	
	public VarExpr(String varName) {
		this.varName = varName;
	}
	
	public String getVarName() {
		return varName;
	}
	
	@Override
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType type = inferType(context);
		
		checkTypeMatching(context, expected, type);
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		return Optional.ofNullable(context.getVarType(varName)).orElseThrow(() -> new StellaUndefinedVariableException(varName));
	}
	
	public String toString() {
		return varName;
	}
}
