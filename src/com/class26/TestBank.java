package com.class26;

public class TestBank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println("Bank balance: "+ bank.getBalance());
		
		bank = new BankA();
		System.out.println("Bank A balance: "+ bank.getBalance());

		bank = new BankB();
		System.out.println("Bank B balance: "+ bank.getBalance());
	
		bank = new BankC();
		System.out.println("Bank C balance: "+ bank.getBalance());
	}

}
