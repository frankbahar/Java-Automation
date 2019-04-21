package com.homework.old;

/*1. Complete the Employee.java class:

Include the following class variables:
* name(String)
* lastName(String)
* employeeId(int)
* startDate(String)
* salary(int)


Write two constructors:

* default constructor
* The main constructor( with all parameters)

Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.


Output:
 
null null 0 null 0
Joe Smith 12345 01/01/1970 35000*/
public class Homework100 {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.printEmployee();
		
		Employee emp2 = new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
		emp2.printEmployee();
		
	}

}
