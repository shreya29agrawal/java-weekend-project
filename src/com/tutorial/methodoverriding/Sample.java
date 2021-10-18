package com.tutorial.methodoverriding;

public class Sample {

	Shape create()
	{
		int ch =2;
		if (ch==1)
		{
			Circle c =new Circle();
			return c;
		}
		else if(ch==2)
		{
			Rectangle r= new Rectangle();
			return r;
		}
		else if(ch==3)
		{
			Triangle t= new Triangle();
			return t;
		}
		else
			return new Shape();
	}
	
	public static void main(String[] args) {
		Sample obj = new Sample();
		Shape s=obj.create();
		s.draw();
		

	}

}
