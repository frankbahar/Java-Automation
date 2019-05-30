package com.class35;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("Beginning of Code");
		int a = 10, b=0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("Code inside catch block");
		}
		System.out.println("The end of the program ");
	}

}
