package com.class4;

import java.util.Scanner;

public class ScannerAndIf {
	public static void main(String[] args) {
	// take 2 number from a user and compare those numbers
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please first numbers to compare");
		int num1 = scanner.nextInt();
		System.out.println("Please second numbers to compare");
		int num2 = scanner.nextInt();
		if(num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if(num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
	}
}
