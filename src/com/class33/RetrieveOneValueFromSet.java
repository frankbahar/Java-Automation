package com.class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetrieveOneValueFromSet {

	public static void main(String[] args) {
		Set<String> cars = new LinkedHashSet<>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Ford");
		// 1. way we convert to the arraylist
		// a-add collection to arraylist
		List<String> list = new ArrayList<>(cars);
		System.out.println("List collection : " + list);
		System.out.println(list.get(2)); // to retrieve Audi
		// b-
		List<String> list2 = new ArrayList<>();
		list2.addAll(cars);
		list2.add("Ford");
		System.out.println("List collection : " + list2);
		System.out.println(list2.get(2)); // to retrieve Audi
		//2 way convert to Array
		Object[] obj = cars.toArray();
		System.out.println(obj[1]);// to reach Honda
	}

}
