package com.class9;

import java.util.Random;
import java.util.Scanner;

public class Task5FindNumber {
	public static void main(String[] args) {
	//	int randomNumber = (int) (Math.random()*100); this is with Math class we can make with Random class
	//  also	
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		System.out.println("Please enter your guess");
		Scanner scanner = new Scanner(System.in);
		int guess=0;
		while(true) {
			guess = scanner.nextInt();
			if(guess == -1) {
				break;
			}else if(guess <-1 || guess >100) {
				System.out.println("Please enter number between -1 to 100");
			} else if(guess>randomNumber) {
				System.out.println("Your guess is greater than my number please try again or enter -1 to quit");
			} else if(guess < randomNumber) {
				System.out.println("Your guess is smaller than my number please try again or enter -1 to quit");
			} else {
				System.out.println("Congratulations you find my number");
				break;
			}
		}	
	}
}
