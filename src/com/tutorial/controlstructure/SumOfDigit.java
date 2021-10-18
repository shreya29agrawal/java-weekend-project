package com.tutorial.controlstructure;

import java.util.Scanner;

public class SumOfDigit {

	void compute()
	{
		int n,r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the number");
			n=sc.nextInt();
			while(n!=0)
			{
				r=n%10;
				sum = sum + r;
				n=n/10;
						
			}
			sc.close();
			System.out.println("sum is "+sum);
			
	}
	public static void main(String[] args) {
		SumOfDigit obj=new SumOfDigit();
		obj.compute();
		

	}

}
