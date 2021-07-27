package com.training.assignmentOfClasses;

public class Student {
String stdname;
String id;
int marks;
int sum=0;
public Student(String stdname, String id) {
	super();
	this.stdname = stdname;
	this.id = id;
	//this.marks= marks;
			}
public void getDetails() {
	System.out.println("name of the student is "+ stdname);
	System.out.println("id of a student is "+ id);
	//System.out.println("marks of the student is "+ marks);
	
}
public void getMarks(int [] marks) {
	for(int i: marks)
		sum+=i;
	this.marks= sum;
	System.out.println("marks of the student is "+ this.marks);
	System.out.println("average marks of a students"+ (int)sum/marks.length);
}
}
