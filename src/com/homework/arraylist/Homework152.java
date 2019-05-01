package com.homework.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*Create a ArrayList with boolean inputs  true,false,false

add your boolean values
(true, false, false)
The modified ArrayList should be
true ,false ,false ,true ,false ,false , */
public class Homework152 {

	public static void main(String[] args) {
		/*
		 * ArrayList<Boolean> arr = new ArrayList<>(Arrays.asList(true,false,false));
		 * 
		 * @SuppressWarnings("unchecked") ArrayList<Boolean> arrnew=
		 * (ArrayList<Boolean>) arr.clone(); arr.addAll(arrnew);
		 * System.out.println(arr);
		 */
		
		 ArrayList<Boolean> arr = new ArrayList<>();
		 arr.add(true);
		 arr.add(false);
		 arr.add(false);
		 Iterator it = arr.iterator();
		 while(it.hasNext()) {
			 it.next();
		 }
		 arr.add(true);
		 arr.add(false);
		 arr.add(false);

		 System.out.println(arr);
		 
	}

}
