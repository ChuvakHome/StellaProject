package ru.itmo.stella.typechecker.type;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaTopType extends StellaType {
	StellaTopType() {
		super(Tag.TOP);
	}
	
	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		return Collections.emptyList();
	}

	@Override
	public boolean equals(Object o) {
		return o == this;
	}
	
	@Override
	public final boolean isSubtype(StellaType type) {
		return type == this;
	}
	
	@Override
	public String toString() {
		return "Top";
	}
}
