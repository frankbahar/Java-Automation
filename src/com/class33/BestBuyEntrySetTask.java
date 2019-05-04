package com.class33;

import java.util.*;

public class BestBuyEntrySetTask {

	public static void main(String[] args) {
		Map<Integer, String> bestBuyStore = new HashMap<>();
		bestBuyStore.put(7664847 , "Printer");
		bestBuyStore.put(7879885, "TV");
		bestBuyStore.put(5455656, "Desktop");
		bestBuyStore.put(3565365, "Keyboard");
		bestBuyStore.put(6755654, "Laptop");
		System.out.println("Using advanced for loop entry set");
		for(Map.Entry<Integer, String> entry: bestBuyStore.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("Using iterator entry set");
		Iterator<Map.Entry<Integer, String>> it = bestBuyStore.entrySet().iterator(); 
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
