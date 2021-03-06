package com.class17_2;

public class NestedLoops {
	public static void main(String[] args) {
		printSequance();
		printNumber();
	}

	public static void printNumber() {
		/*11111
		 *22222
		 *33333
		 *44444
		 *55555 
		 */
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void printSequance() {
		/*12345
		 *12345
		 *12345 
		 *12345 
		 */
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
