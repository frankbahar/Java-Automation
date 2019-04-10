package com.class17_2;

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
public class StringMixer {
	static String mixString(String s1, String s2)
	{	String str="";
		
		for(int i=0;i<s1.length() || i<s2.length();i++) { 
			if(i<s1.length())
				str+=s1.charAt(i);
			if(i<s2.length())
				str+=s2.charAt(i);
			/*
			 * if((i+1) < s1.length() && (i+1)==s2.length()) { str+=s1.substring(i+1); }
			 * if((i+1) < s2.length() && (i+1)==s1.length()) { str+=s2.substring(i+1); }
			 */
		}
		return str;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(mixString("12345","abcdefgrjgfgdjgd")); //should be 1a2b3c4d5e
		System.out.println(mixString("howdy","hello")); //should be hhoewldlyo
	}
}