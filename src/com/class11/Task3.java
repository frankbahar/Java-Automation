package com.class11;

public class Task3 {
	// Create an array on integers and calculate the sum of all elements in an
	// array.
	public static void main(String[] args) {
		int[] nums = { 12, 34, 13, 4, 5, 6 };
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println("Total : " + sum);
	}

}
