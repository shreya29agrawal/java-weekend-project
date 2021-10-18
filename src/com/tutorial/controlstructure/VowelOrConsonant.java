package com.tutorial.controlstructure;

import java.util.Scanner;

public class VowelOrConsonant {

	void check(){
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("enetr a charecter");
		ch=sc.next().toLowerCase().charAt(0);
		sc.close();
		/*if (ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("it is a vowel");
		else
			System.out.println("it is a consonent");*/
		
		if (ch>=97&&ch<=122)
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
		else 
			System.out.println(" not an alphabet");
		
	}
	public static void main(String[] args) {
		VowelOrConsonant obj = new VowelOrConsonant();
		obj.check();
		

	}

}
