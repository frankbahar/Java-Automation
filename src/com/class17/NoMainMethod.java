package com.class17;

public class NoMainMethod {
	String str; // data members
	int num;
	
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friends");
		System.out.println("Hello");
		System.out.println("Hello friends");
		
	}
	
	void bye() {
		System.out.println("Bye");
	}
	
	public static void main(String args[]) { // method signature
		
		NoMainMethod obj = new NoMainMethod(); // method body
		obj.hello();
		obj.bye();
	}
	
	void howAreyou() {
		System.out.println("How are you?");
	}
}
