package com.homework.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*Create a ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

you use an array list that has these values added
(0,1,2,3,4,5)
the array list  output will print
0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5,  */
public class Homework151 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i =0; i<6; i++) {
			arr.add(i);
		}
		int size = arr.size();
		for(int i =0; i<size*2; i+=2) {
			int temp = arr.get(i);
			arr.add(i+1,temp);
		}
		System.out.println(arr);

	}

}
