package ru.itmo.stella.typechecker.expr;

import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.match.StellaIllegalEmptyMatchingException;
import ru.itmo.stella.typechecker.exception.match.StellaNonExhaustiveMatchPatternsException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternMatchCase;
import ru.itmo.stella.typechecker.type.StellaType;

public class MatchExpr extends StellaExpression {
	private StellaExpression matchExpr;
	private List<PatternMatchCase> matchCases;
	
	public MatchExpr(StellaExpression matchExpression, List<PatternMatchCase> matchCases) {
		this.matchExpr = matchExpression;
		this.matchCases = Collections.unmodifiableList(matchCases);
	}
	
	public StellaExpression getMatchExpression() {
		return matchExpr;
	}
	
	public List<PatternMatchCase> getMatchCases() {
		return matchCases;
	}
	
	private StellaType checkPatterns(ExpressionContext context, StellaType matchExpressionType, StellaType patternExpressionType) throws StellaException {
		for (PatternMatchCase matchCase: matchCases) {
			PatternExpr pattern = matchCase.getPattern();
			StellaExpression expr = matchCase.getExpression();
			
			pattern.checkType(context, matchExpressionType);
			
			ExpressionContext subctx = pattern.extendContext(context, matchExpressionType);
			
			if (patternExpressionType == null)
				patternExpressionType = expr.inferType(subctx);
			else
				expr.checkType(subctx, patternExpressionType);
		}
		
		List<? extends PatternExpr> missingPatterns = matchExpressionType.checkPatternsExhaustiveness(matchCases.stream().map(PatternMatchCase::getPattern).toList());
		
		if (!missingPatterns.isEmpty())
			throw new StellaNonExhaustiveMatchPatternsException(
					matchExpr,
					missingPatterns
				);
		
		return patternExpressionType;
	}
	
	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		if (matchCases.isEmpty())
			throw new StellaIllegalEmptyMatchingException(this);
		
		StellaType matchExprType = matchExpr.inferType(context);
		
		checkPatterns(context, matchExprType, expected);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		if (matchCases.isEmpty())
			throw new StellaIllegalEmptyMatchingException(this);
		
		StellaType matchExprType = matchExpr.inferType(context);
		
		return checkPatterns(context, matchExprType, null);
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		if (matchCases.isEmpty())
			throw new StellaIllegalEmptyMatchingException(this);
		
		StellaType resultType = getCachedType(context);
		StellaType matchExprType = matchExpr.inferType(context);
		
		for (PatternMatchCase matchCase: matchCases) {
			PatternExpr matchPattern = matchCase.getPattern();
			StellaExpression matchResult = matchCase.getExpression();
			
			matchPattern.checkType(context, matchExprType);
			
			ExpressionContext subctx = matchPattern.extendContext(context, matchExprType);
			
			matchResult.checkType(subctx, resultType);
			
			context.addConstraints(subctx.getConstraints());
		}
		
		return resultType;
	}

	@Override
	public String toString() {
		return String.format(
					"match %s\n{\n  %s\n}",
					matchExpr,
					String.join(" | ", matchCases.stream().map(PatternMatchCase::toString).toList())
				);
	}
}
