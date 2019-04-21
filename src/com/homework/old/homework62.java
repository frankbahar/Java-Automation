package com.homework.old;

import java.util.Scanner;

/*Create a program that prompt user with question:  Do you need a loan?
If the result is true then prompt user with question: What is your credit score? Otherwise eligibility = "Unknown"
Based on the score define users eligibility 
if score is below  600 --> eligibility = "Not eligible"
if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
if score is higher than any other previous values --> eligibility = "Definitely eligible" .   

The output of the program should be: "The eligibility is ____"
*/public class homework62 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you need a loan?");
		boolean needLoan = scanner.nextBoolean();
		String eligibility;
		int creditScore;
		if (needLoan) {
			System.out.println("What is your credit score?");
			creditScore = scanner.nextInt();
			if (creditScore < 600) {
				eligibility = "Not eligible";
			} else if (creditScore >= 600 && creditScore <= 700) {
				eligibility = "Maybe eligible";
			} else if (creditScore > 700 && creditScore <= 800) {
				eligibility = "Eligible";
			} else {
				eligibility = "Definitely eligible";
			}
		} else {
			eligibility = "Unknown";
		}
		System.out.println("The eligibility is " + eligibility);
	}
}
