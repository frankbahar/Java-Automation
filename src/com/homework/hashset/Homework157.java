package com.homework.hashset;

import java.util.HashSet;
import java.util.Set;

/*How to remove the single elements and how to remove the all the elements from the hashSet

Just add the values as

first
second
third
fourth 
fifth 

first print the all values

than first delete single element i.e second 

than print the values

than delete all the elements 

after that print the values

output

[third, fifth, fourth, first, second]
[third, fifth, fourth, first]
[]*/
public class Homework157 {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		hs.add("fifth");
		System.out.println(hs);
		hs.remove("second");
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
	}

}
