package com.class12;

import java.util.Scanner;

public class Task {
	/*
	 * //Accept username, password and confirm password and check following
	 * requirements:
	 * 
	 * Username and Password cannot be empty, if so→ message=”Username and Password
	 * cannot be empty”. Password should be minimum 8 characters, if less →
	 * message=”Password is too short”. Password cannot contain username if so, →
	 * message=”Password cannot contain username”. Password should match confirmed
	 * password, if not → message “Passwords do not match”. Only after all
	 * requirements met → message “Your username and password has been created”
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String username, password, confirmedPassword;
		while(true) {
			System.out.println("Please enter Username: ");
			username = scanner.nextLine();

			System.out.println("Please enter Password: ");
			password = scanner.nextLine();
			
			System.out.println("Please confirm Password: ");
			confirmedPassword = scanner.nextLine();
			if(username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()) {
				System.out.println("Username and Password cannot be empty Please try again");
			} else if(password.length() < 8) {
				System.out.println("Password is too short please try again");
			} else if(password.toUpperCase().contains(username.toUpperCase())) {
				System.out.println("Password cannot contain username, Please try again");
			} else if (!password.equals(confirmedPassword)) {
				System.out.println("Passwords do not match, Please try again");
			} else {
				System.out.println("Your username and password has been created");
				break;
			}
		}
	}
}
