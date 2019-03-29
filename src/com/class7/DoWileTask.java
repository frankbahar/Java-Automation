package com.class7;

import java.util.Scanner;

public class DoWileTask {

	public static void main(String[] args) {
		/*
		 * Ask user to pay for a soda keep asking user to pay for soda until entered
		 * price is not equal to 1.99 after user got a write amount print
		 * "Please enjoy your soda"
		 */
		Scanner scan = new Scanner(System.in);
		double price = 0;
		do {
			System.out.println("Please enter soda Price");
			price = scan.nextDouble();
		} while (price != 1.99);
		System.out.println("Please enjoy your soda");
	}

}
