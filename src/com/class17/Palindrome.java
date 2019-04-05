package com.class17;

public class Palindrome {

	public static void main(String[] args) {
		String str = "mom";
		String str1 = "mommy";
		Palindrome obj = new Palindrome();
		obj.isPalindrome(str1);
		obj.isPalindrome(str);

	}

	void isPalindrome(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		if (reverse.equals(str)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
	}

}
