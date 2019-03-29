package com.class12;

public class Homework64 {
	/*
	 * //Write a program that takes a 2-D array and prints the sums of the rows as
	 * an integer array.
	 * 
	 * For example, the if we run rowSums for the following 2D array: { {1,1,2},
	 * //sum = 4 {3,1,2}, //sum = 6 {3,5,3}, //sum = 11 {0,1,2} //sum = 3 }
	 * 
	 * 
	 * Then we should get the following array back: 4 6 11 3
	 */
	public static void main(String[] args) {
		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		int sum = 0;
		for (int[] b : a) {
			for (int num : b) {
				sum += num;
			}
			System.out.println(sum + " ");
			sum=0;
		}
	}

}
