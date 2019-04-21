package com.class25;

public class Student {
	
	public void study() {
		System.out.println("Students must study");
	}
	protected void doHomeWork() {
		System.out.println("Students must do homework");
	}
	
	void attendClasses() {
		System.out.println("Student must attent classes");
	}
	//private method cannot be overriden
	private void doResearch() {
		System.out.println("Student must do research");
	}
}
