package com.class27;

public abstract class Phone {
	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	
	public void sendText() {
		System.out.println("Phone can send text");
	}
	
	public abstract void unlockPhone();
	public abstract void viewPictures();

}

class Iphone extends Phone {//concrete class - is a class is inherited from a abstract class or implemented by interface or providing implementation of all
	// unimplemented methods /abstract classes 

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Iphone we can use FaceID or Fingerprint");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view Pictures on Iphone can go to Images");
		
	}
	
}

class Samsung extends Phone {

	@Override
	public void unlockPhone() {
		System.out.println("To unlock the Samsung we need to enter password");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures we have to go to gallery");
		
	}
	
}