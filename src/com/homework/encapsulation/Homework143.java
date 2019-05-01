package com.homework.encapsulation;

/*Firstly create class above main class as EncapsulationDemo
create two instance variables 
private String empName="John";
private int empAge=30

Use the Setter method to set the values and Getter Method to get the values 

In Main method when we are calling the method pass the empName as Mario
and empAge 32

output would be

 
Employee Name: Mario
Employee Age: 32*/
class EncapsulationDemo143 {
	private String empName="John";
	private int empAge=30;

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

public class Homework143 {

	public static void main(String[] args) {
		EncapsulationDemo143 emp = new EncapsulationDemo143();
		emp.setName("Mario");
		emp.setAge(32);
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Age: " + emp.getAge());
	}
}
