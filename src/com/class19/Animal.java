package com.class19;

public class Animal {
	String breed = "Husky";
	int weight = 100;
	int age = 15;
	static String name = "George";

	public boolean canBark() {
		return true;
	}

	public static boolean isWild() {
		return false;
	}

	public void print() {
		System.out.println("Animal name is " + name + " weight is " + weight + " age " + age);
		/*
		 * if(isWild) { System.out.println(name + " is wild animal"); } else {
		 * System.out.println(name + " is not wild animal"); }
		 */
	}
}
