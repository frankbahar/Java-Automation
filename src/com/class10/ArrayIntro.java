package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		int[] array1; // preferred way
		int [] array2;
		int array3[];
		array1=new int[4]; // initialize, create an array
		array1[0]=10; // assigning values
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		System.out.println(array1[1]);
		
		int[] numbers = new int[3];
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=15;
//		numbers[3]=20; // no error during compilation but error on runtime exception index out of bounds exception
		System.out.println(numbers[2]);
		System.out.println(numbers[0]+numbers[2]);  // 20
		
		String[] a=new String[3];
		a[0]="Hello";
		a[1]="Hi";
		a[2]="Bye";
		
		System.out.println(a[1] + " friends");
		
		boolean[] myBoolean = new boolean[4];
		
		
	}

}
