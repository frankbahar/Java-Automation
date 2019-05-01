package com.homework.interfaces;

/*create Interface with name as MyInterface 
Declare the variable int a=100;
and declare another variable as final int b=200;
and another variable as static int c=300;
In main method try to print the all values 

Output would be

 
100
200
300*/
public class Homework141 implements MyInterface141 {

	public static void main(String[] args) {
		System.out.println(Homework141.a);
		System.out.println(Homework141.b);
		System.out.println(Homework141.c);
	}

}

interface MyInterface141 {
	int a = 100;
	final int b = 200;
	static int c = 300;
}
