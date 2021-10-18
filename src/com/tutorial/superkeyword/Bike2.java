package com.tutorial.superkeyword;
class Vehicle2
{ void show()
	{
	System.out.println("vehicle running");
	}
}
public class Bike2 extends Vehicle2 {
	
     void show()

		{System.out.println("bike running ");
		
		}
	void display()
	{
		show();
		super.show();
	}
           

	public static void main(String[] args) {
		Bike2 b=new Bike2();
		b.display();

	}

}
