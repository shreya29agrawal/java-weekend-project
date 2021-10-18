package assignment;

/*2 
4  6 
8  10  12 
14  16  18  20 */

import java.util.Scanner;


public class PatternFour { 
	  void print()
	  {
		  int i,j,k=0,n;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the limit");
		  n=sc.nextInt();
		  for(i=1;i<=4;i++)
		  {
			  for(j=1;j<=i;j++)
			  {
                   
                  System.out.print(" "+(k+2)+" ");
                  k=k+2;
                
                  
			  }
			  System.out.println();
			  
		  }
		  
	  }
	
	
	public static void main(String[] args) {
		PatternFour obj=new PatternFour();
		obj.print();

	}

}
