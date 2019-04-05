package com.class17;

public class EvenOdd {

	public static void main(String[] args) {
		int num = 5;
		EvenOdd obj = new EvenOdd();
		obj.checkNumber(num);
	}

	void checkNumber(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is a even number");
		} else {
			System.out.println(a + " is a odd number");
		}
	}

}
