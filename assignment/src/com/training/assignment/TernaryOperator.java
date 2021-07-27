package com.training.assignment;

public class TernaryOperator {
 public static void main(String[] args) {
	int a= 10, b=50, c=30;
	int max= a>b?(a>c?a:c):(b>c?b:c);
	System.out.print(max);
}
}
