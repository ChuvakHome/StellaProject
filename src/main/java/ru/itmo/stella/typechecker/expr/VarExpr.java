package ru.itmo.stella.typechecker.expr;

import java.util.Optional;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.StellaUndefinedVariableException;
import ru.itmo.stella.typechecker.exception.StellaUnexpectedTypeForExpressionException;
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
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType type = inferType(context);
		
		if (!expected.equals(type))
			throw new StellaUnexpectedTypeForExpressionException(this, expected, type);
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		return Optional.ofNullable(context.getVarType(varName)).orElseThrow(() -> new StellaUndefinedVariableException(varName));
	}
	
	public String toString() {
		return varName;
	}
}
