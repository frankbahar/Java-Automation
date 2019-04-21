package com.homework.old;

public class Homework99 {
	/*
	 * 1. Complete the StoreProduct.java class:
	 * 
	 * Include the following class variables: label price (as an integer) category
	 * hasExpiration (as a boolean) stock (represents how many the store has
	 * available) All class variables should be declared case sensitive
	 * 
	 * Write three constructors:
	 * 
	 * The main constructor( with all parameters) A secondary constructor that does
	 * not have a category and an expiration (category defaults to "misc",
	 * hasExpiration defaults to false) A secondary constructor that does not have a
	 * category, expiration, and stock (stock defaults to 0)
	 * 
	 * Hint: each variable must be object specific Output:
	 * 
	 * 
	 * Eggs 3 Produce true 10 Paper Towels 2 misc false 24 Paper Towels 2 null false
	 * 0
	 */
	public static void main(String[] args) {
		StoreProduct stock1 = new StoreProduct("Eggs", 3, "Produce", true, 10);
		stock1.printStockProduct();
		
		StoreProduct stock2 = new StoreProduct("Paper Towels", 2, 24);
		stock2.printStockProduct();
		
		StoreProduct stock3 = new StoreProduct("Paper Towels", 2);
		stock3.printStockProduct();
		
		
	}

}
