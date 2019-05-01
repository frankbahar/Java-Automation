package com.homework.arraylist;

import java.util.ArrayList;

/*remove an element from a particular position of an ArrayList?
remove() method which takes int type as an argument is used to remove an element from a particular position of an ArrayList. remove the element at position 1

remove all elements of an ArrayList at a time?

clear() method removes all elements of an ArrayList. ArrayList will be empty after this method is executed.

add the below elements to the list
111
222
333
444
555
666

 output

[111, 333, 444, 555, 666]
[]*/
public class Homework149 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(111);
		arr.add(222);
		arr.add(333);
		arr.add(444);
		arr.add(555);
		arr.add(666);
		arr.remove(1);
		System.out.print("[");
		for (int i=0; i<arr.size()-1; i++) {
			System.out.print(arr.get(i)+ ", ");
		}
		System.out.println(arr.get(arr.size()-1)+ "]");
		arr.clear();System.out.print("[");
		for (int i=0; i<arr.size()-1; i++) {
			System.out.print(arr.get(i)+ ", ");
		}
		if (arr.isEmpty()) {
		System.out.println("]");
		} else {
			System.out.println(arr.get(arr.size()-1)+ "]");
					
		}
	}
}
