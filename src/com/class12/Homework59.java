package com.class12;

import java.util.Scanner;

public class Homework59 {
	// Create Scanner class
	/*
	 * Write an array with size of 5. Use a loop to input values to the array. Then
	 * print out all the elements you have created in the first loop in reverse
	 * order.
	 */
	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

}
