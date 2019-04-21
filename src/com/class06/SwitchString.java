package com.class06;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		Scanner scan;
		String country;
		String food;

		scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = scan.nextLine();
		switch (country) {
		case "USA":
			food = "Burger";
			break;
		case "Afghanistan":
			food = "Palav";
			break;
		case "Russia":
			food = "Pelmeni";
			break;
		case "Italy":
			food = "Pasta";
			break;
		case "Turkey":
			food = "Baklava";
			break;
		case "Morocco":
			food = "Couscous";
			break;
		case "Kazakhstan":
			food = "Beshparmak";
			break;
		case "Pakistan":
			food = "Biryani";
			break;
		default:
			food = "Unknown";
			break;
		}
		System.out.println("Your favorite food is " + food);

	}

}
