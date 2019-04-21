package com.homework.methodoverloading;

/*Create two private method with different parameters and try to call them in main method
create one method without parameter
create another method with int parameter

output would 

private m1 method 
private m1 method with int parameter*/
public class Homework122 {

	public static void main(String[] args) {
		Homework122.m1();
		Homework122.m1(5);

	}
	
	private static void m1() {
		System.out.println("private m1 method");
	}
	
	private static void m1(int num) {
		System.out.println("private m1 method with int parameter");
	}
}
