package com.class09;

public class Task3 {
	public static void main(String[] args) {
		// triangle
	//	3. Print the following pattern:
		//	1
		//	12
	//		123
		//	1234
		  //12345
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
