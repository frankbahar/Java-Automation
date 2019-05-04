package com.class33;

import java.util.*;

public class AllKeysAndValueFromMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"A");
		map.put(2,"AA");
		map.put(3, "B");
		map.put(3, "C");
		map.put(4, "D");
		System.out.println(map);
		//returns  a Set of keys from the map
		Set<Integer> keys = map.keySet();
		System.out.println("using for each loop");
		for(Integer key:keys) {
			System.out.println(key + ": " + map.get(key));
		}
		Iterator<Integer> it = keys.iterator();
		System.out.println("\nusing iterator");
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println( key + ": " + map.get(key));
		}
		//how to get All Values
		//return collection of values from a map
		Collection<String> valCol=map.values();
		System.out.println("using for each loop");
		for(String value:valCol) {
			System.out.print(value + " ");
		}
		Iterator<String> itValues = valCol.iterator();
		System.out.println("\nusing iterator");
		while(itValues.hasNext()) {
			System.out.print(itValues.next() + " ");
		}

	}

}
