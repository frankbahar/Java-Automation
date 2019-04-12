package com.class20;

public class AccessModifiers {
	private String name="John";
	String name1="Bilal";
	protected String name2 ="Asha";
	public String name3 = "Tetiana";

	public static void main(String[] args) {
		// Create a method createEmail().
		// Based on provided user name, lastName and email type.
		// your method should return complete email address; johnsnow@gmail.com
		// johnsnow@yahoo.com

		System.out.println(createEmail("Frank", "Bahar", "gmail"));
		System.out.println(createEmail("frank", "bahar", "yahoo"));
		AccessModifiers obj = new AccessModifiers();
		System.out.println(obj.reverseString("Frank"));
		System.out.println("mom is palindrome " + obj.isPalindrome("mom"));
		System.out.println("mommy is palindrome " + obj.isPalindrome("mommy"));
		String str = "I love Java";
		System.out.println(str + " words are below");
		String[] words = obj.wordsOfString(str);
		for(String word:words ) {
			System.out.println(word);
		}
		obj.sayHello();
	}

	static String createEmail(String fName, String lName, String emailType) {
		return (fName + lName + "@" + emailType + ".com").toLowerCase();

	}
	//Create a method that will take 1 parameter as a String and return reversed String. Method should be visibly only within same package.
	String reverseString(String str) {
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
			
		}
		return reverse;
	}
	
	//Create a method that will take a String and return whether String is palindrome or not. Method should available to all classes within your projects.
	public boolean isPalindrome(String str) {
		String reverse = reverseString(str);
		return reverse.equals(str) ? true : false;
	}
	
	//Create a method that will take a string and return array of words from that string. Method should be available only within same class.
	private String[] wordsOfString(String str) {
		return str.split(" ");
	}
	
	void sayHello() {
		System.out.println("Hello students");
	}
}
