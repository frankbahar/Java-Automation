package com.homework.variables;

/*Java program to print an int, a double and a char on screen. 
just declared them as instance variables and call them in main method

    int x = 10;
    double y = 10.23;
    char z = 'z';

Ouput print as ordered above.*/
public class Homework108 {
	int x = 10;
	double y = 10.23;
	char z = 'z';

	public static void main(String[] args) {
		Homework108 obj = new Homework108();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
	}
}
