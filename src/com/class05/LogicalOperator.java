package com.class05;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		/* write a java program to ask user enter daily sales amount
		 * Based on the sales range commission will be different
		 * sales <100 comm %2 sales more than 100 and less  than 200 comm 5
		 */
		Scanner scanner;
		int sales;
		int commission;
		
		scanner = new Scanner(System.in);
		System.out.println("Please enter sales amount");
		sales = scanner.nextInt();
		if (sales < 100 && sales > 0) {
			commission=2;
		} else if(sales >=100 && sales < 200) {
			commission=5;
		} else if(sales >= 200 && sales <500) {
			commission = 10;
		} else if(sales >= 500) {
			commission= 20;
		} else {
			commission=0;
		}
		System.out.println("Your commission is :" + commission);
	}
}
