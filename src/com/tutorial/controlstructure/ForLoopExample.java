package com.tutorial.controlstructure;

import java.util.Scanner;

public class ForLoopExample {
	void print()
	{
		int n,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		n=sc.nextInt();
		sc.close();
	System.out.println("enter no.");
		for(c=1;c<=n;c++)
		{
			System.out.println(c);
	}
	c=1;
	for(;;)
	{    System.out.println(c);
	        if(c==n)
		    break;
	      c++;
		
	}
	}

	public static void main(String[] args) {
		
		ForLoopExample obj=new ForLoopExample();
		obj.print();
	}

}
