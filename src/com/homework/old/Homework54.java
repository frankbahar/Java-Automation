package com.homework.old;

import java.util.Scanner;

public class Homework54 {
	/*****
	 * Must use the Scanner Class Write a program to take user name, age and mobile
	 * number in single line.
	 * 
	 * First Output: "Enter your name" Second Output: "Enter your mobile number"
	 * Third Output: "Enter your age" Final Output: "Your name is ___ , your age is
	 * ___ and your mobile number is (___)-___-____"
	 * 
	 * 
	 * Note: this final output is an example must use a variable for Weqas for name,
	 * 70 as a variable, and mobile number as a Variable when you use scanner must
	 * be able to input these values
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		System.out.println("Enter your mobile number");
		String phone = scanner.nextLine();
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		System.out.println("Your name is " + name + ", your age is " + age + " and your mobile number is " + phone);

	}

}
