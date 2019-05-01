package com.homework.abstractclass;

/*Create abstract class as  parent 
Create one abstract method and another normal instance method in the abstract class with implementation 
 Extends the abstract class with main class
Provide the implementation for one abstract method which is declared in the parent class
In main method by creating the object on main class with parent class instance and call those 
two methods in the main method 

Output: 

abstract method1 implementation in main class
abstract method2 implementation in parent class*/
public class Homework135 extends Parent135 {

	public static void main(String[] args) {
		Parent135 obj = new Homework135();
		obj.method1();
		obj.method2();

	}

	@Override
	void method1() {
		System.out.println("abstract method1 implementation in main class");

	}

}

abstract class Parent135 {
	abstract void method1();

	void method2() {
		System.out.println("abstract method2 implementation in parent class");
	}
}