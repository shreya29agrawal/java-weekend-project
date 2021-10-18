package assignment;

import java.util.Scanner;

public class PatternTwo {

	public static void main(String[] args) {
		int i, j, n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		n=sc.nextInt();

		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print( " " +(i+1)+ " ");
			}
			System.out.println(" " );
		}

	}

}
