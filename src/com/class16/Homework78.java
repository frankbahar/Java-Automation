package com.class16;

public class Homework78 {
	String species;
	String size;
	int weight;
	String color;
	public static void main(String[] args) {
		Homework78 dog1 = new Homework78();
		dog1.species = "Husky";
		dog1.size = "Medium";
		dog1.weight =100;
		dog1.color="White";
		
		dog1.bark();
		dog1.run();
		dog1.play();
	
		Homework78 dog2 = new Homework78();
		dog2.species = "Bulldog";
		dog2.size = "Large";
		dog2.weight =200;
		dog2.color="Brown";
		
		dog2.bark();
		dog2.run();
		dog2.play();
		
		Homework78 dog3 = new Homework78();
		dog3.species = "Labrador";
		dog3.size = "Small";
		dog3.weight =50;
		dog3.color="White";
		
		dog3.bark();
		dog3.run();
		dog3.play();
	}
	
	void bark	() {
		System.out.println(species + " can bark");
	}
	
	void run() {
		System.out.println(species + " can run");
	}
	
	void play() {
		System.out.println(species + " can play");
	}
}
