package com.class6;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		Scanner scan;
		char operator;
		double rightNum;
		double leftNum;
		double result;

		scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		leftNum = scan.nextDouble();
		System.out.println("Please enter second number");
		rightNum = scan.nextDouble();
		
		System.out.println("Please enter your operator");
		operator = scan.next().charAt(0);
		switch (operator) {
		case '+':
			result = leftNum + rightNum;
			break;
		case '-':
			result = leftNum - rightNum;
			break;
		case '*':
			result = leftNum * rightNum;
			break;
		case '/':
			result = leftNum / rightNum;
			break;
		default:
			System.out.println("Not Acceptable Operator");
			result=0;
			break;
		}
		System.out.println("Your result is " + result);
	}
}
