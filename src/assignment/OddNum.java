package assignment;

import java.util.Scanner;

// n term of odd no and their sum
public class OddNum {

	public static void main(String[] args) {
	
     int n,i,sum;
     sum=0;
   // int  j=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     n=sc.nextInt();
     for(i=1;i<=n;i++)
     {    
         if(i%2!=0)
    	 { 
        	 sum =sum+i;
    		
    	 }
        
     }
     //System.out.println("odd no upto integer  is  "+j);
     System.out.println("sum of odd no upto integer "  +n+ " is : " +sum);
     sc.close();
	}
	
	

}
