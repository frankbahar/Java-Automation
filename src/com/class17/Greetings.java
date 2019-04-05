package com.class17;

public class Greetings {

	public static void main(String[] args) {
		Greetings obj = new Greetings();
		obj.hello();
		
		//how to find largest number
		int a=140;
		int b=20;
		
		obj.findLargest(a, b);
	 	
		obj.findLargest(30, 40);
		obj.helloToInstructor("Awet");
	}
	
	void hello() {
		System.out.println("Hello");
	}
	
	void helloToInstructor(String name) {
		System.out.println("Hello " + name);
	}
	
	void findLargest(int a, int b) {
		if(a>b) {
			System.out.println(a + " is larger than " + b);
		}else {
			System.out.println(b + " is larger than " + a);
		}
	}

}
