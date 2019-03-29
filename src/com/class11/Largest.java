package com.class11;

public class Largest {

	public static void main(String[] args) {
		// create an array of integers and find largest number
		int[] numbers = { 12, 4, 5, 34, -5, 0, 56 };
		int max = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : numbers) {
			if (num > max) {
				secondLargest = max;
				max = num;
			}
		}
		System.out.println("Array max number is: " + max);
		System.out.println("Second largest number is " + secondLargest);
	}
}
