package com.homework.methodoverloading;
/*Create the two Constructor with different parameters and try to call them in main method
create one method without parameter
create another method with String parameter
output would 
 
Welcome to the syntax solutions
I am the student in syntax solutions*/

public class Homework123 {
	Homework123() {
		System.out.println("Welcome to the syntax solutions");
	}

	Homework123(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {

		Homework123 obj = new Homework123();
		Homework123 obj1 = new Homework123("I am the student in syntax solutions");
	}
}
