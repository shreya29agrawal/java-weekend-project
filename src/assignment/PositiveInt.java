package assignment;

import java.util.Scanner;

public class PositiveInt {

	public static void main(String[] args) {
		 int n,num,count;
	count=0;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter the positive number");
	     num=sc.nextInt();
	     n =num;
	     while(num!=0)
	    {  
	    	num=num/10;
	    	++count;
	   
	    }
	  	System.out.println("the digit in integer : "+n+ " is: "+count);
           sc.close();
	}

}
