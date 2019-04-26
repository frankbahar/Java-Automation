package com.class28;

public abstract class Vehicle {
	static int vehicleCount;
	
	Vehicle(){
		vehicleCount++;
	}
	protected abstract void start();
	public abstract void drive();
	//public static abstract void m1(); cannot override static method 
	//private abstract void m1(); cannot override private method 
	//public abstract final void m1(); cannot override final 
	
	public void stop() {
		System.out.println("Stop vehicle by pressing break");
	}
	
	public static void displayTotalVehicle() {
		System.out.println("Total vehicle we build=" + vehicleCount);
	}
}

abstract class Car extends Vehicle{
	// by default it call
	//Car(){super();}
	String make;
	Car(String make){
		this.make=make;
	}
}

class BMW extends Car {
	
	// by default it call
		//BMW(){super();}
	
	BMW(String make){
		super(make);
	}
	@Override
	protected void start() {
	System.out.println("BMW cars starts remote");	
	}

	@Override
	public void drive() {
		System.out.println("BMW cars drivers fast");
	}
	
}

class Toyota extends Car {
	
	Toyota(String make){
		super(make);
	}
	
	@Override
	public void start() {
		System.out.println("Toyota car starts with push button");
		
	}

	@Override
	public void drive() {
		System.out.println("Toyoto cars drive safe");
		
	}
	
}