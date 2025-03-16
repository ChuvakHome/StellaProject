package ru.itmo.stella.typechecker;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;

public interface StellaTypechecker {
	List<StellaException> typecheckProgram(InputStream in) throws IOException;
	
	public static class TypecheckContext {
		private List<StellaException> errorsList;
		private ExpressionContext context;
		
		public TypecheckContext(List<StellaException> errorsList, ExpressionContext context) {
			this.errorsList = errorsList;
			this.context = context;
		}
		
		public void addTypecheckError(StellaException exception) {
			errorsList.add(exception);
		}
		
		public List<StellaException> getErrorsList() {
			return Collections.unmodifiableList(errorsList);
		}
		
		public ExpressionContext getExpressionContext() {
			return context;
		}
	}
}
