package com.training.assignment;
import java.util.*;
public class registration {
public static void main(String[] args) {
	boolean check=false;
	String [] arr=  {"AYAN", "AYUSH", "OSHI","RAM"};
	Scanner kb= new Scanner(System.in);
	System.out.println("enter unique name");
	String a= kb.next();
	for(String val: arr) {
		if(val.equals(a)) {
			
			check= true;
		}
	}
	if(check!= true)
	{
		System.out.println("registered successfully");
	}
	else
		System.out.println("pls enter unique name");
	
	
}
}
