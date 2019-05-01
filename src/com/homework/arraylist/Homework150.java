package com.homework.arraylist;

import java.util.ArrayList;

/*Create an ArrayList and modify it by removing every other element in the list, starting with removing the 0th element.

Add these values below to your arraylist
("hi" "yo" "sup" "yolo" "boop")
use an advanced for loop to print the new values to the array list
yo yolo */
public class Homework150 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("hi");
		arr.add("yo");
		arr.add("sup");
		arr.add("yolo");
		arr.add("boop");
		int size = arr.size();
		for (int i = arr.size() - 1; i >= 0; i -= 2) {
			arr.remove(i);
		}
		for (String value : arr) {
			System.out.print(value + " ");
		}
	}

}
