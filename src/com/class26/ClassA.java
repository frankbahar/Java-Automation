package com.class26;

public class ClassA {

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.methodFinal();
		obj.methodFinal(5);
	}

	final void methodFinal() {
		System.out.println("Parent Final");
	}

	final void methodFinal(int num) {
		System.out.println("Parent Final method overloaded");
	}
}

class ClassB extends ClassA {
	/*
	 * we CANNOT override final method final void methodFinal() {
	 * System.out.println("Parent Final"); }
	 */
}