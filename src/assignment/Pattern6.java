package assignment;
//Aa
//Aa  Bb
//Aa  Bb  Cc;

import java.util.Scanner;

public class Pattern6 {
	void print()
	{
		int i,j,n,k=1,a=64,b=96;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print( " "+(char)(a+j)+""+(char)(b+j)+" " );
				
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern6 obj = new Pattern6();
		obj.print();

	}

}
