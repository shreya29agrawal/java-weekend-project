package assignment;

import java.util.Scanner;

public class FibonacciSeries {

	void print()
	{
		int n1 , n2 ,sum,i, count;
		n1=0;
		n2=1;
		sum=0;
		i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no to print fibonacci series");
		
		count=sc.nextInt();
		System.out.println(" fibonacci series of "+ count+ " is");
		sc.close();
		while(i<count){
			
			System.out.println(sum);
			n1=n2;
		     n2=sum;
		     sum=n1+n2;
		     i++;
		}
	}
	public static void main(String[] args) {
		FibonacciSeries obj = new FibonacciSeries();
		obj.print();

	}

}
