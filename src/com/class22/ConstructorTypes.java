package com.class22;

public class ConstructorTypes {

	ConstructorTypes() {
		System.out.println("I am a constructor with no parameter");
	}

	ConstructorTypes(String str) {// str - is a local variable to a constructor
		System.out.println("I am a constructor with 1 parameter" + str);
	}

	ConstructorTypes(int a, String str) {// str - is a local variable to a constructor
		System.out.println("I am a constructor with 2 parameter" + a + " and " + str);
	}

	public static void main(String[] args) {
		ConstructorTypes obj = new ConstructorTypes();
		ConstructorTypes obj1 = new ConstructorTypes("1 String paramater");
		ConstructorTypes obj2 = new ConstructorTypes(2, "paramaters");
			
	}
}
