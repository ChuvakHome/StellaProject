package ru.itmo.stella.typechecker.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternInlExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternInrExpr;

public class StellaSumType extends StellaType.StellaComplexType {
	private StellaType left, right;
	
	public StellaSumType(StellaType left, StellaType right) {
		super(StellaType.Tag.SUM);
		
		this.left = left;
		this.right = right;
	}
	
	public StellaType[] getTypes() {
		return new StellaType[] { left, right };
	}
	
	public StellaType getLeftType() {
		return left;
	}
	
	public StellaType getRightType() {
		return right;
	}
	
	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		List<PatternExpr> inlPatterns = new ArrayList<>();
		List<PatternExpr> inrPatterns = new ArrayList<>();
		
		for (PatternExpr pattern: patterns) {
			switch (pattern.getPatternTag()) {
				case INL:
					inlPatterns.add(
							((PatternInlExpr) pattern).getInlPattern()
						);
					break;
				case INR:
					inrPatterns.add(
							((PatternInrExpr) pattern).getInrPattern()
						);
					break;
				default:
					break;
			}
		}
		
		List<PatternExpr> missingPatterns = new ArrayList<>();
		
		if (inlPatterns.isEmpty())
			missingPatterns.add(new PatternInlExpr(PatternExpr.STUB_PATTERN));
		else {
			List<? extends PatternExpr> missingInlPatterns = left.checkPatternsExhaustivenessForType(inlPatterns);
			
			for (PatternExpr missingInlPattern: missingInlPatterns)
				missingPatterns.add(new PatternInlExpr(missingInlPattern));
		}
		
		if (inrPatterns.isEmpty())
			missingPatterns.add(new PatternInrExpr(PatternExpr.STUB_PATTERN));
		else {
			List<? extends PatternExpr> missingInrPatterns = right.checkPatternsExhaustivenessForType(inrPatterns);
			
			for (PatternExpr missingInrPattern: missingInrPatterns)
				missingPatterns.add(new PatternInrExpr(missingInrPattern));
		}
		
		return missingPatterns;
	}

	@Override
	public boolean equalsType(StellaType type) {
		StellaSumType sumType = (StellaSumType) type;
		
		return sumType.left.equals(left) && sumType.right.equals(right); 
	}
	
	@Override
	public final boolean isSubtype(StellaType type) { // TODO: write the correct impl!
		if (super.isSubtype(type))
			return true;
		else if (type.getTypeTag() != Tag.SUM)
			return false;
		
		StellaSumType sumType = (StellaSumType) type;
		
		return left.isSubtype(sumType.left) && right.isSubtype(sumType.right);
	}
	
	public String toString() {
		return String.format("%s + %s", left, right);
	}
}
