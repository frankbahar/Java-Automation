package com.class12;

public class Homework62 {
	// Write a program that prints the highest value in the array.
	public static void main(String[] args) {
		int[][] a = { { 5, 2, 3, 7 }, 
					  { 1, 5, 1, 1 }, 
					  { 8, 3, 1, 2 } };
		int max = Integer.MIN_VALUE;
		for (int[] nums : a) {
			for (int num : nums) {
				if (num > max) {
					max = num;
				}
			}
		}
		System.out.println(max);
	}

}
