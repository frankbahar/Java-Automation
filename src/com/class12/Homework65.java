package com.class12;

public class Homework65 {
	//Write a program that prints the total number of elements that are negative AND odd
	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		int count=0;
		for(int[] b:a) {
			for(int num:b) {
				if(num < 0 && num %2 != 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
