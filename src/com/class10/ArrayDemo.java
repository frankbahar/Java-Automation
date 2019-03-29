package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] numbers = new int[4];
		
		numbers[3]=10;
		numbers[2]=5;
		numbers[0]=1;
		numbers[1]=15;
		
		System.out.println(numbers[0]);
		numbers[0]=30;
		System.out.println(numbers[0]);
	}

}
