package com.class8;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out.println(sum);
		sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		sum =0;
		for(int i = 10; i <= 50; i+=10) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
