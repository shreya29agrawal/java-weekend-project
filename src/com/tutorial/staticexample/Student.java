package com.tutorial.staticexample;

public class Student {
	
	int id;
	String name;
	static String college = "avg";
	 Student(int i,String n)
	 {id=i;
	   name = n;
	   	 
	 }
	void show()
	{
		System.out.println("id "+id+ " Name "+name+ " collage "+ college);
	}

	public static void main(String[] args) {
		Student s1=new Student(1,"tom");
		s1.show();
		Student s2=new Student(2,"peter");
		s2.show();
		
	}

}
