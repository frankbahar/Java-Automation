package com.class09;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		//1. Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even and odd integers.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter starting number:");
		int startNum = scanner.nextInt();
		System.out.println("Please enter ending number:");
		int endNum = scanner.nextInt();
		int sumOdd=0, sumEven=0;
		for(int i=startNum;i<=endNum; i++) {
			if(i%2 == 0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		System.out.println("Odd total is: " + sumOdd + " Even total is: " + sumEven);
	}
}
