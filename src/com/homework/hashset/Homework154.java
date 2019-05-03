package com.homework.hashset;

import java.util.HashSet;

/*Use add() method to add values in the hash set  
add the colors
Red
Pink
Yellow
White
Black
print the colors 
and get total number of colors available in the set

Output:
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5*/
public class Homework154 {

	public static void main(String[] args) {
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("Red");
		h_set.add("Pink");
		h_set.add("Yellow");
		h_set.add("White");
		h_set.add("Black");
		System.out.println("Original Hash Set: " + h_set);
		System.out.println("Size of the Hash Set: " + h_set.size());

	}

}
