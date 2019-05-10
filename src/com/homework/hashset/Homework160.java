package com.homework.hashset;

import java.util.*;

/*Create a Set and print the values before deletion and after deletion 
Output:

 
My HashSet content:
[third, first, second]
Clearing HashSet:
Content After clear:
[]*/
public class Homework160 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("first");
		set.add("second");
		set.add("third");
		System.out.println("My HashSet content:");
		System.out.println(set);	
		System.out.println("Clearing HashSet:");
		set.clear();
		System.out.println("Content After clear:");
		System.out.println(set);
	}

}
