package com.tutorial.controlstructure;

import java.util.Scanner;

// n= print n natural number
// counter --- initializing , testing , inc/dec
public class PrintNaturalNo {
	void print(){
		int count , n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		count=1;
		sc.close();
		
		while(count<=n)
		{
			System.out.println(count);
			count++;
			}
		System.out.println("end of loop");
	}

	public static void main(String[] args) {
		PrintNaturalNo obj=new PrintNaturalNo();
		obj.print();
		

	}

}
