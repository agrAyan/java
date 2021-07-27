package com.training.doubtSessionAssignment;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		int count=0;
		int sum=0;
		Scanner kb= new Scanner(System.in);
		System.out.println("enter number");
		int a= kb.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				sum=count+j;
				System.out.print(sum);
			}
			count=count+i;
			System.out.println();
		}
}
}
