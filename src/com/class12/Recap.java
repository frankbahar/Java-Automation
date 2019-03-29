package com.class12;

public class Recap {

	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3}, //1st array that stored with index 0
				{10,20,30}, // 2nd array with index 1
				{100,200,300}}; // 3rd array with index 2
					//how many total arrays
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length; j++) {//0 //1 //2
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for(int[] cols : arr) {
			for(int num : cols) {//0 //1 //2
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
