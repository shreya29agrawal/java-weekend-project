package assignment;

import java.util.Scanner;

public class NEvenNo {
// print the n even no 
	void print()
	{
		int count, i, num;
		i=0;
		num=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count number");
		count=sc.nextInt();
		sc.close();
		while(i<count)
		{
			System.out.println(num);
			i=i+1;
			num=num+2;
			
		}
	}
	public static void main(String[] args) {
		NEvenNo obj=new NEvenNo ();
		obj.print();

	}

}
