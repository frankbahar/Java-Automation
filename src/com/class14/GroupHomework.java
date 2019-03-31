package com.class14;

import java.util.Scanner;

public class GroupHomework {
	/*
	 * 1. Write a program to swap 2 numbers without a temporary variable? Swap 2
	 * strings without a temporary variable?
	 * 
	 * 2.Write a java program to find the second largest number in the array?
	 * Maximum and minimum number in the array?
	 * 
	 * 3. Find out how many alpha characters present in a string?
	 * 
	 * 4.How to find out the part of the string from a string? What is substring?
	 * Find number of words in string?
	 * 
	 * 5. Write a java program to reverse String? Reverse a string word by word? 6.
	 * Write a Java Program to find whether a String is palindrome or not? reverse
	 * order same also original order
	 * 
	 * 7. Write a java program to check whether a given number is prime or not?
	 * 
	 * 8. Write a Java Program to print first 10 numbers of Fibonacci series.
	 */
	public static void main(String[] args) {
		// 1
		int num1 = 5;
		int num2 = 10;
		System.out.println("before " + num1 + " and " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("after " + num1 + " and " + num2);

		String str1 = "Hello";
		String str2 = "World";
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());// Hello
		str1 = str1.substring(str2.length());

		System.out.println("The value of str1= " + str1 + " the value of str2 = " + str2);
		str1 = "Hello";
		str2 = "World";
		str1 = str1 + str2;
		str2 = str1.replaceAll(str2, "");
		str1 = str1.replaceAll(str2, "");
		System.out.println("The value of str1= " + str1 + " the value of str2 = " + str2);

		// 2
		int[] values = { 45, 78, 12, 67, -1 };
		int largest = values[0];
		int second = values[0];
		int min = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i] > largest) {
				second = largest;
				largest = values[i];

			} else if (values[i] > second) {
				second = values[i];
			}
			if (values[i] < min) {
				min = values[i];
			}
		}
		System.out.println("Max is: " + largest + " Min is: " + min + " Second Max is: " + second);

		// 3
		String str = "Taking the classes from Syntax is %100 great";
		String newStr = str.replaceAll("[^a-zA-Z]", "");
		System.out.println("Total aplha character is : " + newStr.length());

		// 4 we can use substring method to find out the part of the string
		// substring is gives nex string out of old string first parameter is beginning
		// index for new string and if there is 2nd parameter
		// its ending index for the newstring if not second string goes to end to first
		// string
		str = "Today is weather is perfect for cycling";
		String substring = str.substring(9, 16);
		System.out.println(substring);
		System.out.println("Number of words in string is: " + str.split(" ").length);

		// 5
		str = "Today is my Birthday";
		String[] array = str.split(" ");
		System.out.println(str);

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");

		}
		System.out.println();

		// 6
		Scanner scanner = new Scanner(System.in);
		String reverse = "";
		while (true) {
			System.out.println("Please enter string to check whether is palindrome or to exit q");
			str = scanner.nextLine();
			if (str.equals("q")) {
				break;
			} else {
				for (int i = str.length() - 1; i >= 0; i--) {
					reverse += str.charAt(i);
				}
				if (str.equalsIgnoreCase(reverse)) {
					System.out.println(str + " is palindrome");
					break;
				} else {
					System.out.println(str + " is not palindrome");
				}
			}
		}
		
		// 7
		int num = 58;
		boolean isPrime = num > 1 ? true : false;
		for (int i = 2; i < num / 2 + 1; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is a not a prime number");
		}
		// 8
		int fibonacci = 1;
		num1 = 0;

		num2 = 1;
		System.out.print(num1 + " " + num2 + " ");
		for (int i = 2; i < 10; i++) {
			fibonacci = num1 + num2;
			num1 = num2;
			System.out.print(fibonacci + " ");
			num2 = fibonacci;
		}

		System.out.println("-----------");
	}
}
