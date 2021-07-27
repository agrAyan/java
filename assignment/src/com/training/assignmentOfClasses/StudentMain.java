package com.training.assignmentOfClasses;
import java.util.*;
public class StudentMain {
public static void main(String[] args) {
	Scanner kb= new Scanner(System.in);
	System.out.println("Enter name");
	String name= kb.nextLine();
	System.out.println("enter std id");
	String stdId= kb.next();
	Student student= new Student(name, stdId);
	System.out.println("how many subject");
	int a= kb.nextInt();
	int [] marks= new int [a];
	for(int i=0;i<a; i++) {
		System.out.println("enter marks");
		marks[i]= kb.nextInt();
	}
	System.out.println("-----------------------------------");
	student.getDetails();
	student.getMarks(marks);
	
}
}
