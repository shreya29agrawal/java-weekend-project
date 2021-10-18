package com.tutorial.methodoverloading;

public class MethodOverload {
	
	
	void area(float r)
	{System.out.println("area of circle "+(3.14*r*r));
	
	}
	void area(float l, float b)
	{System.out.println("area of rectangle "+(l*b));
	
	}
	void area(float pt,float b,float h)
	{System.out.println("area of triangle "+(pt*b*h));
	
	}
	public static void main(String[] args) {

		MethodOverload obj = new MethodOverload();
		obj.area(3.4f);
		obj.area(3f,7.8f);
		obj.area(3.4f,5f,6f);
	}

}
