package com.tutorial.abstractclassexample;

public  abstract  class A {

	A()
	{
		System.out.println("A constructor");
	}
	void m1() {
		System.out.println("m1 from A");
	}
	abstract void m2();
	
	static void m3()// cannot override the static method
	{
		System.out.println("m3 static method");
	}
	
	public static void main(String[] args) {
		m3();

	}

}
