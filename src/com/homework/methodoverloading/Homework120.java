package com.homework.methodoverloading;

/*Write program to overload static method

Create the two static method with different parameters and try to call them in main method
create one method without parameter
create another method with int parameter

output would 
 
M1 method without parameter
M1 method with int parameter*/
public class Homework120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework120.m1();
		Homework120.m1(5);
	}

	static void m1() {
		System.out.println("M1 method without parameter");
	}

	static void m1(int num) {
		System.out.println("M1 method with int parameter");
	}

}
