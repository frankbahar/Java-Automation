package com.class29;

public interface Shape {
	void calculateArea();
	void calculatePerimiter();

}

class Circle implements Shape {
	int radius;
	
	Circle(int radius){
		this.radius=radius;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Circle area is " + (Math.PI*Math.pow(radius, 2)));
	}

	@Override
	public void calculatePerimiter() {
		System.out.println("Circle perimeter is " + (2*Math.PI*radius));
	}
}

class Square implements Shape {
	int length;

	Square(int length){
		this.length=length;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Square area is " + (Math.pow(length, 2)));
		
	}

	@Override
	public void calculatePerimiter() {
		System.out.println("Square perimeter is " + (4*length));
		
	}
	
}