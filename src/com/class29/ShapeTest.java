package com.class29;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.calculateArea();
		circle.calculatePerimiter();
		
		Square square = new Square(5);
		square.calculateArea();
		square.calculatePerimiter();
	}

}
