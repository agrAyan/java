package com.training.inheritance;

public class Bank {
private double balance;

public void withdraw(double amount) {
	balance-=amount;
}
public void deposit(double amount) {
	balance+= amount;
}
public double getBalance() {
	System.out.println("your account have Rs. "+balance);
	return this.balance;
}
public Bank(double balance) {
	super();
	this.balance = balance;
}
}
