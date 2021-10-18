package com.tutorial.staticexample;

public class Student2 {
	int id;
	String name;
	static String college;
	static String collegeAddress;
	static 
	{
		college="davv";
		collegeAddress= "pune";
	}
	
	Student2(int i,String n)
	 { id=i;
	   name = n;
	   	 
	 }
	void show()
	{
		System.out.println("id "+id+ " Name " +name);
	}
  
	static void collegeDetail()
   {
	  System.out.println("college "+college+ " college address "+collegeAddress );
	}
  
	public static void main(String[] args) {
		collegeDetail();
		
		Student2 s1=new Student2(1,"tom");
		s1.show();
		Student2 s2=new Student2(2,"peter");
		s2.show();

	}

}
