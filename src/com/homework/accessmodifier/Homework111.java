package com.homework.accessmodifier;

/*Please create the different methods with different access modifiers and try to access those methods in the main class 

In each method write the logic accordingly like if for private method write the logic in the println Statement as "This is Private Method" accordingly for rest methods should be a total of 4 outputs, please make sure they are same order that is printed below

Output:
This is Private Method
This is Default Method
This is Protected Method
This is Public Method*/
public class Homework111 {

	public static void main(String[] args) {
		Homework111 obj = new Homework111();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}

	private void m1() {
		System.out.println("This is Private Method");
	}

	void m2() {
		System.out.println("This is Default Method");
	}

	protected void m3() {
		System.out.println("This is Protected Method");
	}

	public void m4() {
		System.out.println("This is Public Method");
	}
}
