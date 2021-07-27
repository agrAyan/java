package com.training.doubtSessionAssignment;

import java.util.Scanner;

public class SumAndAverageOfArray {
	public static void main(String[] args) {
		int sum=0; int avg=0;
		Scanner kb= new Scanner(System.in);
		
		System.out.print("enter array size");
		int a= kb.nextInt();
		int [] arr= new int [a];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter values  ");
			arr[i]= kb.nextInt();
		}
		for(int i: arr) {
			sum+=i;
		}
		System.out.println("sum is "+ sum);
		System.out.println("average is "+(sum/arr.length));
	}
}
