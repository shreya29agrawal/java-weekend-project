package com.tutorial.controlstructure;

import java.util.Scanner;

public class CheckForAlpahbet {
	void check(){
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("enetr a charecter");
		ch=sc.next().charAt(0);
		 int asciivalue= (int)ch;
		
		/*if (ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("it is a vowel");
		else
			System.out.println("it is a consonent");*/
		switch(ch)
		{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u': System.out.println(" it is vowel");
		break;
		default:
			System.out.println("consonent");
		}
	}
		public static void main(String[] args) {
		}
		
		}
