package com.class19;

public class Minimum {

	public static int minOfValues(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int maxOfValues(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	void print() {
	System.out.println("The Print instance method");	
	}
}
