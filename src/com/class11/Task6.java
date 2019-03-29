package com.class11;

public class Task6 {

	public static void main(String[] args) {

		String[][] cars = { 
				{ "Ford", "Buick", "GMC" }, 
				{ "BMW", "Mercedes", "Wolkswagen" }, 
				{ "Hyundai", "Kia" },
				{ "Fiat", "Maserati" } };
		for (int row = 0; row < cars.length; row++) {
			for (int col = 0; col < cars[row].length; col++) {
				System.out.print(cars[row][col] + " ");
			}
			System.out.println();
		}

	}

}
