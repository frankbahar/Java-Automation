package com.class18;

/*For you to do 
Multiple Parameters for method
create three method with  Multiple Parameters as int 
and write the logic in that method to perform multiplication,addition and subtraction
and call the method in main method with values 

1. for the addition method add two numbers to make 30 but put those numbers in the parameters
2. for multiplication multiply two numbers to make 30 but put those two numbers in your parameters
3. for Subtraction subtract two numbers to equal 20, with using parameters.
30 for addition
30 for multiplication
20 for subtraction*/
public class Homework86 {
	void add(int a, int b) {
		System.out.println(a + b);
	}

	void multiple(int a, int b) {
		System.out.println(a * b);
	}

	void substract(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		Homework86 obj = new Homework86();
		obj.add(20,10);
		obj.multiple(10, 3);
		obj.substract(30, 10);
	}

}
