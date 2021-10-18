package com.tutorial.controlstructure;

import java.util.Scanner;

public class GreaterAmongTwoNumber {

	
	void check()
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		
		if(a>b)
		{
			System.out.println("a is grater");
		}
		else if(a==b)
		{
			System.out.println("both no. is equal");
		}
		else
		{
			System.out.println("b is greater");
		}
	}
	public static void main(String[] args) {
		
		GreaterAmongTwoNumber obj=new GreaterAmongTwoNumber();
		obj.check();
		
	}

}
