package com.class32;

public class ArrayTest {

	public static void main(String[] args) {
		String a = "A";
		String b = new String("B");
		int[] intArray= {10,21,34};
		String[] stringArray = {"Hello", "Bye"};
		
		//can we place Object into Array 
		Visa visa1 = new Visa("Visa Platinum");
		Visa visa2 = new Visa("Visa Platinum");
		Visa visa3 = new Visa("Visa Platinum");
		Visa[] visaArray = {visa1, visa2, visa2};
	
		AX ax1 = new AX("AX Platinum");
		AX ax2 = new AX("AX Platinum");
		AX ax3 = new AX("AX Platinum");
		CreditCard[] ccArray = {visa1, visa2, visa2, ax1, ax2, ax2};
		Object[] objArray = {visa1, visa2, visa2, ax1, ax2, ax2, "John", true, 'a', 13, 1335l, 134.5f, 1334.87d};
	}

}
