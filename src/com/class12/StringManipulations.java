package com.class12;

public class StringManipulations {

	public static void main(String[] args) {
		//Length() function/method - returns number of characters in the String
		String str = "Syntax";
		int length = str.length();
		System.out.println(length);

		String str1 = "Syntax Technologies";
		int lengthOf2String = str1.length();
		System.out.println(lengthOf2String);
		
		String str2="Welcome, students!";
		System.out.println(str2.length());
		
		String str3="Hello";
		String newString = str3.toUpperCase(); // toUpperCase() -> converts all characters to UpperCase
		System.out.println(newString);
		
		String lowerString = newString.toLowerCase(); // toLowerCase() -> convert all characters to lowerCase
		System.out.println(lowerString);
		
		//equals()- compares 2 strings, if string equal --> true else -->false
		String str4="Hello";
		String str5 = "Hello";
		boolean equality = str4.equals(str5);
		System.out.println(equality);
		
		// equalsIgnoreCase()- compares 2 strings but ignore case sensivity, if string equal --> true else -->false
		String expectedBrowser="Chrome";
		String actualBrowser="chrome";
		equality = expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equality);
	}

}
