package com.class36;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello"); //id=18
		sb.deleteCharAt(3); //id=18
		System.out.println(sb); //id=18
		
		String str="Good moring";
		str.concat("John"); // new String created ("Good morning John")
		System.out.println("String " + str);
		sb.append("John"); // same object value changes
		
		System.out.println("String Buffer " + sb.toString());
		

	}

}
