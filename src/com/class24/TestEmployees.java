package com.class24;

public class TestEmployees {

	public static void main(String[] args) {
		Employee emp = new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		Contractor cont = new Contractor();
		emp.getPaid(); // Employee gets paid salary
		ft.getPaid();//Full time employee gets paid salary + bonus
		cont.getPaid();// Employee gets paid salary

	}

}
