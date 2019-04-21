package com.class04;

import java.util.Scanner;

public class EmployeeBonus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter how many years your worked : ");
		int yearsWorked = scanner.nextInt();
		System.out.println("Please enter your annual salary");
		double annualSalary = scanner.nextDouble();
		
		if(yearsWorked >= 5) {
			if(annualSalary > 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else
			System.out.println("You are not eligible for bonus");
	}

}
