package com.class9;

public class RectangleShape {

	public static void main(String[] args) {
		// rectangle perimeter
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
