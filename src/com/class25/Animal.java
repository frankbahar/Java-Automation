package com.class25;

public class Animal {
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}

class Poppy extends Animal {
	/* cannot override static method with instance
	 * public void whoAmI() { System.out.println("I am an puppy"); }
	 */
}

class Monkey extends Animal {
	public static void whoAmI() {
		System.out.println("I am an monkey");
	}
}