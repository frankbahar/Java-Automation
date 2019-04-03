package com.class16;

public class Phone {
	String brand;
	String os;
	int storage;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone1 = new Phone();
		phone1.brand="iPhone";
		phone1.os = "IOS";
		phone1.storage=128;
		phone1.start();
		phone1.call();
		phone1.sendText();
		
		Phone phone2 = new Phone();
		phone2.brand="Samsung";
		phone2.os = "Android";
		phone2.storage=64;
		phone2.start();
		phone2.call();
		phone2.sendText();
		
		Phone phone3 = new Phone();
		phone3.brand="Nokia";
		phone3.os = "IOS";
		phone3.storage=32;
		phone3.start();
		phone3.call();
		phone3.sendText();
	}
	
	void start() {
		System.out.println(brand + " phone started");
	}
	
	void call() {
		System.out.println(brand + " phone is calling");
	}
	
	void sendText() {
		System.out.println(brand + " phone is sending text msg");
	}

}
