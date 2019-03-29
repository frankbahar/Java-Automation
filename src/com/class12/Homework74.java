package com.class12;

import java.util.Scanner;

public class Homework74 {
	/*
	 * //For you to do:
	 * 
	 * If language is Java It should print the Java is a programming language. If
	 * language is C It should print the C is a procedural programming language If
	 * language is C++ It should print the C++ is a middle-level programming
	 * language If any other should print Doesn't match any programming language
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any programming language");
		String language = sc.nextLine();
		String word;
		switch (language) {
		case "Java":
			word = language.concat(" is a programming language");
			break;
		case "C":
			word = language.concat(" is a procedural programming language");
			break;
		case "C++":
			word = language.concat(" is a middle-level programming language");
			break;
		default:
			word = "Doesn't match any programming language";
			break;
		}
		System.out.println(word);
	}
}
