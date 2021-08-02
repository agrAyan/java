package com.training.abstraction;

public class Current extends Bank {

	

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("anstract method overridden");
		System.out.println("inside current withdraw . Bank will deduct 100 ruppess more as a charge");
		double balance= super.getBalance();
		balance= balance-amount-100;
		System.out.println("your current balance is"+ balance);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		//super.deposit(amount);
		System.out.println("abstract method overridden");
		System.out.println("inside current withdraw. Bank will deduct 100 ruppess more as a charge");
		double balance=super.getBalance();
		balance= balance+amount+100;
		System.out.println("your current balance is"+ balance);
	}

}
