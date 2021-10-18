package assignment;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		int i, n , cube;
		i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		n=sc.nextInt();
		/*for(i=1;i<=n;i++)
		{
			cube=i*i*i;
			System.out.println("the cube of no " +i+ "  is :" +cube);
		}*/
		while(i<=n)
		{
			cube = i*i*i;
			System.out.println("the cube of no " +i+ "  is :" +cube);
			i++;
		}
        sc.close();
	}

}
