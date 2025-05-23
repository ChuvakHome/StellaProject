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
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		if (matchCases.isEmpty())
			throw new StellaIllegalEmptyMatchingException(this);
		
		StellaType matchExprType = matchExpr.inferType(context);
		
		checkPatterns(context, matchExprType, expected);
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		if (matchCases.isEmpty())
			throw new StellaIllegalEmptyMatchingException(this);
		
		StellaType matchExprType = matchExpr.inferType(context);
		
		return checkPatterns(context, matchExprType, null);
	}

	@Override
	public String toString() {
		return String.format(
					"match %s\n{%s\n}",
					matchExpr,
					String.join("\n|", matchCases.stream().map(PatternMatchCase::toString).toList())
				);
	}
}
