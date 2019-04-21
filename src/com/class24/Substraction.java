package com.class24;

public class Substraction {

	public static void main(String[] args) {
		Substraction.substract(5.5d, 3.1d);
		Substraction.substract(50, 34);
		Substraction.substract(123, 34, 23);
	}

	static void substract(int a, int b) {
		System.out.println(a - b);
	}

	static void substract(double a, double b) {
		System.out.println(a - b);
	}

	static void substract(int a, int b, int c) {
		System.out.println(a - b - c);
	}

}
