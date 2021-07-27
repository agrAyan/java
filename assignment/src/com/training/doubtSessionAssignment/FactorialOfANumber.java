package com.training.doubtSessionAssignment;

import java.util.Scanner;

public class FactorialOfANumber {
	public static void main(String[] args) {
		int fact=1;
		Scanner kb= new Scanner(System.in);
		System.out.println("enter number");
		int a= kb.nextInt();
		for(int i=1;i<=a;i++) {
			fact= fact*i;
		}
		System.out.println("Factorial of a given number is"+fact);
	}
}
