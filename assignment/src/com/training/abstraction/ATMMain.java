package com.training.abstraction;

import java.util.Scanner;

public class ATMMain {
	static Scanner kb = new Scanner(System.in);
	static String exit = "";
	static double bal = 5000;
	static Bank b = new Current(bal);

	public static boolean checkWithdraw(double d) {
		boolean check = false;
		if (d < 5000) {
			check = true;
		} else
			check = false;
		return check;
	}

	public static void checkAccountType() {
		System.out.println("enter account type or E to exit");
		String accountType = kb.next();

		switch (accountType) {
		case "C":
			b.getBalance();
			b = new Current(bal);
			System.out.println("enter w or c ");
			String check = kb.next();
			if (check.equals("w")) {

				System.out.print("Enter withdrawl amount");
				double with = kb.nextDouble();
				boolean checkWith = checkWithdraw(with);
				if (checkWith)
					b.withdraw(with);
				else
					System.out.println("enter amonut less than balance");
			} else if(check.equals("c")) {
				System.out.print("Enter deposit amount");
				double with = kb.nextDouble();
				b.deposit(with);
			}
			else
				System.out.print("please enter c or w");
			break;
		case "S":
			b.getBalance();
			b = new Saving(bal);
			System.out.println("enter w or c ");
			String check1 = kb.next();
			if (check1.equals("w")) {

				System.out.print("Enter withdrawl amount");
				double with = kb.nextDouble();
				boolean checkWith = checkWithdraw(with);
				if (checkWith)
					b.withdraw(with);
				else
					System.out.println("enter amonut less than balance");
			} else {
				System.out.print("Enter deposit amount");
				double with = kb.nextDouble();
				b.deposit(with);
			}
			break;
		case "E":
			System.exit(0);
		default:
			System.out.println("enter correct values");
			break;

		}

	}

		/* if(accountType.equals("C")) {
			 
		 }
		 else if(accountType.equals("S"))
		 {
		 }
		 else
			 System.out.println("enter correct values");
	}*/

	public static void main(String[] args) {

		do {
			checkAccountType();
		} while (!exit.equals("E"));

	}
}
