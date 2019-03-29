package com.class3;

public class IfElseIf {

	public static void main(String[] args) {
		int num1 = 23;
		int num2 = 23;

		if (num1 > num2) {
			System.out.println("I am in if true block");
			System.out.println("num1 greater than num2");
		} else if (num1 < num2) {
			System.out.println("num1 shorter than num2");
		} else {
			System.out.println("num1 equal to num2");
		}
	}

}
