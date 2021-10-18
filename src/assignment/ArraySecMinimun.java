package assignment;

import java.util.Scanner;

public class ArraySecMinimun {
	
	public static void main(String[] args) {
		int n,a,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index for array");
		n=sc.nextInt();
		System.out.println("enter integers "+n);
		int ar[]=new int[n];
		
		for(i=0;i<n;i++)
			ar[i]=sc.nextInt();
		
		int min=ar[0];
		int min2=ar[0];
		
		for(i=0;i<n;i++)
		{ if(ar[i]<min)
			{
				min2 =min;
				min=ar[i];
			}
		else if((ar[i]>min)||(min2==min))
		{
			min2= ar[i];
		}
			
		}
				
		System.out.println("minimun is "+min);
		System.out.println("second minimun is :"+min2);

     }
}