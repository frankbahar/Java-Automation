package com.class22;

public class BankAccount {
	public int accountNumber;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public void printAccount() {
		System.out.println("Account number is : " + accountNumber);
	}
}
