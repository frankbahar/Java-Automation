package com.homework.inheritance;

public class Employee extends Person {
	int salary;

	void printEmployee() {
		System.out.println(name+ " " + lastName + " " + age + " " + salary);
	}
}
