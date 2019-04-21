package com.homework.methodoverriding;

/*Create the two static method with same name
create one method in parent class
write the logic as "Parent m1()"
create another method with same in the child class
Write the logic "Child m1()"
In main method create object with child class and call the child class Method
output would 

Child m1()*/
public class Homework125 {
	static void m1() {
		System.out.println("Parent m1()");
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
	}

}

class Child extends Homework125 {
	static void m1() {
		System.out.println("Child m1()");
	}
}
