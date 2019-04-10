package com.class17_2;

import java.util.Scanner;

import com.class17.Calculator;

public class ScannerMethod {

	public static void main(String[] args) {
		ScannerMethod obj = new ScannerMethod();
		System.out.println("please enter first number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("please enter second number");
		int b = scan.nextInt();
		obj.sum(a, b);
		obj.sum(12, 13);
		obj.sum(100,100);
		obj.sub(a, b);
		obj.sub(13, 10);
		
		Calculator calc = new Calculator();
		
		System.out.println(a + " + " + b + " = " + calc.sum(a,b));
		System.out.println(a + " - " + b + " = " + calc.sub(a,b));
		System.out.println(a + " / " + b + " = " + calc.div(a,b));
		System.out.println(a + " * " + b + " = " + calc.mult(a,b));
		System.out.println(myfunction());
	}
	
	int sum(int x, int y) {
	
		//System.out.println(x + " + " + y + " = " + (x+y));
		return x+y;
	}
	
	void sub(int x, int y) {
		System.out.println(x + " - " + y + " = " + (x-y));
	}
	
	static float myfunction() {
		char a='a',b='b';
		System.out.println(a+b);
		System.out.println(a);
		return a;
	}
	
}
