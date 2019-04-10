package com.class18;
/*Write a method header on line two with the following specs:

Returns: a boolean
Method Name: bothEven
Parameters:
an integer called "num1"
an integer called "num2"

Then, starting on line 4, write code that will return true if both num1 and num2 are even.  Return false otherwise.

Examples:
bothEven(4,6) ==> true
bothEven(3,4) ==> false
bothEven(-1,1) ==> false*/

public class Homework94 {
	static boolean bothEven(int num1, int num2)
	{
		return num1 % 2 == 0 && num2 % 2 == 0?true:false;
	}

	// test case below (dont change):
	public static void main(String[] args) {
		System.out.println(bothEven(8, 6)); // should be true
		System.out.println(bothEven(5, 6)); // should be false
	}
}
