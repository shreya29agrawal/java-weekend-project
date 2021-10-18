package assignment;

import java.util.Scanner;

public class ArrayTwoD {

	public static void main(String[] args) {
		int x,y,i,j=0;
		int sum=0;
		int d=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for row nd colom");
		x=sc.nextInt();
		y=sc.nextInt();
		
		int  ar[][]=new int[x][y];
		System.out.println("enter the element in :" +x+ "*"+y+"formate");
		
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
	
		System.out.println("elements of matrix is ");
		
		for(int[] row:ar)
		{
			for(int col:row)
			{
				System.out.print(col + "\t");
			}
			System.out.println(" ");
		}

		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				if(ar[i]==ar[j])
				{
					sum=sum+(ar[i][j]);	
				}
			}
		}
		System.out.println("sum of diagonalfrom left to right elements is  "+ sum);

    sc.close();
	}

}
