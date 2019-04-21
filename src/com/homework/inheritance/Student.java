package com.homework.inheritance;

public class Student extends Person {
	int grade;

	void printStudent() {
		System.out.println(name + " " + lastName + " " + age + " " + grade);
	}
}
