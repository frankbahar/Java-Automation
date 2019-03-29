package com.class4;

public class NestedIf {
	public static void main(String[] args) {
		/*write a program to check work eligibility
		 * if user is younger than <16 not allow to work
		 * otherwise --> allow to work, if if user is younger than 64 --> go to work
		 * 									otherwise --> enjoy your life		
		 */
		int age =18;
		int eligibleAge=18;
		int retirementAge=64;
		
		if(age < eligibleAge) {
			System.out.println("You are too young, no work for you");
		} else {
			System.out.println("Your are eligible to work");
			if(age < retirementAge) {
				System.out.println("Go work hard");
			} else {
				System.out.println("Please enjoy your life, you do not need to work");
			}
		}
	}
}
