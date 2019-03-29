package com.class9;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		// 2. Ask user to enter the item they want to buy and the price for the item.
		// Then ask user to pay for it.
		// Every time user enters money accumulate the amount and tell user how much is
		// left to pay off the amount.
		// Whenever user done with payments tell them "Thank you for shopping!"
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter item:");
		String item = scanner.nextLine();
		System.out.println("Please enter item price");
		double price = scanner.nextDouble();
		double remainBalance = price;
		double totalPayment = 0, payment;
		do {
			System.out.println("Your pay off amount is: " + remainBalance);
			System.out.println("Please enter payment amount:");
			payment = scanner.nextDouble();
			totalPayment += payment;
			remainBalance = price - totalPayment;
		} while (remainBalance > 0);
		if (remainBalance < 0) {
			System.out.println("Thank you for shopping here is your change: " + (remainBalance * -1));
		} else {
			System.out.println("Thank you for shopping");
		}
	}
}
