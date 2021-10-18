package com.tutorial.constructor;

public class Student {
      int id;
         String name;
         
         Student()
         {
        	System.out.println("constructor initiated"); 
        	id=1;
        	name= "adc";
         }
        
         
         Student(int i, String n)  // constructor overloading 
         {
        	System.out.println("constructor initiated"); 
        	id=i;
        	name= n;
         }
         void show()
         {
        	 System.out.println("id :" +id);
        	 System.out.println("name :"+name);
         }
 
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		
		Student s1= new Student(2,"tom");
		s1.show();
	}

}
