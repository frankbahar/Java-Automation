package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
	// prompt user to ask the name 3 times and print "You are doing great____"
		Scanner scan = new Scanner(System.in);
		String name;
		
		int a=3;
		
		while(a > 0) {
			System.out.println("Please enter your name: ");
			name = scan.nextLine();
			System.out.println("You are doing great " + name);
			a--;
		}
	}

}
