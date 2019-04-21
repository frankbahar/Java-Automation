package com.homework.methodoverriding;

/*Create a default method in parent class saying "method in Parent class" that will be overridden from the child class saying "method in Child class"
In main class achieve run time polymorphism.
*/
public class Homework127 {
	void m1() {
		System.out.println("method in Parent class");
	}
	
	public static void main(String[] args) {
		Child127 obj = new Child127();
		obj.m1();
	}

}

class Child127 extends Homework127{
	void m1() {
		System.out.println("method in Child class");
	}
}