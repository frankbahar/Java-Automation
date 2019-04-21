package com.class06;

import java.util.Scanner;

public class SwitchLanguage {

	public static void main(String[] args) {
		Scanner scan;
		String country;
		String language;

		scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = scan.nextLine();
		switch (country) {
		case "USA":
			language = "English";
			break;
		case "Afghanistan":
			language = "Pashto";
			break;
		case "Russia":
			language = "Russion";
			break;
		case "Italy":
			language = "Italian";
			break;
		case "Turkey":
			language = "Turkish";
			break;
		case "Morocco":
			language = "Arabic";
			break;
		case "Kazakhstan":
			language = "Russion";
			break;
		case "Pakistan":
			language = "Hindustani";
			break;
		default:
			language = "Unknown";
			break;
		}
		System.out.println("Your language is " + language);
	}

}
