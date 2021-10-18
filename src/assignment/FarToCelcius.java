package assignment;

import java.util.Scanner;

public class FarToCelcius {

	public static void main(String[] args) {
	float f,c;
	System.out.println("enter the temperature in fharenhite");
	Scanner sc= new Scanner(System.in);
	
	f=sc.nextFloat();
	c=((f-32)*5)/9;
	System.out.println("temperature is" +c);
    sc.close();
    
	}

}
