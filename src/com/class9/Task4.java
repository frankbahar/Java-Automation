package com.class9;

public class Task4 {
	/*
	 * 4. Print the following pattern:
	 *
	 **
	 ***
	 ****
	 *****
	 ****
	 ***
	 **
	 **/

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i >=1; i--) {
			for (int j = i; j >=1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}