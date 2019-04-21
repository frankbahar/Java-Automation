package com.class24;

public class Programming {
	Programming(){
		System.out.println("I love programming languages");
	}
	
	Programming(String str){
		System.out.println("I love " + str);
	}
	
	public static void main(String[] args) {
		Programming obj = new Programming();
		Programming obj1 = new Programming("Java");
			
	}
}
