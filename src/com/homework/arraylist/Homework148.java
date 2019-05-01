package com.homework.arraylist;

import java.util.ArrayList;

/*Create the arraylist with list of integers add the below numbers for the list
111
111
111
999
999
999
and print the list using the using Enhanced for loop 

output

 
111
111
111
999
999
999*/
public class Homework148 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			arr.add(111);
		}
		for (int i = 1; i < 4; i++) {
			arr.add(999);
		}
		for (Integer num : arr) {
			System.out.println(num);
		}
	}
}