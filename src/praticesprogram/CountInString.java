package praticesprogram;

import java.util.Scanner;


public class CountInString {

	public static void main(String[] args) {
		String s;
		char c;
		int alpha=0,numeric=0,symbol=0;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		s=sc.nextLine();
		for(i=0;i<s.length()-1;i++)
		{  
			c=s.charAt(i);
			if(Character.isAlphabetic(c))
				alpha++;
			else if(Character.isDigit(c))
			numeric++;
			else
				symbol++;
			
			
		}
		System.out.println("Alphbet in string :"+alpha);
		System.out.println("Digit in String :"+numeric);
		System.out.println("Symbol in String :"+symbol);

	}

}
