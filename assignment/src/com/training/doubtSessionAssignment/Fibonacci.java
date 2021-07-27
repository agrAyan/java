package com.training.doubtSessionAssignment;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0; int b=1;
		int c=0;
	
	Scanner kb= new Scanner(System.in);
	System.out.println("enter number");
	int number= kb.nextInt();
	for(int i=0;i<number;i++) {
		c= a+b;
		System.out.println(c);
		a=b;
		b=c;
		
	}
	
	}
}

