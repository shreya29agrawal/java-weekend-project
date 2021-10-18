package com.tutorial.interfaceexample;

public interface Printable {

	int data = 80;
	void print();
	void m3();
	default void m1()
	{
		System.out.println("m1 from printable");
		
	}
	static void m2()
	{
		System.out.println("m2 from printable");
	}
	

}
