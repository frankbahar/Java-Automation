package com.homework.methodoverriding;

/*Create the two method with same name
create one method in parent class with two int parameters and write the logic in the method to print that values (a+b)
create another method in child with same name and extends the parent class with two int parameters and write the logic in the method to print that values (a+b)

In main method create object with child class and call the child class Method
pass the parameter values as 100, 200
*/
public class Homework126 {
	void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		Child126 obj = new Child126();
		obj.add(100, 200);

	}

}

class Child126 extends Homework126{
	void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
}