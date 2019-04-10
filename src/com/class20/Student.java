package com.class20;
//create a Class student that will have a method  getGrade your method should accept the score of a student and return grade
	// score >90 - A  > 80 - B > 70 -C >60 -D  anything else -F

public class Student {
	String name;
	char grade;
	public char getGrade(int score) {
		if(score>90)
			return 'A';
		else if(score>80)
			return 'B';
		else if(score>70)
			return 'C';
		else if(score>50)
			return 'D';
		else 
			return 'F';
	}
	public static void main(String[] args) {
		Student student1 = new Student();
	System.out.println("Student grade is : " + student1.getGrade(8));	
	}
}
