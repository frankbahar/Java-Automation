package com.class11;

public class Task2 {
	// Create an array of countries. While retrieving all values from an array print
	// capital for each country. (use 2 different loops).
	public static void main(String[] args) {
		String[] countries = { "USA", "Turkey", "Germany", "United Kingdom" };
		for (int i = 0; i < countries.length; i++) {
			if (countries[i].equals("USA")) {
				System.out.println("Washington DC");
			} else if (countries[i].equals("Turkey")) {
				System.out.println("Ankara");
			} else if (countries[i].equals("Germany")) {
				System.out.println("Berlin");
			} else if (countries[i].equals("United Kingdom")) {
				System.out.println("London");
			}
		}
		System.out.println("For Each loop");
		for (String country : countries) {
			switch (country) {
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Turkey":
				System.out.println("Ankara");
				break;
			case "Germany":
				System.out.println("Berlin");
				break;
			case "United Kingdom":
				System.out.println("London");
				break;
			}
		}
	}

}
