package com.class11;

public class Recap {

	public static void main(String[] args) {
		// let's create array of names that will hold 5 and retrieve all values from it.
		String[] names = new String[5];
		names[0] = "Asel";
		names[1] = "Awet";
		names[2] = "Arif";
		names[3] = "Weqas";
		names[4] = "Dimitri";
		// names[5]="Shivs"; will get run time exception when try to access it
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// 2. create an array using literal,
		String[] studentNames = { "Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank" };
		for (int i = 0; i <= studentNames.length - 1; i++) {
			System.out.println(studentNames[i]);
		}
		// retrieve values using: advanced for loop, for each loop, enchanced for loop
		for (String student : studentNames) {
			System.out.println(student);
		}
	}
}
