package com.homework.hashmap;

import java.util.*;

/*How do you replace a value associated with a given key in the HashMap?

replace() method replaces the value associated with the specified key if the key is currently mapped to some value

add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
print the key and values pairs

replace with below values
 map.replace("THREE", "ASEL"); 
 map.replace("FIVE", "SUMAIR"); 
PRINT THE VALUES AFTER REPLACING

OUTPUT
 
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : SUMAIR*/
public class Homework165 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");
		System.out.println("HashMap Before Replace :");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");
		System.out.println("------------------");
		System.out.println("HashMap After Replace :");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
