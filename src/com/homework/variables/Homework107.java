package com.homework.variables;

/*For you to do

Declare one local variable and one Instance variables in the class Main and access them in the main Method
Instance Variable as String Student1="John"

and declare one local variables as int batch=3

and access them in the main method

Output: 
John
3*/
public class Homework107 {
	String Student1 = "John";

	public static void main(String[] args) {
		int batch = 3;
		Homework107 obj = new Homework107();
		System.out.println(obj.Student1);
		System.out.println(batch);

	}

}
