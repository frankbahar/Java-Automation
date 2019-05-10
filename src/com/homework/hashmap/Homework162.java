package com.homework.hashmap;

import java.util.*;

/*Create HashMap with String and Integer.
Print only the key values by using the Enhanced for loop 
add values like ("ONE",1);
Output 
 
FIVE
ONE
FOUR
TWO
THREE*/
public class Homework162 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
		map.put("FIVE", 5);
		
		for(String key:map.keySet()) {
			System.out.println(key);
		}

	}

}
