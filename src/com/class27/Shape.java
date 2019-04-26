package com.class27;

public class Shape {
		int radius;
	Shape(int radius){
		this.radius=radius;
	}
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.area();
	}

}

class Circle extends Shape{
	Circle(int radius){
		super(radius);
	}
	
	void area() {
		System.out.println("Circle area is " + (Math.PI*Math.pow(super.radius,2)));
	}
}