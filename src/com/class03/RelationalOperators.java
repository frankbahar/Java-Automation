package com.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		int a=198;
		int b=198;
		boolean result =a>b;
		System.out.println(result);
		boolean result1=a==b;
		System.out.println(result1);
		//compare 2 numbers and if a is larger than b --> print
		if(a != b) {
			System.out.println("hello");
		} else {
			System.out.println("bye");
		}
		// declare price if price higher than expected price --> i will not buy
		double shoePrice = 32.99;
		double allowedPrice =31.99;
		if (shoePrice <= allowedPrice) {
			System.out.println("I am buying this shoes");
		} else {
			System.out.println("I am NOT buying this shoes");
		}
		System.out.println("I am continues code");
		
		
	}

}
