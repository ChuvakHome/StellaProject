package ru.itmo.stella.main;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import ru.itmo.stella.typechecker.BaseStellaTypechecker;
import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaTypecheckerMain {
	public static void main(String[] args) throws IOException {
//		String prog;
//		
//		prog = "language core;\n"
//				+ "\n"
//				+ "extend with #type-reconstruction,\n"
//				+ "            #fixpoint-combinator,\n"
//				+ "            #exceptions,\n"
//				+ "            #lists,\n"
//				+ "            #sum-types,\n"
//				+ "            #structural-patterns\n"
//				+ "            ;\n"
//				+ "\n"
////				+ "fn do-something(func : auto) -> auto {\n"
////				+ "  return fix(func)\n"
////				+ "}\n"
//				+ "\n"
//				+ "fn exception-test(n : auto) -> auto {\n"
//				+ "  return if true then [0] else throw([])\n"
//				+ "}\n"
//				+ "\n"
//				+ "fn main(n : auto) -> auto {\n"
////				+ "  return match (match (match n {\n"
////				+ "    0 => inl(true)\n"
////				+ "    | succ(x) => inr(x)\n"
////				+ "  }) {\n"
////				+ "    inl(l) => l\n"
////				+ "    | inr(r) => Nat::iszero(r)\n"
////				+ "  }) {\n"
////				+ "      0 => true\n"
////				+ "      | succ(x) => false\n"
////				+ "  }\n"
//				+ "  return List::tail([exception-test(n)])\n"
//				+ "}";
//		
//		prog = "language core;\n"
//				+ "extend with #sum-types;\n"
//				+ "\n"
//				+ "fn g(x : Nat + (Bool + (fn(Nat) -> Nat))) -> Nat {\n"
//				+ "  return match x {\n"
//				+ "      inl(n) => succ(n)\n"
//				+ "    | inr(bf) => match bf {\n"
//				+ "          inr(f) => f(f(succ(0)))\n"
//				+ "        | inl(b) => if b then succ(0) else 0\n"
//				+ "      }\n"
//				+ "  }\n"
//				+ "}\n"
//				+ "\n"
//				+ "fn main(x : Nat) -> Nat {\n"
//				+ "  return g(inr(inl(fn(n : Nat) { return g(inl(n)) })))\n"
//				+ "}\n"
//				+ "";
//		
//		System.setIn(new ByteArrayInputStream(prog.getBytes()));
		
		StellaTypechecker stellaTypechecker = new BaseStellaTypechecker();
		List<StellaException> errorsList = stellaTypechecker.typecheckProgram(System.in);
		
		if (errorsList.isEmpty())
			System.out.println("Input program is well-typed!");
		else {
			System.err.println(
				String.join("\n", 
					errorsList
						.stream()
//						.limit(1)
						.map(ex -> String.format("%s\n%s\n", ex.getErrorCode(), ex.getRecordMessage()))
						.toList()
				)
			);
		}
		
		System.exit(errorsList.size());
	}
}
