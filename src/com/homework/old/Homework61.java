package com.homework.old;

import java.util.Scanner;

public class Homework61 {
	/*
	 * Prompt user with question: "Is it weekend?" if it is not a weekend -->
	 * subject="Manual testing" Otherwise --> subject="Java"
	 * 
	 * Output of the program should be: "Today you will be learning ____"
	 */ public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is it weekend?");
		boolean isItWeekend = scanner.nextBoolean();
		String subject;
		if (!isItWeekend) {
			subject = "Manula testing";
		} else {
			subject = "Java";
		}
		System.out.println("Today you will be learning " + subject);

	}

}
