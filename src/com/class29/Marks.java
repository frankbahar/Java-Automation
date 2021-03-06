package com.class29;

public abstract class Marks {
	public abstract double getPercentage(); 
	
}

class StudentA extends Marks {
	int mark1;
	int mark2;
	int mark3;
	
	StudentA(int mark1, int mark2, int mark3){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}

	@Override
	public double getPercentage() {
		
		return (mark1*.33+mark2*.33+mark3*.34);
	}
	
}

class StudentB extends Marks {
	int mark1;
	int mark2;
	int mark3;
	int mark4;
	
	StudentB(int mark1, int mark2, int mark3, int mark4){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=mark4;
	}

	@Override
	public double getPercentage() {
		
		return (mark1*.25+mark2*.25+mark3*.25+mark4*.25);
	}
	
}