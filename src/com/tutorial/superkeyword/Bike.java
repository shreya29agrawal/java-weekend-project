package com.tutorial.superkeyword;

// super keyword=>refer to imidiate parent class object
// suerper - to refer to instance variable of immediate parent class
// super = to refer to method of immediate of parent class
// super() -> to invoke constructor of parent class


class Vehicle
{int speed =70;

	
}
public class Bike extends Vehicle {
	int speed =80;
	/*void show()
	{
		System.out.println("speed of bike "+speed);
		System.out.println("speed of vehicle "+super.speed);
	}*/

	public static void main(String[] args) {
		Bike b = new Bike();
		//b.show();
           System.out.println(b.speed);
           
	}

}
