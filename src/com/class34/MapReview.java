package com.class34;

import java.util.*;

public class MapReview {

	public static void main(String[] args) {
		//create a map of grocery procucts and its quantity
		Map<String, Integer> grocerceryMap = new LinkedHashMap<>();
		grocerceryMap.put("Milk", 1);
		grocerceryMap.put("Bread", 2);
		grocerceryMap.put("Eggs", 12);
		grocerceryMap.put("Coffee", 2);
		grocerceryMap.put("Potato", 2);
		grocerceryMap.put("Cookies", 3);
		System.out.println(grocerceryMap);
		grocerceryMap.put("Cheese", 1);
		System.out.println(grocerceryMap.size());
		grocerceryMap.replace("Eggs", 18);
		System.out.println(grocerceryMap);
		grocerceryMap.remove("Cheese");
		System.out.println(grocerceryMap);
		//retrieving all values using keySet();
		Set<String> keySet = grocerceryMap.keySet();
		for(String key:keySet) {
			System.out.println(key + ": " + grocerceryMap.get(key));
		}
		Iterator<String> it=keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + ": " + grocerceryMap.get(key));
		}
		//without assigning the variable
		for(String key:grocerceryMap.keySet()) {
			System.out.println(key + ": " + grocerceryMap.get(key));
		}
		Iterator<String> keyit=grocerceryMap.keySet().iterator();
		while(keyit.hasNext()) {
			String key = keyit.next();
			System.out.println(key + ": " + grocerceryMap.get(key));
		}
		//retrieving all values using
		Collection<Integer> varCol = grocerceryMap.values();
		for(Integer value: varCol) {
			System.out.println(value);
		}
		for(Integer value: grocerceryMap.values()) {
			System.out.println(value);
		}
		Iterator<Integer> valueIt = grocerceryMap.values().iterator();
		while(valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}
		//retrieving all key+values using entryset();
		for(Map.Entry<String, Integer> entry : grocerceryMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		//map --> using entrySet we will get --> any collection has iterator method
		Iterator<Map.Entry<String, Integer>> itEntry = grocerceryMap.entrySet().iterator();
		while(itEntry.hasNext()) {
			Map.Entry<String, Integer> entry = itEntry.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
