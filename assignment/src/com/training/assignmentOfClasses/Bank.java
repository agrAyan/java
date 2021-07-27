package com.training.assignmentOfClasses;

public class Bank {
 double balance;

public Bank(double balance) {
	super();
	this.balance = balance;
}
public void deposit(double deposit) {
	balance= balance+ deposit;
}
public void withdrawl(double withdrawal) {
	balance= balance - withdrawal;
}
public void getBalance() {
	System.out.println(balance);
	System.out.println("-----------------------------");
}
}
