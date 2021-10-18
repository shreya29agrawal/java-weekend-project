package com.tutorial.abstractclassexample;


 abstract class Shape{
	 
	 abstract void draw();// abstract method
	
 }
  class Circle extends Shape{

	@Override
	void draw() {
	System.out.println("drawing circle");	
	}
	  
	
  }
  class Rectangle extends Shape{

		@Override
		void draw() {
		System.out.println("drawing Rectangle");	
		}
		  
	  }
 abstract  class Triangle extends Shape{

		
		  
	  }
  class UpperTriangle extends Triangle{

	@Override
	void draw() {
		System.out.println("print upper class");
		
	}
	  
  }
  class LowerTriangle extends Triangle{

		@Override
		void draw() {
			System.out.println("print Lower class");
			
		}
		  
	  }
  
  
public class Test {

	public static void main(String[] args) {
		//Shape s= new Shape(); abstract class cannot be intenciated
		Shape s;
		s= new Circle();
		s.draw();

		Circle c = new Circle();
		c.draw();
		Rectangle r= new Rectangle();
		r.draw();
		UpperTriangle t1 = new UpperTriangle();
		t1.draw();
		LowerTriangle t2 = new LowerTriangle();
		t2.draw();
		

	}

}
