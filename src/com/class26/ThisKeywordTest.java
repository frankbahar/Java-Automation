package com.class26;

public class ThisKeywordTest {

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(10, 20);
		obj.sum(100, 200);

		ThisKeyword obj1 = new ThisKeyword();
		obj1.sum(12, 13);
	}
}
