package com.homework.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*We will be manipulating elements of an ArrayList by using List methods.

Create a method in which you will be storing names into ArrayList and your method should return that arrayList object.

Please add the three names like Shiva,Sandish,Asel

Output would be:

[Shiva, Sandish, Asel]*/
public class Homework153 {

	public static void main(String[] args) {
		System.out.println(setArray());
	}

	public static ArrayList<String> setArray() {
		return new ArrayList<>(Arrays.asList("Shiva", "Sandish", "Asel"));
	}
}
