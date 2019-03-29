package com.class12;

import java.util.Scanner;

public class Homework58 {
	// Note: Create a Scanner Class
	// Create an int array with the size of 5 and input values with Scanner. Print
	// out each element of the array multiplied by ten,
	// one element per line. Create a loop and enter values into one loop, the
	// second loop print the values and it must be multiplied by 10.
	public static void main(String[] args) {

		int[] array = new int[5];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		for (int num : array) {
			System.out.println(num * 10);
		}
	}

}
