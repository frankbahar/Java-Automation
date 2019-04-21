package com.class26;

public class ThisWithConstructor {
	//this()
	public ThisWithConstructor() {
		System.out.println("I am inside construcotr with no parameters");
		System.out.println("I have no parameters");
	}

	ThisWithConstructor(String str){
		this();
		System.out.println("I am inside constructor with 1 parameter");
		System.out.println("I have 1 string parameter " + str);
	}
	
	ThisWithConstructor(String str, String str2){
		this(str);
		System.out.println("I am inside constructor with 2 parameter");
		System.out.println("I have 1 string parameter " + str + " " +str2);
	}
	
	public static void main(String[] args) {
	//	ThisWithConstructor obj = new ThisWithConstructor();
	//	ThisWithConstructor obj1 = new ThisWithConstructor("Hello");
		ThisWithConstructor obj2 = new ThisWithConstructor("Hello", "Bye");
		/*
		 * I am inside construcotr with no parameters 
		 * I have no parameters I am inside constructor with 1 parameter 
		 * I have 1 string parameter Hello I am inside constructor with 2 parameter 
		 * I have 1 string parameter Hello Bye
		 */
	}
}
