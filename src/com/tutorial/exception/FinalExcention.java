package com.tutorial.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalExcention {
   void input()
   {
	int age;
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age and name");

      try{
	age=sc.nextInt();
	name=sc.next();
	System.out.println(age +" and "+name );
	System.exit(0);
	System.out.println("done");
	
     }
      catch(ArithmeticException e)
      {
	   System.out.println(e);
	   System.out.println("age should be numeric");
      }
   catch(InputMismatchException e)
      {
	   System.out.println(e);
	   System.out.println("age should be numeric");
      }
      finally
      {
    	  sc.close();
    	  System.out.println("finally executed");
      }
	
   }
	public static void main(String[] args) {
		
		FinalExcention obj = new FinalExcention();
		obj.input();
		System.out.println("rest of the code");
				
	}

}
