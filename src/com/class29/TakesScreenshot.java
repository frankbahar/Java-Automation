package com.class29;

public interface TakesScreenshot {
	String fileExtension = ".png";// by default this public static final variable and it MUST be

	void takesScreenshot();
	// from java 8 we can have define methods in interface : static or default

	static void m1() {
		System.out.println("Static m1 method");
	}

	default void m2() {
		System.out.println("default m2 method");
	}
}
