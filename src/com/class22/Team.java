package com.class22;

public class Team {

	public String name = "Giants";

	private Team() {
		System.out.println("Private Constructor");
	}

	public static void main(String[] args) {

		Team team1 = new Team();
		team1.printTeam();

	}

	public void printTeam() {
		System.out.println("my team is " + name);
	}
}
