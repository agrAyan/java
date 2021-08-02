package com.training.abstraction1;

public class CarMain {
public static void main(String[] args) {
	
	Accessories c= new Car("suv", 1200);
	c.internal();
	c.external();
	Vehicle v= (Vehicle) c;
	v.getDetails();
	v.getMilage();
	
	
                                       	
}
}
