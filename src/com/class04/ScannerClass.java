package com.class04;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		//take an number from user and print that number
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the number: ");
		int num = scanner.nextInt();
		System.out.println("Entered number is : " + num);
		
	}

}
