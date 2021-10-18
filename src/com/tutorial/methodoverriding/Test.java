package com.tutorial.methodoverriding;
// method overriding and run time polymorphism
//shape-> circle,rectangle,triangle
//signature -> returntype , name , parameters
// method overriding => two time of polymorphism take place
// compile time at refrence level then run time an object level


   class Shape
   {
	void draw()
	{
		System.out.println("drawing no shape");
	}
   }
   
   class Rectangle extends Shape
   {
	   void draw() // method overriding
	   {
		   System.out.println("drawing Rectangle");
	   }
   }
   
   class Triangle extends Shape
   {
	 /*  void draw()  //method overriding
	   {
		   System.out.println("drawing Triangle");
	   }*/
   }
   class Circle extends Shape
   {
	   void draw()// method overriding
	   {
		   System.out.println("drawing circle");
	   }
   }
public class Test {

	public static void main(String[] args) {
	
		Shape s; // null
		s= new Shape();
		
		s=new Circle();// upcasting =>> storing object of sub in refrence of super class
		s.draw();
		s=new Rectangle();
		s.draw();
		s=new Triangle();
		s.draw();
		
	}

}
