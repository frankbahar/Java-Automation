package com.class12;

public class Homework60 {
	// Write a program to double the values of every element in the array and print
	// it out.
	public static void main(String[] args) {
		double[][] a = {
						{ 1.4, 2.0, 3.3, 2 },
						{ 4, 1.5, 6.1, 1 }, 
						{ 1.2, 3.1, 4, 1.6 } };
		for (double[] numbers : a) {
			for (double num : numbers) {
				System.out.println(num * 2);
			}
		}

	}

}
