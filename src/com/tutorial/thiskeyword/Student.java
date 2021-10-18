package com.tutorial.thiskeyword;

public class Student {

	
	int id ;
	String name;
	
	
	Student()
	{
		this(2,"xyz");
      System.out.println("default constroctor called");
	}
	
	
	Student(int id,String name)
	{System.out.println("parametrised constructor called");
		this.id=id;
		this.name=name;
		
	}
	Student(int id)
	
	{System.out.println("parametrised constructor2 called");
		this.id=id;
		
		
	}
	void show()
	{
		System.out.println("id "+id+ " name " +name);
	}
	public static void main(String[] args) {
		Student s1 =new Student(1,"tom");
		s1.show();

	}

}
