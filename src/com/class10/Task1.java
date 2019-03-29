package com.class10;

public class Task1 {
	//1.Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B
	//(use 2 different ways of creating an array).
	public static void main(String[] args) {
		char[] myChars;
		myChars = new char[6];
		myChars[0]='A';
		myChars[1]='B';
		myChars[2]='C';
		myChars[3]='D';
		myChars[4]='E';
		myChars[5]='F';
		System.out.println(myChars[1]);

		char[] myChars1 = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(myChars1[1]);
		
	}

}
