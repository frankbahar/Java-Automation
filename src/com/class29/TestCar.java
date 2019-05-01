package com.class29;


abstract class Car {
	int regularPrice;
	String color;

	Car(String color, int price) {
		this.regularPrice = price;
		this.color = color;
	}

	public abstract double calculateSalePrice();

}

class Sedan extends Car {
	int length;

	Sedan(String color, int price, int length) {
		super(color, price);
		this.length = length;
	}

	@Override
	public double calculateSalePrice() {
		double discountedPrice = 0;
		if (length > 20) {
			discountedPrice = regularPrice * .95;
		} else {
			discountedPrice = regularPrice * .90;

		}
		return discountedPrice;
	}
}

class Truck extends Car {
	int weight;

	Truck(String color, int price, int weight) {
		super(color, price);
		this.weight = weight;
	}

	public double calculateSalePrice() {
	    	double discountedPrice=0;
	        if (weight>2000) {
	        discountedPrice = regularPrice*.90;
	  
	        }else {
	            discountedPrice = regularPrice*.80;
	                
	            }
	        return discountedPrice;
	    }
}
public class TestCar {

    public static void main(String[] args) {
        Truck truck=new Truck("Black", 5000,3000);
        System.out.println(truck.calculateSalePrice());
        
        Sedan sedan=new Sedan("Grey", 2000, 30);
        System.out.println(sedan.calculateSalePrice());
        
        
    }



}

