package com.class13;

public class StringReview {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday → yadnuS).
		String str = "Sunday";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		//Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String
		System.out.println("\n---Task2---");
		String str1="Frank";
		if(!str1.isEmpty()) {
			if(str1.length()%2 == 1 && str1.length()>=3 )
				System.out.println(str1.charAt(str1.length()/2));
		}
	}

}
