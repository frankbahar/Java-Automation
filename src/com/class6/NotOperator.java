package com.class6;

public class NotOperator {

	public static void main(String[] args) {
		boolean a = !true;
		System.out.println("The value for boolean variable is " + a);
		
		boolean snow=true;
		//if it is not snowing i will come to the class otherwise i will stay at home
		
		if(!snow) {
			System.out.println("I will come to class");		
		} else {
			System.out.println("I will stay home");
		}
		int x=10;
		int y=20;
		if(!(x>y)) {
			System.out.println("X is smaller than Y");
		}
	}

}
