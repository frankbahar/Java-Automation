package com.class3;

public class MultipleConditions {
	public static void main(String[] args) {
		/*create a java program nd declare int variable that will hold a day,
		 * based on the value of the variable your porgram should print
		 * the name of the day
		 */
		int day =5;
		
		if(day == 1) {
			System.out.println("Monday");
		} else if(day == 2) {
			System.out.println("Tuesday");
		} else if (day ==3) {
			System.out.println("Wednesday");
		} else if(day ==4) {
			System.out.println("Thrusday");
		} else if(day == 5) {
			System.out.println("Friday - fun day");
		} else if(day == 6) {
			System.out.println("Saturday");
		} else if(day ==7 ){
			System.out.println("Sunday");
		} else {
			System.out.println("Day entered is not valid");
		}
	}
}
