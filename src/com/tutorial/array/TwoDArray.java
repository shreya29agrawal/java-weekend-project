package com.tutorial.array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
	int matrix[][]=new int[3][4];
	int i,j;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter matrixin 3*4 formate");
	
	for(i=0;i<3;i++)
	{
		for (j=0;j<4;j++)
		{
			matrix[i][j]= sc.nextInt();	
		}
	}

	System.out.println("matrix is");
	for(i=0;i<3;i++)
	{
		for (j=0;j<4;j++)
		{
			System.out.print(matrix[i][j]+"\t");	
		}
		System.out.println();
	}
	sc.close();
	}

}
