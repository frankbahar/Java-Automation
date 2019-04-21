package com.class24;

public class Degree {
	public static void main(String[] args) {
		Degree degree = new Degree();
		degree.getDegree();

		Undergraduate undergrad = new Undergraduate();
		undergrad.getDegree();

		Postgraduate postgrad = new Postgraduate();
		postgrad.getDegree();

	}

	void getDegree() {
		System.out.println("I got a degree");
	}
}

class Undergraduate extends Degree {
	@Override
	void getDegree() {
		System.out.println("I am an Undergraduate");
	}
}

class Postgraduate extends Degree {
	@Override
	void getDegree() {
		System.out.println("I am a Postgraduate");
	}
}
