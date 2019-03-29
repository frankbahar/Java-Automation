package com.class9;

import java.util.Scanner;

public class Task6 {
	// 6. Ask a user to input a leap year. Give the user 10 chances to enter a
	// correct leap year. As soon as the user
	// enters the correct leap year exit the loop.
	public static void main(String[] args) {
		boolean isLeapYear = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a leap year");
		for (int i = 1; i <= 10; i++) {
			int year = scanner.nextInt();
			if ((year%4 == 0 && year%100 != 0) || year % 400 == 0) {
				isLeapYear = true;
				break;
			}else {
				System.out.println("Please try again");
			}
		}
	}
}
