package com.training.assignment;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
	
		boolean check=false;
		String [] arr=  {"AYAN", "AYUSH", "OSHI","RAM"};
		Scanner kb= new Scanner(System.in);
		System.out.println("enter name to login");
		String a= kb.next();
		for(String val: arr) {
			if(val.equals(a)) {
				
				check= true;
			}
		}
		if(check== true)
		{
			System.out.println("Successfull Login");
		}
		else
			System.out.println("pls enter correct name");
		

	}

}
