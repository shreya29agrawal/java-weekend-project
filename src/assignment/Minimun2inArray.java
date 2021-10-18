package assignment;

import java.util.Scanner;

public class Minimun2inArray {
	
   void  check(){
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index for array");
		n=sc.nextInt();
		System.out.println("enter integers "+n);
		int ar[]=new int[n];
	
				
				
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		int temp=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++ )
				if(ar[j]>ar[j+1]){
			{
				temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
			}
				
			System.out.println("second smalles value is  "+ ar[1]);	
		}
			sc.close();
			}
			
	}
	
	
	public static void main(String[] args) {
		  
		Minimun2inArray obj= new Minimun2inArray();
		obj.check();
		
	}

}
