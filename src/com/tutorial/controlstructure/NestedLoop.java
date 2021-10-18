package com.tutorial.controlstructure;

import java.util.Scanner;

public class NestedLoop {
	
	void print()
	{
		int i=1 , j, n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		n=sc.nextInt();
		while(i<=n){
			j=1;
			while(j<=i)
			{
				System.out.print(" "+j+" ");
				j++;
			}
			   System.out.println("  " );
			i++;
		    }
		  
		}
		
	public static void main(String[] args) {

		NestedLoop obj = new NestedLoop();
		obj.print();
	
        }
      }