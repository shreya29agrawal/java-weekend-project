package assignment;

import java.util.Scanner;

public class ArithmaticOpp {
	
	float a,b,res;
	Scanner sc=new Scanner(System.in);
	
	float add()
	{
		System.out.println(" Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		res=a+b;
		return res;
		
		
	}
	
	float minus()
	{
		System.out.println(" Enter two number");
	a=sc.nextInt();
	b=sc.nextInt();
		if(a>b){
			res= a-b;
			}
		else
		{
			res=b-a;
			
		}
		return res;
		
	}
   float mult(){
	   System.out.println(" Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		res=a*b;
		return res;
		
   }
   
   float div(){
	   System.out.println(" Enter dividend first then divisior");
		a=sc.nextInt();
		b=sc.nextInt();
		res=a/b;
		return res;
		
   }
       // sc.close();
        
	public static void main(String[] args) {
		
		ArithmaticOpp op=new ArithmaticOpp();
		System.out.println("addition of two no. is :"+op.add());
		System.out.println("subtraction of two no. is :"+op.minus());
		System.out.println("multiplication two no. is :"+op.mult());
		System.out.println("division of two no. is :"+op.div());
	}
     
}
