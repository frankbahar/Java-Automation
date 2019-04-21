package com.homework.inheritance;

public class Retiree extends Person {
	String seniorActivity;
	
	void printRetiree() {
		System.out.println(name+ " " + lastName + " " + age + " " + seniorActivity);
	}
}
