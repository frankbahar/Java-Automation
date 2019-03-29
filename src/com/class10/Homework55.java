package com.class10;

public class Homework55 {
	/*
	 * Write a program that creates an array of strings with the following
	 * values{"This", "is", "array", "of", "strings"} and prints all values in one
	 * line Hint: This is array of strings
	 */
	public static void main(String[] args) {
		String[] sentence = { "This", "is", "array", "of", "strings" };
		for (int i = 0; i < sentence.length; i++) {
			System.out.print(sentence[i] + " ");
		}
	}

}
