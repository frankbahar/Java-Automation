package com.class02;

public class VariableChange {

	public static void main(String[] args) {
		String name ="Frank";
		String lastName = "Bahar";
		int grade = 100;
		String city ="Clifton";
		String state ="NJ";
		String phoneNumber="973 234 4565";
		
		grade=95;
		
		System.out.println("Grade " + grade);
		
		System.out.println("Name: " + name);
		System.out.println("Last Name: " + lastName);
		System.out.println("Grade: " + grade);
		System.out.println("City: " + city);
		state = "NY";
		System.out.println("State:" + state);
		System.out.println("Phone Number : " + phoneNumber + " " );

	}

}
