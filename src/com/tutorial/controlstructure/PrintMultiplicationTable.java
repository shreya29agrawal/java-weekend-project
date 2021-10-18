package com.tutorial.controlstructure;

import java.util.Scanner;

public class PrintMultiplicationTable {
	// multiplication table
	void multiplication()
	{
		int n , count;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		n=sc.nextInt();
		sc.close();
		
		count = 1;
		while(count<=10)
		{
			System.out.println(n+ "* " +count+ " = "+(n*count));
			count++;
		}
	
		

		}

	public static void main(String[] args) {
		PrintMultiplicationTable obj =new PrintMultiplicationTable();
		obj.multiplication();

	}

}
