package assignment;

import java.util.Scanner;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		
		String s,s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		s=sc.next();
		s1=new String();
       for(int i=0;i<(s.length());i++)
       {
    	 char c=s.charAt(i);
    	 
    	  }
    		  
       for(int i=0;i<(s.length());i++)
       {
    	   for(int j=0;j<(s1.length());j++)
    	   {
    		   if(s.charAt(i)!=s1.charAt(j))
    		   {
    			   s1=s1+s.charAt(i);
    		   }
    	   }
       }
      System.out.println(s1);
    	
    		
       }
	}


