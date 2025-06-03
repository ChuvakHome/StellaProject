package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.throwing.StellaExceptionTypeNotDeclaredException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternMatchCase;
import ru.itmo.stella.typechecker.type.StellaType;

public class TryCatchExpr extends StellaExpression {
	private StellaExpression tryExpr;
	private PatternMatchCase catchPatternMatch;
	
	public TryCatchExpr(StellaExpression tryExpression, PatternMatchCase catchPatternMatch) {
		this.tryExpr = tryExpression;
		this.catchPatternMatch = catchPatternMatch;
	}
	
	public StellaExpression getTryExpression() {
		return tryExpr;
	}
	
	public PatternMatchCase getCatchPatternMatch() {
		return catchPatternMatch;
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		tryExpr.checkType(context, expected);
		
		StellaType exceptionType = context.getExceptionType();
		
		if (exceptionType == null)
			throw new StellaExceptionTypeNotDeclaredException();
		
		StellaType expectedCatchType = exceptionType;
		
		PatternExpr catchPattern = catchPatternMatch.getPattern();
		
		catchPattern.checkType(context, expectedCatchType);
		ExpressionContext subctx = catchPattern.extendContext(context, expectedCatchType);
		
		StellaExpression catchExpr = catchPatternMatch.getExpression();
		catchExpr.checkType(subctx, expected);
		
//		List<PatternExpr> missingPatterns = expectedCatchType.checkPatternsExhaustiveness(List.of(catchPattern));
//		
//		if (!missingPatterns.isEmpty())
//			throw new StellaNonExhaustiveCatchPatternsException(
//					expectedCatchType,
//					missingPatterns
//				);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		StellaType tryExprType = tryExpr.inferType(context);
		
		doTypeCheckSimple(context, tryExprType);
		
		return tryExprType;
	}

	@Override
	public String toString() {
		return null;
	}
}
