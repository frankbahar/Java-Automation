package com.class22;

public class Student {
	public String studentName;
	public int mathScore;
	public int scienceScore;
	public int artScore;
	
	public Student(String name, int score1, int score2, int score3) {
		this.studentName=name;
		this.mathScore=score1;
		this.scienceScore=score2;
		this.artScore=score3;
	}
	
	public void printAverage() {
		System.out.println("Student " + studentName + " average grade is " + (mathScore+scienceScore+artScore)/3);
	}
}
