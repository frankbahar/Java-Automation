package com.class33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Task {

	public static void main(String[] args) {
		System.out.println(
				"1. Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.");
		ArrayList<String> names = new ArrayList<String>();

		names.add("Frank");
		names.add("Huseyin");
		names.add("Ismail");
		names.add("Armand");
		names.add("John");
		Collections.sort(names);
		System.out.println(names);

		System.out.println(
				"2. Create an array of Strings and using Arrays class  class sort the values of that array of Strings.");
		String[] cars = { "Nissan", "Acura", "Honda", "Audi" };
		Arrays.sort(cars);
		for (String car : cars)
			System.out.print(car + " ");

		System.out.println("3. Create an HashSet of cities and add duplicates into it.\r\n"
				+ "    Retrieve all values from hashset in 2 different ways.\r\n"
				+ "    Retrieve all values in alphabetical order.");
		HashSet<String> cities = new HashSet<>();
		cities.add("New York");
		cities.add("Los Angeles");
		cities.add("Houston");
		cities.add("New York");
		cities.add("Houston");
		// 1. using advance for loop
		System.out.println("----using advance for loop");
		for (String city : cities) {
			System.out.println(city);
		}
		// 2-using iterator
		System.out.println("----using iterator");
		Iterator<String> it = cities.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		List<String> alist = new ArrayList<>(cities);
		Collections.sort(alist);
		System.out.println(alist);
		
	}

}
