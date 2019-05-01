package com.homework.arraylist;

import java.util.ArrayList;

/*find out whether the given ArrayList is empty or not

isEmpty(); method of ArrayList is used to check whether the given ArrayList is empty or not. This method returns true
if an ArrayList contains no elements otherwise returns false.
Without adding the numbers to the list call isEmpty method
after adding the one or two numbers to the list call isEmpty Method

Output

true
false*/
public class Homework146 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names.isEmpty());
		names.add("Frank");
		names.add("Ismet");
		names.add("Huseyin");
		System.out.println(names.isEmpty());
	}

}
