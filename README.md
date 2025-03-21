# StellaProject

This repository contains the code of typechecker for simple functional programming language *Stella*. Current typechecker implementation supports:
- language core
- extentions:
  * #unit-type
  * #pairs & #tuples
  * #records
  * #let-bindings
  * #type-ascriptions
  * #sum-types
  * #lists
  * #variants
  * #fixpoint-combinator
  * #natural-literals
  * #nullary-functions & #multiparameter-functions
  * #structural-patterns, not all, availables patterns are:
    + variables
    + natural literals
    + succ
    + booleans
    + unit
    + sum-types
    + variants
- errors:
	* ERROR_MISSING_MAIN
	* ERROR_MISSING_MAIN
	* ERROR_UNDEFINED_VARIABLE
	* ERROR_UNEXPECTED_TYPE_FOR_EXPRESSION
	* ERROR_NOT_A_FUNCTION
	* ERROR_NOT_A_TUPLE
	* ERROR_NOT_A_RECORD
	* ERROR_NOT_A_LIST
	* ERROR_UNEXPECTED_LAMBDA
	* ERROR_UNEXPECTED_TYPE_FOR_PARAMETER
	* ERROR_UNEXPECTED_TUPLE
	* ERROR_UNEXPECTED_RECORD
	* ERROR_UNEXPECTED_VARIANT
	* ERROR_UNEXPECTED_LIST
	* ERROR_UNEXPECTED_INJECTION
	* ERROR_MISSING_RECORD_FIELDS
	* ERROR_UNEXPECTED_RECORD_FIELDS
	* ERROR_UNEXPECTED_FIELD_ACCESS
	* ERROR_UNEXPECTED_VARIANT_LABEL
	* ERROR_TUPLE_INDEX_OUT_OF_BOUNDS
	* ERROR_UNEXPECTED_TUPLE_LENGTH
	* ERROR_AMBIGUOUS_SUM_TYPE
	* ERROR_AMBIGUOUS_VARIANT_TYPE
	* ERROR_AMBIGUOUS_LIST
	* ERROR_ILLEGAL_EMPTY_MATCHING
	* ERROR_NONEXHAUSTIVE_MATCH_PATTERNS
	* ERROR_UNEXPECTED_PATTERN_FOR_TYPE
	* ERROR_DUPLICATE_RECORD_FIELDS
	* ERROR_DUPLICATE_RECORD_TYPE_FIELDS
	* ERROR_DUPLICATE_VARIANT_TYPE_FIELDS
	* ERROR_INCORRECT_ARITY_OF_MAIN
	* ERROR_INCORRECT_NUMBER_OF_ARGUMENTS
	* ERROR_UNEXPECTED_NUMBER_OF_PARAMETERS_IN_LAMBDA

## Requirements:
- JDK 17 or later
- Maven

## Build
To build the project run `mvn package` or `mvn install`. Runnable java program `typechecker-jar-with-dependencies.jar` will be in `target` directory. 
If you want to start it, run `java -jar target/typechecker-jar-with-dependencies.jar`. Make sure that you run the typechecker with Java 17+.
