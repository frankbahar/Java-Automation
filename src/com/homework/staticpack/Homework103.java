package com.homework.staticpack;

/*For you to do 

create two methods
create first instance method write the logic in it as 
Programming is amazing. in println statement
create second static method write the logic in it as 
Java is awesome. in println statement

call this two method in main method

Output:
Programming is amazing.
Java is awesome.*/
public class Homework103 {

	public static void main(String[] args) {
		Homework103 obj = new Homework103();
		obj.printInstance();
		Homework103.printStatic();
	}

	void printInstance() {
		System.out.println("Programming is amazing.");
	}

	static void printStatic() {
		System.out.println("Java is awesome.");
	}
}
