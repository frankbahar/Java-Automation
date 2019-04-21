package com.homework.old;

public class Car {
	String make;
	String model;
	int numOfDoors;
	int topSpeed;
	double price;

	Car(String make, String model, int numOfDoors, int topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.numOfDoors = numOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}

	Car(String make, String model, int topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.numOfDoors = 4;
		this.topSpeed = topSpeed;
		this.price = price;
	}

	Car(int numOfDoors, int topSpeed, double price) {
		this.make = "unknown";
		this.model = "unknown";
		this.numOfDoors = numOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}

	Car(String make, String model, int numOfDoors) {
		this.make = make;
		this.model = model;
		this.numOfDoors = numOfDoors;
		this.topSpeed = 90;
		this.price = 0;
	}

	void printCar() {
		System.out.println(make + " " + model + " " + numOfDoors + " " + topSpeed + " " + price);
	}
}
