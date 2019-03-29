package com.class5;

import java.util.Scanner;

public class HomeWork64 {
	/*
	 * Prompt user to: "Please enter your birthday month number" if user enters 12,
	 * 1, 2 --> season="Winter" if user enters 3, 4, 5--> season="Spring" if user
	 * enters 6, 7, 8 --> season="Summer" if user enters 9, 10, 11--> season="Fall"
	 * if any other number--> "Please enter valid month number" and season="Unknown"
	 * 
	 * The output of the program should be : "You were born in __ "
	 */ public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your birthday month number");
		int month = scanner.nextInt();
		String season;
		if (month == 12 || month == 1 || month == 2) {
			season = "Winter";
		} else if (month >= 3 && month <= 5) {
			season = "Spring";
		} else if (month >= 6 && month <= 8) {
			season = "Summer";
		} else if (month >= 9 && month <= 11) {
			season = "Fall";
		} else {
			System.out.println("Enter valid month");
			season = "Unknown";
		}
		System.out.println("You were born in " + season);

	}

}
