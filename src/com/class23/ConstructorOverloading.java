package com.class23;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("I am constructor with no parameter");
	}
	
	ConstructorOverloading(String str){
		System.out.println("I am constructor with 1 String parameter");
	}
	
	ConstructorOverloading(String str, String str1){
		System.out.println("I am constructor with 2 String parameter");
	}
	
	ConstructorOverloading(int a){
		System.out.println("i am constructor with 1 int parameter");
	}
	
	public static void main(String args) {
		System.out.println("main method with string array ");
	}
	
	public static void main(String[] args) {
		System.out.println("main method with string array ");
	}
}
