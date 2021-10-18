package praticesprogram;
//         *
//        **
//       ***
//      ****

import java.util.Scanner;


public class Pattern1 {
 
	void print()
	{
		int i,j,n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		n=sc.nextInt();
		sc.close();
		
		for(i=1;i<=n;i++)
		{
			for(j=(n-1);j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern1 obj=new Pattern1();
		obj.print();

	}

}
