package com.training.classbasic;

public class Student {
String stdname;
String id;

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
	int mark=0;
	int sum=0;
	for(int i: marks)
		sum+=i;
	mark= sum;
	System.out.println("marks of the student is "+ mark);
	System.out.println("average marks of a students"+ (int)sum/marks.length);
}
}
