package com.tutorial.controlstructure;

import java.util.Scanner;
// iterate atleast one without checking condition
// print n natural number
public class DoWhileExample {
	void print()
	{
		int n,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		n=sc.nextInt();
		c=1;
		do{
			System.out.println(c);
			c++;
		}
		while(c<=n);
		sc.close();
		
	}

	public static void main(String[] args) {
		DoWhileExample obj = new DoWhileExample();
		obj.print();
		

	}

}
