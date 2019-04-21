package com.class21;

public class Student {
	String studentName;
	int studentID;
	static int numberOfStudents;

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "Frank";
		student1.studentID=1;
		Student.numberOfStudents++;
		
		Student student2 = new Student();
		student2.studentName = "Ismet";
		student2.studentID=2;
		Student.numberOfStudents++;
		
		Student student3 = new Student();
		student3.studentName = "Huseyin";
		student3.studentID=3;
		Student.numberOfStudents++;
		
		System.out.println("Total number of students is " + Student.numberOfStudents);
	
	}

}
