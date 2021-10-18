package assignment;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		int n,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index for array");
		n=sc.nextInt();
		System.out.println("enter integers "+n);
		int ar[]=new int[n];
		
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		
		System.out.println("enter the no for which index to be searched");
		
		a=sc.nextInt();
		
		try{
			for(int i:ar)
		
		   
		       {
		        if(a==ar[i])
		        {
		           System.out.println(i);
		           break;
		        } 
		        
		       }        
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("not found");  
		}
		sc.close();
		}
		

	}


