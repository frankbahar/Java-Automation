package com.homework.encapsulation;

/*Firstly create class above main class as EncapsulationDemo
create two instance variables
private String empName="John"
private int empAge=30;

Don't use the Setter method to set the values and  use the Getter Method to get the values 

Ouput:
Employee Name: John
Employee Age: 30 */
class EncapsulationDemo144 {
	private String empName = "John";
	private int empAge = 30;

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

public class Homework144 {

	public static void main(String[] args) {
		EncapsulationDemo144 emp = new EncapsulationDemo144();
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Age: " + emp.getAge());
	}
}
