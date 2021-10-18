package com.tutorial.controlstructure;

import java.util.Scanner;

// 5!=5*4*3*2*1
public class Factorial {

	void compute()
	{
		long fact=1 ;
		int num , count;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the no");
		num = sc.nextInt();
		sc.close();
		count=num;
		while(count>1)
		{
			fact=count*fact;
			count--;
			
		}
		System.out.println("factorial of no is "+fact);
		
	}
	public static void main(String[] args) {
		 Factorial ft=new Factorial();
		 ft.compute();

	}

}
