package com.class10;

public class Task3 {
	//3.Create an array of words: Java, Saturday, day, coding, is. 
	//Print the following sentence using element of array: “Saturday is Java coding Day”.
	public static void main(String[] args) {
		String[] mySentence = {" Java", "Saturday", " day", " coding", " is"};	
		System.out.println(mySentence[1] + mySentence[4] + mySentence[0] + mySentence[3] + mySentence[2]);
		int size = mySentence.length;
		System.out.println("The size of an array is " + size);
	}

}
