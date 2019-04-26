package com.class28;

public interface Bank {
	//by default compiler adds public & abstrat to every method
	public void hasChecking();
	void hasSavings();
	void hasCreditCard();
	//static void m1(); cannot have static method
	int a=10; // by default compiler adds public static final 
	static String name="Bank";
	
}

class BOA implements Bank {

	@Override
	public void hasChecking() {
		System.out.println("BOA has 2 checking accounts");
		
	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 saving accounts");
		
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 different CC");
		
	}
	
}

class PNC implements Bank{
	@Override
	public void hasChecking() {
		System.out.println("PNC has 3 checking accounts");
		
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 saving accounts");
		
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 different CC");
		
	}
}