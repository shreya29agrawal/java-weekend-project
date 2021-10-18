package com.tutorial.interfaceexample;


interface One{
	void m1();
	
}

interface Two{
	void m2();
}
public interface Three extends One,Two{ // mulltiple inheritance
   void m3();

}
class Test2 implements Three{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
}