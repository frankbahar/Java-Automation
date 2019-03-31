package com.class14;

public class ReverseString {

	public static void main(String[] args) {
		//Reverse a string without using a reverse function 
		//1 using toCharArray();
		String original="Today is Java Class";
		String reverse="";
		char[] array = original.toCharArray();
		for(int i = array.length-1; i>=0; i--) {
			reverse+=array[i];
		}
		System.out.println("Reverse String is: " + reverse);
		//1 using toCharArray();
		reverse="";
		for(int i = original.length()-1; i>=0; i--) {
			reverse+=original.charAt(i);
		}
		System.out.println("Reverse String is: " + reverse);
		//using substring()
		reverse="";
		for(int i = original.length(); i>0; i--) {
			reverse+=original.substring(i-1,i);
		}
		System.out.println("Reverse String is: " + reverse);

	}

}
