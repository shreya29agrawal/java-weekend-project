package assignment;

import java.util.Scanner;
// try catch
// multiple catch block
public class ExeptionHandling {
	void division()
	{
	int n1,n2,res,index;
	int ar[]={10,20,30,40,50};
	String s=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter to number");
	n1=sc.nextInt();
	n2=sc.nextInt();
	index=sc.nextInt();
	try
	{
	res=n1/n2;
	System.out.println("division :"+res);
	System.out.println("digit at array at index "+index+" is :"+ar[index]);
	System.out.println("done");
	System.out.println(s.length());
	}
	catch(ArithmeticException e )
	{
		System.out.println(e);
		System.out.println("divided by zero");
	}
	catch(IndexOutOfBoundsException e)
	{
		System.out.println(e);
		System.out.println("out of limit");
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println("general cathch");
	}
	sc.close();
	}
	
	public static void main(String[] args) {
		ExeptionHandling obj = new ExeptionHandling();
		obj.division();
		System.out.println("rest of the code ....");

	}

}
