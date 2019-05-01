package com.class30;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		// generic Array that stores only String object
		ArrayList<String> names = new ArrayList<String>();

		names.add("Frank");
		names.add("Huseyin");
		names.add("Ismail");
		names.add("Armand");
		names.add("John");
		// names.add(1234); not valid since we have generic arraylist of a type of
		// String
		// non-generic arraylist - we can store different types of Objects
		ArrayList alist = new ArrayList();
		alist.add("String");// String
		alist.add(100); // Integer
		alist.add(100.10); // Double
		alist.add(true); // Boolean
		alist.add('a'); // Character
		for (Object o : alist) {
			System.out.println(o);
		}
		
		ArrayList<Boolean> booleanArrayList = new ArrayList();
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		
		for(Object val:booleanArrayList) {
			System.out.println(val);
		}
	}

}
