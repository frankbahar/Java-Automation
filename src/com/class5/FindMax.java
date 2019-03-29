package com.class5;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double max = Double.MIN_VALUE;
		System.out.println("Please enter 3 double values to compare: ");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double num3 = scanner.nextDouble();
		if (num1 > num2 && num1 > num3) {
			max = num1;
		} else if (num2 > num1 && num2 > num3) {
			max = num2;
		} else if (num3 > num1 && num3 > num2) {
			max = num3;
		}
		System.out.println("Max Number is " + max);
	}
}
