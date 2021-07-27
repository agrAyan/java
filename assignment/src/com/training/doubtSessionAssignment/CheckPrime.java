package com.training.doubtSessionAssignment;

import java.util.Scanner;

public class CheckPrime {
public static void main(String[] args) {
	boolean check= false;
	Scanner kb= new Scanner(System.in);
	System.out.println("enter number");
	int a= kb.nextInt();
	
	for(int i=2;i<a/2;i++) {
		if(a%i==0)
			check= true;
	}
	if(!check)
		System.out.println("prime number");
	else
		System.out.println("not prime");
	kb.close();
		
}
}
