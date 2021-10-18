package com.tutorial.basics;

import java.util.Scanner;


public class Average {

	public static void main(String[] args) {
     int a,b,c;
     float avg;
     Scanner sc = new Scanner(System.in);
     System.out.println(" enter three value");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      avg=(a+b+c)/3f;
      sc.close();
      
      // for float value in decimal
      System.out.println("average of 3 number is : "+avg);
      sc.close();
	}

}
