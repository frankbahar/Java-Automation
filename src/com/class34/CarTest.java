package com.class34;

import java.util.*;

public class CarTest {

	public static void main(String[] args) {
		//Create a map in which we will store carNumber and Car itself
		Car car1 = new Car("Toyota", "Corolla");
		Car car2 = new Car("Honda", "Accord");
		Car car3 = new Car("Lada", "Priora");
		car1.printCarDetails();
		car2.printCarDetails();
		car3.printCarDetails();
		Map<Integer, Car> carMap = new HashMap<>(); 
		carMap.put(1 , car1);
		carMap.put(2, car2);
		carMap.put(3, car3);
		carMap.put(4, new Car("BMW", "X8"));
		carMap.put(5, new Car("Audi", "R8"));
		carMap.put(6, new Car("Mercedes", "cls"));
		Collection<Car> carValues = carMap.values();
		for(Car car : carValues) {
			car.printCarDetails();
		}
	}

}
