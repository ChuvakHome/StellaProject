package ru.itmo.stella.main;

import java.io.IOException;
import java.util.List;

import ru.itmo.stella.typechecker.BaseStellaTypechecker;
import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaTypecheckerMain {
	public static void main(String[] args) throws IOException {
		StellaTypechecker stellaTypechecker = new BaseStellaTypechecker();
		List<StellaException> errorsList = stellaTypechecker.typecheckProgram(System.in);
		
		if (errorsList.isEmpty())
			System.out.println("Input program is well-typed!");
		else {
			System.err.println(
				String.join("\n", 
					errorsList
						.stream()
						.limit(1)
						.map(ex -> String.format("%s\n%s\n", ex.getErrorCode(), ex.getRecordMessage()))
						.toList()
				)
			);
		}
		
		System.exit(errorsList.size());
	}
}
