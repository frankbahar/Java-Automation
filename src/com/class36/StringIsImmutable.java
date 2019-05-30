package com.class36;

public class StringIsImmutable {

	public static void main(String[] args) {
		//2 ways to create String;
		//1 way - using String literal
		String str="Hello"; // id =18
 		//2 way 
		String str2 = new String("Bye");
		
		str = str.toUpperCase(); //id = 20
		str = str.replace("O", "A"); //id =22
		System.out.println(str);
		str=str2;
		
		
	}

}
