package com.class07;

public class TaskLoop {

	public static void main(String[] args) {
		boolean workDay = true;
		int day = 1;
		while (workDay) {
			System.out.println("I need a day off");
			if (day == 5) {
				System.out.println("I do not need day off");
				workDay = false;
			}
			day++;
		}
	}
}
