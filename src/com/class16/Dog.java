package com.class16;

public class Dog {
	String species;
	String size;
	int weight;
	String color;
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.species = "Hasky";
		dog1.size = "Medium";
		dog1.weight =100;
		dog1.color="White";
		
		dog1.chew();
		dog1.sleep();
		dog1.walking();
	
		Dog dog2 = new Dog();
		dog2.species = "Larador";
		dog2.size = "Small";
		dog2.weight =50;
		dog2.color="White";
		
		dog2.chew();
		dog2.sleep();
		dog2.walking();
	
		Dog dog3 = new Dog();
		dog3.species = "Bulldog";
		dog3.size = "Large";
		dog3.weight =200;
		dog3.color="Brown";
		
		dog3.chew();
		dog3.sleep();
		dog3.walking();
	}
	
	void chew() {
		System.out.println(color + " " + species + " chewing");
	}
	
	void sleep() {
		System.out.println(color + " " + species + " sleeping");
	}
	
	void walking() {
		System.out.println(color + " " + species + " walking");
	}
}
