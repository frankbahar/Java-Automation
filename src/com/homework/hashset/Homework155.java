package com.homework.hashset;

import java.util.HashSet;

/*Create the HashSet with list of integers add the below numbers for the list
111
111
111
999
999
999
 and print the list using the using Enhanced for loop 

output
999
111*/
public class Homework155 {

	public static void main(String[] args) {
		 HashSet<Integer> list = new HashSet<Integer>();
		 list.add(111);
		 list.add(111);
		 list.add(111);
		 list.add(999);
		 list.add(999);
		 list.add(999);
		 for(Integer num:list) {
			 System.out.println(num);
		 }
	}

}
