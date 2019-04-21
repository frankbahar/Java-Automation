package com.class26;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("Object of Parent class");
		Phone phone = new Phone();
		phone.hasCamera();
		phone.makeCall();

		System.out.println("Object of Iphone class");
		Iphone iphone = new Iphone();
		iphone.hasCamera();
		iphone.makeCall();
	
		System.out.println("Object of Samsung class");
		Samsung samsung = new Samsung();
		samsung.hasCamera();
		samsung.makeCall();
		
		System.out.println("Object of Nokia class");
		Nokia nokia = new Nokia();
		nokia.hasCamera();
		nokia.makeCall();
		
		Phone p = new Iphone();
		p.hasCamera();
		p.makeCall();

		Phone p1 = new Nokia();
		p1.hasCamera();
		p1.makeCall();
		//p1.cannotBreakable(); method is under child cannot be used
		// creating a variable of a ParentType
		Phone parentPhone;
		//assigning Iphone object
		parentPhone = new Iphone();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		//assigning Samsung object
		parentPhone = new Samsung();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		//assigning Nokia object
		parentPhone = new Nokia();
		parentPhone.makeCall();
		parentPhone.hasCamera();
	}
}
