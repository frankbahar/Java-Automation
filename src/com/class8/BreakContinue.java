package com.class8;

public class BreakContinue {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		for(int g=0; g<=4; g++) {
			System.out.println("Hello");
			break;
		}
		for(int i=0; i<=6; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		for(int i =1; i<= 20; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
