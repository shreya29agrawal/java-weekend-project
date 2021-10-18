package com.tutorial.inheritanceexample;

import java.util.Scanner;

class Worker{
	Scanner sc=new Scanner(System.in);
	int salary ;
	String name;
	void getSalary()
	
	{   System.out.println("enter the name and salary of employee");
		name=sc.next();
		salary=sc.nextInt();
		System.out.println(name);
		System.out.println(salary);
	}
}

    public class Manager extends Worker {
   
    	

	 void getSalary()
	 {   System.out.println("enter travellrate and house rent");
		 int ta = sc.nextInt();
		 int hr = sc.nextInt();
		 System.out.println("salary of manager :"+(salary+ta+hr));
		 
	 }
	 void display()
	 {
		 
		 super.getSalary();
		 getSalary();
		 
	 }
	public static void main(String[] args) {
		
		Manager obj=new Manager();
		obj.display();
		

	}

}
