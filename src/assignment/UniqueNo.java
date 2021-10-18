package assignment;

import java.util.Scanner;

public class UniqueNo {

	public static void main(String[] args) {
		 
		int num1,num2,r1,r2,n , c=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
		n=sc.nextInt();
		num1=n;
		num2=n;
		
		while(num1>0)
		{
			r1=num1%10;
			while(num2>0)
			{
				r2=num2%10;
				if(r1==r2)
				{c++;
			}
				num2= num2/10;
		}
			num1=num1/10;

	}
		if(c==1)
		{System.out.println("unique no");
		}
		else
		{
			System.out.println("not a unique no");
		}
		}

   }
