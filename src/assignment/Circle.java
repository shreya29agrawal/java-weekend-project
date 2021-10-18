package assignment;

import java.util.Scanner;

public class Circle {
	static double r, res,r1;
	//Scanner sc=new Scanner(System.in);
     //System.out.println("enter the value of radius");
	  // r=sc.nextDouble();
	
	double area()
	
	{// System.out.println("enter the value of radius");
	  // r=sc.nextDouble();
	    r=r1;
		res= 3.14*r*r;
		return res;
		
	}
       double peri()
{
	//System.out.println("enter the value of radius");
	//  r=sc.nextDouble();
	     r=r1;
		res= 2*3.14*r;
		return res;
		
}
      
       
	public static void main(String[] args) {
		System.out.println("enter the value of radius");
	
		Scanner sc=new Scanner(System.in);
		r1 =sc.nextDouble();
	Circle c =new Circle();
	System.out.println("area of circle is "+c.area());
	
	System.out.println("perimeter of circle is "+c.peri());
	
	sc.close();
	
	}
     

}
