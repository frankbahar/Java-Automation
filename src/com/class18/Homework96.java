package com.class18;

/*Write a method header on line two with the following specs:  

Returns: a String
Method Name: mixString
Parameters:
a String called s1
a String called s2

Then, starting on line 4, write code that will return the strings combined, one letter at a time, starting with s1.  See example below for an example.  You can assume that s1 and s2 are equal lengths:
s1 ==> "12345"
s2 ==> "abcde"
mixString(s1,s2) ==> "1a2b3c4d5e"*/
public class Homework96 {
	static String mixString(String s1, String s2)
	{	String str="";
		for(int i=0;i<s1.length();i++) { 
			str+=s1.charAt(i);
			str+=s2.charAt(i);
		}
		return str;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(mixString("12345","abcde")); //should be 1a2b3c4d5e
		System.out.println(mixString("howdy","hello")); //should be hhoewldlyo
	}
}