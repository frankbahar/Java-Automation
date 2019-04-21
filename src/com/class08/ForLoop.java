package com.class08;

public class ForLoop {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Good Morning" + i);
		}
		// i want to print numbers from 10 to 1
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		for (int a = 0; a <= 20; a += 2) {
			System.out.println(a);
		}

		for (int b = 1; b <= 50; b += 5) { // first intilization 2 check condition 3 exec block 4 increment
			System.out.println(b);
		}
		for(int i=1; i <=100; i++) {
			System.out.println(i);
		}
		for(int i=100; i>=1 ; i--) {
			System.out.println(i);
		}
		for(int i=1; i <20;i+=2) {
			System.out.println(i);
		}
		for(int i = 2; i <= 20; i+=2) {
			System.out.println(i);
		}
		for(int i = 20; i <=50; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		for(int i =20; i <= 50; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		boolean isPrime=true;
		for(int i=0; i<=50; i++) {
			for(int j=0; j<i;j++) {
				if(i%j == 0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
			System.out.println(i);
			}
		}
	}
}
