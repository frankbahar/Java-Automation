package com.homework.methodoverriding;

/*Create the two method with same name
create one protected method in parent class 
write the logic as "Protected method in parent class"
create same public method within  the child class and extends the parent class
write the logic as "public method in parent class"
In main method create object with Parent  class and call the parent  class Method*/
public class Homework128 {
	protected void m1( ) {
		System.out.println("Protected method in parent class");
	}
	
	public static void main(String[] args) {
		Homework128 obj = new Homework128();
		obj.m1();

	}
}

class Child128 extends Homework128 {
	public void m1( ) {
		System.out.println("public method in parent class");
	}
}
