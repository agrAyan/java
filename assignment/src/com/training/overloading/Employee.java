package com.training.overloading;

public class Employee {
String name;
String degination;
public Employee(String name, String degination) {
	super();
	this.name = name;
	this.degination = degination;
}
public double calcBonus(double basicAllowance) {
	System.out.println("Constructor having one parameter");
	return basicAllowance;
}
public double calcBonus(double basicAllowance,double carAllowance) {
	System.out.println("Constructor having two parameter");
	return basicAllowance+ carAllowance;
}
public double calcBonus(double basicAllowance,double carAllowance, double houseAllowance) {
	System.out.println("Constructor having three parameter");
	return basicAllowance+ carAllowance+houseAllowance;
}
}
