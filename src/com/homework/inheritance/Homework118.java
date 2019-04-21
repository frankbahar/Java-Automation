package com.homework.inheritance;

/*create class X create static method in it write the logic in it 
System.out.println("Class X");
create class Y create static method in it write the logic in it and extends class X
System.out.println("Class Y");
create same method name in both the classes
in main method call the the method which you created in Y

Output:
Class Y*/
public class Homework118 {

	public static void main(String[] args) {
		Y.write();
	}

}

class X {

	static void write() {
		System.out.println("Class X");
	}
}

class Y extends X {

	static void write() {
		System.out.println("Class Y");
	}
}
