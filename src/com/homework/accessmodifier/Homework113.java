package com.homework.accessmodifier;

/*For you to do 
Declare two private variables in Main class as
private int batch=3
private String name="SyntaxSolutions"
declare one private method in Main class as display

create a method to return print those two values and print them in your main method by calling that method please print in order as shown above

Output:
3
SyntaxSolutions*/
public class Homework113 {
	private int batch=3;
	private String name="SyntaxSolutions";

	public static void main(String[] args) {
		Homework113 obj = new Homework113();
		obj.printValues();
	}
	
	private void printValues() {
		System.out.println(batch);
		System.out.println(name);
	}
}
