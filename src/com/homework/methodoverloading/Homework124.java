package com.homework.methodoverloading;

/*Create the two final method with same name but different parameters and try to call them in main method
create one method with boolean parameter
create another method with String parameter
output would 

Final method with boolean parameter
Final method with String parameter*/
public class Homework124 {
	final void m1(boolean myBoolean) {
		System.out.println("Final method with boolean parameter");
	}

	final void m1(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Homework124 obj = new Homework124();
		obj.m1(true);
		obj.m1("Final method with String parameter");
	}

}
