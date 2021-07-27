package com.training.assignment;
import java.util.*;
public class ArrayExample {
public static void main(String[] args) {
	int [] even= new int [2];
	int [] odd= new int [2];
	int evenCount=0;
	int oddCount=0;
	Scanner kb= new Scanner (System.in);
	int a=kb.nextInt();
	int [] arr= new int [a];
	for(int i=0;i<a;i++) {
		arr[i]= kb.nextInt();
	}
	for(int i: arr) {
		if(i%2==0) {
			even[evenCount]= i;
			evenCount=evenCount+1;
		}
		else
		{	
		odd[oddCount]=i;
		 oddCount= oddCount+1;
		}
	}
	for(int i: even) {
		System.out.println("even "+i);
	}
	for(int i:odd) {
		System.out.println("odd "+i);
	}
}
}
