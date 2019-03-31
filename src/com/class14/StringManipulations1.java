package com.class14;

public class StringManipulations1 {
	
	public static void main(String[] args) {
		//toCharArray
		String str="saturday";
		char[] myChars = str.toCharArray();
		for(int i=0; i<myChars.length; i++) {
			System.out.println(myChars[i]);
		}
		for(char myChar:myChars) {
			System.out.println(myChar);
		}
		for(int i=myChars.length-1; i>=0;i--) {
			System.out.print(myChars[i]);
		}
		
	}
}
