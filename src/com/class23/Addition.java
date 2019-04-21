package com.class23;

public class Addition {
	//overloading methods by changing number of parameters
	public void add(int a, int b) {
		System.out.println("method 2 int parameter");
		System.out.println(a+b);
	}
	
	public void add(int a) {
		System.out.println("method 1 int parameter");
		System.out.println(a+100);
	}
	
	public void add(int a, int b, int c) {
		System.out.println("method 3 int parameter");
		System.out.println(a+b+c);
	}
	//2overloading method by changing the data type of the parameters
	public void add(double a, double b) {
		System.out.println("method 2 double parameter");
		System.out.println(a+b);
	}
	
	public void add(int a, double b) {
		System.out.println("method 1 int parameter 1 double");
		System.out.println(a+b);
	}
	
	public void add(double a, int b) {
		System.out.println("method 1 double 1  int parameter");
		System.out.println(a+b);
	}
	
	public void add(double a, double b, double c) {
		System.out.println("method 2 double parameter");
		System.out.println(a+b+c);
	}
}
