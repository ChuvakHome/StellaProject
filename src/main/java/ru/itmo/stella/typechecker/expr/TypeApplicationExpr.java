package ru.itmo.stella.typechecker.expr;

import java.util.ArrayList;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.generic.StellaIncorrectNumberOfTypeArguments;
import ru.itmo.stella.typechecker.exception.generic.StellaNotAGenericFunctionException;
import ru.itmo.stella.typechecker.type.StellaForAllType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaType.Tag;
import ru.itmo.stella.typechecker.type.StellaTypeVar;

public class TypeApplicationExpr extends StellaExpression {
	private List<StellaType> typeArgs;
	private StellaExpression callExpr;
	
	public TypeApplicationExpr(List<StellaType> typeArguments, StellaExpression callExpression) {
		this.typeArgs = new ArrayList<>(typeArguments);
		this.callExpr = callExpression;
	}
	
	public List<StellaType> getTypeArguments() {
		return typeArgs;
	}
	
	public StellaType getTypeArguments(int i) {
		return typeArgs.get(i);
	}
	
	public StellaExpression getCallExpression() {
		return callExpr;
	}
	
	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypeMatching(context, expected, inferType(context));
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		StellaType callExprType = callExpr.inferType(context);
		
		if (callExprType.getTypeTag() != Tag.FOR_ALL_TYPE)
			throw new StellaNotAGenericFunctionException(callExprType, callExpr, this);
		
		StellaForAllType forAllFnType = (StellaForAllType) callExprType;
		
		int expectedTypeArgsNumber = forAllFnType.getTypeVariables().size();
		int actualTypeArgsNumber = typeArgs.size();
		
		if (expectedTypeArgsNumber != actualTypeArgsNumber) {
			throw new StellaIncorrectNumberOfTypeArguments(
						expectedTypeArgsNumber,
						callExpr,
						actualTypeArgsNumber,
						this
					);
		}
		
		List<StellaTypeVar> genericTypeVars = forAllFnType.getTypeVariables();
		StellaType innerType = forAllFnType.getInnerType(); 
		
		for (int i = 0; i < expectedTypeArgsNumber; ++i) {
			StellaTypeVar typeVar = genericTypeVars.get(i);
			StellaType typeArg = typeArgs.get(i);
			
			innerType = innerType.replaceType(typeVar, typeArg);
		}
		
		return innerType;
	}

	@Override
	public String toString() {
		return String.format(
					"%s[%s]",
					callExpr,
					String.join(", ", typeArgs.stream().map(StellaType::toString).toList())
				);
	}
}
