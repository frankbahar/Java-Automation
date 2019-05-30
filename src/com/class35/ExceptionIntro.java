package com.class35;

import java.util.*;

public class ExceptionIntro {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		/*
		 * System.out.println(a/b); System.out.println("Code after an exception");
		 * 
		 * ArithmeticException exception = new ArithmeticException(); throw exception;
		 */
		// below code will give OutOfMemoryError
		List<Object> fixedData = new ArrayList<>();
		while(true) {
			Object data = new byte[64*1024-1];
			fixedData.add(data);	
		}
	}

}
