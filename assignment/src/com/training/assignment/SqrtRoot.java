package com.training.assignment;

import java.util.Scanner;

public class SqrtRoot {
public static void main(String[] args) {
Scanner kb= new Scanner(System.in);
	int count=0;
	System.out.print("enter array size");
	int a= kb.nextInt();
	int [] arr= new int [a];
	double [] sqrt= new double[a];
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("enter values");
		arr[i]= kb.nextInt();
	}
	for(int value: arr) {
		sqrt[count]= Math.sqrt(value);
		count=count+1;
	}
	for(double val: sqrt) {
		System.out.println(val);
	}
}
}
