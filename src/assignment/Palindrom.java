package assignment;

import java.util.Scanner;


public class Palindrom {
	void check(){
		int n,mod,sum, temp;
		sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		n=sc.nextInt();
		sc.close();
		temp=n;
		while(n>0)
		{
		mod =n%10;
		sum=(sum*10)+mod;
		n=n/10;
		}
		if(sum==temp){
			System.out.println("no is palindrome");
			
		}
		else
			{System.out.println("no. is not palindrome");
			
			}
	}

	public static void main(String[] args) {
		
		Palindrom obj=new Palindrom();
		obj.check();
	}

}
