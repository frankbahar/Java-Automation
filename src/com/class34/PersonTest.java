package com.class34;

import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
		Map<Integer, Person> personMap = new HashMap<>();
		personMap.put(1, new Person("Frank", "Snatra", 53, 97000));
		personMap.put(2, new Person("Elvis", "Presley", 46, 110000));
		personMap.put(3, new Person("Michael", "Jackson", 38, 103000));
		
		for(Person person:personMap.values()) {
			person.printPerson();
		}
	}

}
