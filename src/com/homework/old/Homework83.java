package com.homework.old;

public class Homework83 {
	/*
	 * Create a while loops that prints out even numbers from 1 to 13
	 * 
	 * Must not include the number 13 in the output
	 * 
	 * Increment by 1 example(a++)
	 * 
	 * Output: 2 4 6 8 10 12
	 */
	public static void main(String[] args) {
		int a = 1;
		while (a < 13) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
			a++;
		}
	}

}
