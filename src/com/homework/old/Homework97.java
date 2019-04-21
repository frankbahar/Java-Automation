package com.homework.old;

public class Homework97 {
	/*
	 * 1. Complete the Dog.java class:
	 * 
	 * Include the following class variables: dogName, dogWeight and dogBreed=Mutt;
	 * All class variables should be declared lowercase, also make dogBreed static
	 * 
	 * Write two constructors: The main constructor(with all parameters) A secondary
	 * constructor that takes in only Name and Weight
	 * 
	 * 2. Test your code with the Main.java class:
	 * 
	 * Create a Dog object using both Constructors and print their fields/states to
	 * make sure it's correct.
	 * 
	 * Output: 1.The main constructor(with all parameters)=Tarzan Mutt 50.0
	 * 
	 * 2.secondary constructor that takes in only Name and Weight (Breed defaults to
	 * "Mutt") =Tarzan Mutt 50.0
	 */

	public static void main(String[] args) {
		Dog dog1 = new Dog("Tarzan", "Mutt", 50.0d);
		dog1.printDog();
		Dog dog2 = new Dog("Tarzan", 50.0d);
		dog2.printDog();

	}

}
