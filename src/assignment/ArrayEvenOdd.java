package assignment;

import java.util.Scanner;

public class ArrayEvenOdd {
	
	void check()
	{
		int n;
		int evencount =0,oddcount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index for array");
		n=sc.nextInt();
		System.out.println("enter integers "+n);
		int ar[]=new int[n];
	
				
				
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println(" even no "+ar[i]);
				evencount++;
				
			}
			else
				{System.out.println(" odd no "+ar[i]);
				oddcount++;
				}
		}
		System.out.println("total even no is :"+evencount);
		System.out.println("total odd no is :"+oddcount);
		sc.close();
	}

	public static void main(String[] args) {
		 ArrayEvenOdd obj = new  ArrayEvenOdd();
		 obj.check();

	}

}
