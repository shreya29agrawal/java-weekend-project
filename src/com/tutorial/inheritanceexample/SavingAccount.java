package com.tutorial.inheritanceexample;

import java.util.Scanner;

class Account
 {
	String id;
	Double balance;
	Scanner sc= new Scanner(System.in);
		
	void input()
	{
		System.out.println("enter id and balance");
		id=sc.next();
		balance=sc.nextDouble();
	}
	void show()
	{
		System.out.println("id "+id);
		System.out.println("balance "+balance);
	}
     }


public class SavingAccount extends Account {
	double rate;
	void inputsavingdetails()
	{
		System.out.println("enter rate of intrest");
		rate=sc.nextDouble();
	}
   void showSavingDetails()
   {System.out.println("roi "+rate);
	   
   }
	public static void main(String[] args) {
		
		SavingAccount obj=new SavingAccount();
		obj.input();

		obj.show();
		obj.inputsavingdetails();
		obj.showSavingDetails();
	}

}
