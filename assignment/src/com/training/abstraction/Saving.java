package com.training.abstraction;

public class Saving extends Bank {

	

	public Saving(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("abstract method overridden");
		System.out.println("inside saving withdraw.Bank will cut half of amount from your balance");
		 double balance= super.getBalance();
		balance= balance - amount/2;
		System.out.println("your account balance is "+balance );
		
		//super.withdraw(amount);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("abstract method overridden");
		System.out.println("inside saving deposit. Bank will deposit double the amount you will enter");
		double balance= super.getBalance();
		balance+=(amount*2);
		System.out.println("your saving balance is"+balance);
	}

}
