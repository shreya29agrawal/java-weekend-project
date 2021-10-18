package com.tutorial.methodoverloading;

public class MethodOverLoad2 {
	void sum(int a,int b)
	{
		System.out.println("sum of int "+(a+b));
		
	}
	void sum(float a, float b)
	{
		System.out.println("sum of num is "+(a+b));
	}

	public static void main(String[] args) {
		
		MethodOverLoad2 obj = new MethodOverLoad2();
		obj.sum(3.4f,4.5f);
		obj.sum(1,8);
				
	}

}
