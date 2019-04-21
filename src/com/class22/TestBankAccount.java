package com.class22;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		account1.printAccount();
		
		BankAccount account2 = new BankAccount(34566);
		account2.printAccount();
	}
}
