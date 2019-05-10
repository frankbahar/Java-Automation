package com.homework.hashmap;

import java.util.*;

/*Add the following values to the Map
map.put("Shiva",222);
map.put("Sandish",333);
map.put("Asel",555);
map.put("Sumair",666);

Print all keys using iterator*/
public class Homework163 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Shiva",222);
		map.put("Sandish",333);
		map.put("Asel",555);
		map.put("Sumair",666);
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
