package com.class7;

public class IncrementDecrement {

	public static void main(String[] args) {
		int x = 1;
		x = x + 1;
		System.out.println(x);// 2

		int y = 1;
		y += 1;
		System.out.println(y);// 2

		int z = 1;
		z++;
		System.out.println(z); // 2

		int w = 2;
		w++;
		System.out.println(w); // 3

		int v = 10;
		v--;
		System.out.println(v); // 9

		int a = 10;
		int b = ++a; // first increment and assing
		int c = a++; // first assing then increment to a resut b =11 c =11 a =12

		System.out.println(b);
		System.out.println(c);
		System.out.println(a);

		a = 10;
		b = ++a; // first increment and assing
		c = a++; // first assing then increment to a resut b =11 c =11 a =12
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);

		int q = 100;
		int e = q--;

		System.out.println("Value is e is " + e); // 100
		System.out.println("Value is  is q"); // 99

		int h = 50;
		int g= --h;
		System.out.println("Value is e is " + h); // 49
		System.out.println("Value is  is g"); // 49

	}

}
