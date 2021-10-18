package com.tutorial.superkeyword;

class Vehicle3
{ 
	Vehicle3(int s)
	{
	System.out.println("vehicle running  " +s);
	}
}
public class Bike3 extends Vehicle3 {
	
     Bike3()

		{
    	 super(34);
    	 System.out.println("bike running ");
		
		}
	
           

	public static void main(String[] args) {
		Bike3 b=new Bike3();
		

	}

}


