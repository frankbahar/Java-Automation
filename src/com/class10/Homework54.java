package com.class10;

public class Homework54 {
	/*
	 * Write a program that creates an array with the following values{s, a, y, b,
	 * n, c, t, d, a, e, x} and prints the values starting at index 0 and multiple
	 * of 2 using a for loop. Hint: syntax
	 */

	public static void main(String[] args) {

		char[] myChar = { 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x' };
		for (int i = 0; i < myChar.length; i += 2) {
			System.out.print(myChar[i]);
		}

	}

}
