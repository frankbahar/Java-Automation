package com.class12;

public class Homework61 {
	// Write a program to sum the elements in the third row.
	public static void main(String[] args) {
		int[][] a = { { 5, 2, 3, 7 },
					  { 1, 5, 2, 2 },
					  { 1, 2, 3, 4 } };
		int sum = 0;
		for (int i = 0; i < a[2].length; i++) {
			sum += a[2][i];
		}
		System.out.println(sum);
	}

}
