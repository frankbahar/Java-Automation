package com.class17_2;

public class NestedLoopDemo {
	public static void main(String[] args) {

		NestedLoopDemo obj = new NestedLoopDemo();

		obj.printNumber();
	}
	
	void printNumber() {
		for (int i = 1; i <= 3; i++) {
			for (int y = 1; y <= 2; y++) {
				System.out.println(i + " " + y); // 11 12 21 22 31 32
			}
		}
	}
}
