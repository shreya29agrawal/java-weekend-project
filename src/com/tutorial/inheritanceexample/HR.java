package com.tutorial.inheritanceexample;

 class Employee{
	 int age, salary;
     String name;
	 Employee(String n,int a,int s)
	 {
		 name=n;
		age=a;
		salary=s;

	 }
	 
     void show(String name,int age,int salary)
     {   System.out.println("Employee details");
    	 System.out.println("name :"+name);
    	 System.out.println("age of employee :"+age);
    	 System.out.println("salary of employee :"+salary);
     }
     
 }
public class HR extends Employee {
	int hrsalary;
	
	HR()
	{
		super("abc",2,34556);
	}
	void show(String name,int age,int salary)
		
	{  
	 System.out.println("HR details");
	 System.out.println("name :"+name);
      System.out.println("age of employee :"+age);
		System.out.println("salary of hr is :"+salary);
	}
	void display()
	{  
		super.show("abc",2,3456);
		show("asd",4,6588);
		
	}

	public static void main(String[] args) {
		
		HR obj=new HR();
		obj.display();
		
	}

}
