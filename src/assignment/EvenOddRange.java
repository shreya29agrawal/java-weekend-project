package assignment;

import java.util.Scanner;

public class EvenOddRange {

	public static void main(String[] args) {
		int num,i ;
		   
		     Scanner sc=new Scanner(System.in);
		     System.out.println("enter the positive number");
		     num=sc.nextInt();
		     
          for(i=0;i<=num;i++)
        	  if(i%2==0)
        	  {  
        		  System.out.println("even no "+i+ " ");
        	  }
        	  else
        	  {
        		  System.out.println("odd no "+i+ " ");
        	  }
          sc.close();
	}

}
