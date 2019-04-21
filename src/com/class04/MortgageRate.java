package com.class04;

public class MortgageRate {
	public static void main(String[] args) {
		double rate=3.8;
		double housePrice=199000;
		
		if (rate > 4.5) {
			System.out.println("I will not buy house");
		} else {
			if(housePrice > 200000) {
				System.out.println("I will get loan");
			} else {
				System.out.println("I will buy cash");
			}
		}
	}
}
