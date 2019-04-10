package com.class18;
/*For you to do 
create two method without any parameters  after main method
method name as newLine
and write the logic for that method in println statement as "newLine method implementation"
method name as displayLine
and write the logic for that method in println statement as "displayLine method implementation"
in main method try to call that method */

public class Homework81 {

	public static void main(String[] args) {
		Homework81 obj = new Homework81();
		obj.newLine();
		obj.displayLine();
	}

	void displayLine() {
		System.out.println("displayLine method implementation");
	}

	void newLine() {
		System.out.println("newLine method implementation");
	}
}
