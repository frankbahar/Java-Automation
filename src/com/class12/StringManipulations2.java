package com.class12;

public class StringManipulations2 {

	public static void main(String[] args) {
		// contains()--> checks string if containes 2nd string
		String str = "Good morning, students!";
		// boolean contains= str.toUpperCase().contains("Morning".toUpperCase()); //will
		// get true
		boolean contains = str.contains("Morning"); // will get false becase case sensitive

		System.out.println(contains);
		String present = "Welcome, Mehmet5465644";
		String neededValue = "WELCOME,";
		boolean flag = present.contains(neededValue);
		System.out.println(flag);

		flag = present.toUpperCase().contains(neededValue);
		System.out.println(flag);

		// startsWith() endsWith() --> will return true if specific String starts with specific value or vs
		String str1 = "syntax";
		boolean starts = str1.startsWith("s");
		System.out.println(starts);
		System.out.println(str.endsWith("y"));
		
		//isEmpty()--> is length of a string is 0 then empty otherwise not empty " " is not empty
		System.out.println("_________isEmpty()_______________");
		String str2="";
		boolean isEmpty = str2.isEmpty();
		System.out.println(isEmpty);
		
		//concat() --> will concatenate 2nd string to the end of first string 
		String str3="Hello ";
		String str4="Ali!";
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
	
		//
		System.out.println("____________");
		String expected="You may qualify for a multi-policy discount";
		String actual=" You may qualify for a multi-policy discount ";
		
		actual = actual.trim(); // trim your String begining end ending whitespaces (not in the middle) 
		System.out.println(expected.equals(actual));
	}
}
