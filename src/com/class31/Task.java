package com.class31;

import java.util.*;
import java.util.Arrays;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		// 1.Create an arraylist of cars and retrieve all the values using 4 different
		// ways.
		System.out.println("-----Task1----");
		ArrayList<String> cars = new ArrayList<>(Arrays.asList("Nissan", "Acura", "Honda", "Audi"));
		System.out.println("----1th way -using for loop");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("----2nd way -using for each loop");
		for (String car : cars) {
			System.out.println(car);
		}
		System.out.println("----3th way -using iterator");
		Iterator<String> it = cars.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----4th way -using while loop");
		int i = 0;
		while (i < cars.size()) {
			System.out.println(cars.get(i));
			i++;
		}

		// 2.Create an arrayList of words. Remove every word that ends with “e”.
		System.out.println("-----Task2----");
		ArrayList<String> words = new ArrayList<>(Arrays.asList("Hello", "Bye", "Hi", "Ola", "Bee"));
		it = words.iterator();
		while (it.hasNext()) {
			String word = it.next();
			if (word.endsWith("e") || word.endsWith("E")) {
				it.remove();
			}
		}
		System.out.println(words);

		// 3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace
		// it with water.
		System.out.println("-----Task3----");
		ArrayList<String> drinks = new ArrayList<>(
				Arrays.asList("Cola", "Tuno", "Orange Juice", "Water", "Su", "Ginger", "Tea", " Coffee", "Sir"));
		for (i = 0; i < drinks.size(); i++) {
			String drink = drinks.get(i);

			if (drink.contains("e") || drink.contains("E") || drink.contains("a") || drink.contains("A")) {
				drinks.set(i, "Water");
			}
		}
		System.out.println(drinks);
		
		//4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList.
		System.out.println("-----Task4----");
		ArrayList<Integer> numbers = new ArrayList<>();
		for (i = 1; i <=50; i++) {
			if(i%2==0) {
				numbers.add(i);
			}
		}
		Iterator<Integer> itnum = numbers.iterator();
		while(itnum.hasNext()) {
			if(itnum.next()%5 == 0) {
				itnum.remove();
			}
		}
		System.out.println(numbers);
		
		System.out.println("-----Task5----");
		Set<String> mydrinks = new HashSet<>(
				Arrays.asList("Cola", "Tuno", "Orange Juice", "Water", "Su", "Ginger", "Tea", " Coffee", "Sir"));
		
		System.out.println("before change to water : " + mydrinks);
		Iterator<String> itdrinks = mydrinks.iterator();
		boolean addWater=false;
		while(itdrinks.hasNext()) { 
			String drink = itdrinks.next();
			if (drink.contains("e") || drink.contains("E") || drink.contains("a") || drink.contains("A")) {
				addWater=true;
				itdrinks.remove();
			}
		}
		if(addWater) {
			mydrinks .add("Water");
		}
		System.out.println("after change to water : " + mydrinks);
	}
}
