package com.training.doubtSessionAssignment;

import java.util.Scanner;

public class AmstrongNumber {
public static void main(String[] args) {
	Scanner kb= new Scanner(System.in);
	System.out.println("enter number");
	int a= kb.nextInt();
	int safe=a;
	int check=0;
	while(safe>0) {
		int rem= safe%10;
		check= check+ (int) Math.pow(rem, 3);
		safe=safe/10;
		
	}
	if(check==a) {
		System.out.println("it is a Amstrong Number");
	}
	else {
		System.out.println("it is not a Amstrong Number");
	}
}
}
