package com.class05;

import java.util.Scanner;

public class PersonHeight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter person height in Inches: ");
		int height = scanner.nextInt();
	
		if(height < 60 && height > 0) {
			System.out.println("Person is short");
		} else if(height >= 60 && height < 72) {
			System.out.println("Person is medium");
		} else if(height >= 72) {
			System.out.println("Person is tall");
		}	
	}
}
