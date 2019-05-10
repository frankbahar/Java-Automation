package com.class34;

import java.util.*;

/*1.Create a Map from array of cities that will sort keys in alphabetical order. As a key store the name of the city 
 * and as a value store the length of the city name (Example: Paris=5, Moscow =6 etc..).
If any city name is more than 7 characters remove that city ( use entrySet with Iterator ).

2. Write a program to check which employee gets highest salary use hashmap employee name as key and salary amount
 as the value. Output example: John Smith=100000.*/
public class Task {

	public static void main(String[] args) {
		// Task 1 
		String[] cities= {"Paris", "Moscow", "New York", "Antalya"};
		
		Map<String, Integer> cityMap = new TreeMap<>();
		for(String city:cities) { 
			cityMap.put(city, city.length());
		}
		System.out.println("Before remove cities : " + cityMap);
		Iterator<Map.Entry<String, Integer>> it = cityMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			if(entry.getValue()>7) {
				it.remove();
			}
		}
		System.out.println("After remove cities : " + cityMap 
				);
		//Task 2
		Map<String, Integer> emp = new HashMap<>();
		emp.put("Frank", 130000);
		emp.put("John", 120000);
		emp.put("Melissa", 110000);
		emp.put("James", 125000);
		emp.put("Liz", 115000);
		it = emp.entrySet().iterator();
		int maxSalary=0;
		String nameMaxSalary="";
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			if(entry.getValue()>maxSalary) {
				maxSalary= entry.getValue();
				nameMaxSalary=entry.getKey();
			}
		}
		System.out.println(nameMaxSalary + "=" + maxSalary);
	}

}
