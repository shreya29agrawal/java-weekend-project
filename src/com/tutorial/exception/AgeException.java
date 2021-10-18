package com.tutorial.exception;

import java.util.Scanner;

public class AgeException extends Exception {

	AgeException()
	{
		System.out.println("invalid age");
	}
	
	void inputshow()
	{
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age ");
		age=sc.nextInt();

	      try{
	    	  if(age<0)
	         throw new AgeException();
	        System.out.println("age "+age);
	      }
	      catch(AgeException e)
	      {
		      System.out.println(e );
	          System.out.println("age cannot be negative");
	      }
	      finally
	      {   sc.close();
	    	  System.out.println("finally executed");
	      }
	}

	public static void main(String[] args) {
		AgeException a=new AgeException();
		a.inputshow();
		System.out.println("rest of the code ....");
	}
	}


