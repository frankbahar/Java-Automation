package com.class12;

public class Homework63 {
	/*
	 * //Write a program that checks if a 2-D integer array is a square array,
	 * meaning, if its rows and columns are equal.
	 * 
	 * Hint:
	 * 
	 * int[][] a = { {1,1,1}, {1,1,1}, {1,1,1} }; //should be true
	 * 
	 * int[][] b = { {1,1,1,1}, {1,1,1,1}, {1,1,1,1} }; //should be false
	 */ public static void main(String[] args) {
		int[][] a = { { 1, 1, 1, 1 },
					  { 1, 1, 1, 1 }, 
					  { 1, 1, 1,1  } };
		boolean isSquareArray = true;
		for (int i = 0; i < a.length; i++) {
			if (a.length != a[i].length) {
				isSquareArray = false;
				break;
			}
		}
		System.out.println(isSquareArray);

	}

}
