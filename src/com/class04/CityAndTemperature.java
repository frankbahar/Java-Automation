package com.class04;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {
	// ask user to enter city and tempature in Fahrenheit
	// your program should convert F -> C
	// your program should say The temperature in the city __ is ___
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter city: ");
		String city = scanner.nextLine();
		System.out.println("Please enter temperature in Fahrenheit : ");
		int tempF = scanner.nextInt();
		int tempC= (tempF - 32) *5/9;
		System.out.println("The temperture in " + city + " is " + tempC + " Celsius");
	}
}
