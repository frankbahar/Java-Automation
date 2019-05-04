package com.class33;

import java.util.*;

public class MapTask {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "Feza Cell");
		map.put(4, "Apple");
		map.put(5, "eBay");
		map.put(6, "Apple");
		map.put(7, "Paypal");
		map.put(1, "Amazon");
		System.out.println("we have " + map.size() + " elements");
		System.out.println("Before update 4th floor " + map);
		map.put(4, "Facebook");
		System.out.println("after update 4th floor " + map);
		System.out.println("Before remove 7th floor " + map);
		map.remove(7);
		System.out.println("after remove 7 th floor " + map);
	}

}
