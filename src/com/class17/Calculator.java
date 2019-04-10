package com.class17;

public class Calculator {
	public int sum(int x, int y) {
		return x+y;
	}
	
	public int sub(int x, int y){
		return x-y;
	}
	
	public int div(int x, int y) {
		return y>0?x/y:-1;
	}
	
	public int mult(int x, int y) {
		return x*y;
	}
	
}
