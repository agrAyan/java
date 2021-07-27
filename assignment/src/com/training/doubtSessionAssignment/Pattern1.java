package com.training.doubtSessionAssignment;

import java.util.Scanner;

public class Pattern1 {
public static void main(String[] args) {
	Scanner kb= new Scanner(System.in);
	System.out.println("enter number");
	int a= kb.nextInt();
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
}
