package com.training.assignment;
import java.util.*;
import java.util.Scanner;

public class Pattern1 {
public static void main(String[] args) {
Scanner kb= new Scanner(System.in);
	int count=1;
	System.out.print("enter array size");
	int a= kb.nextInt();
	for(int i=1;i<a;i++) {
		for(int j=1;j<i;j++) {
			
			System.out.print(count);
			count=count+j;
		}
		System.out.println();
	}
}
}
