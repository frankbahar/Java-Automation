package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		// Create a grocery list: fruits{}
		// vegetables{}
		// dairy{}
		// Retrieve all values using 2 different loops
		String[][] grocery = { { "Apple", "Orange", "Banana", "Blueberry" }, 
				{ "Tomato", "Onion", "Squash" },
				{ "Milk", "Yogurt", "Cheese" } };
		for (int i = 0; i < grocery.length; i++) {
			for (int j = 0; j < grocery[i].length; j++) {
				System.out.print(grocery[i][j] + " ");
			}
			System.out.println();
		}
		for (String[] products : grocery) {
			for (String item : products) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}
}
