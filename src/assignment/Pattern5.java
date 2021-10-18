package assignment;

import java.util.Scanner;

public class Pattern5 {
	
	void print()
	{
		int i,j,n,k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print( " "+k+" " );
				k=k+2;
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Pattern5 obj=new Pattern5();
		obj.print();
	}

}
