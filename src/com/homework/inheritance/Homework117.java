package com.homework.inheritance;

/*For you to do 

create class A write the logic in it as by creating constructor
System.out.println(10);
create class B write the logic in it by creating constructor
as and extends the class A
System.out.println(20);
create class C write the logic in it by creating constructor
 as and extends the class B
System.out.println(30);

In main method create object for For C class 

Output:
10
20
30*/

class A {
	A() {
		System.out.println(10);
	}
}

class B extends A {
	B() {
		System.out.println(20);
	}
}

class C extends B {
	C() {
		System.out.println(30);
	}
}

class Homework117 {
	public static void main(String[] args) {
		C obj = new C();
	}
}
