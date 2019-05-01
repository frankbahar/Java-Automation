package com.homework.arraylist;

import java.util.ArrayList;

/*retrieve an element from a particular position of an ArrayList

get() method returns an element from a specified position of an ArrayList. This method takes index of the element as an argument.

Add the six Elements to the list 
111
222
333
444
555
666

by using get method call get 1, 3, 5*/
public class Homework147 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(111);
		arr.add(222);
		arr.add(333);
		arr.add(444);
		arr.add(555);
		arr.add(666);
		System.out.println(arr.get(1));
		System.out.println(arr.get(3));
		System.out.println(arr.get(5));
	}

}
