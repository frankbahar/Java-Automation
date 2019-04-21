package com.homework.inheritance;
/*1. Create four classes (Person, Employee, Student, Retiree)

* Have properties
For Person: name(String)
For Person: lastName(String)
For Person: age(int)
For Employee: salary(int)
For Student: grade(int)
For Retiree: seniorActivity(String)

* have a print method in each that prints the properties in line as shown in the output

Use your inheritance skills to make Person as your parent class and 

From your Main class create objects of the Employee, Student and Retiree classes and print out their properties in the following order.


Output: 
 
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour*/

public class Homework116 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "Joe";
		emp.lastName = "Smith";
		emp.age = 35;
		emp.salary = 35000;
		emp.printEmployee();

		Student student = new Student();
		student.name = "Adam";
		student.lastName = "Smith";
		student.age = 15;
		student.grade = 10;
		student.printStudent();

		Retiree retire = new Retiree();
		retire.name = "Frank";
		retire.lastName = "Smith";
		retire.age = 15;
		retire.seniorActivity = "tour";
		retire.printRetiree();
	}

}
