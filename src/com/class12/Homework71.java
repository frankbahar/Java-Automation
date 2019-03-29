package com.class12;

public class Homework71 {
	//(all output should be one per line)
	/*
	 * Output 1: print str starting at index 5 and going to the end Output 2: print
	 * str starting at index 7 and ending at index 10 Output 3: print "harambe" this
	 * must not be a new string must be from str Output 4: print "t f" this must not
	 * be a new string must be from str on one line
	 */
	public static void main(String[] args) {
	
		String str = "laptops out for harambe";
		System.out.println(str.substring(5));
		System.out.println(str.substring(7,10));
		System.out.println(str.substring(16));
		System.out.println(str.substring(10,13));
	}
}
