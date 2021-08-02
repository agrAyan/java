package com.training.abstraction;

public abstract class Bank {
private double balance;

public abstract void withdraw(double amount);
public abstract  void deposit(double amount);
public double getBalance() {
	
	System.out.println("Bank class \t your account have Rs. "+balance);
	return this.balance;
}
public Bank(double balance) {
	super();
	this.balance = balance;
}
}
