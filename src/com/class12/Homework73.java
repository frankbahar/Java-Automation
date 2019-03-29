package com.class12;

import java.util.Scanner;

public class Homework73 {
	// Note: Create a main Method and Scanner class
	/*
	 * Given a String banana do the following: Print out the following:
	 * "The first 3 letters of ___ is ___"
	 * 
	 * For example, if the input is "banana", your output should be
	 * "The first 3 letters of banana is ban"
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	//	System.out.println("Please enter string");
		String word = scanner.nextLine();
		System.out.println("the first 3 letters of " + word + " is " + word.substring(0, 3));
	}
}
