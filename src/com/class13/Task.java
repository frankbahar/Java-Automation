package com.class13;

import java.util.Scanner;

public class Task {
	/*
	 * //Write a program that reads two people’s first names and if they expecting
	 * boy or girl? Based on the input suggests a name for a baby: Example Output:
	 * Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested
	 * baby name: DANRY
	 * 
	 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
	 * girl Suggested baby name: MAIEL
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Mom's First name ");
		String momName = scanner.nextLine();
		System.out.println("Please enter Daddy's First name");
		String dadName = scanner.nextLine();
		System.out.println("Please enter baby's gender Girl or Boy");
		String gender = scanner.nextLine();
		String babyName= "";
		if(gender.equalsIgnoreCase("Girl")) {
			babyName = momName.substring(0,momName.length()/2).concat(dadName.substring(dadName.length()/2));
		}else if(gender.equalsIgnoreCase("Boy")) {
			babyName = dadName.substring(0,dadName.length()/2).concat(momName.substring(momName.length()/2));
		}else {
			System.out.println("Please enter valid gender");
		}
		System.out.println(babyName.toUpperCase());
	}
}
