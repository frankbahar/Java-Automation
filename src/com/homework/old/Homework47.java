package com.homework.old;

import java.util.Scanner;

public class Homework47 {
	/*
	 * Write a program that shows if you input a number it will display a month
	 * associated to it and if you input a number out of bounds of (12) it will
	 * display invalid. Display the months to to be displayed on my output.
	 * 
	 * Hint: Add a main method, also import a Scanner Class and use the scanner for
	 * int.
	 * 
	 * 
	 * 1 will display January 2 will display February 3 will display March 4 will
	 * display April 5 will display May 6 will display June 7 will display July 8
	 * will display August 9 will display September 10 will display October 11 will
	 * display November 12 will display December ANY INPUT outside of 12 should
	 * display in output "Invalid"
	 */ public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter month number");
		int month = scanner.nextInt();
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("Invalid");
		}

	}

}
