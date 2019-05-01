package com.homework.interfaces;

/*Create Interface with name as MyInterface1 with one method in it

Create another Interface with name as MyInterface2 that also will have one method and will be a child of MyInterface1 

Main class should be implementing MyInterface2

In main method call those two methods.

one method will have the output "welcome to syntax solutions"
the other method will have the output "hi syntax solutions how are you"

Output:

 
method1-----welcome to syntax solutions
method2-----hi syntax solutions how are you*/
public class Homework139 implements MyInterface2139 {

	public static void main(String[] args) {
		Homework139 obj = new Homework139();
		obj.mehtod1();
		obj.mehtod2();

	}

	@Override
	public void mehtod1() {
		System.out.println("method1-----welcome to syntax solutions");
	}

	@Override
	public void mehtod2() {
		System.out.println("method2-----hi syntax solutions how are you");

	}

}

interface MyInterface1139 {
	void mehtod1();

}

interface MyInterface2139 extends MyInterface1139 {
	void mehtod2();
}
