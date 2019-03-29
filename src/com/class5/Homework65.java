package com.class5;

import java.util.Scanner;

/*Take 2 boolean inputs from a user:
	 
"Are you thirsty?"
"Are you sleepy?"

If user is thirsty and not sleepy--> drink=Water
If user is thirsty and sleepy--> drink=Coffee
If user is not thirsty and sleepy --> drink=Tea
Otherwise drink="Nothing"

The output should be:   "Looks like you need ___ "*/
public class Homework65 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		boolean thirsty = scanner.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean sleepy = scanner.nextBoolean();
		String drink;
		if (thirsty && !sleepy) {
			drink = "Water";
		} else if (thirsty && sleepy) {
			drink = "Coffee";
		} else if (!thirsty && sleepy) {
			drink = "Tea";
		} else {
			drink = "Nothing";
		}
		System.out.println("Looks like you need to drink" + drink);

	}

}
