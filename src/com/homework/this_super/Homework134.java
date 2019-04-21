package com.homework.this_super;

/*create class Parent 
declare one constructor here with one argument

create another class as Child  
declare one constructor here without any arguments 
and call the parent class constructor by using super keyword

create another Constructor in class  Child  
declare another constructor here with any arguments 
and call the parent class constructor by using super keyword


in main method call create object for child class with without any parameter
create another object with one argument

Output:
 
Parent Constructor in parent class with one argument
Child Constructor in child class with zero argument
Parent Constructor in parent class with one argument
Child Constructor in child class with one argument*/
public class Homework134 {

	public static void main(String[] args) {
		Child134 obj1 = new Child134();
		Child134 obj2 = new Child134(5);

	}

}

class Parent134 {
	Parent134(int num){
		System.out.println("Parent Constructor in parent class with one argument");
	}
}

class Child134 extends Parent134 {
	Child134(){
		super(5);
		System.out.println("Child Constructor in child class with zero argument");
	}
	
	Child134(int num){
		super(5);
		System.out.println("Child Constructor in child class with one argument");
	}
}