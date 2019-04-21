package com.homework.variables;

/*Declare the two variables in the Main class and call those variables in the main method 
for example you can declare local variables as
int batch=3;
String InstituteName="SyntaxSolutions"
int year=2019;

call them in the main method;

Output:
3
SyntaxSolutions
2019*/
public class Homework106 {
	int batch=3;
	String InstituteName="SyntaxSolutions";
	int year=2019;

	public static void main(String[] args) {
		Homework106 obj = new Homework106();
		System.out.println(obj.batch);
		System.out.println(obj.InstituteName);
		System.out.println(obj.year);

	}

}
