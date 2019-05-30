package com.class35;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("Beginning of the code");
		try {
			Thread.sleep(2000); // new InterruptedException(); 
			System.out.println(10/0);//ArithmeticException();
		} catch (ArithmeticException e ) {
			System.out.println("Code of Arimetic Exception catch");
			//3 ways to print name and details of an exception
			e.printStackTrace(); // name of he E, Detail of E , location
//			System.out.println(e); // name of the E and details
	//		e.getMessage(); // details of an E 
		}
		catch (InterruptedException e) {
			System.out.println("Code of Interrupted Exception catch");
		}

	}

}
