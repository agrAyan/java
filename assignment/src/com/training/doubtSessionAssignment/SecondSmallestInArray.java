package com.training.doubtSessionAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestInArray {
	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		System.out.println("enter array size");
		int a= kb.nextInt();
		int [] arr= new int [a];
		for(int i=0;i<a;i++) {
			System.out.print("enter values  ");
			arr[i]= kb.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Second Smallest in Array "+arr[1]);
	}
}
