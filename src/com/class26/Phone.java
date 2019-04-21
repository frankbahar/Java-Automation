package com.class26;

public class Phone {

	public void makeCall() {
		System.out.println("Can make a phone call");
	}
	
	public void hasCamera() {
		System.out.println("Phone has a camera");
	}
}

class Iphone extends Phone {
	
	public void makeCall() {
		System.out.println("Can make a face time");
	}
	
	public void hasCamera() {
		System.out.println("iPhone has dual HD camera");
	}
}

class Nokia extends Phone{
	
	
	public void cannotBreak() {
		System.out.println("Nokia phones are unbreakable");
	}

}

class Samsung extends Phone{
	
	public void hasCamera() {
		System.out.println("Samsung has 3 lenses camera");
	}
}