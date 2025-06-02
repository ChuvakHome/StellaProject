package ru.itmo.stella.typechecker.expr.pattern.visitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.itmo.stella.lang.Absyn.ALabelledPattern;
import ru.itmo.stella.lang.Absyn.LabelledPattern;
import ru.itmo.stella.lang.Absyn.Pattern;
import ru.itmo.stella.lang.Absyn.PatternAsc;
import ru.itmo.stella.lang.Absyn.PatternCons;
import ru.itmo.stella.lang.Absyn.PatternFalse;
import ru.itmo.stella.lang.Absyn.PatternInl;
import ru.itmo.stella.lang.Absyn.PatternInr;
import ru.itmo.stella.lang.Absyn.PatternInt;
import ru.itmo.stella.lang.Absyn.PatternList;
import ru.itmo.stella.lang.Absyn.PatternRecord;
import ru.itmo.stella.lang.Absyn.PatternSucc;
import ru.itmo.stella.lang.Absyn.PatternTrue;
import ru.itmo.stella.lang.Absyn.PatternTuple;
import ru.itmo.stella.lang.Absyn.PatternUnit;
import ru.itmo.stella.lang.Absyn.PatternVar;
import ru.itmo.stella.lang.Absyn.PatternVariant;
import ru.itmo.stella.lang.Absyn.SomePatternData;
import ru.itmo.stella.typechecker.BaseStellaTypechecker.StellaTypeVisitor;
import ru.itmo.stella.typechecker.StellaTypechecker.TypecheckContext;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaDuplicateRecordPatternFieldException;
import ru.itmo.stella.typechecker.expr.pattern.PatternAscExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternBoolExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternConsExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternInlExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternInrExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternIntExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternListExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternRecordExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternSuccExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternTupleExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternUnitExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternVarExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternVariantExpr;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaCorePatternExprVisitor extends StellaBasePatternExprVisitor {
	public StellaCorePatternExprVisitor(StellaTypeVisitor typeVisitor) {
		super(typeVisitor);
	}
	
	@Override
	public PatternExpr doVisit(PatternInl p, TypecheckContext ctx) throws StellaException {
		PatternExpr argExpr = p.pattern_.accept(this, ctx).get();
		
		return new PatternInlExpr(argExpr);
	}

	@Override
	public PatternExpr doVisit(PatternInr p, TypecheckContext ctx) throws StellaException {
		PatternExpr argExpr = p.pattern_.accept(this, ctx).get();
		
		return new PatternInrExpr(argExpr);
	}
	
	@Override
	public PatternExpr doVisit(PatternFalse p, TypecheckContext ctx) throws StellaException {
		return new PatternBoolExpr(false);
	}

	@Override
	public PatternExpr doVisit(PatternTrue p, TypecheckContext ctx) throws StellaException {
		return new PatternBoolExpr(true);
	}

	@Override
	public PatternExpr doVisit(PatternUnit p, TypecheckContext ctx) throws StellaException {
		return new PatternUnitExpr();
	}

	@Override
	public PatternExpr doVisit(PatternInt p, TypecheckContext ctx) throws StellaException {
		return new PatternIntExpr(p.integer_);
	}
	
	@Override
	public PatternExpr doVisit(PatternVar p, TypecheckContext ctx) throws StellaException {		
		return new PatternVarExpr(p.stellaident_);
	}
	
	@Override
	public PatternExpr doVisit(PatternVariant p, TypecheckContext ctx) throws StellaException {
		String label = p.stellaident_;
		PatternExpr labelPattern = null;
		
		if (p.patterndata_ instanceof SomePatternData someData)
			labelPattern = someData.pattern_.accept(this, ctx).get();
		
		return new PatternVariantExpr(label, labelPattern);
	}
	
	@Override
	public PatternExpr doVisit(PatternSucc p, TypecheckContext ctx) throws StellaException {
		PatternExpr argExpr = p.pattern_.accept(this, ctx).get();
		
		return new PatternSuccExpr(argExpr);
	}
	
	@Override
	public PatternExpr doVisit(PatternList p, TypecheckContext ctx) throws StellaException {
//		PatternListExpr emptyList = new PatternListExpr(); 
//		
//		if (p.listpattern_.isEmpty())
//			return emptyList;
//		
//		List<PatternExpr> patterns = p.listpattern_
//										.stream()
//										.map(pattern -> pattern.accept(this, ctx))
//										.toList();
//		Collections.reverse(patterns);
//		
//		PatternConsExpr consPattern = new PatternConsExpr(patterns.get(0), emptyList);
//				
//		for (int i = 1; i < patterns.size(); ++i)
//			consPattern = new PatternConsExpr(patterns.get(i), consPattern);
//		
//		return consPattern;
		
		List<PatternExpr> listElementsPatterns = new ArrayList<>();
		
		for (Pattern pattern: p.listpattern_)
			listElementsPatterns.add(pattern.accept(this, ctx).get());
		
		return new PatternListExpr(listElementsPatterns);
	}
	
	@Override
	public PatternExpr doVisit(PatternCons p, TypecheckContext ctx) throws StellaException {
		PatternExpr headPattern = p.pattern_1.accept(this, ctx).get();
		PatternExpr tailPattern = p.pattern_2.accept(this, ctx).get();
		
		return new PatternConsExpr(headPattern, tailPattern);
	}
	
	@Override
	public PatternExpr doVisit(PatternTuple p, TypecheckContext ctx) throws StellaException {
		List<PatternExpr> componentsPatterns = new ArrayList<>();
		
		for (Pattern pattern: p.listpattern_)
			componentsPatterns.add(pattern.accept(this, ctx).get());
		
		return new PatternTupleExpr(componentsPatterns);
	}
	
	@Override
	public PatternExpr doVisit(PatternRecord p, TypecheckContext ctx) throws StellaException {
		Set<String> duplicatedFields = new HashSet<>();
		Map<String, PatternExpr> recordFieldsPatterns = new HashMap<>();
		
		class LabeledFieldPattern {
			final String field;
			final PatternExpr pattern;
			
			LabeledFieldPattern(String field, PatternExpr pattern) {
				this.field = field;
				this.pattern = pattern;
			}
			
			public String toString() {
				return field + " = " + pattern;
			}
		}
		
		List<LabeledFieldPattern> labeledFieldsPatterns = new ArrayList<>();
		
		for (LabelledPattern pattern: p.listlabelledpattern_) {
			ALabelledPattern labelledPattern = (ALabelledPattern) pattern;
			
			String fieldName = labelledPattern.stellaident_;
			PatternExpr fieldPattern = labelledPattern.pattern_.accept(this, ctx).get();
			
			labeledFieldsPatterns.add(new LabeledFieldPattern(fieldName, fieldPattern));
			
			if (recordFieldsPatterns.containsKey(fieldName))
				duplicatedFields.add(fieldName);
			else
				recordFieldsPatterns.put(fieldName, fieldPattern);
		}
		
		if (duplicatedFields.isEmpty())
			return new PatternRecordExpr(recordFieldsPatterns);
		else {
			throw new StellaDuplicateRecordPatternFieldException(
				duplicatedFields,
				String.format(
					"{ %s }",
					String.join(
						", ",
						labeledFieldsPatterns.stream().map(LabeledFieldPattern::toString).toList()
					)
				)
			);
		}
	}
	
	@Override
	public PatternExpr doVisit(PatternAsc p, TypecheckContext ctx) throws StellaException {
		try {
			StellaType ascType = p.type_.accept(typeVisitor, ctx.getExpressionContext()).get();
			PatternExpr ascPattern = p.pattern_.accept(this, ctx).get();
			
			return new PatternAscExpr(ascPattern, ascType);
		} catch (StellaException e) {
			ctx.addTypecheckError(e);
		}
		
		return null;
	}
}
