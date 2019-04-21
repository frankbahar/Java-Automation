package com.class25;

public class SyntaxStudent extends Student {

	// public boolean study() { we cannot change parent class return type
	public void study() {

		System.out.println("Syntax Students must study HARD");
//		return true;
	}

	public void doHomeWork() {
		System.out.println("Syntax Students must do REPL");
	}

	protected void attendClasses() {
		System.out.println("Syntax Student must attent classes");
	}

	// reating child specific private method doResearch
	private void doResearch() {
		System.out.println("Student must do research");
	}
}
