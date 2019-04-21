package com.class22;

public class StaticVsNonStatic {
	
	public String name="John";
	public static String lastName="Snow";
			
	public static void main(String[] args) {
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.getInfo();
		getInfo1();//within same class we can call it by using method/variable name
	}
	///non static
	public void getInfo() {
		System.out.println("My name is " + name + " and my last name is " + lastName);
		//non static method can call or reach both instance and static variables
		getInfo1();// we cann access static methods within non static
	}
	
	//static method
	public static void getInfo1() {
		//System.out.println("My name is " + name + " and my last name is " + lastName);
		//will get an error static method can call or reach only static method or static variable 
		System.out.println("I am a static method");
		//getInfo(); we cannot access non statick method within static method
	}
}
