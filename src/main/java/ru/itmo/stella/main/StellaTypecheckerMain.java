package ru.itmo.stella.main;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import ru.itmo.stella.typechecker.BaseStellaTypechecker;
import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaTypecheckerMain {
	public static void main(String[] args) throws IOException {
//		String prog = "language core;\n"
//				+ "\n"
//				+ "extend with #type-reconstruction;\n"
//				+ "\n"
//				+ "fn Nat::add(n : auto) -> fn(Nat) -> Bool {\n"
//				+ "  return fn(m : Nat) {\n"
//				+ "    return Nat::rec(n, m, fn(i : Nat) {\n"
//				+ "      return fn(r : Nat) {\n"
//				+ "        return if Nat::iszero(r) then r else succ(r); // r := r + 1\n"
//				+ "      };\n"
//				+ "    });\n"
//				+ "  };\n"
//				+ "}\n"
//				+ "\n"
//				+ "fn square(n : Nat) -> Nat {\n"
//				+ "  return Nat::rec(n, 0, fn(i : auto) {\n"
//				+ "    return fn(r : Nat) {\n"
//				+ "      return Nat::add(i)( Nat::add(i)( succ( r )));\n"
//				+ "    };\n"
//				+ "  });\n"
//				+ "}\n"
//				+ "\n"
//				+ "fn main(n : Nat) -> Nat {\n"
//				+ "  return square(n)\n"
//				+ "}\n"
//				+ "";
		
		String prog = "language core;\n"
				+ "\n"
				+ "extend with #type-reconstruction;\n"
				+ "\n"
				+ "fn Nat::add(n : auto) -> auto {\n"
				+ "  return fn(m : auto) {\n"
				+ "    return Nat::rec(n, m, fn(i : auto) {\n"
				+ "      return fn(r : auto) {\n"
				+ "        return if r then r else r; // r := r + 1\n"
				+ "      };\n"
				+ "    });\n"
				+ "  };\n"
				+ "}\n"
				+ "\n"
				+ "fn square(n : auto) -> auto {\n"
				+ "  return Nat::rec(n, 0, fn(i : auto) {\n"
				+ "    return fn(r : auto) {\n"
				+ "      return Nat::add(i)( Nat::add(i)( succ( r )));\n"
				+ "    };\n"
				+ "  });\n"
				+ "}\n"
				+ "\n"
				+ "fn main(n : auto) -> auto {\n"
				+ "  return square(n)\n"
				+ "}\n"
				+ "";
		
//		prog = "language core;\n"
//				+ "extend with #type-reconstruction;\n"
//				+ "\n"
//				+ "fn main(n : auto) -> fn(auto)->auto {\n"
////				+ "  return if n then n and Nat::iszero(succ(0)) else succ(n)\n"
//				+ "  return new(0)"
//				+ "}";
		
		// actual = expected
		
//		prog = "language core;\n"
//				+ "				 \n"
//				+ "extend with #type-reconstruction;\n"
//				+ "				 \n"
//				+ "fn Nat::add(n : auto) -> auto {\n"
//				+ "  return fn(m : auto) {\n"
//				+ "    return if m then m else Nat::iszero(m)\n"
//				+ "  };\n"
//				+ "}\n"
//				+ "\n"
//				+ "fn main(n : auto) -> Nat {\n"
//				+ "  return Nat::add(n)(true)\n"
//				+ "}"; 
		
		prog = "language core;\n"
				+ "				 \n"
				+ "extend with #type-reconstruction, #pairs, #records, #sum-types, #references, #type-ascriptions, #lists, #unit-type;\n"
				+ "				 \n"
				+ "//! ERROR(sema::undefined_type)\n"
				+ "generic fn undefined-ty[Foo, Bar](x : Foo) -> Bar {\n"
				+ "  return x\n"
				+ "}\n"
				+ "\n"
				+ "fn Nat::add(n : auto) -> fn(auto) -> auto {\n"
				+ "  return fn(m : auto) {\n"
				+ "    return Nat::rec(n, m, fn(i : auto) {\n"
				+ "      return fn(r : auto) {\n"
				+ "        return if Nat::iszero(r) and r then r else r; // r := r + 1\n"
				+ "      };\n"
				+ "    });\n"
				+ "  };\n"
				+ "}\n"
				+ "\n"
				+ "fn square(n : auto) -> auto {\n"
				+ "  return Nat::rec(n, 0, fn(i : auto) {\n"
				+ "    return fn(r : auto) {\n"
				+ "      return Nat::add(i)( Nat::add(i)( succ( r )));\n"
				+ "    };\n"
				+ "  });\n"
				+ "}\n"
				+ "\n"
				+ "fn main(n : auto) -> auto {\n"
				+ "  return square(n)\n"
				+ "}\n"
				+ "\n"
				+ "// fn create-tuple(x : auto) -> auto {\n"
				+ "//   return { x, true }\n"
				+ "// }\n"
				+ "\n"
				+ "// fn main(x : auto) -> Nat {\n"
				+ "//   return if 0 as Unit then 0 else succ(0);\n"
				+ "// }\n"
				+ "\n"
				+ "// fn main(x : auto) -> Nat {\n"
				+ "//   return if x as Nat then 0 else succ(0);\n"
				+ "// }";
		
		prog = "language core;\n"
				+ "				 \n"
				+ "extend with #type-reconstruction, #logical-operators, #pairs;\n"
				+ "				 \n"
//				+ "fn Nat::add(n : auto) -> fn(auto) -> auto {\n"
//				+ "  return fn(m : auto) {\n"
//				+ "    return Nat::rec(n, m, fn(i : auto) {\n"
//				+ "      return fn(r : auto) {\n"
//				+ "        return if Nat::iszero(r) then r else succ(r); // r := r + 1\n"
//				+ "      };\n"
//				+ "    });\n"
//				+ "  };\n"
//				+ "}\n"
//				+ "\n"
//				+ "fn square(n : auto) -> auto {\n"
//				+ "  return Nat::rec(n, 0, fn(i : auto) {\n"
//				+ "    return fn(r : auto) {\n"
//				+ "      return Nat::add(i)( Nat::add(i)( succ( r )));\n"
//				+ "    };\n"
//				+ "  });\n"
//				+ "}\n"
				+ "\n"
				+ "fn fun(x : auto) -> auto {\n"
				+ "  return { x = x }\n"
				+ "}\n"
				+ "fn do-something(func : auto) -> auto {\n"
				+ "  return fix(func)\n"
				+ "}\n"
				+ "\n"
				+ "fn main(n : Nat) -> { x : Nat} {\n"
//				+ "  return *(fun(n).x := 0)\n"
				+ "  return do-something(fun)\n"
				+ "}";
		
//		prog = "language core;\n"
//				+ "\n"
//				+ "extend with #type-reconstruction;\n"
//				+ "extend with #lists;\n"
//				+ "\n"
//				+ "fn fun(a : auto) -> auto {\n"
//				+ "  return [a]\n"
//				+ "}\n"
//				+ "\n"
//				+ "fn main(b : Nat) -> [Bool] {\n"
//				+ "    return fun(0)\n"
//				+ "}";
		
		System.setIn(new ByteArrayInputStream(prog.getBytes()));
		
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
