package com.tutorial.controlstructure;

import java.util.Scanner;

public class EvenOdd {

	void check()
	{
		int n,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer no.");
		n=sc.nextInt();
		
		r=n%2; //% modulos to store remainder
		
		if(r==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		sc.close();
		
	}
	
	public static void main(String[] args) {
		EvenOdd eo=new EvenOdd();
		eo.check();
		
	}

}
