package com.homework.hashmap;

import java.util.*;

/*How do you remove a key-value pair from a HashMap if and only if the specified key 
is currently mapped to given value?

Another version of remove() method which takes two arguments – one is key and another one is value,
 removes the mapping for the specified key only if it is currently mapped to given value.

add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

print the key and values pairs
remove
"ONE","AAA"
"FOUR","DDD"
PRINT THE VALUES

OUTPUT
 
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
*/public class Homework164 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		System.out.println("HashMap Before Remove :");
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		map.remove("ONE", "AAA");
		map.remove("FOUR", "DDD");
		System.out.println("------------------");
		System.out.println("HashMap After Remove :");
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}	
	}

}
