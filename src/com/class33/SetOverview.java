package com.class33;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOverview {

	public static void main(String[] args) {
		Set<String> classDays = new HashSet<>();
		classDays.add("Tuesday");
		classDays.add("Wednesyday");
		classDays.add("Thursday");
		classDays.add("Saturday");
		classDays.add("Sunday");
		
		System.out.println(classDays);
		System.out.println("------------enchanced for loop--------");
		for(String day : classDays) {
			System.out.println(day);
		}
		System.out.println("----Iterator----");
		Iterator<String> it = classDays.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
