package com.homework.old;

public class StoreProduct {
	String label;
	int price;
	String category;
	boolean hasExpiration;
	int stock;

	StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
		this.label = label;
		this.price = price;
		this.category = category;
		this.hasExpiration = hasExpiration;
		this.stock = stock;
	}

	StoreProduct(String label, int price, int stock) {
		this.label = label;
		this.price = price;
		this.category = "misc";
		this.hasExpiration = false;
		this.stock = stock;
	}

	StoreProduct(String label, int price) {
		this.label = label;
		this.price = price;
	}

	void printStockProduct() {
		System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
	}
}
