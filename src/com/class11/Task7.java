package com.class11;

public class Task7 {

	public static void main(String[] args) {
		String[][] countries = { { "USA", "Canada", "Mexico" },
				{ "Brazil", "Colombia", "Peru", "Argentina", "Uruguay" },
				{ "Germany", "United Kingdon", "Sweden", "Norway" }, { "Chine", "Kazakhstan", "Azerbaijan", "Russia" },
				{ "Chad", "South Africa", "Mozambique", "Ethiopia" } };

		for (String[] rows : countries) {
			for (String country : rows) {
				System.out.print(country + " ");
			}
			System.out.println();
		}

	}

}
