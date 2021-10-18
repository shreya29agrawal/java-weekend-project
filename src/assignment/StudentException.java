package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

 class StudentException1 extends Exception {
	 

	StudentException1()
       {
		System.out.println("mark of the student not be greater than 100");
		}
 }
	 public  class StudentException {
		 int mark;
	     String name;
	
		 void input()
	{  
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name and mark for student");
		
		try{
			
			 name=sc.next();
		     mark=sc.nextInt();
			if(mark>100)
			{   
				System.out.println(name+"  "+mark);
				throw new StudentException1();
				
			}
			//System.out.println(name+"  "+mark);
		}
		catch(StudentException1 e)
		{
			System.out.println(e);
		    System.out.println("marks cannot be greater than 100");
	      }
		catch(InputMismatchException e)
		{
			System.out.println(e);
			System.out.println("value enter was not correct");
		}
	      finally
	      {   sc.close();
	    	  System.out.println("finally executed");
	      }	
		
	}
	 
	    public static void main(String[] args) {
		
	    	StudentException obj = new StudentException();
		     obj.input();

	}
 }
 


		
