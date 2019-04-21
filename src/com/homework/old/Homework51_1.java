package com.homework.old;

import java.util.Scanner;

public class Homework51_1 {
	/*
	 * *******Create a Scanner class
	 * 
	 * Create a program that will take a boolean value from a user make the variable
	 * isTrue. if the input is TRUE or FALSE then output should read.
	 * 
	 * First Output: "Input the boolean value" Final Output: "The value is ______"
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the boolean value");
		boolean isTrue = scanner.nextBoolean();
		System.out.println("The value is " + isTrue);
	}

}
