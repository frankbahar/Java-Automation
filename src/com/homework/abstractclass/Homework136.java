package com.homework.abstractclass;
/*Create abstract class as  parent 
Create default constructor in the abstract class 
Extends the abstract class with main class
Declare default constructor in the main class 
In main method create the object  for the main class 

Output:
abstract class Constructor
Main class Constructor*/

public class Homework136 extends Parent136 {
	Homework136() {
		System.out.println("Main class Constructor");
	}

	public static void main(String[] args) {
		Parent136 obj = new Homework136();

	}

}

abstract class Parent136 {
	Parent136() {
		System.out.println("abstract class Constructor");
	}
}
