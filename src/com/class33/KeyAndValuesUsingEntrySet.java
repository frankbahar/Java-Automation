package com.class33;

import java.util.*;

public class KeyAndValuesUsingEntrySet {

	public static void main(String[] args) {
		//Create a map store userdetails(name, salary, department, title)
		Map<String, String> userDetailsMap = new TreeMap<>();
		userDetailsMap.put("Name", "Alex Smith"); // 1 entry =key = name + value = "Alex Smith"
		userDetailsMap.put("Salary", "90000");   // 2 entry
		userDetailsMap.put("Department", "IT"); //3 entry
		userDetailsMap.put("Title", "Automation Tester"); // 4 entry
		System.out.println(userDetailsMap);
		userDetailsMap.entrySet(); //return a set of Entries
		for(Map.Entry entry : userDetailsMap.entrySet()) { // non generic
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		for(Map.Entry<String, String> entry : userDetailsMap.entrySet()) { // generic 
 			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		Iterator<Map.Entry<String, String>> it = userDetailsMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());			
		}
			

	}

}
