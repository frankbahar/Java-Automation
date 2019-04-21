package com.homework.constructor;

/*1. Complete the SyntaxTechnologies.java class:

Include the following class variables:
* schoolName(String)
* batch(int)
* year(String)
* lastDayOfClass(String)


Write two constructors:

* default constructor
* The main constructor( with all parameters)

Create two different objects of the SyntaxTechnologies class using both constructors and print the values of the properties inline


Output:
 
null 0 null null
Syntax 4 2019 07/30/2019*/
public class Homework100 {
	public static void main(String[] args) {

		SyntaxTechnologies school1 = new SyntaxTechnologies();
		school1.printSyntaxTechnologies();

		SyntaxTechnologies school2 = new SyntaxTechnologies("Syntax", 4, "2019", "07/30/2019");
		school2.printSyntaxTechnologies();

	}
}