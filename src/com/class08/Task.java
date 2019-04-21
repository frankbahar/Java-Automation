package com.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// Task let user define a range numbers to print
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a starting number");
		int startNumber = scanner.nextInt();
		
		System.out.println("Please enter ending number");
		int endNumber = scanner.nextInt();
		for(int i = startNumber; i <= endNumber; i++) {
			System.out.println(i);
		}
	}

}
