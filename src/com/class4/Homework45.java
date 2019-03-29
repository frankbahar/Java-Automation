package com.class4;

import java.util.Scanner;

public class Homework45 {
	/*
	 * Write a program to take values of length and width from user and check if it
	 * the shape of the object is square or rectangle.
	 * 
	 * Examples:
	 * 
	 * Please enter the length 18 Please enter the width 16 The shape of your object
	 * is rectangle
	 * 
	 * Please enter the length 16 Please enter the width 16 The shape of your object
	 * is square
	 */ public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the length");
		int length = scanner.nextInt();
		System.out.println("Please enter the width");
		int width = scanner.nextInt();
		if (length == width) {
			System.out.println("The shape of your object is square");
		} else {
			System.out.println("The shape of your object is rectangle");
		}

	}

}
