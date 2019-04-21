package com.homework.methodoverriding;

/*Create the two Constructor
create one Constructor  in parent class
write the logic as Parent class Constructor without parameter

create another Constructor in the child class
write the logic as Child class Constructor without parameter

In main method create object with child class and call the child class Method
output would 
Parent class Constructor without parameter
Child class Constructor without parameter*/
public class Homework129 {
	Homework129() {
		System.out.println("Parent class Constructor without parameter");
	}

	public static void main(String[] args) {
		Child129 obj = new Child129();
	}

}

class Child129 extends Homework129 {
	Child129() {
		System.out.println("Child class Constructor without parameter");
	}
}
