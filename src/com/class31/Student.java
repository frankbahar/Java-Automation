package com.class31;

public class Student {
	public String name;
	public int studentId;
	
	public Student(String name, int studentID) {
		this.name=name;
		this.studentId=studentID;
	}
	
	public void printStudentDetails() {
		System.out.println("Student name is " + name + " ID is " + studentId);
	}
}
