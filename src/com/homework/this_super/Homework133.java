package com.homework.this_super;
/*super method calling 
create class Parent 
declare static instance method  write logic in println statement as
m1 static method in parent class


create another class as Child  extends Parent class
declare two static method in child class one method with same name as parent class method   write logic in println statement as
m1 static method in child class
create another method m2 in child class call the child class method and parent class method in this method
in main method call the method which you created in the child class call the m2 method 

Output:
m1 static method in child class
m1 static method in parent class*/

public class Homework133 {

	public static void main(String[] args) {
		Child133 obj = new Child133();
		obj.m2();

	}

}
class Parent133 {
	static void m1() {
		System.out.println("m1 static method in parent class");
	}
}

class Child133 extends Parent133 {
	static void m1() {
		System.out.println("m1 static method in child class");
	}
	
	void m2() {
		this.m1();
		super.m1();
	}
}