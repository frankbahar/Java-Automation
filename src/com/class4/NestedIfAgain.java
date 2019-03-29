package com.class4;

public class NestedIfAgain {
	public static void main(String[] args) {
		/*declare variable for gpa and having a diploma
		 * if user has a diploma --> congratulation --> (if gpa is higher 3.5 --> hire
		 * 
		 *  											else do not hire.
		 */
		double gpa=3.6;
		double expectedGpa=3.5;
		boolean hasDiploma=true;
		if(hasDiploma) {
			System.out.println("Congratulations");
			if(gpa > expectedGpa) {
				System.out.println("Your are hired");
			} else {
				System.out.println("Unfortunately we cannot hire you");
			}
		} else {
			System.out.println("Pleasse get your degree");
		}
	}
}
