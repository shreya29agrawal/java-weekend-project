package com.tutorial.array;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		int ar[] =new int[5];
		//int []ar =new int[5];
       //int[] ar =new int[5];
	
		int ele;
		boolean flag=false;
		int min=Integer.MAX_VALUE;
		System.out.println(min);
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 numbers");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();	
		}
		
		
	
		for(int r:ar)// enhanced for loop
		{
			if(r<min)
				
			{min=r;
		
			}
			
		}
		System.out.println(min);
			sc.close();
		}
	}
	



