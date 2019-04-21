package com.homework.old;

public class Homework97_ {
	/*
	 * Write a program that prints the string "It is year: " and the years between
	 * 2010 and 2019.
	 * 
	 * Must not include year 2019 in the output
	 * 
	 * Hint:
	 * 
	 * It is year 2011 It is year 2012 It is year 2013 . . . It is year 2018
	 * 
	 * Output: It is year 2011 It is year 2012 It is year 2013 It is year 2014 It is
	 * year 2015 It is year 2016 It is year 2017 It is year 2018
	 */
	public static void main(String[] args) {
		for (int year = 2011; year < 2019; year++) {
			System.out.println("It is year " + year);
		}
	}

}
