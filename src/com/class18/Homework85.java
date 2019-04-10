package com.class18;

/*For you to do 
Multiple Parameters for method
create method with Multiple Parameters as int 
and write the logic in that method in println statement to print hours : with minutes 
and call the method in main method with values 

Output: MUST BE!!!
11:30*/
public class Homework85 {
	void printTime(int hour, int minute) {
		System.out.println(hour + ":" + minute);
	}

	public static void main(String[] args) {
		Homework85 obj = new Homework85();
		obj.printTime(11, 30);

	}

}
