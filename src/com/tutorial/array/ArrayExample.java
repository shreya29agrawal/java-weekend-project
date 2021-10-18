package com.tutorial.array;

import java.util.Scanner;

// array - same type of element
// array - static
// array - every element has index start from 0 to n n is index
// for each loop-- enhanced for loop
/*  for(datatype ref:arrayname) 
 * 
 * 
 */
public class ArrayExample {

	public static void main(String[] args) {
		int ar[] =new int[5];
		//int []ar =new int[5];
       //int[] ar =new int[5];
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 numbers");
		for(int i=0;i<=4;i++)
		{
			ar[i]=sc.nextInt();	
		}
		System.out.println("element of array");
		/*for(int i=0;i<=4;i++)
		{
			System.out.println(ar[i]);	
		}*/
		
		for(int r:ar)// enhanced for loop
		{
			System.out.println(r);
		}
		sc.close();
	}

}
