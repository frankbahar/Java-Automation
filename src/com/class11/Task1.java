package com.class11;

public class Task1 {
	//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
	public static void main(String[] args) {
		String[] cars = {"MDX", "Corolla", "Civic", "X5", "Sonata", " RDX"};
		for(int i=0; i<cars.length;i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println("\nEnhanced For loop");
		for(String car : cars) {
			System.out.print(car + " ");
		}
		

	}

}
