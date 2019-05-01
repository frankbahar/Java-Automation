package com.homework.interfaces;

/*create Interface with name as MyInterface
create two  methods  in the interface without implementation 
implements the MyInterface with main class
In main method by creating the object on main class with MyInterface instance and call those 
two methods in the main method and for those methods have them print the statements
implementation of method1 for first method

implementation of method2 for the second method




Output

implementation of method1
implementation of method2*/
public class Homework138 implements MyInterface138 {

	public static void main(String[] args) {
		Homework138 obj = new Homework138();
		obj.method1();
		obj.method2();

	}

	@Override
	public void method1() {
		System.out.println("implementation of method1");

	}

	@Override
	public void method2() {
		System.out.println("implementation of method2");

	}

}

interface MyInterface138 {
	void method1();
	void method2();
}
