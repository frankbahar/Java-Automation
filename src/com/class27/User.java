package com.class27;

public class User {
	String name;
	String mobileNumber;
	
	User(String name, String mobileNumber){
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	
	public static void main(String[] args) {
		UserInfo person1 = new UserInfo("John Snow", " 201 938 7874", " 1234 broadway NY, NY, 10001");
		person1.userDetails();
	}

}

 class UserInfo extends User {
	 String address;
	 UserInfo(String name, String mobileNumber, String address){
		 super(name, mobileNumber);
		 this.address=address;
	 }
	 
	 void userDetails() {
		 System.out.println("User name is " + name +" Mobile Phone number is " + mobileNumber + " address is " + address);
	 }
 }