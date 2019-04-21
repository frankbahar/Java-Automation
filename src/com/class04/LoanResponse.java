package com.class04;

import java.util.Scanner;

public class LoanResponse {
	public static void main(String[] args) {
		System.out.println("Please enter the amount you needed: ");
		Scanner scanner = new Scanner(System.in);
		double amountRequested = scanner.nextDouble();
		if(amountRequested < 200000) {
			System.out.println("Your loan will be ready in shortly");
		} else {
			System.out.println("We are sorry we can't give you a loan and this time");
		}
	}

}
