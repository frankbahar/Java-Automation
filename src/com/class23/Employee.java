package com.class23;

public class Employee {
	int salary;
	public static String department="IT";
	protected int salary1;
	public void getPaid() {
		System.out.println("Employee get's paid " + salary);
	}
	
	public static void work() {
		System.out.println("Employee work");
	}
	
	void getVacation(){
		System.out.println("Default method working");
	}
	
	protected void workHarder() {
		System.out.println("Protected method working");
	}
}
