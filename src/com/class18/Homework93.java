package com.class18;

/*Write a method header on line two with the following specs:  

Returns: a char
Method Name: getChar
Parameters:
a String called "word"
an integer called "index"

Then, starting on line 4, write code that will return the character in "word" at the index "index"

Examples:
getChar("hello",1) ==> 'e'
*/
public class Homework93 {
	static char getChar(String word, int index) {
		return word.charAt(index);
	}

	// test case below (dont change):
	public static void main(String[] args) {
		System.out.println(getChar("hello", 1)); // should be 'e'
	}
}
