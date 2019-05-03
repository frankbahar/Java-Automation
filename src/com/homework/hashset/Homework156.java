package com.homework.hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*Write program in LinkedHashSet to iterate the values through LinkedHashSet

Add the values as
first
second
third
fourth 
fifth 
By using the iterator first print the all values and also use by use the contains method check
whether list contains fourth 

Output:
first
second
third
fourth
fifth
Does LinkedHashSet contains first element? true*/
public class Homework156 {

	public static void main(String[] args) {
		Set<String> hs = new LinkedHashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		hs.add("fifth");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Does LinkedHashSet contains first element? " + hs.contains("first"));

	}

}
