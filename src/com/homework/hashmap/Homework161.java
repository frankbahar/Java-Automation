package com.homework.hashmap;

import java.util.*;

/*Create HashMap with String and Integer and print the values directly 

Output 

 
{FIVE=5, ONE=1, FOUR=4, TWO=2, THREE=3}*/
public class Homework161 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
		map.put("FIVE", 5);
		System.out.println(map);

	}

}
