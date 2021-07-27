package com.training.assignment;
import java.util.*;
public class ReverseArray {
public static void main(String[] args) {
	Scanner kb= new Scanner(System.in);
	System.out.println("enter size");
	int a= kb.nextInt();
	int [] arr= new int [a];
	int [] reverse= new int [a]; 
	for(int i=0;i<a ;i++) {
		System.out.print("enter values ");
		arr[i]= kb.nextInt();
	}
	for(int i=0;i<a;i++) {
		int temp= arr[i];
		reverse[reverse.length-1-i]= arr[i];
		arr[i]= temp;
	}
	for(int i: reverse) {
		System.out.println("reverse order is "+ i+"    ");
	}
}
}
