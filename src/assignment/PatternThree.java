package assignment;
//1
//2 3
//4 5 6
//7 8 9 10
import java.util.Scanner;

public class PatternThree {

	public static void main(String[] args) {
		int i, j, n,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		n=sc.nextInt();
          
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print( " " +(k+1)+ " ");
				k++;
			}
			System.out.println(" " );
	}

}}
