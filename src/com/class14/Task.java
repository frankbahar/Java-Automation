package com.class14;

public class Task {

	public static void main(String[] args) {
		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		String str = "I like Java";
		String newStr = str.replace(" ", "");
		System.out.println(newStr);
		
		//Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.
		String str1="Today weather is 63 %#";
		System.out.println("Total aplha characters is: " +str1.replaceAll("[^A-Za-z]", "").length());
		
		//You have a String a=“Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array = a.split("\\?");
		System.out.println("There are " + array.length + " sentences in the string");
		for(String word:array) {
			System.out.println(word);
		} 
	}

}
