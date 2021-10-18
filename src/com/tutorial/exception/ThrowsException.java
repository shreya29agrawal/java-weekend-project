package com.tutorial.exception;

import java.util.Scanner;

public class ThrowsException {
	void inputshow()
	{
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age ");
		age=sc.nextInt();

	      try{
	    	  if(age<0)
	        throw new ArithmeticException();//instance of arithmeticException
	        System.out.println("age "+age);
	      }
	      catch(ArithmeticException e)
	      {
		     System.out.println(e );
		      System.out.println("age cannot be negative");
	      }
	      finally
	      {
	    	  sc.close();
	    	  System.out.println("finally executed");
	      }
	}

	public static void main(String[] args) {
		ThrowsException obj = new ThrowsException();
		obj.inputshow();

	}

}
