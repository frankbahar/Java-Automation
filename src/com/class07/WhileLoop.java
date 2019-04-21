package com.class07;

public class WhileLoop {

	public static void main(String[] args) {
		int a = 1;
		
		while(a < 10) {
			System.out.println("Good Morning");
			a++;
		}
		
		int b = 1;
		
		while(b <= 5) {
			System.out.println("I am inside while loop");
			b++;
		}
		System.out.println("I am outside of while loop");
		// I want to print values from 10 t0 20 inclusive
		int z = 10;
		while(z<=20) {
			System.out.println(z);
			z++;
		}
		//I want to print values from 10 1;
		int e=10;
		while(e >= 1) {
			System.out.println(e);
			e--;
		}	
		
	}
}
