package com.class9;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
	//5.	Write a guessing game where the user has to guess a secret number between 1 and 20. 
	//After every guess input, the program tells the user whether their number was too large or too small.
	//The program will keep asking the user to enter the number until he finds the correct number. 
	//When the correct answer is found the system should display "Congratulations!!. You got it!".

	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(20);
		System.out.println("Please enter your guess");
		Scanner scanner = new Scanner(System.in);
		int guess=0;
		while(true) {
			guess = scanner.nextInt();
			if(guess == -1) {
				break;
			}else if(guess <-1 || guess >20) {
				System.out.println("Please enter number between -1 to 20");
			} else if(guess>randomNumber) {
				System.out.println("Your guess is greater than my number please try again or enter -1 to quit");
			} else if(guess < randomNumber) {
				System.out.println("Your guess is smaller than my number please try again or enter -1 to quit");
			} else {
				System.out.println("Congratulations!!. You got it!");
				break;
			}
		}	

	}

}
