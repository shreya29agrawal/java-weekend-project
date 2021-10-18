package com.tutorial.controlstructure;

import java.util.Scanner;

public class PrimeNumber {
void check(){
	int n,count;
	//boolean f=true;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	n=sc.nextInt();
	sc.close();
	count=2;
	while(count<=n/2)
	{
		if(n%count==0)
		{ 
			System.out.println("not a prime no");
			//f==false;
			break;
		}
		count++;
	}
	// if(f==true)
	 if(count>n/2){
	 System.out.println("prime no");}
	 
}
	public static void main(String[] args) {
		 PrimeNumber obj = new PrimeNumber();
		 obj.check();

	}

}
