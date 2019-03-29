package com.class3;

public class TemperatureCheck {

	public static void main(String[] args) {
		int degree=45;
		if (degree < 32) {
			System.out.println("Water will freeze with temperature " + degree);
		} else {
			System.out.println("Water will NOT freeze with temperature " + degree);
		}
	}	
}
