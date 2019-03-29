package com.class4;

import java.util.Scanner;

/*IMPORTANT: You must use a Scanner class for this conditional statement

Input variable in console using 121.
Find out if a number is Even or ODD
Please display "Even" if number is even
and "Odd" if the number is an odd number
*/public class Homework41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
