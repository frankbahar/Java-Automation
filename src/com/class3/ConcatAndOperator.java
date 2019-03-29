package com.class3;

public class ConcatAndOperator {
	public static void main(String[] args) {
		/*
		 * String a="Helo"; String b="Bye";
		 * 
		 * int x = 10; int y = 20; System.out.println(x+y+a+b);
		 * System.out.println(x+a+y+b); System.out.println(x+a+b+y);
		 * System.out.println(a+b+x+y);
		 */
		int a = 10;
		int b = 3;
		int div = a/b;
		System.out.println(div);
		//modules operator %
		int remainder = a%b;
		System.out.println(remainder);
		int q=23;
		int w=11;
		System.out.println(q%w);
		int e=-5+4*6;
		System.out.println(e);
		int x = (22+9)%7;
		System.out.println(x);
		System.out.println(10%100);
		int z = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println(z);
		z=5;
		q=++z;
		System.out.println(q);
		
		
	}
}
