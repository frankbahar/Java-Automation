package com.homework.encapsulation;

/*Firstly create class above main class as EncapsulationDemo
create two instance variables in the 
private String empName;
private int empAge;
Use the Setter method to set the values and Getter Method to get the values 
In Main method when we are calling the method set the values for setter method calling as  the empName as John
and empAge 30
Output:
Employee Name: John
Employee Age: 30*/
class EncapsulationDemo142 {
	private String empName;
	private int empAge;

	public void setName(String name) {
		this.empName = name;
	}

	public void setAge(int age) {
		this.empAge = age;
	}

	String getName() {
		return empName;
	}

	int getAge() {
		return empAge;
	}
}

public class Homework142 {

	public static void main(String[] args) {
		EncapsulationDemo142 emp = new EncapsulationDemo142();
		emp.setName("John");
		emp.setAge(30);
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Age: " + emp.getAge());
	}
}
