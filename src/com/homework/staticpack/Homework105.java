package com.homework.staticpack;

/*For you to do

Create method and create the logic to increment the count value as count++
and in main method create the three objects and call the method with three different object you created and print count value.

Output:
3
3
3*/
public class Homework105 {

	static int count = 0;

	public static void main(String[] args) {
		Homework105 obj1 = new Homework105();
		Homework105 obj2 = new Homework105();
		Homework105 obj3 = new Homework105();
		
		obj1.increaseValue();
		obj2.increaseValue();
		obj3.increaseValue();
		
		System.out.println(obj1.count);
		System.out.println(obj2.count);
		System.out.println(obj3.count);
	}

	static void increaseValue() {
		Homework105.count++;
	}
}
