package assignment;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
   System.out.println("enter a chracter");
   Scanner sc=new Scanner(System.in);
    char ch =sc.next().charAt(0);
    int asciivalue= (int)ch;
    System.out.println("Ascii value of chracter is     "+asciivalue);
   
   sc.close();
   

	}

}
