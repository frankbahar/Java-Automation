package com.class16;

public class Computer {
	boolean mouse, keyboard;
	int ram, screen;
	String OS, brand;
	public static void main(String[] args) {
		
		Computer com1 = new Computer();
		com1.mouse=true;
		com1.keyboard=true;
		com1.screen=19;
		com1.ram=8;
		com1.OS="Windows 10";
		com1.brand="Dell";
		
		com1.doJavaCoding();
		com1.watchMovie();
		com1.playMusic();
		
		Computer com2 = new Computer();
		com2.mouse=false;
		com2.keyboard=true;
		com2.screen=15;
		com2.ram=12;
		com2.OS="Windows 10";
		com2.brand="Lenova";
		 
		com2.doJavaCoding();
		com2.watchMovie();
		com2.playMusic();
	}
	
	void watchMovie() {
		System.out.println("We can watch movie on a computer " + brand);
	}
	
	void doJavaCoding() {
		System.out.println("We can do Java coding on our computer " + brand);
	}
	
	void playMusic() {
		System.out.println("we can play music on our computer " + brand);
	}
}
