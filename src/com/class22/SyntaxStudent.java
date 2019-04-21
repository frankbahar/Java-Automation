package com.class22;

public class SyntaxStudent {
	/*schoolName, batchNumber, studentName, studentLastName
	 * method getStudentDetails
	 */
	public static String schoolName="Syntax";
	public static int batchNumber=4;
	public String studentName;
	public String studentLastName;
	
	public SyntaxStudent(String name, String lastName) {
		this.studentName = name;
		this.studentLastName = lastName;
	}
	
	public void getStudentDetails() { 
		String details="I am a student at " + schoolName + " from batch " + batchNumber + " name is " + studentName + " last name is " + studentLastName;
		System.out.println(details);
	}
}
