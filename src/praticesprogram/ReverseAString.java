package praticesprogram;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
	String s;
	String rev="";
	int i;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter a string");
	s=sc.next();
	for(i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println("reverse string is :"+rev);
     sc.close();
	}

}
