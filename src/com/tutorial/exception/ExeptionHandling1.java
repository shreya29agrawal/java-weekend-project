package com.tutorial.exception;

import java.util.Scanner;


//try catch
//multiple catch block
public class ExeptionHandling1 {
	void division()
	{
	int n1,n2,res,index;
	int ar[]={10,20,30,40,50};
	String s=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter divisor number");
	n1=sc.nextInt();
	System.out.println("enter dividend number");
	n2=sc.nextInt();
	System.out.println("enter index of  array");
	index=sc.nextInt();
	try
	{
	res=n1/n2;
	System.out.println("division :"+res);
	System.out.println("digit at array at index "+index+" is :"+ar[index]);
	System.out.println("done");
	System.out.println(s.length());
	}
	catch(ArithmeticException e )
	{
		System.out.println(e);
		System.out.println("divided by zero");
	}
	catch(IndexOutOfBoundsException e)
	{
		System.out.println(e);
		System.out.println("out of limit");
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println("general cathch");
	}
	sc.close();
	}
	
	public static void main(String[] args) {
		ExeptionHandling1 obj = new ExeptionHandling1();
		obj.division();
		System.out.println("rest of the code ....");

	}

}

