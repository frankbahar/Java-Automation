package com.class24;

public class Testing {

	public static void main(String[] args) {
		
		String a;
		a="10";
		Parent parent =new Parent();
		parent.love();
		parent.work();
		
		Child child = new Child();
		child.love();
		child.cry();
		child.work();
		System.out.println(child.myvalue);
		//type casting 
		Parent obj = new Child(); // parent is taking the reference
	//	Child obj1 = new Parent(); not possible
	//	obj.cry(); // not accessible
	}

}
