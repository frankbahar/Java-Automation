package com.homework.old;

import java.util.Scanner;

public class Homework51 {
	/*
	 * ******Must use the scanner class Write a program that takes a user's name and
	 * prints it. Step 1:"Hello, please Enter user name" should read First in your
	 * output Step 2:"your name is "+ any variable name should read Second in your
	 * output
	 * 
	 * Hint: you are not restricted for any name you can use any name
	 */ public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, please Enter user name");
		String name = scanner.nextLine();
		System.out.println("your name is " + name);
	}

}
