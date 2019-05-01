package com.homework.encapsulation;
/*Firstly create class above main class as EncapsulationDemo
create 
*private data members  
private long acc_no;  
private String name,email;  
private float amount;  

Use the Setter method to set the values and Getter Method to get the values 

In main method set the values by calling setter method and get the values by calling get methods

Output

7560504000 Sumair sumair@syntaxsolutions.com 500000.0*/

class EncapsulationDemo145 {
	private long acc_no;
	private String name, email;
	private float amount;

	public void setAccNo(Long acc_no) {
		this.acc_no = acc_no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	String getName() {
		return name;
	}

	String getEmail() {
		return email;
	}

	long getAccNo() {
		return acc_no;
	}

	float getAmount() {
		return amount;
	}
}

public class Homework145 {

	public static void main(String[] args) {
		EncapsulationDemo145 emp = new EncapsulationDemo145();
		emp.setAccNo(7560504000l);
		emp.setName("Sumair");
		emp.setEmail("sumair@syntaxsolutions.com");
		emp.setAmount(500000.0f);
		System.out.println(emp.getAccNo() + " " + emp.getName() + " " + emp.getEmail() + " " + emp.getAmount());
	}
}
