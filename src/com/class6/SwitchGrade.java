package com.class6;

import java.util.Scanner;

public class SwitchGrade {

	public static void main(String[] args) {
		Scanner scan;
		char grade;
		String gradeLevel;

		scan = new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade = scan.next().charAt(0);
		switch (grade) {
		case 'A':
			gradeLevel = "Excellent";
			break;
		case 'B':
			gradeLevel = "Good";
			break;
		case 'C':
			gradeLevel = "Average";
			break;
		case 'D':
			gradeLevel = "Bad";
			break;
		default:
			gradeLevel = "Not Acceptable";
			break;
		}
		System.out.println("Your gradeLevel is " + gradeLevel);
	}

}
