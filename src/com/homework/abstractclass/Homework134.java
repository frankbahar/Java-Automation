package com.homework.abstractclass;
/*Create abstract class as  parent 
Create two abstract methods  
Extends the abstract class with main class and provide the implementation for abstract methods which are declared in the parent class
In main method by creating the object on main class with parent class instance and call those 
two methods in the main method 


Output would be

abstract method1 implementation in main class
abstract method2 implementation in main class
*/

public class Homework134 extends Parent134 {

	public static void main(String[] args) {
		Parent134 obj = new Homework134();
		obj.m1();
		obj.m2();

	}

	@Override
	void m1() {
		System.out.println("abstract method1 implementation in main class");
		
	}

	@Override
	void m2() {
		System.out.println("abstract method2 implementation in main class");
		
	}

}

abstract class Parent134 {
	abstract void m1();
	abstract void m2();
}