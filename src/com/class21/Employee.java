package com.class21;
//Create a Class called Employee:
//Create three  variables  eID , salary and set the CEO to “Sumair”
//Create two objects of the class Employee
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects
public class Employee {
	int eID;
	double salary;
	static String CEO="Sumair";
	
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.eID=1;
		emp1.salary=100000;
		
		Employee emp2=new Employee();
		emp2.eID=2;
		emp2.salary=120000;
	
		emp1.printEmployee();
		emp2.printEmployee();
		
	
	}
	void printEmployee() {
		System.out.println("Employee Id : " + eID + " has a salary of " + salary + " and CEO is " + CEO);
	}
}
