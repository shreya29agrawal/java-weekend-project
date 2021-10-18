package com.tutorial.thiskeyword;

public class Rectangle {
	
	int x,y,l,b;
	Rectangle()
	{  this(0,0,0,0);
		System.out.println("default constructor");
		
				
	}
	Rectangle(int x,int y)
	{   
		this(x,y,0,0);
		
		System.out.println("2 parameter constructor");
		System.out.println(x);
		System.out.println(y);
		System.out.println(l);
		System.out.println(b);
		
	}
	Rectangle(int x,int y,int l,int b)
	{
		this.x=x;
		this.y=y;
		this.l=l;
		this.b=b;
		
		
		System.out.println("4 parameter constructor");
		System.out.print(x);
		System.out.print(y);
		System.out.print(l);
		System.out.print(b);
		
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
				
		Rectangle r1=new Rectangle(2,4);
		Rectangle r2=new Rectangle(2,4,6,8);
	}

}
