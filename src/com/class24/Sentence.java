package com.class24;

public class Sentence {

	public static void main(String[] args) {
		Sentence obj = new Sentence();
		obj.printWords("Hello");
		obj.printWords("Hello", 5);
		obj.printWords("Hello", "Word");
	}

	private void printWords(String str) {
		System.out.println(str);
	}

	private void printWords(String str, int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}

	private void printWords(String str, String str2) {
		System.out.println(str + " " + str2);
	}
}
