package com.homework.variables;

/*just declare the instance variables

int aa;
String name;
float salary;
boolean value;
double age;
just take this instance variables in the main class and print the values for this in main method as we are not assigning the any values for them we should get default values 

THESE variables do not have any value attached to them, just call them in main method

Output:
0
null
0.0
false
0.0*/
public class Homework110 {
	int aa;
	String name;
	float salary;
	boolean value;
	double age;

	public static void main(String[] args) {
		Homework110 obj = new Homework110();
		System.out.println(obj.aa);
		System.out.println(obj.name);
		System.out.println(obj.salary);
		System.out.println(obj.value);
		System.out.println(obj.age);
	}

}
