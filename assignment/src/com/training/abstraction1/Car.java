package com.training.abstraction1;

public class Car extends Vehicle {

	public Car(String model, double price) {
		super(model, price);
	}

	@Override
	void internal() {
		System.out.println("internal class overriding");

	}

	@Override
	void external() {
		System.out.println("external class overriding");

	}

	@Override
	void getMilage() {
		System.out.println("milage is 50km/l");
		
	}

}
