package praticesprogram;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int num , i ,j ,k, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range of number");
		num=sc.nextInt();
		int array[]=new int[num];
		System.out.println("Enter integers");
		for(i=0;i<num;i++)
		
			array[i]=sc.nextInt();
			//System.out.println(array[i]);
		
		
		for(i=0;i<(num-1);i++)
		{
			for(j=0;j<num-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
					
				}
			}
		}
		System.out.println("sorted list :");
		for(i=0;i<num;i++)
			System.out.println(array[i]);

	}

}
