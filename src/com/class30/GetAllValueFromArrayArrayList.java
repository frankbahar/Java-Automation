package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValueFromArrayArrayList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Frank");
		names.add("Huseyin");
		names.add("Ismail");
		names.add("Armand");
		names.add("John");

		// 1 way
		System.out.println("---1 way using for loop---");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		// 2 way using advance for loop
		System.out.println("---2 way using for enhaced loop---");
		for (Object name : names) {
			System.out.println(name);
		}

		// all collections have 1 method to get all values from collection
		System.out.println("---3 way using iterator---");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {	
			System.out.println(it.next());
		}
	}

}
