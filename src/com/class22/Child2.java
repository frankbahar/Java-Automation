package com.class22;

public class Child2 extends Parent {
	String  gender= "Male";

	public static void main(String[] args) {
		Child2  child2Object = new Child2();
		System.out.println("Child 2 hair color is " + child2Object.hairColor);
		System.out.println("Child 2 eye color is " + child2Object.eyeColor);
		System.out.println("Child 2 has a " + child2Object.nose + " nose");
		System.out.println("Child 2 gender is "+ child2Object.gender);
		child2Object.sing();
		child2Object.cycling();
	}
	
	public void cycling() {
		System.out.println("Child can cyling");
	}
}
