package com.training.abstraction1;

public abstract class Vehicle extends Accessories {

	String model;
	double price;

	public Vehicle(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	abstract void getMilage();

	public void getDetails() {
		System.out.println("name od vehicle " + model);
		System.out.println("price " + price);

	}

}
