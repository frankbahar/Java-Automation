package com.class33;

import java.util.*;

public class EntrySet {

	public static void main(String[] args) {
		Map<String, Integer> classroomMap = new LinkedHashMap<>();
		classroomMap.put("Table", 20); // Entry<Key, Value>
		classroomMap.put("Chairs", 60); // Entry<String, Integer>
		classroomMap.put("Screens", 3);
		classroomMap.put("Student", 60);
		classroomMap.put("Instructor", 3);
		System.out.println(classroomMap);
		for(Map.Entry<String, Integer> entry:classroomMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		Iterator<Map.Entry<String, Integer>> it = classroomMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	

}
