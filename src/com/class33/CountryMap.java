package com.class33;

import java.util.*;

public class CountryMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("USA", "Washington DC");
		map.put("Turkey", "Ankara");
		map.put("France", "Paris");
		map.put("United Kingdom", "London");
		map.put("Germany", "Berlin");

		System.out.println("Printing all key values using for each loop");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.print(key + " ");
		}
		System.out.println("\nPrinting all key values using iterator");
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\nPrinting all values using for each loop");
		Collection<String> valCol = map.values();
		for (String val : valCol) {
			System.out.print(val + " ");
		}
		System.out.println("\nPrinting all values using iterator");
		it = valCol.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\nPrinting all country map using for each loop");
		keys = map.keySet();
		for (String key : keys) {
			System.out.print(key + ": " + map.get(key));
		}
		System.out.println("\nPrinting all country map using iterator");
		it = keys.iterator();
		while (it.hasNext()) {
			String country = it.next();
			System.out.print( country+ ": " + map.get(country));
		}
	}

}
