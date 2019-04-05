package com.class16;

public class Homework77 {
	/*
	 * create a class named 'Main' with specific attributes. For you to do 
	 * Create two object in which you will be assigning the following values.
	 * carColor='Black' carModelYear=2019 carName='BMW'
	 * carColor='White' carModelYear=2018 carName='Toyota'
	 * Car color is Black and car model year is 2019 and car name is BMW Car color
	 * is White and car model year is 2018 and car name is Toyota
	 */
	String carname;
	String carColor;
	int carModelYear;
	public static void main(String[] args) {
		Homework77 car1 = new Homework77();
		car1.carColor="Black"; 
		car1.carModelYear=2019;
		car1.carname="BMW";
		
		Homework77 car2 = new Homework77();
		car2.carColor="White";
		car2.carModelYear=2018;
		car2.carname="Toyota";
		System.out.println("Car color is " + car1.carColor + " and car model year is " + car1.carModelYear + " and car name is " + car1.carname);
		System.out.println("Car color is " + car2.carColor + " and car model year is " + car2.carModelYear + " and car name is " + car2.carname);

	}
}
