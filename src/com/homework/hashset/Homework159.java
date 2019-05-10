package com.homework.hashset;

import java.util.*;

/*Create set of string values 
Please add the below values and see the result 

 
add("India"); 
add("Australia"); 
add("South Africa"); 
add("India");
add("America");
add("America");

Output:
 
[America, Australia, India, South Africa]*/
public class Homework159 {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("India"); 
		set.add("Australia"); 
		set.add("South Africa"); 
		set.add("India");
		set.add("America");
		set.add("America");
		System.out.println(set);

	}

}
