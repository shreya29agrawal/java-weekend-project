package com.tutorial.interfaceexample;

public class Sample implements Printable,Testeble{
	

	public static void main(String[] args) {
		Sample s = new Sample();
		s.print();
		//System.out.println(data);
		s.m1();
		Printable.m2();
		s.m3();
	}

	@Override
	public void print() {
		System.out.println("print from sample");
		
	}
  public void m1()
  {
	  System.out.println("m1 from sample");
  }
	@Override
	public void m3() {
		System.out.println("m3 from printable");
		
	}

}
