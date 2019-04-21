package com.class04;

import java.util.Scanner;

public class DMVRepsonse {
	public static void main(String[] args) {
		System.out.println("Please enter your age :");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age >= 18) {
			System.out.println("Your Driver licence will be ready in short");
		} else {
			System.out.println("we cannot issue Driver licence now");
		}
	}
}
