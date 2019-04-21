package com.homework.old;

public class Homework98 {
	/*
	 * . Complete the Car.java class:
	 * 
	 * Include the following class variables: make model numberOfDoors topSpeed
	 * price All class variables should be declared case sensitive
	 * 
	 * Write four constructors: The first constructor(with all parameters) A
	 * secondary constructor that does not include numberOfDoors, which should
	 * default to 4 A third constructor that does not include make and model; both
	 * default to "unknown" A fourth constructor that does not include topSpeed and
	 * price; default to 90 and 0 respectively.
	 * 
	 * 2. Test your code with the Main.java class: Create several Car objects using
	 * all Constructors and print their fields/states to make sure it's correct.
	 * print your objects with variables in your output each object
	 * 
	 * 
	 * Output: Toyota Prius 4 120 30000.0 Toyota Prius 4 120 30000.0 unknown unknown
	 * 4 120 30000.0 Toyota Prius 4 90 0.0
	 */

	public static void main(String[] args) {
		Car car1 = new Car("Toyota", " Prius", 4, 120, 30000.0d);
		car1.printCar();

		Car car2 = new Car("Toyota", " Prius", 120, 30000.0d);
		car2.printCar();

		Car car3 = new Car(4, 120, 30000.0d);
		car3.printCar();
		
		Car car4 = new Car("Toyota", " Prius", 4);
		car4.printCar();


	}

}
