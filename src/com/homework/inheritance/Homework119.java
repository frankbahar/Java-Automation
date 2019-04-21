package com.homework.inheritance;

/*For you to do

Create class A
declare variable int i=10;

Create class B  extends A
declare variable int i=20;

in main method create object for class B and  call the variable which you declared in the class B

Output:
20*/
public class Homework119 {

	public static void main(String[] args) {
		
		B119 obj = new B119();
		System.out.println(obj.i);
	}

}

class A119 {
	int i=10;
}

class B119 extends A119{
	int i=20;
}
