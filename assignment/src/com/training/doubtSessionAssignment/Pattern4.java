package com.training.doubtSessionAssignment;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.println("enter number");
		int a= kb.nextInt();
		for(int i=a;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
}
