package com.homework.staticpack;

/*For you to do

First declared the static variable static int a=100;
than print the value
than change the value a=200;
than print the value
again  change the value a=300;
than print the value

Output:
100
200
300*/
public class Homework104 {
	static int a = 100;

	public static void main(String[] args) {
		System.out.println(Homework104.a);
		Homework104.a=200;
		System.out.println(Homework104.a);
		Homework104.a=300;
		System.out.println(Homework104.a);
	}
}
