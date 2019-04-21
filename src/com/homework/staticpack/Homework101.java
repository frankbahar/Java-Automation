package com.homework.staticpack;

public class Homework101 {
	/*
	 * Declare the static variable in the Main class as static String
	 * ss="Welcome To Syntax Solutions" and call the static variable in main method
	 * You need to call the static variable in three different ways first way : By
	 * calling directly Second way: By using the className Third way: By creating
	 * the object of the class
	 * 
	 * Output: Welcome To Syntax Solutions Welcome To Syntax Solutions Welcome To
	 * Syntax Solutions
	 */

	static String ss= "Welcome To Syntax Solutions";
	public static void main(String[] args) {
		System.out.println(ss);
		System.out.println(Homework101.ss);
		Homework101 obj = new Homework101();
		System.out.println(obj.ss);

	}

}
