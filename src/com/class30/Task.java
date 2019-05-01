package com.class30;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Frank");
		names.add("Huseyin");
		names.add("Ismail");
		names.add("Armand");
		names.add("John");

		if (names.isEmpty()) {
			System.out.println("Array list is empty");
		} else {
			System.out.println("Array list is not empty has " + names.size() + " elements");
		}

		if (names.contains("Frank")) {
			System.out.println("Frank is in the arraylist");
		} else {
			System.out.println("Frank is not in the arraylist");
		}
		System.out.println("Array list size is " + names.size());
		System.out.println("----Array list elements");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
