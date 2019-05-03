package com.class32;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsuranceTest {

	public static void main(String[] args) {
		CarInsurance car = new CarInsurance("Geico", "Acura");
		PetInsurance pet = new PetInsurance("Allstate", "Cat");
		HealthInsurance health = new HealthInsurance("Aetna");
		
		List<Insurance> alist = new ArrayList<>(); 
		
		alist.add(car);
		alist.add(pet);
		alist.add(health);
		
		for(int i=0; i<alist.size(); i++) {
			Insurance obj = alist.get(i);
			obj.getQuote();		
		}
		
		Iterator<Insurance> it = alist.iterator();
		while(it.hasNext()) {
			Insurance obj = it.next();
			obj.cancelInsurance();
		}
		
		for(Insurance obj :alist) {
			obj.getQuote();
		}
	}

}
