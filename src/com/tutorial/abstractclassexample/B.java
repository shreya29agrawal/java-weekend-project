package com.tutorial.abstractclassexample;

public class B extends A {

	B()
	{
		System.out.println("B class constructor");
	}
	
	public static void main(String[] args) {
		B b= new B();
		b.m1();
		b.m2();
		m3();

	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}

}
