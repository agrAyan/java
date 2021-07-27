package com.training.assignmentOfClasses;
import java.util.*;
public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		Scanner kb= new Scanner(System.in);
		do {
		Bank bank= new Bank (50000.00);
		
		System.out.println("your bank balance is ");
		 bank.getBalance();
		System.out.println("enter amount you want to deposit ");
		double deposit= kb.nextDouble();
		bank.deposit(deposit);
		System.out.println("amount after depositing " );
		 bank.getBalance();
		 System.out.println("enter withdrawal amount ");
		 double withdrawl= kb.nextDouble();
		bank.withdrawl(withdrawl);
		bank.getBalance();
		System.out.println("press 1 to exit or any other key to contitnue");
		a=kb.nextInt();
		
		}while(a!=1);
	}

}
