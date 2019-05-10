package com.homework.hashmap;

import java.util.*;

/*Create hashmap with key and values pairs  add the duplicate keys and print the values 
add values as below
map.put("mango", 10); 
map.put("apple", 30); 
map.put("orange", 20); 
map.put("mango", 40); 
map.put("mango", 40);     

output 

{orange=50, apple=30, mango=40}*/
public class Homework167 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("mango", 10);
		map.put("apple", 30);
		map.put("orange", 20);
		map.put("mango", 40);
		map.put("mango", 40);
		map.put("orange", 50);
		System.out.println(map);
	}

}
