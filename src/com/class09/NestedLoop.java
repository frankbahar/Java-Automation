package com.class09;

public class NestedLoop {

	public static void main(String[] args) {
		printText();
	}

	public static void printText() {
		for (int i=0; i<5; i++) {
			for (int y = 0; y < 3; y++) {
				System.out.println("I am inner loop");
			}
			System.out.println("----------------I am outer loop---------------");
		}
	}
}
