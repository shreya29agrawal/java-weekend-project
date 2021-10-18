package com.tutorial.array;

import java.util.Scanner;

public class ReversingArray {

	public static void main(String[] args) {
		int ar[] =new int[5];
		
		int i,j;
		int temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 numbers");
		for( i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();	
		}
		for(i=0,j=ar.length-1;i<(ar.length)/2;i++,j--)// enhanced for loop
		{
			temp =ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		
		System.out.println("reverse array");
		
		for(int r:ar)
			
		System.out.println(r);
		sc.close();
	}
	

}
