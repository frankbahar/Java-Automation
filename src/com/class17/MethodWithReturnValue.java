package com.class17;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		String str = "Hello";

		int stringLength = str.length(); // int stringLenght=5
		System.out.println(stringLength);

		char character = str.charAt(3);
		System.out.println(character);

		MethodWithReturnValue obj = new MethodWithReturnValue();
		// String str = obj.askHowAreYou("Asel");
		String day = obj.whatIsADay();
		System.out.println("Today is " + day);

		// int num=obj.findlargestNum(201,10)
		int largestNum = obj.findLargestNum1(201, 10);
		System.out.println(largestNum);

		boolean isOdd = obj.isOdd(largestNum);
		if (isOdd) {
			System.out.println(largestNum + " is a odd number");
		} else {
			System.out.println(largestNum + " is a even number");
		}

	}

	void askHowAreyou(String name) { // parameter
		System.out.println("How are you " + name);
	}

	String whatIsADay() {
		return "Thursday";
	}

	void findLargestNum(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger than " + b);
		} else {
			System.out.println(b + " is larger than " + a);
		}
	}

	int findLargestNum1(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	boolean isOdd(int num) {
		if (num % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

}
