package com.training.overloading;

import java.util.Scanner;

public class EmployeeMain {
	
	static String desination;
	Scanner kb= new Scanner(System.in);
	 public boolean callMethod() {
	    	boolean check=false;
	    System.out.println("enter name ");
	    String name=kb.next();
	    System.out.println("enter degination ");
	     desination= kb.next();
	    Employee employee= new Employee(name, desination);
	    
	    if(desination.equals("Manager") || desination.equals("Director") || desination.equals("Programmer")) {
	        if(desination.equals("Programmer"))
	        {
	        	System.out.println("enter basic Allowance \t");
	            double basicAllowance= kb.nextDouble();
	            double totalAllowance = employee.calcBonus(basicAllowance);
	            System.out.println("your totalAllowance is \t"+ totalAllowance);
	        }
	       
	        if(desination.equals("Manager"))
	        {
	        	System.out.println("enter basic Allowance \t");
	            double basicAllowance= kb.nextDouble();
	            System.out.println("enter car Allowance \t");
	            double carAllowance= kb.nextDouble();
	            double totalAllowance = employee.calcBonus(basicAllowance, carAllowance);
	            System.out.println("your totalAllowance is \t"+ totalAllowance);
	        }
	        if(desination.equals("Director"))
	        {
	        	System.out.println("enter basic Allowance \t");
	            double basicAllowance= kb.nextDouble();
	            System.out.println("enter car Allowance \t");
	            double carAllowance= kb.nextDouble();
	            System.out.println("enter house Allowance \t");
	            double houseAllowance= kb.nextDouble();
	            double totalAllowance = employee.calcBonus(basicAllowance,carAllowance, houseAllowance);
	            System.out.println("your totalAllowance is \t"+ totalAllowance);
	        }
	         check= true;
	    	}
	        else
	        {
	        	System.out.println("please Enter correct designation as \t Manager \t Director \t Programmer");
	        	 check=false;
	        }
	    return check;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeMain e= new EmployeeMain();
       boolean check= e.callMethod();
       if(!check) {
    	   e.callMethod();
       }
    
    
	}
	

}
