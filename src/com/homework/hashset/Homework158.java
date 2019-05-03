package com.homework.hashset;

import java.util.HashSet;

/*Converting a HashSet to an Array

Just add the values as

first
second
third
fourth 
fifth 

Output:
HashSet contains: [third, fifth, fourth, first, second] Array elements: third fifth fourth first second*/
public class Homework158 {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("first");
		hset.add("second");
		hset.add("third");
		hset.add("fourth");
		hset.add("fifth");
		System.out.println("HashSet contains: " + hset);
		System.out.println("Array elements:");
		for(Object obj: hset.toArray()) {
			System.out.println(obj + " ");
		}
	}
}
