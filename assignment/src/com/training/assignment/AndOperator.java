package com.training.assignment;
import java.util.*;
public class AndOperator {
public static void main(String[] args) {
	Scanner kb= new Scanner(System.in);
	System.out.println("\"enter first number \"");
	int a= kb.nextInt();
	System.out.println("enter second");
	int b= kb.nextInt();
	System.out.println("enter third");
	int c= kb.nextInt();
	if(a>b && a>c)
		System.out.print("a is greatest with value "+ a);
	else if(b>c)
		System.out.print("b is greatest "+b);
	else
		System.out.print("c is greatest "+ c);
}
}
