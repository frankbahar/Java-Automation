package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		//System.out.println(a/b); // new ArithmeticException
		//if person is >18 --> issue driver licence else we can throw an exception
		checkAgeEligibility(19);
		twoNumDiv(10, 1);
		checkLength("Afdgdf");
		withdrawMoney(300, 600);
	}
	
	public static void checkAgeEligibility(int age) {
		if (age>=18) {
			System.out.println("Congratilations on your driver licence");
		} else {
			throw new ArithmeticException("Your are not eligible to get driver licence");
		}
	}
	
	public static void twoNumDiv(int a, int b) {
		if(b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("We cannot divide by zero");
		}
	}
	
	public static void checkLength(String username) {
		if(username.length() >3) {
			System.out.println("User name is accepted ");
		} else {
			throw new NullPointerException("Username must be longer than 3 character");
		}
		
	}
	
	public static void withdrawMoney(double balance, double withdraw) {
		if(withdraw<= balance) {
			System.out.println("Here is your money");
		}else {
			throw new ArithmeticException("You do not have enough money");
		}
	}
}
