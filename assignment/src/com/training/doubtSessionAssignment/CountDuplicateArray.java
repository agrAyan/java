package com.training.doubtSessionAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class CountDuplicateArray {
public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	Scanner kb= new Scanner(System.in);
	System.out.println("enter array size");
	int a= kb.nextInt();
	int [] arr= new int [a];
	for(int i=0;i<a;i++) {
		System.out.print("enter values  ");
		arr[i]= kb.nextInt();
	}
	Arrays.sort(arr);
	for(int j=1;j<arr.length;j++) {
		int k=0;
		boolean check=false;
		while(k<j)
		{
			if((j!=k) && arr[j] ==arr[k])
				check=true;
				
			k++;
		}
		if(check) {
			System.out.println(arr[j]);
		}
	}
}
}

