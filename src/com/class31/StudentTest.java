package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student("John", 101);
		Student student2 = new Student("James", 102);
		Student student3 = new Student("Anna", 103);
		Student student4 = new Student("Katy", 104);
		
		ArrayList<Student> alist = new ArrayList<>();
		alist.add(student1);
		alist.add(student2);
		alist.add(student3);
		alist.add(student4);
		
		for(Student student:alist) {
			student.printStudentDetails();
			System.out.println(student.name);
		}
		
		Iterator<Student> it=alist.iterator();
		while(it.hasNext()) {
			Student student= it.next();
			student.printStudentDetails();
		}
	}
}
