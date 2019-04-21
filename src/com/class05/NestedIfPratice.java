package com.class05;

public class NestedIfPratice {

	public static void main(String[] args) {
		/*check if the user has credit card -->
		 * check what is the balance if balance
		 */
		boolean creditCard=true;
		int balance = 1000;
		if(creditCard) {
			if(balance >= 1000) {
				System.out.println("pay your balance");
			} else if (balance == 0){
				System.out.println("Please use your card");
			} else {
				System.out.println("You are safe");
			}
		} else {
			System.out.println("Do you want a credit card");
		}
	}

}
