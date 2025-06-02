package ru.itmo.stella.typechecker.expr;

import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaForAllType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaTypeVar;

public class TypeAbstractionExpr extends StellaExpression {
	private List<StellaTypeVar> typeVariables;
	private StellaExpression fnBody;
	
	public TypeAbstractionExpr(List<StellaTypeVar> typeVariables, StellaExpression fnBody) {
		this.typeVariables = typeVariables;
		this.fnBody = fnBody;
	}
	
	public List<StellaTypeVar> getTypeVariables() {
		return typeVariables;
	}
	
	public StellaTypeVar getTypeVariable(int i) {
		return typeVariables.get(i);
	}
	
	public StellaExpression getBody() {
		return fnBody;
	}
	
	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypeMatching(context, expected, inferType(context));
		
//		if (expected.getTypeTag() != Tag.FOR_ALL_TYPE)
//			throw new StellaUnexpectedTypeForExpressionException(this, expected, inferType(context));
//		
//		StellaForAllType expectedForAllType = (StellaForAllType) expected; 
//		
//		ExpressionContext subctx = new ExpressionContext(context);
//		
//		typeVariables.forEach(subctx::addTypeVariable);
//		
//		List<StellaTypeVar> expectedTypeVariables = expectedForAllType.getTypeVariables();
//		
//		final int expectedTVNumber = expectedTypeVariables.size();
//		final int actualTVNumber = typeVariables.size();
//		
//		if (expectedTVNumber != actualTVNumber)
//			throw new StellaUnexpectedTypeForExpressionException(this, expected, inferType(context));
//		
//		StellaType innerType = expectedForAllType.getInnerType();
//		
//		for (int i = 0; i < expectedTypeVariables.size(); ++i) {
//			StellaTypeVar oldTypeVar = expectedTypeVariables.get(i);
//			StellaTypeVar newTypeVar = typeVariables.get(i);
//			
//			innerType = innerType.replaceType(oldTypeVar, newTypeVar);
//		}
//		
//		fnBody.checkType(subctx, innerType);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		ExpressionContext subctx = new ExpressionContext(context);
		
		typeVariables.forEach(subctx::addTypeVariable);
		
		StellaType bodyType = fnBody.inferType(subctx);
		
		return new StellaForAllType(typeVariables, bodyType);
	}

	@Override
	public String toString() {
		return String.format(
					"generic [%s] %s",
					String.join(", ", typeVariables.stream().map(StellaTypeVar::getVarName).toList()),
					fnBody
				);
	}
	
}
