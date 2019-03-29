package com.class12;

import java.util.Scanner;

public class Homework75 {
	/*
	 * For you to do: If browser is ChRoME It should print the Proceed with chrome
	 * Browser If browser is FireFOX It should print the Proceed with firefox
	 * Browser If browser is Ie It should print the Proceed with ie Browser If any
	 * other browser It should print the Invalid Browser
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name to proceed further with execution");
		String browser = sc.nextLine();
		String upperBrowser = browser.toUpperCase().trim();
		switch (upperBrowser) {
		case "CHROME":
			System.out.println("Proceed with chrome Browser");
			break;
		case "FIREFOX":
			System.out.println("Proceed with firefox Browser");
			break;
		case "IE":
			System.out.println("Proceed with ie Browser");
			break;
		default:
			System.out.println("Invalid Browser");
			break;
		}
	}
}
