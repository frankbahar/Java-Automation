package com.class35;

public class ThrowsKeyword {
	public static String name;

	public static void main(String[] args) {
		sleepMode();

	}

	public static void studentSleeping() throws InterruptedException {
		System.out.println("Student " + name + " is sleeping");
		Thread.sleep(2000);
		System.out.println("Give some coffee..");
	}

	public static void allStudentSleeping() throws InterruptedException {
		studentSleeping();
	}

	public static void sleepMode() {
		try {
			allStudentSleeping();
		} catch (InterruptedException e) {
			//// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
	}
}
