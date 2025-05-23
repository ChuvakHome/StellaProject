package ru.itmo.stella.typechecker.expr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.let.StellaNonExhaustiveLetPatternsException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternMatchCase;
import ru.itmo.stella.typechecker.type.StellaType;

public class LetExpr extends StellaExpression {
	private List<PatternMatchCase> matchCases;
	private StellaExpression expression;
	
	public LetExpr(List<PatternMatchCase> patterns, StellaExpression expression) {
		this.matchCases = new ArrayList<>(patterns);
		this.expression = expression;
	}
	
	public List<PatternMatchCase> getMatchCases() {
		return matchCases;
	}
	
	public StellaExpression getExpression() {
		return expression;
	}
	
	private ExpressionContext createExtendedContext(ExpressionContext context) throws StellaException {
		ExpressionContext subctx = new ExpressionContext(context);
		
		StellaExpression matchExpr = null;
		List<? extends PatternExpr> missingPatterns = Collections.emptyList();
		
		for (PatternMatchCase matchCase: matchCases) {
			PatternExpr casePattern = matchCase.getPattern();
			StellaExpression caseExpr = matchCase.getExpression();
			
			ExpressionContext tmpCtx = new ExpressionContext();
			
			StellaType caseExprType = caseExpr.inferType(subctx);
			casePattern.checkType(subctx, caseExprType);
			
			List<? extends PatternExpr> tmp = caseExprType.checkPatternsExhaustiveness(Arrays.asList(casePattern));
			
			if (!tmp.isEmpty()) {
				matchExpr = caseExpr;
				missingPatterns = tmp;
			}
			
			subctx.addAll(casePattern.extendContext(tmpCtx, caseExprType));
		}
		
		if (!missingPatterns.isEmpty())
			throw new StellaNonExhaustiveLetPatternsException(matchExpr, missingPatterns);
		
		return subctx;
	}
	
	@Override
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		ExpressionContext subctx = createExtendedContext(context);
		
		expression.checkType(subctx, expected);
	}
	
	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		ExpressionContext subctx = createExtendedContext(context);
		
		return expression.inferType(subctx);
	}
	
	@Override
	public String toString() {
		return String.format(
				"let %s in %s", 
				String.join(
					",", 
					matchCases.stream()
						.map(mc -> String.format("%s = %s", mc.getPattern(), mc.getExpression()))
						.toList()
				), 
				expression
			);
	}
}
