package com.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		/*if number is between 1-10 -->number is small
		 * if number is between 11 - 100 --> number is medium
		 * if number is between 101 -1000 --> number is large
		 */
		int num = 15;
		if(num > 1 && num <= 10) {
			System.out.println("Number is small");
		} else if(num > 10 && num <=100) {
			System.out.println("Number is medium");
		} else if(num > 100 && num <=1000) {
			System.out.println("Number is Large");
		}
	}

}
