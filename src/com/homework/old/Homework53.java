package com.homework.old;

import java.util.Scanner;

public class Homework53 {
	/*
	 * ****Must use the Scanner Class Write a program that asks the user's age and
	 * then display it by adding 10 i.e (age + 10)
	 * 
	 * First Output: "Enter your age" Final Output: "your age after 10 years is "
	 * remember to put the value in your final output with 10 years added to it
	 */ public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		System.out.println("your age after 10 years is " + (age + 10));

	}

}
