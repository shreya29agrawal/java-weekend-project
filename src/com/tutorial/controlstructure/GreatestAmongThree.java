package com.tutorial.controlstructure;

import java.util.Scanner;

// greatest among three
public class GreatestAmongThree {
	void check()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		sc.close();
		if((a>b)&&(a>c))
		{
			System.out.println(a+" is greatest");

		}
		else if (b>c)
			{System.out.println(b+" is greatest");
			
			}
		else
		{
			System.out.println(c+" is greatest");
		}
}


	public static void main(String[] args) {
		GreatestAmongThree obj=new GreatestAmongThree();
		obj.check();
		
	
	}
}
		


