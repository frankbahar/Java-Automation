package com.class18;

/*Write a method header on line two with the following specs:

Returns: a String
Method Name: makeCapital
Parameters: a String named "name"

You should not be writing code on any line other than #2*/
public class Homework90 {
	String makeCapital(String name)
	{
		return name.toUpperCase();
	}
	
	//test case below (dont change):
	public static void main(String[] args){
	  Homework90 m=new Homework90();
		System.out.println(m.makeCapital("test"));
	}

}
