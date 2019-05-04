package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListRemoveDuplicates {

	public static void main(String[] args) {
		List<String> alist = new ArrayList<>();
		alist.add("John");
		alist.add("Jane");
		alist.add("James");
		alist.add("Jasmine");
		alist.add("Jane");
		alist.add("James");
		System.out.println("Before : " + alist);
		Set<String> hset = new HashSet(alist);
		alist.clear();
		alist.addAll(hset);
		System.out.println("After : " + alist);
	}

}
