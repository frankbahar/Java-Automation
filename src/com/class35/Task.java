package com.class35;

import java.io.FileNotFoundException;
import java.util.*;

public class Task {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter integer value");

		try {
			int a = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please enter integer value");
		}
		List<Exception> list = getExceptions();
		for (Exception e : list) {
			System.out.println(e);
		}
	}

	public static List<Exception> getExceptions() {
		List<Exception> list = new ArrayList<>();
		try {
			System.out.println(10/0);
		} catch(ArithmeticException e) {
			list.add(e);
		}
		int[] array = {12,13};
		try {
		System.out.println(array[3]);
		
		}catch (ArrayIndexOutOfBoundsException e) {
			list.add(e);
		}
		String str = null;
		try {
			System.out.println(str.length());
		}catch(NullPointerException e) {
			list.add(e);
		}
		str = "A";
		try {
			System.out.println(str.charAt(4));
		} catch(StringIndexOutOfBoundsException e) {
			list.add(e);
		}
		return list;
	}
}
