package com.class10;

public class GetAll {

	public static void main(String[] args) {
		String[] names = {"Frank", "Ismet", "Huseyin", "Armand", "Semsediny", "Kamal", "Siyar"};
		int a=3;
		System.out.println(names[a]);//Armand
		a+=2;
		System.out.println(names[a]);//Kamal
		a-=4;
		System.out.println(names[a]);//Ismet
	
		for(int i=0;i <names.length; i++) {
			System.out.println("Names " + i + "th element value is " + names[i]);
		}
		for(String i: names) {
			System.out.println(i);
		}
	}
}
