package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan;
		boolean snow;
		boolean rain;
		boolean sunny;
		int temp;
		String activity;

		scan = new Scanner(System.in);
		System.out.println("Please enter tempature:");
		temp = scan.nextInt();

		if (temp >= 40 && temp <= 80) {
			System.out.println("Is Raining");
			rain = scan.nextBoolean();
			if (rain) {
				activity = "Watch Movie";
			} else {
				activity = "Hiking";
			}
		} else if (temp >= 25 && temp < 40) {
			System.out.println("Is Snowing");
			snow = scan.nextBoolean();
			if (snow) {
				activity = "Snowboarding";
			} else {
				activity = "Do coding";
			}
		} else if (temp > 80) {
			System.out.println("Is Sunny");
			sunny = scan.nextBoolean();
			if (sunny) {
				activity = "Go to the beach";
			} else {
				activity = "More Coding";
			}
		} else {
			System.out.println("Please enter different Tempatature");
			activity = "Unknown";
		}
		System.out.println("Activity is " + activity);
	}

}
