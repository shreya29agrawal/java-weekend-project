package com.tutorial.controlstructure;

import java.util.Scanner;

public class ReversOfNumber {

	void compute()
	{
		int n,r=0,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the number");
			n=sc.nextInt();
		
			while(n!=0)
			{
				r=n%10;
				rev=(rev*10)+r;
				n=n/10;
			}
			System.out.println(rev);
	}
	
	public static void main(String[] args) {
		ReversOfNumber obj=new ReversOfNumber();
		obj.compute();
		
		
	}

}
