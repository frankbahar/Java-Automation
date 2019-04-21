package com.pack1;

import com.class23.Employee;

public class WaterFallTeam extends Employee{

	public static void main(String[] args) {
		WaterFallTeam wft = new WaterFallTeam();
		System.out.println("printing protected field from other package thru inheritance" + wft.salary1);
	//	System.out.println("printing default field from other package thru inheritance" + wft.salary);cannot reach 
		wft.workHarder();// protected method can be reach from different package
		//wft.getVacation(); cannot reach defaul method from different package
	}

}
