package com.tutorial.basics;
//compute simple intrest
public class SimpelIntrest {
	
	float computeSimpleIntrest(){
		float p,r,t,si;
		p= 8000;
		r=4.5f;
		t=2.5f;
		
		si=(p*r*t)/100;
		return si;
		
	}

	public static void main(String[] args) {
		
		SimpelIntrest obj=new SimpelIntrest();
		float s= obj.computeSimpleIntrest();
		System.out.println("si is "+s);
		
		System.out.println("si is "+obj.computeSimpleIntrest());
	}

}
