package com.class10;

public class Task2 {
	//2.Create an array of names and store all names of your group. 
	//Then print your name from that array.
	//(use 2 different ways of creating an array).
	public static void main(String[] args) {
		String[] javatar;
		javatar=new String[6];
		javatar[0]="Frank";
		javatar[1]="Ismet";
		javatar[2]="Huseyin";
		javatar[3]="Armand";
		javatar[4]="Semsediny";
		javatar[5]="Kamal";
		System.out.println(javatar[0]);

		String[] javatar1 = {"Frank", "Ismet", "Huseyin", "Armand", "Semsediny", "Kamal"};
		System.out.println(javatar1[0]);
	}

}
