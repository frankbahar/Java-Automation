package com.class28;

public class VehicleTest {

	public static void main(String[] args) {
		Car  car = new BMW("BMW");
		car.drive();
		car.start();
		car.stop();
		car = new Toyota("Toyota");
		car.drive();
		car.start();
		car.stop();
		new BMW("BMW");
		new Toyota("Toyota");
		System.out.println(Vehicle.vehicleCount);
		Vehicle.displayTotalVehicle();
	}

}
