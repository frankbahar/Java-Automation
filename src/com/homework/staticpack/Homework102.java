package com.homework.staticpack;

/*For you to do,

Declare the static method and in the static method write the logic to print the static variables 

In main method pass the values for the static variables as 
 age=40;
name="John"
and call the static method in static way only
Do not create an object

Output:
40
John*/

	
public class Homework102 {
	
	static int age;
	static String name;
	
	public static void main(String[] args) {
		Homework102.age = 40;
		Homework102.name = "John";
		Homework102.printValues();

	}

	static void printValues() {
		System.out.println(age);
		System.out.println(name);
	}
}
