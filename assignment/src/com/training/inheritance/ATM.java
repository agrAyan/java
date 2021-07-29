package com.training.inheritance;

import java.util.Scanner;

public class ATM {
	
	public static boolean checkWithdraw(double d) {
		boolean check=false;
		if(d<5000) {
			check= true;}
		else
			check=false;
		return check;
		}
	
public static void main(String[] args) {
	Scanner kb= new Scanner(System.in);
	String exit="";
	double bal= 5000;
	Bank b= new Bank(5000);
	do {
	System.out.println("enter account type");
	String accountType=kb.next();
	 if(accountType.equals("C")) {
		 b= new Current(bal);
		 System.out.println("enter w or c ");
		 String check= kb.next();
		 if(check.equals("w")) {
			 
			 System.out.print("Enter withdrawl amount");
			 double with= kb.nextDouble();
			 boolean checkWith=checkWithdraw(with);
			 if(checkWith)
			 b.withdraw(with);
			 else
				 System.out.println("enter amonut less than balance");
		 }
		 else {
			 System.out.print("Enter deposit amount");
			 double with= kb.nextDouble();
			 b.deposit(with);
		 }
			 
	 }
	 else if(accountType.equals("S"))
	 {
		 b= new Saving(bal);
		 System.out.println("enter w or c ");
		 String check= kb.next();
		 if(check.equals("w")) {
			 
			 System.out.print("Enter withdrawl amount");
			 double with= kb.nextDouble();
			 boolean checkWith=checkWithdraw(with);
			 if(checkWith)
			 b.withdraw(with);
			 else
				 System.out.println("enter amonut less than balance");
		 }
		 else {
			 System.out.print("Enter deposit amount");
			 double with= kb.nextDouble();
			 b.deposit(with);
		 }
	 }
	 else
		 System.out.println("enter correct values");
	}while(!exit.equals("E"));
	
	
	
	
}
}
