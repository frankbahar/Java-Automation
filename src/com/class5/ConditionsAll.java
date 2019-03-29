package com.class5;

import java.util.Scanner;

public class ConditionsAll {

	public static void main(String[] args) {
		/* ask user to enter price and boolean value for sale
		 * Based on the sale we will check the price:
		 * if price <20 --> apply discount 20% and give final price
		 * if the price is > 20 and less 100 --> apply discount 30% and give final price
		 * if the price is >100 less 500 --> apply discount 50% give final price
		 */
		Scanner scan;
		boolean sale;
		int discount;
		int price=0;
		double finalPrice;
		scan = new Scanner(System.in);
		System.out.println("Please enter if there is a sale :");
		sale = scan.nextBoolean();
		if(sale) {
			System.out.println("Please enter the price of the item :");
			price = scan.nextInt();
		
			System.out.println("Let's check the price");
			if(price <20) {
				discount = 20;
				finalPrice=price-(price*0.20);
			} else if( price >= 20 && price <100) {
				discount = 30;
				finalPrice=price-(price*0.30);
			} else if (price >= 100 && price < 500) {
				discount = 50;
				finalPrice=price-(price*0.50);
			} else {
				discount = 75;
				finalPrice=price-(price*0.75);
			}
			System.out.println("Final Price: " + finalPrice);
		} else {
			System.out.println("Not Interested");
		}
		
	}

}
