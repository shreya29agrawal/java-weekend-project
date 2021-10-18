package praticesprogram;

import java.util.Scanner;

public class NoOfWordInString {

	public static void main(String[] args) {
		String s;
		int count =0;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		s=sc.next();
		for(i=0;i<=s.length()-1;i++)
		{
			count = count+1;
		}
       System.out.println(count);
       sc.close();
	}

}
