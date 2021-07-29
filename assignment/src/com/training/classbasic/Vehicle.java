package com.training.classbasic;

public class Vehicle {
 String name;
 String model;
 int price;
public Vehicle(String name, String model, int price) {
	super();
	this.name = name;
	this.model = model;
	this.price = price;
}
public void getDetails() {
	System.out.println("name of the vehicle "+ name);
	System.out.println("model of the vehicle "+ model);
	System.out.println("price of the vehicle "+ price);
	System.out.println("-------------------------------------------");
}
}
