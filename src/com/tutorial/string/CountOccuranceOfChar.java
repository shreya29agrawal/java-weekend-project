package com.tutorial.string;

import java.util.Scanner;

public class CountOccuranceOfChar {

	public static void main(String[] args) {
		String s;
		char ch;
		char ar[];
		int count =0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 s=sc.next();
		 System.out.println("enter the charecter");
		 ch=sc.next().charAt(0);
		 ar=s.toCharArray();
		 int i;
	/*	for(i=0; i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				count++;
		}
		 
		System.out.println(count);*/
		 
		 
		 for(char c:ar)
		 {
			 if(c==ch)
				 count++;
		 }
		 System.out.println(count);
		 sc.close();
		

	}

}
