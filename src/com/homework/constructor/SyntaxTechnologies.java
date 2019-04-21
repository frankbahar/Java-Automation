package com.homework.constructor;

public class SyntaxTechnologies {
	String schoolName;
	int batch;
	String year;
	String lastDayOfClass;

	SyntaxTechnologies() {
	}

	SyntaxTechnologies(String schoolName, int batch, String year, String lastDayOfClass) {
		this.schoolName = schoolName;
		this.batch = batch;
		this.year = year;
		this.lastDayOfClass = lastDayOfClass;
	}

	void printSyntaxTechnologies() {
		System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
	}

}
