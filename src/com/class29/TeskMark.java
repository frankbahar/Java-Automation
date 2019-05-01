package com.class29;

public class TeskMark {

	public static void main(String[] args) {
		Marks studentA = new StudentA(90, 80, 69);
		System.out.println("Student A average is " + studentA.getPercentage());

		Marks studentB = new StudentB(90, 89, 78, 67);
		System.out.println("Student B average is " + studentB.getPercentage());

	}

}
