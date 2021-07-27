package com.training.doubtSessionAssignment;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	int sum=0;
	int i=1;
	Scanner kb= new Scanner(System.in);
	System.out.println("enter number");
	int a= kb.nextInt();
	while(i <= a/2)  
	{  
	if(a % i == 0)  
	{  
		sum = sum + i;  
	}   
	i++;  
	}
	if(sum==a)
		System.out.println("perfect number");
	else
		System.out.println("not perfect number");
}
}
