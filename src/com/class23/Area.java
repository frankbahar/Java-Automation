package com.class23;

public class Area {
	public void calculateArea(int a) {
		System.out.println("Area of Square is " + a*a);
	}
	
	public void calculateArea(int a, boolean isCube) {
		System.out.println("Area of cube is " + 6*(a*a));
	}
	
	public void calcualteArea(int a, int b) {
		System.out.println("Area of Rectangle is " + a*b);
	}
}
