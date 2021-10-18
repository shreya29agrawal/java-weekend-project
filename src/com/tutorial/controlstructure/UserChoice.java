package com.tutorial.controlstructure;

import java.util.Scanner;

public class UserChoice {
	void operation()
	{
	float n1,n2,res;
	int choice;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter two number");
	n1=sc.nextFloat();
	n2=sc.nextFloat();
	System.out.println("enter 1 for addition");
	System.out.println("2 for subtraction");
	System.out.println("3 for multiplication");
     System.out.println("4 for division");
	choice  =sc.nextInt();
	sc.close();
	/*if (choice==1)
	{
		res=n1+n2;
		System.out.println("the sum is " +res);
	}
	else if (choice==2)
	{
		res=n1-n2;
		System.out.println(" subtractin is "+res);
	}
	else if (choice==3)
	{
		res=n1*n2;
		System.out.println("mul is "+res);
	}
	else
	{
		res= n1/n2;
		System.out.println("division is "+res);
	}*/
	
	switch(choice){
	
	case 1:res=n1+n2;
	System.out.println("sum is" +res);
	break;
	
	case 2:res=n1-n2;
	System.out.println("minu is" +res);
	break;
	
	case 3:res=n1*n2;
	System.out.println("multiple is" +res);
	break;
	
	case 4:res=n1/n2;
	System.out.println("division is" +res);
	break;
	
	default:
	System.out.println(" invalid opetion");
	}
	}

	public static void main(String[] args) {
		UserChoice obj = new UserChoice();
		obj.operation();

	}

}
