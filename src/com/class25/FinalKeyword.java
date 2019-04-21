package com.class25;

public class FinalKeyword {
	public static final String name = "SYNTAX";

	public static void main(String[] args) {
		/*
		 * Final keyword can be used in 3 places /ways 1.variables -we CANNOT change
		 * their value --> CONSTANT 2.methods -we CANNOT OVERRIDE final methods--> PREVENT METHOD OVERRIDING
		 * 3.classes -- we CANNOT create a child Final class --> PREVENT INHERITANCE 
		 */
		final String str = "Hello";
		// str = "John";

	}

	public final void hello() {
		System.out.println("Hello from Parent class");
	}
}


  final class ChildOFFinal extends FinalKeyword {
	  // CANNOT OVERRIDE FINAL METHOD public
  }
 /* void hello() { System.out.println("Hello from Parent class"); }
 * 
 * }
 */