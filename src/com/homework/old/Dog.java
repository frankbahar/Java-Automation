package com.homework.old;

public class Dog {
	String name;
	static String breed;
	double weight;

	Dog(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	Dog(String name, double weight) {
		this.name = name;
		this.breed = "Mutt";
		this.weight = weight;
	}
	
	void printDog() {
		System.out.println(name + " " + breed + " " + weight);
	}
}
