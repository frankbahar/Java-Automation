package com.class2;

public class ArithmeticOperators {

	public static void main(String[] args) {
		//declare two int variables and the perform addition, subtraction, multiplication, division
		int a = 30;
		int b = 15;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		
		int sum = a+b;
		int sub = a-b;
		int mult = a*b;
		double div = a/b;
		System.out.println("The sum of 2 numbers is " + sum);
		System.out.println("The subtraction of 2 numbers is " + sub);
		System.out.println("The multiplication of 2 numbers is " + mult);
		System.out.println("The division of 2 numbers is " + div);
		
		double x = 34.98;
		double y = 12.45;
		System.out.println("The sum of 2 numbers " + x + " and " + y + " is equals to " + (x+y));
		System.out.println("The subtraction of 2 numbers " + x + " and " + y + " is equals to " + (x-y));
		System.out.println("The multiplication of 2 numbers " + x + " and " + y + " is equals to " + (x*y));
		System.out.println("The division of 2 numbers " + x + " and " + y + " is equals to " + (x/y));
		
		System.out.format("The sum of 2 numbers %.2f and %.2f is equals to %.2f\n",
				x, y ,(x+y));
		System.out.format("The subtraction of 2 numbers %.2f and %.2f is equals to %.2f\n",
				x, y ,(x-y));
		System.out.format("The multiplication of 2 numbers %.2f and %.2f is equals to %.2f\n",
				x, y ,(x*y));
		System.out.format("The division of 2 numbers %.2f and %.2f is equals to %.2f\n",
				x, y ,(x/y));
		
		x=3.9;
		System.out.println("The Square of the " + x + " is " + x*x);
		
		a = 5;
		b = 8;
		
		System.out.println(" The perimeter of a rectangle with width " + a + " and height " + b
				+ " is equal to " + 2*(a+b));
		System.out.println(" The area of a rectangle with width " + a + " and height " + b
				+ " is equal to " + (a*b));
	}
}
