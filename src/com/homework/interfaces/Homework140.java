package com.homework.interfaces;

/*Implement the multiple inheritance Concept 
create Interface with name as MyInterface1
create one method in the interface without implementation 
create another Interface with name as MyInterface2 
create one method in this interface without implementation

implements the MyInterface1, MyInterface2 with main class
In main method by creating the object on main class call those 
two methods in the main method 

Output


method1 implementing multiple Inheritance
method2 implementing multiple Inheritance*/
public class Homework140 implements MyInterface1140, MyInterface2140 {

	public static void main(String[] args) {
		Homework140 obj = new Homework140();
		obj.method1();
		obj.method2();

	}

	@Override
	public void method2() {
		System.out.println("method2 implementing multiple Inheritance");

	}

	@Override
	public void method1() {
		System.out.println("method1 implementing multiple Inheritance");

	}

}

interface MyInterface1140 {
	void method1();
}

interface MyInterface2140 {
	void method2();
}