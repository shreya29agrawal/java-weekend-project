package com.tutorial.interfaceexample;

public class Test implements Printable {

	public static void main(String[] args) {
		Test t=new Test();
		t.print();
		t.m3();
		System.out.println(data);

	}

	@Override
	public void print() {
		System.out.println("print from test");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 from printable");
		
	}

}
